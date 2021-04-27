
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AspectUsageCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AspectUsageCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Product"/>
 *     &lt;enumeration value="Instance"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AspectUsageCodeType")
@XmlEnum
public enum AspectUsageCodeType {


    /**
     * 
     * 						This enumeration value indicates that the Item Specific in the corresponding <b>NameRecommendation.Name</b> field is defined/derived from an eBay catalog product. 'Product' Item Specifics are also referred to as Product Aspects in Web flows and other APIs. Generally, catalog product-based Item Specifics should not be modified if the seller created/revise/relisted the item based on an eBay catalog product.
     * 					
     * 
     */
    @XmlEnumValue("Product")
    PRODUCT("Product"),

    /**
     * 
     * 						This enumeration value indicates that the Item Specific in the corresponding <b>NameRecommendation.Name</b> field is an 'instance aspect', which is an Item Specific whose value will vary based on a particular instance of the product. When creating a listing, the seller should pass in the name-value pair for this Item Specific through the <b>Item.ItemSpecifics.NameValueList</b> container of an <b>AddItem</b> call.
     * 					
     * 
     */
    @XmlEnumValue("Instance")
    INSTANCE("Instance"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AspectUsageCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AspectUsageCodeType fromValue(String v) {
        for (AspectUsageCodeType c: AspectUsageCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

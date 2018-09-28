
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
     * 						This enumeration value indicates that the aspect in the corresponding <b>NameRecommendation.Name</b> field is a product aspect. Product aspects are defined through an eBay Catalog product, and sellers cannot change these product aspects unless they find that the particular product aspect is inaccurate or missing from the eBay Catalog product, in which case, they could use the <b>Catalog API</b> to make a request to eBay to revise an existing eBay Catalog product.
     * 						<br/><br/>
     * 						<span class="tablenote"><b>Note: </b> Currently, the <b>AspectUsage</b> field will only be returned in the Sandbox environment, and only for category/brands that are a part of the Product-Based Shopping Experience mandate. See the <a href="https://developer.ebay.com/api-docs/sell/static/inventory/pbse_product_vs_item_aspects.html" target="_blank">Product aspects vs. item specifics</a> page for more information about product aspects and instance aspects.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Product")
    PRODUCT("Product"),

    /**
     * 
     * 						This enumeration value indicates that the aspect in the corresponding <b>NameRecommendation.Name</b> field is an instance aspect, which is an aspect whose value will vary based on a particular instance of the product. When creating a listing, the seller should pass in the name-value pair for this aspect through the <b>Item.ItemSpecifics.NameValueList</b> container of an <b>AddItem</b> call.
     * 						<br/><br/>
     * 						<span class="tablenote"><b>Note: </b> Currently, the <b>AspectUsage</b> field will only be returned in the Sandbox environment, and only for category/brands that are a part of the Product-Based Shopping Experience mandate. See the <a href="https://developer.ebay.com/api-docs/sell/static/inventory/pbse_product_vs_item_aspects.html" target="_blank">Product aspects vs. item specifics</a> page for more information about product aspects and instance aspects.
     * 						</span>
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


package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductRequiredCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductRequiredCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ProductRequiredCodeType")
@XmlEnum
public enum ProductRequiredCodeType {


    /**
     * 
     * 						If this enumeration value is returned for a product brand within a category, the eBay seller is not expected to use an eBay catalog product when creating or revising their listing in this category for this product brand.
     * 					
     * 
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * 
     * 						If this enumeration value is returned for a product brand within a category, the eBay seller should use an eBay catalog product when creating or revising their listing in this category for this product brand. Using an eBay catalog product for the specific category/brand to create/revise the listing is not a hard mandate, but it is necessary if the seller would like the listing to appear in product-based listing search results.
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 				  
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ProductRequiredCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductRequiredCodeType fromValue(String v) {
        for (ProductRequiredCodeType c: ProductRequiredCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

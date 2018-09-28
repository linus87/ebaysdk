
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecommendationEngineCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecommendationEngineCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ListingAnalyzer"/>
 *     &lt;enumeration value="SIFFTAS"/>
 *     &lt;enumeration value="ProductPricing"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="SuggestedAttributes"/>
 *     &lt;enumeration value="ItemSpecifics"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RecommendationEngineCodeType")
@XmlEnum
public enum RecommendationEngineCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ListingAnalyzer")
    LISTING_ANALYZER("ListingAnalyzer"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    SIFFTAS("SIFFTAS"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ProductPricing")
    PRODUCT_PRICING("ProductPricing"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("SuggestedAttributes")
    SUGGESTED_ATTRIBUTES("SuggestedAttributes"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ItemSpecifics")
    ITEM_SPECIFICS("ItemSpecifics");
    private final String value;

    RecommendationEngineCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecommendationEngineCodeType fromValue(String v) {
        for (RecommendationEngineCodeType c: RecommendationEngineCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

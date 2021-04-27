
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariationSpecificsRuleCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VariationSpecificsRuleCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "VariationSpecificsRuleCodeType")
@XmlEnum
public enum VariationSpecificsRuleCodeType {


    /**
     * 
     * 						This value indicates that the corresponding Item Specific can be specified at the variation level. In the <b>AddFixedPriceItem</b> call, variation-specific name-value pairs are specified under the <b>Variation.VariationSpecifics.NameValueList</b> container.
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						This value indicates that the corresponding Item Specific cannot be specified at the variation level. If an Item Specific cannot be used at the variation level, it usually indicates that the particular Item Specific should only be specified at the listing-level, as it is a product aspect that should be shared by all variations in the multiple-variation listing.
     * 					
     * 
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    VariationSpecificsRuleCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VariationSpecificsRuleCodeType fromValue(String v) {
        for (VariationSpecificsRuleCodeType c: VariationSpecificsRuleCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

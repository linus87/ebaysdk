
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariationPictureRuleCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VariationPictureRuleCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "VariationPictureRuleCodeType")
@XmlEnum
public enum VariationPictureRuleCodeType {


    /**
     * 
     * 						This value indicates that the corresponding Item Specific variation name must be specified in the <b>Variations.Pictures.VariationSpecificName</b> field in an Add/Revise/Relist call.
     * 					
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required"),

    /**
     * 
     * 						This value indicates that the corresponding Item Specific variation name may be specified in the <b>Variations.Pictures.VariationSpecificName</b> field in an Add/Revise/Relist call.
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						This value indicates that the corresponding Item Specific variation name may not be specified in the <b>Variations.Pictures.VariationSpecificName</b> field in an Add/Revise/Relist call.
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

    VariationPictureRuleCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VariationPictureRuleCodeType fromValue(String v) {
        for (VariationPictureRuleCodeType c: VariationPictureRuleCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

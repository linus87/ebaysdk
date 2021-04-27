
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
     * 						This value indicates that the corresponding Item Specific name must be used in the <b>Variations.Pictures.VariationSpecificName</b> field if the   seller is providing picture URLs through the <b>Variations.Pictures.VariationSpecificPictureSet</b> container in a 'FixedPriceItem' call when creating, revising, or relisting an item.
     * 					
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required"),

    /**
     * 
     * 						This value indicates that the corresponding Item Specific name can be used in the <b>Variations.Pictures.VariationSpecificName</b> field if the   seller is providing picture URLs through the <b>Variations.Pictures.VariationSpecificPictureSet</b> container in a 'FixedPriceItem' call when creating, revising, or relisting an item. Unlike the 'Required' value, 'Enabled' indicates that corresponding Item Specific name is just one option, and they may be other options to use as a <b>VariationSpecificName</b> value.
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						This value indicates that the corresponding Item Specific name cannot be used in the <b>Variations.Pictures.VariationSpecificName</b> field if the seller is providing picture URLs through the <b>Variations.Pictures.VariationSpecificPictureSet</b> container in a 'FixedPriceItem' call when creating, revising, or relisting an item. The seller will have to find an Item Specific that is either 'Enabled' or 'Required'  to use as a <b>VariationSpecificName</b> value.
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

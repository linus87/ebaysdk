
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageConstraintCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UsageConstraintCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Optional"/>
 *     &lt;enumeration value="Recommended"/>
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "UsageConstraintCodeType")
@XmlEnum
public enum UsageConstraintCodeType {


    /**
     * 
     * 						This enumeration value indicates that the corresponding item specific is completely optional for a listing in the category, but the seller should still include it if the item specific is relevant to the product and its value is known.
     * 					
     * 
     */
    @XmlEnumValue("Optional")
    OPTIONAL("Optional"),

    /**
     * 
     * 						This enumeration value indicates that the corresponding item specific is typical and recommended for a listing in the category, but not fully required. The seller should include this item specific if its value is known because including it may improve search results and sale conversion.
     * 					
     * 
     */
    @XmlEnumValue("Recommended")
    RECOMMENDED("Recommended"),

    /**
     * 
     * 						This enumeration value indicates that the corresponding item specific is required for a listing in the category. The seller must include this item specific or the listing may be blocked.
     * 					
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 				  
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    UsageConstraintCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UsageConstraintCodeType fromValue(String v) {
        for (UsageConstraintCodeType c: UsageConstraintCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

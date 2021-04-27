
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharityAffiliationTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CharityAffiliationTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Community"/>
 *     &lt;enumeration value="Direct"/>
 *     &lt;enumeration value="Remove"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CharityAffiliationTypeCodeType")
@XmlEnum
public enum CharityAffiliationTypeCodeType {


    /**
     * 
     * 					  This enumeration value indicates that the seller is selling to benefit  a nonprofit charity organization identified through the <b>CharityID</b> field.
     * 					
     * 
     */
    @XmlEnumValue("Community")
    COMMUNITY("Community"),

    /**
     * 
     * 					  This enumeration value indicates that the seller is a direct, non-profit organization registered with the PayPal Giving Fund, and selling to directly benefit their association.
     * 					
     * 
     */
    @XmlEnumValue("Direct")
    DIRECT("Direct"),

    /**
     * 
     * 					  This enumeration value may be returned if a direct, non-profit organization has recently unregistered with the PayPal Giving Fund, or if a Community Seller has recently removed the charity feature from a listing.
     * 					
     * 
     */
    @XmlEnumValue("Remove")
    REMOVE("Remove"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CharityAffiliationTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CharityAffiliationTypeCodeType fromValue(String v) {
        for (CharityAffiliationTypeCodeType c: CharityAffiliationTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

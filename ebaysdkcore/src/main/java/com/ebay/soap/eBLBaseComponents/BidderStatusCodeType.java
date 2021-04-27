
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidderStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidderStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Approved"/>
 *     &lt;enumeration value="Denied"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BidderStatusCodeType")
@XmlEnum
public enum BidderStatusCodeType {


    /**
     * 
     * 					  This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Approved")
    APPROVED("Approved"),

    /**
     * 
     * 					  This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Denied")
    DENIED("Denied"),

    /**
     * 
     * 					  This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 					  This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BidderStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidderStatusCodeType fromValue(String v) {
        for (BidderStatusCodeType c: BidderStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

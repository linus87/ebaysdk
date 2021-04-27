
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidGroupItemStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidGroupItemStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CurrentBid"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Skipped"/>
 *     &lt;enumeration value="Ended"/>
 *     &lt;enumeration value="Won"/>
 *     &lt;enumeration value="GroupClosed"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BidGroupItemStatusCodeType")
@XmlEnum
public enum BidGroupItemStatusCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CurrentBid")
    CURRENT_BID("CurrentBid"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Skipped")
    SKIPPED("Skipped"),

    /**
     * 
     * 						This value is not used.
     * 						
     * 
     */
    @XmlEnumValue("Ended")
    ENDED("Ended"),

    /**
     * 
     * 						This value is not used.
     * 						
     * 
     */
    @XmlEnumValue("Won")
    WON("Won"),

    /**
     * 
     * 						This value is not used.
     * 						
     * 
     */
    @XmlEnumValue("GroupClosed")
    GROUP_CLOSED("GroupClosed"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BidGroupItemStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidGroupItemStatusCodeType fromValue(String v) {
        for (BidGroupItemStatusCodeType c: BidGroupItemStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

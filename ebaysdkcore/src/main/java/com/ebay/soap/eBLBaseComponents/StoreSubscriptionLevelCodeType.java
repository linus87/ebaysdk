
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreSubscriptionLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreSubscriptionLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Close"/>
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="Featured"/>
 *     &lt;enumeration value="Anchor"/>
 *     &lt;enumeration value="Starter"/>
 *     &lt;enumeration value="Enterprise"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "StoreSubscriptionLevelCodeType")
@XmlEnum
public enum StoreSubscriptionLevelCodeType {


    /**
     * 
     * 					   This value is passed into the <b>Store.SubscriptionLevel</b> field of a <b>SetStore</b> call to cancel your current eBay Store subscription. Despite its name, this action does not close your store immediately. Any active listings will remain available through your eBay Store until those listings have ended (either through a sale or when listing end time has been reached).
     * 					
     * 
     */
    @XmlEnumValue("Close")
    CLOSE("Close"),

    /**
     * 
     * 					   This enumeration value indicates that the eBay user has a Basic eBay Store subscription.
     * 					
     * 
     */
    @XmlEnumValue("Basic")
    BASIC("Basic"),

    /**
     * 
     * 					   This enumeration value indicates that the eBay user has a Premium eBay Store subscription.
     * 					
     * 
     */
    @XmlEnumValue("Featured")
    FEATURED("Featured"),

    /**
     * 
     * 					   This enumeration value indicates that the eBay user has an Anchor eBay Store subscription.
     * 					
     * 
     */
    @XmlEnumValue("Anchor")
    ANCHOR("Anchor"),

    /**
     * 
     * 						 This enumeration value indicates that the eBay user has a Starter eBay Store subscription.
     * 					
     * 
     */
    @XmlEnumValue("Starter")
    STARTER("Starter"),

    /**
     * 
     * 						 This enumeration value indicates that the eBay user has an Enterprise eBay Store subscription.
     * 					
     * 
     */
    @XmlEnumValue("Enterprise")
    ENTERPRISE("Enterprise"),

    /**
     * 
     * 					   Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    StoreSubscriptionLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreSubscriptionLevelCodeType fromValue(String v) {
        for (StoreSubscriptionLevelCodeType c: StoreSubscriptionLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

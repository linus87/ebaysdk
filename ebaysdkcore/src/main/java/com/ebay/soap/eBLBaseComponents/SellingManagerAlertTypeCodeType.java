
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingManagerAlertTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerAlertTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Sold"/>
 *     &lt;enumeration value="Inventory"/>
 *     &lt;enumeration value="Automation"/>
 *     &lt;enumeration value="PaisaPay"/>
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellingManagerAlertTypeCodeType")
@XmlEnum
public enum SellingManagerAlertTypeCodeType {


    /**
     * 
     * 						This enumeration value indicates that the alert is related to a sales transaction. See the corresponding <b>Alert.SoldAlert</b> value for more information on the alert.
     * 					
     * 
     */
    @XmlEnumValue("Sold")
    SOLD("Sold"),

    /**
     * 
     * 						This enumeration value indicates that the alert is related to the seller's inventory. See the corresponding <b>Alert.InventoryAlert</b> value for more information on the alert.
     * 					
     * 
     */
    @XmlEnumValue("Inventory")
    INVENTORY("Inventory"),

    /**
     * 
     * 						This enumeration value indicates that the alert is related to an Selling Manager automation alert. See the corresponding <b>Alert.AutomationAlert</b> value for more information on the alert.
     * 					
     * 
     */
    @XmlEnumValue("Automation")
    AUTOMATION("Automation"),

    /**
     * 
     * 						This enumeration value is no longer applicable, so should not get returned.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPay")
    PAISA_PAY("PaisaPay"),

    /**
     * 
     * 						This enumeration value indicates that the alert is related to either one of the following: negative feedback received; a bad email template, or an unpaid item dispute requires attention. See the corresponding <b>Alert.GeneralAlert</b> value for more information on the alert.
     * 					
     * 
     */
    @XmlEnumValue("General")
    GENERAL("General"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerAlertTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerAlertTypeCodeType fromValue(String v) {
        for (SellingManagerAlertTypeCodeType c: SellingManagerAlertTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

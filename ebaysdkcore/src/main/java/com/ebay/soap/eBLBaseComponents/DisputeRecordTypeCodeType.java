
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeRecordTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeRecordTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UnpaidItem"/>
 *     &lt;enumeration value="ItemNotReceived"/>
 *     &lt;enumeration value="HalfDispute"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeRecordTypeCodeType")
@XmlEnum
public enum DisputeRecordTypeCodeType {


    /**
     * 
     * 						This enumeration value indicates that the dispute is an Unpaid Item case created by the seller against the buyer. A seller should always try to resolve an Unpaid Item issue with the buyer before opening up a case with eBay. Sometimes, just sending payment reminders to the buyer or messaging the buyer through the Messaging platform can be helpful. The <a href="https://www.ebay.com/help/selling/getting-paid/resolving-unpaid-items-buyers?id=4137">Resolving unpaid items with buyers</a> help topic provides more details and tips on trying to work Unpaid Item issues out with the buyer.
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItem")
    UNPAID_ITEM("UnpaidItem"),

    /**
     * 
     * 						This enumeration value indicates that the dispute is an Item Not Received case created by the buyer against the seller through PayPal's platform.
     * 						<br/><br/>
     * 						<span class="tablenote"><strong>Note:</strong>
     * 							As noted above, the <b>GetDispute</b> or <b>GetUserDisputes</b> calls will not return any eBay Money Back Guarantee cases.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("ItemNotReceived")
    ITEM_NOT_RECEIVED("ItemNotReceived"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the Half.com marketplace is shut down.
     * 					
     * 
     */
    @XmlEnumValue("HalfDispute")
    HALF_DISPUTE("HalfDispute"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeRecordTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeRecordTypeCodeType fromValue(String v) {
        for (DisputeRecordTypeCodeType c: DisputeRecordTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstructionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentInstructionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PaymentInstruction"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PaymentInstructionCodeType")
@XmlEnum
public enum PaymentInstructionCodeType {


    /**
     * 
     * 						This enumeration value indicates that payment instructions were included in the shipping package for the 'Pay Upon Invoice' order.
     * 					
     * 
     */
    @XmlEnumValue("PaymentInstruction")
    PAYMENT_INSTRUCTION("PaymentInstruction"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PaymentInstructionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentInstructionCodeType fromValue(String v) {
        for (PaymentInstructionCodeType c: PaymentInstructionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

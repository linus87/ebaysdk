
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscountCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Percentage"/>
 *     &lt;enumeration value="Price"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DiscountCodeType")
@XmlEnum
public enum DiscountCodeType {


    /**
     * 
     * 						The enumeration value indicates that the discount being offered is a percentage discount, which means a percentage of the total price to the buyer is being discounted. So, if the total price for an order line item is $100, the <b>DiscountType</b> is <code>Percentage</code>, and the <b>DiscountValue</b> is <code>15.0</code> (percent), the buyer will pay just $85.00 for the order line item.
     * 					
     * 
     */
    @XmlEnumValue("Percentage")
    PERCENTAGE("Percentage"),

    /**
     * 
     * 						The enumeration value indicates that the discount being offered is a price discount, which means the total price to the buyer is being reduced by this amount. So, if the total price for an order line item is $100, the <b>DiscountType</b> is <code>Price</code>, and the <b>DiscountValue</b> is <code>20.0</code> (dollars), the buyer will pay just $80.00 for the order line item.
     * 					
     * 
     */
    @XmlEnumValue("Price")
    PRICE("Price"),

    /**
     * 
     * 						This value is reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DiscountCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscountCodeType fromValue(String v) {
        for (DiscountCodeType c: DiscountCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

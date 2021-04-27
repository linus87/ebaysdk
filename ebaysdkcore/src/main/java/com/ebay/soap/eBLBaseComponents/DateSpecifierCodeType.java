
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateSpecifierCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateSpecifierCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DateSpecifierCodeType")
@XmlEnum
public enum DateSpecifierCodeType {


    /**
     * 
     * 						This field is deprecated.
     * 					
     * 
     */
    M("M"),

    /**
     * 
     * 						This field is deprecated.
     * 					
     * 
     */
    D("D"),

    /**
     * 
     * 						This field is deprecated.
     * 					
     * 
     */
    Y("Y"),

    /**
     * 
     * 						This field is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DateSpecifierCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateSpecifierCodeType fromValue(String v) {
        for (DateSpecifierCodeType c: DateSpecifierCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

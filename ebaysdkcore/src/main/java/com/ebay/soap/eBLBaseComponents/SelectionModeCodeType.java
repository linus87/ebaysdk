
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectionModeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SelectionModeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Automatic"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Prefilled"/>
 *     &lt;enumeration value="SelectionOnly"/>
 *     &lt;enumeration value="FreeText"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SelectionModeCodeType")
@XmlEnum
public enum SelectionModeCodeType {


    /**
     * 
     * 						Automatic criteria. Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),

    /**
     * 
     * 						Manual criteria. Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("Manual")
    MANUAL("Manual"),

    /**
     * 
     * 						Indicates eBay recommended and required item specifics will be pre-filled by eBay if a product ID is provided in the <b>Add</b>/<b>Revise</b>/<b>Relist</b> call.
     * 					
     * 
     */
    @XmlEnumValue("Prefilled")
    PREFILLED("Prefilled"),

    /**
     * 
     * 						Indicates the seller must use eBay's recommended item specifics, and cannot use their own custom item specifics when creating a listing with <b>Add</b>/<b>Revise</b>/<b>Relist</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("SelectionOnly")
    SELECTION_ONLY("SelectionOnly"),

    /**
     * 
     * 						Indicates the seller can create their own custom item specifics or they can use eBay recommended item specifics for the category when creating a listing with <b>Add</b>/<b>Revise</b>/<b>Relist</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("FreeText")
    FREE_TEXT("FreeText"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SelectionModeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelectionModeCodeType fromValue(String v) {
        for (SelectionModeCodeType c: SelectionModeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

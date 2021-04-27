
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
     * 						Indicates that mandatory and recommended Item Specifics will be pre-filled after a successful <b>Add</b>/<b>Revise</b>/<b>Relist</b> call if eBay is able to match a provided eBay Product ID (ePID), Global Trade Identification Number (UPC, EAN, ISBN), or Brand/MPN pair to an eBay catalog product.
     * 					
     * 
     */
    @XmlEnumValue("Prefilled")
    PREFILLED("Prefilled"),

    /**
     * 
     * 						Indicates that the seller must use the exact string provided in the corresponding <b>NameRecommendation.Name</b> field when creating, revising, or relisting an item and using that particular Item Specific.
     * 					
     * 
     */
    @XmlEnumValue("SelectionOnly")
    SELECTION_ONLY("SelectionOnly"),

    /**
     * 
     * 						Indicates that the seller is allowed to specify their own value(s) for the corresponding Item Specific when creating, revising, or relisting an item and using that particular Item Specific.
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


package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeSortTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeSortTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="DisputeCreatedTimeAscending"/>
 *     &lt;enumeration value="DisputeCreatedTimeDescending"/>
 *     &lt;enumeration value="DisputeStatusAscending"/>
 *     &lt;enumeration value="DisputeStatusDescending"/>
 *     &lt;enumeration value="DisputeCreditEligibilityAscending"/>
 *     &lt;enumeration value="DisputeCreditEligibilityDescending"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeSortTypeCodeType")
@XmlEnum
public enum DisputeSortTypeCodeType {


    /**
     * 
     * 						This is the default value. If this value is used in the <b>DisputeSortType</b> field, or if the <b>DisputeSortType</b> field is omitted from the <b>GetUserDisputes</b> request, retrieved disputes are sorted according to dispute creation time, in descending order.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						If this value is used in the <b>DisputeSortType</b> field,  retrieved disputes are sorted according to dispute creation time, in ascending order.
     * 					
     * 
     */
    @XmlEnumValue("DisputeCreatedTimeAscending")
    DISPUTE_CREATED_TIME_ASCENDING("DisputeCreatedTimeAscending"),

    /**
     * 
     * 					If this value is used in the <b>DisputeSortType</b> field,  retrieved disputes are sorted according to dispute creation time, in descending order.
     * 					
     * 
     */
    @XmlEnumValue("DisputeCreatedTimeDescending")
    DISPUTE_CREATED_TIME_DESCENDING("DisputeCreatedTimeDescending"),

    /**
     * 
     * 					If this value is used in the <b>DisputeSortType</b> field,  retrieved disputes are sorted according to dispute status, in ascending order.
     * 					
     * 
     */
    @XmlEnumValue("DisputeStatusAscending")
    DISPUTE_STATUS_ASCENDING("DisputeStatusAscending"),

    /**
     * 
     * 					If this value is used in the <b>DisputeSortType</b> field,  retrieved disputes are sorted according to dispute status, in descending order.
     * 					
     * 
     */
    @XmlEnumValue("DisputeStatusDescending")
    DISPUTE_STATUS_DESCENDING("DisputeStatusDescending"),

    /**
     * 
     * 					If this value is used in the <b>DisputeSortType</b> field,  retrieved disputes are sorted according to whether the disputes are eligible for a Final Value Fee credit to the seller, in ascending order. In other words, disputes ineligible for a FVF credit are listed before disputes that are eligible for a FVF credit.
     * 					
     * 
     */
    @XmlEnumValue("DisputeCreditEligibilityAscending")
    DISPUTE_CREDIT_ELIGIBILITY_ASCENDING("DisputeCreditEligibilityAscending"),

    /**
     * 
     * 					If this value is used in the <b>DisputeSortType</b> field,  retrieved disputes are sorted according to whether the disputes are eligible for a Final Value Fee credit to the seller, in descending order. In other words, disputes eligible for a FVF credit are listed before disputes that are not eligible for a FVF credit.
     * 					
     * 
     */
    @XmlEnumValue("DisputeCreditEligibilityDescending")
    DISPUTE_CREDIT_ELIGIBILITY_DESCENDING("DisputeCreditEligibilityDescending"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeSortTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeSortTypeCodeType fromValue(String v) {
        for (DisputeSortTypeCodeType c: DisputeSortTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Shipped"/>
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Authenticated"/>
 *     &lt;enumeration value="InProcess"/>
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="CancelPending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "OrderStatusCodeType")
@XmlEnum
public enum OrderStatusCodeType {


    /**
     * 
     * 						This value indicates that the cart is active. The 'Active' state is the only order state in which order line items can still be added, removed, or updated in the cart.
     * 					
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     * 						This value indicates that the cart is inactive.
     * 					
     * 
     */
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),

    /**
     * 
     * 						This value indicates that the order is completed.
     * 					
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),

    /**
     * 
     * 						This value indicates that the cart was cancelled.
     * 					
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * 
     * 						This enumeration value is no longer applicable since this value is only applicable for Half.com listings, and API support for Half.com listings is being deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Shipped")
    SHIPPED("Shipped"),

    /**
     * 
     * 						This value indicates that the order is in default status.
     * 					
     * 
     */
    @XmlEnumValue("Default")
    DEFAULT("Default"),

    /**
     * 
     * 						This value indicates that the cart was authenticated.
     * 					
     * 
     */
    @XmlEnumValue("Authenticated")
    AUTHENTICATED("Authenticated"),

    /**
     * 
     * 						This value indicates that processing of the buyer's cart has been initiated, but is not yet complete.
     * 					
     * 
     */
    @XmlEnumValue("InProcess")
    IN_PROCESS("InProcess"),

    /**
     * 
     * 						This value indicates that the cart is invalid, or no longer exists.
     * 					
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This value is passed into the <b>OrderStatus</b> of <b>GetOrders</b> to retrieve order in all states. This is the default value.
     * 					
     * 
     */
    @XmlEnumValue("All")
    ALL("All"),

    /**
     * 
     * 						This value indicates that a buyer has initiated a cancellation request on the order. If a seller sees an order in this state, that seller must either approve or reject the cancellation request through My eBay Web flows or through the Post-Order API cancellation calls.
     * 						<br/><br/>
     * 						This <code>CancelPending</code> value can be used as a filter in the <b>GetOrders</b> call request to discover recent buyer-initiated cancellations.
     * 					
     * 
     */
    @XmlEnumValue("CancelPending")
    CANCEL_PENDING("CancelPending");
    private final String value;

    OrderStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderStatusCodeType fromValue(String v) {
        for (OrderStatusCodeType c: OrderStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

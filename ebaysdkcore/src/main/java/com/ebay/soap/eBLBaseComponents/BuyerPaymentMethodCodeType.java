
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyerPaymentMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuyerPaymentMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="MOCC"/>
 *     &lt;enumeration value="AmEx"/>
 *     &lt;enumeration value="PaymentSeeDescription"/>
 *     &lt;enumeration value="CCAccepted"/>
 *     &lt;enumeration value="PersonalCheck"/>
 *     &lt;enumeration value="COD"/>
 *     &lt;enumeration value="VisaMC"/>
 *     &lt;enumeration value="PaisaPayAccepted"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PayPal"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="CashOnPickup"/>
 *     &lt;enumeration value="MoneyXferAccepted"/>
 *     &lt;enumeration value="MoneyXferAcceptedInCheckout"/>
 *     &lt;enumeration value="OtherOnlinePayments"/>
 *     &lt;enumeration value="Escrow"/>
 *     &lt;enumeration value="PrePayDelivery"/>
 *     &lt;enumeration value="CODPrePayDelivery"/>
 *     &lt;enumeration value="PostalTransfer"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="LoanCheck"/>
 *     &lt;enumeration value="CashInPerson"/>
 *     &lt;enumeration value="ELV"/>
 *     &lt;enumeration value="PaisaPayEscrow"/>
 *     &lt;enumeration value="PaisaPayEscrowEMI"/>
 *     &lt;enumeration value="IntegratedMerchantCreditCard"/>
 *     &lt;enumeration value="Moneybookers"/>
 *     &lt;enumeration value="Paymate"/>
 *     &lt;enumeration value="ProPay"/>
 *     &lt;enumeration value="PayOnPickup"/>
 *     &lt;enumeration value="Diners"/>
 *     &lt;enumeration value="StandardPayment"/>
 *     &lt;enumeration value="DirectDebit"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="PayUponInvoice"/>
 *     &lt;enumeration value="QIWI"/>
 *     &lt;enumeration value="PayPalCredit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BuyerPaymentMethodCodeType")
@XmlEnum
public enum BuyerPaymentMethodCodeType {


    /**
     * 
     * 						This enumeration value indicates that no payment method has been specified for the listing. This may be the case for a classified ad listing, since payment happens outside of the eBay platform.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						This enumeration value indicates that a money order or cashiers check is accepted for payment.
     * 					
     * 
     */
    MOCC("MOCC"),

    /**
     * 
     * 						This enumeration value indicates that American Express is accepted for payment.
     * 					
     * 
     */
    @XmlEnumValue("AmEx")
    AM_EX("AmEx"),

    /**
     * 
     * 						This enumeration value indicates that buyers should check the listing description for more details on payment. This may be the case for a classified ad listing, since payment happens outside of the eBay platform.
     * 					
     * 
     */
    @XmlEnumValue("PaymentSeeDescription")
    PAYMENT_SEE_DESCRIPTION("PaymentSeeDescription"),

    /**
     * 
     * 						This enumeration value indicates that credit cards are accepted for payment.
     * 						<br/><br/>
     * 						<span class="tablenote"><b>Note: </b>
     * 							This enumeration value is also returned in the response of order management calls if the seller is opted in to eBay Managed Payments, and the buyer used an eBay gift card to pay the full or partial balance of the order.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("CCAccepted")
    CC_ACCEPTED("CCAccepted"),

    /**
     * 
     * 						This enumeration value indicates that a personal check is accepted for payment.
     * 					
     * 
     */
    @XmlEnumValue("PersonalCheck")
    PERSONAL_CHECK("PersonalCheck"),

    /**
     * 
     * 						This enumeration value indicates that cash on delivery of item is accepted for payment.
     * 					
     * 
     */
    COD("COD"),

    /**
     * 
     * 						This enumeration value indicates that Visa or MasterCard are accepted for payment.
     * 					
     * 
     */
    @XmlEnumValue("VisaMC")
    VISA_MC("VisaMC"),

    /**
     * 
     * 						This enumeration value indicates that PaisaPay is accepted for payment. This form of payment is only available to buyers in India.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayAccepted")
    PAISA_PAY_ACCEPTED("PaisaPayAccepted"),

    /**
     * 
     * 						This enumeration value may be returned if the payment method is unknown.
     * 					
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     * 						This enumeration value indicates that PayPal is accepted as a payment method. If PayPal is set by the seller as an accepted payment method, the seller must also supply their PayPal email address through the <b>Item.PayPalEmailAddress</b> field in an Add/Revise/Relist call. <br>
     * 						<br>
     * 						If you don't pass PayPal in the listing request but the seller's eBay
     * 						preferences are set to accept PayPal on all listings,
     * 						eBay will add PayPal as a payment method for you in most cases,
     * 						and we may return a warning. <br>
     * 						<br>
     * 						Except for sellers opted in to eBay Managed Payments, PayPal must be the only accepted payment method to enable the immediate payment feature (Item.AutoPay). PayPal must be accepted for charity listings. PayPal must be accepted for event ticket listings when the venue is in New York state or Illinois, so that eBay can offer buyer protection (per state law). (For some applications, it may be simplest to use errors returned from VerifyAddItem to flag the PayPal requirement for New York and Illinois ticket listings.) PayPal must be accepted for US eBay Motors listings that require a deposit (and it will not be set automatically based on the seller's preferences). Conversely, if PayPal is specified for US eBay Motors listings, deposit attributes must be specified.<br>
     * 					
     * 
     */
    @XmlEnumValue("PayPal")
    PAY_PAL("PayPal"),

    /**
     * 
     * 						This enumeration value indicates that Discover Card is accepted for payment.
     * 					
     * 
     */
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),

    /**
     * 
     * 						This enumeration value indicates that cash on pickup is accepted for payment.
     * 					
     * 
     */
    @XmlEnumValue("CashOnPickup")
    CASH_ON_PICKUP("CashOnPickup"),

    /**
     * 
     * 						This enumeration value indicates that a direct transfer of money is accepted for payment.
     * 					
     * 
     */
    @XmlEnumValue("MoneyXferAccepted")
    MONEY_XFER_ACCEPTED("MoneyXferAccepted"),

    /**
     * 
     * 						This enumeration value indicates that a direct transfer of money during checkout is accepted for payment.
     * 					
     * 
     */
    @XmlEnumValue("MoneyXferAcceptedInCheckout")
    MONEY_XFER_ACCEPTED_IN_CHECKOUT("MoneyXferAcceptedInCheckout"),

    /**
     * 
     * 						This enumeration value may be returned if the payment method is unknown.
     * 					
     * 
     */
    @XmlEnumValue("OtherOnlinePayments")
    OTHER_ONLINE_PAYMENTS("OtherOnlinePayments"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("Escrow")
    ESCROW("Escrow"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("PrePayDelivery")
    PRE_PAY_DELIVERY("PrePayDelivery"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CODPrePayDelivery")
    COD_PRE_PAY_DELIVERY("CODPrePayDelivery"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("PostalTransfer")
    POSTAL_TRANSFER("PostalTransfer"),

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
     * 						This enumeration value indicates that a loan check is accepted for payment. This option is generally only applicable to motor vehicle listings.
     * 					
     * 
     */
    @XmlEnumValue("LoanCheck")
    LOAN_CHECK("LoanCheck"),

    /**
     * 
     * 						This enumeration value indicates that cash is accepted for payment. This option is generally only applicable to motor vehicle listings on the US and Canada sites.
     * 					
     * 
     */
    @XmlEnumValue("CashInPerson")
    CASH_IN_PERSON("CashInPerson"),

    /**
     * 
     * 						Elektronisches Lastschriftverfahren (direct debit).
     * 						Only applicable to the Express Germany site, which has been shut down.
     * 					
     * 
     */
    ELV("ELV"),

    /**
     * 
     * 						This payment type is no longer applicable since eBay India is no longer a functioning site.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayEscrow")
    PAISA_PAY_ESCROW("PaisaPayEscrow"),

    /**
     * 
     * 						This payment type is no longer applicable since eBay India is no longer a functioning site.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayEscrowEMI")
    PAISA_PAY_ESCROW_EMI("PaisaPayEscrowEMI"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b>
     * 							This enumeration value should no longer be passed in as an accepted payment method on any eBay marketplace. If this value is specified in an Add/Revise/Relist call, it will be ignored and dropped. eBay no longer supports electronic payments through Integrated Merchant Credit Card accounts. To accept online credit card payments from buyers, a seller must use specify 'PayPal' as a payment method, and the buyer can pay by credit card through their PayPal account, or the seller must opt in to eBay Managed Payments program, and eBay will process credit card payments.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("IntegratedMerchantCreditCard")
    INTEGRATED_MERCHANT_CREDIT_CARD("IntegratedMerchantCreditCard"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						This payment method is no longer an acceptable form of payment. Sellers may no longer offer this payment method to buyers when creating new listings.
     * 						</span>
     * 						<br>
     * 						The Moneybookers payment method.
     * 						For more information, see http://www.moneybookers.com/partners/us/ebay.
     * 						Only applicable to the US site (and
     * 						to the Parts and Accessories category of the US eBay Motors site).
     * 					
     * 
     */
    @XmlEnumValue("Moneybookers")
    MONEYBOOKERS("Moneybookers"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						This payment method is no longer an acceptable form of payment. Sellers may no longer offer this payment method to buyers when creating new listings.
     * 						</span>
     * 						<br>
     * 						The Paymate payment method. This payment method is only accepted on the eBay Australia site. For more information on setting up Paymate as an accepted payment method on the eBay Australia site,
     * 						see the <a href="http://www.paymate.com/cms/index.php/sellers/sell-on-ebay/selling-on-ebay" target="_blank">Sell with Paymate on eBay.com.au</a> help page.
     * 					
     * 
     */
    @XmlEnumValue("Paymate")
    PAYMATE("Paymate"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						This payment method is no longer an acceptable form of payment. Sellers may no longer offer this payment method to buyers when creating new listings.
     * 						</span>
     * 						<br>
     * 						The ProPay payment method. US site only. For more information,
     * 						see http://www.Propay.com/eBay.
     * 					
     * 
     */
    @XmlEnumValue("ProPay")
    PRO_PAY("ProPay"),

    /**
     * 
     * 						PayOnPickup payment method. PayOnPickup is the same as CashOnPickup.
     * 						For listings on the eBay US site, the user interface refers to this feature as Pay on pickup.
     * 						In the user interface of your application, please refer to the feature as Pay on pickup so that
     * 						the name in your user interface corresponds to the name on the eBay US site.
     * 					
     * 
     */
    @XmlEnumValue("PayOnPickup")
    PAY_ON_PICKUP("PayOnPickup"),

    /**
     * 
     * 						This enumeration value indicates that the Diners Club credit card is accepted for payment.
     * 					
     * 
     */
    @XmlEnumValue("Diners")
    DINERS("Diners"),

    /**
     * 
     * 						This value is no longer used.
     * 					
     * 
     */
    @XmlEnumValue("StandardPayment")
    STANDARD_PAYMENT("StandardPayment"),

    /**
     * 
     * 						This value indicates that a debit card can be used/was used to pay for the order. This payment method value must be passed in one of the <b>Item.PaymentMethods</b> fields if the seller is making the item available for eBay Now delivery. For eBay Now orders, the eBay Now valet accepts debit cards as a form of payment. This value is only applicable for eBay Now orders.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebit")
    DIRECT_DEBIT("DirectDebit"),

    /**
     * 
     * 						This enumeration value is returned in the response of order management calls if the seller is opted in to eBay Managed Payments, and the buyer has paid for the order with any accepted payment method except an eBay gift card. If the buyer used an eBay gift card to pay the full or partial balance of the order, the <code>CCAccepted</code> value will be returned instead.
     * 						<br/><br/>
     * 						This is not an enumeration value that a seller would pass in as an accepted payment method.
     * 					
     * 
     */
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),

    /**
     * 
     * 						This buyer payment method is only applicable for the Germany site and is associated with the rollout of Progressive Checkout and the Pay Upon Invoice feature. 'PayUponInvoice' is not a payment method that is offered to the buyer, but instead, eBay/PayPal makes the determination (based on several factors) during checkout whether the buyer is eligible for 'Pay Upon Invoice'. If the buyer is offered the 'Pay Upon Invoice' option, that buyer is not required to pay for the order until an order invoice is sent by the seller. The seller must offer PayPal as a payment option or the 'Pay Upon Invoice' option will not be made available to the buyer under any circumstance.
     * 						<br><br>
     * 						Only select categories on the Germany site will support the 'Pay Upon Invoice' option, and orders going above the two-thousand dollar EURO mark will not be eligible for 'Pay Upon Invoice'.
     * 						<br><br>
     * 						Since the seller can not specify 'Pay Upon Invoice' as a payment method, this enumeration value cannot be passed into a <b>Item.PaymentMethods</b> field in an Add/Revise/Relist call.
     * 					
     * 
     */
    @XmlEnumValue("PayUponInvoice")
    PAY_UPON_INVOICE("PayUponInvoice"),

    /**
     * 
     * 					This value indicates that QIWI can be used/was used by Russian buyers to pay for the order. This payment method value must be passed in one of the <b>Item.PaymentMethods</b> fields in an Add/Revise/Relist API call if the seller wants to make QIWI an available payment method for Russian buyers. QIWI works in conjunction with PayPal, so if 'QIWI' is set as an available payment method, 'PayPal' must be specified as well. This value can only be specified on the eBay US site, and it is only applicable for Russian buyers.
     * 				
     * 
     */
    QIWI("QIWI"),

    /**
     * 
     * 					This value indicates that a PayPal credit card can be used/was used to pay for the order.
     * 				
     * 
     */
    @XmlEnumValue("PayPalCredit")
    PAY_PAL_CREDIT("PayPalCredit");
    private final String value;

    BuyerPaymentMethodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuyerPaymentMethodCodeType fromValue(String v) {
        for (BuyerPaymentMethodCodeType c: BuyerPaymentMethodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

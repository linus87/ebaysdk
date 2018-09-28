
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductRequiredCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductRequiredCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ProductRequiredCodeType")
@XmlEnum
public enum ProductRequiredCodeType {


    /**
     * 
     * 						If this enumeration value is returned for a brand, the eBay seller is not required to use an eBay catalog product when creating or revising their listing in this category for this product brand. Although not required, the seller will still have an option to use an eBay catalog product if one exists for their product.
     * 						<br/><br/>
     * 						<span class="tablenote"><b>Note: </b> Through 'Phase 1' of the Product-Based Shopping Experience requirement, scheduled to start being enforced in May 2018, the <b>ProductRequired</b> field will only be returned if <code>Enabled</code> for the product brand. However, with 'Phase 2' of the Product-Based Shopping Experience requirement, scheduled to start being enforced in August 2018, the <b>ProductRequired</b> field will get returned (whether it is <code>Enabled</code> or <code>Disabled</code>) for all product brands if the mandate applies to the eBay category. For more information about the Product-Based Shopping Experience requirement, see the <a href="https://developer.ebay.com/api-docs/sell/static/inventory/pbc_playbook.html" target="_blank">Product-Based Shopping Experience Playbook</a>.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * 
     * 						If this enumeration value is returned, the eBay seller is required to use an eBay catalog product when creating or revising their listing in this category for this product brand. A listing can be associated with an eBay catalog product by using the Add/Revise listing calls of the Trading API, or with the <a href="https://developer.ebay.com/api-docs/sell/inventory/overview.html" target="_blank">Inventory API</a>. For complete information on how to create or revise a listing using a eBay catalog product, see the <a href="https://developer.ebay.com/api-docs/sell/static/inventory/pbc_playbook.html#CreatingRevisingListings" target="_blank">Creating/Revising Listings with a Catalog Product</a> section in the <b>Product-Based Shopping Experience Playbook</b>.
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 				  
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ProductRequiredCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductRequiredCodeType fromValue(String v) {
        for (ProductRequiredCodeType c: ProductRequiredCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

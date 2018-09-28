
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailNameCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DetailNameCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CountryDetails"/>
 *     &lt;enumeration value="CurrencyDetails"/>
 *     &lt;enumeration value="PaymentOptionDetails"/>
 *     &lt;enumeration value="RegionDetails"/>
 *     &lt;enumeration value="ShippingLocationDetails"/>
 *     &lt;enumeration value="ShippingServiceDetails"/>
 *     &lt;enumeration value="SiteDetails"/>
 *     &lt;enumeration value="TaxJurisdiction"/>
 *     &lt;enumeration value="URLDetails"/>
 *     &lt;enumeration value="TimeZoneDetails"/>
 *     &lt;enumeration value="RegionOfOriginDetails"/>
 *     &lt;enumeration value="DispatchTimeMaxDetails"/>
 *     &lt;enumeration value="ItemSpecificDetails"/>
 *     &lt;enumeration value="UnitOfMeasurementDetails"/>
 *     &lt;enumeration value="ShippingPackageDetails"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="ShippingCarrierDetails"/>
 *     &lt;enumeration value="ListingStartPriceDetails"/>
 *     &lt;enumeration value="ReturnPolicyDetails"/>
 *     &lt;enumeration value="BuyerRequirementDetails"/>
 *     &lt;enumeration value="ListingFeatureDetails"/>
 *     &lt;enumeration value="VariationDetails"/>
 *     &lt;enumeration value="ExcludeShippingLocationDetails"/>
 *     &lt;enumeration value="RecoupmentPolicyDetails"/>
 *     &lt;enumeration value="ShippingCategoryDetails"/>
 *     &lt;enumeration value="ProductDetails"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DetailNameCodeType")
@XmlEnum
public enum DetailNameCodeType {


    /**
     * 
     * 						This enumeration value is specified to list the country codes and associated name of each country. The two-digit country codes can be used when a seller is creating a 'ship-to' and/or an 'exclude ship-to' location list.
     * 					
     * 
     */
    @XmlEnumValue("CountryDetails")
    COUNTRY_DETAILS("CountryDetails"),

    /**
     * 
     * 						This enumeration value is specified to list the primary currencies of each country. The three-digit currency codes are used when a seller is expressing a dollar value in API calls. For example, the <b>currencyID</b> attribute value in the <b>StartPrice</b> field of an <b>AddItem</b> call.
     * 					
     * 
     */
    @XmlEnumValue("CurrencyDetails")
    CURRENCY_DETAILS("CurrencyDetails"),

    /**
     * 
     * 						This enumeration value is specified to view all payment methods that are accepted on the specified eBay site. Note that the accepted payment methods can vary by category and/or by listing format, so the seller may also want to make a <b>GetCategoryFeatures</b> call, passing in the listing category ID, and setting the <b>FeatureID</b> value to <code>PaymentMethods</code>.
     * 					
     * 
     */
    @XmlEnumValue("PaymentOptionDetails")
    PAYMENT_OPTION_DETAILS("PaymentOptionDetails"),

    /**
     * 
     * 						This enumeration value is specified to list the local regions within the specified country.
     * 					
     * 
     */
    @XmlEnumValue("RegionDetails")
    REGION_DETAILS("RegionDetails"),

    /**
     * 
     * 						This enumeration value is specified to list the geographical regions and country codes.
     * 					
     * 
     */
    @XmlEnumValue("ShippingLocationDetails")
    SHIPPING_LOCATION_DETAILS("ShippingLocationDetails"),

    /**
     * 
     * 						This enumeration value is specified to list the shipping service options available on the specified eBay site to ship domestic and international orders. The returned data on each available shipping service will include the shipping carrier name and service, the actual shipping service enumeration value that will be used in an <b>AddItem</b> call, the expected shipping time range, the package types that can be used for that shipping service, and whether the shipping service is for domestic or international shipping. In addition to this information, the seller will have to look for a value of <code>true</code> in the <b>ValidForSellingFlow</b> field. If the value in this field is <code>false</code>, it indicates that the shipping service is no longer available for shipping.
     * 					
     * 
     */
    @XmlEnumValue("ShippingServiceDetails")
    SHIPPING_SERVICE_DETAILS("ShippingServiceDetails"),

    /**
     * 
     * 						This enumeration value is specified to list the eBay sites that are supported in Trading API calls. The <b>SiteID</b> values that are returned for each country are specified as an HTTP header if the seller wants to see site metadata returned for that particular country.
     * 					
     * 
     */
    @XmlEnumValue("SiteDetails")
    SITE_DETAILS("SiteDetails"),

    /**
     * 
     * 						This enumeration value is specified to list the different tax jurisdictions (such as states or provinces) within the specified eBay site. The two-digit <b>JurisdictionID</b> codes that are returned are used when a seller is setting/configuring sales tax rates in a Sales Tax Table or when creating a listing. For example, the <b>SalesTax.SalesTaxState</b> field of an <b>AddItem</b> call.
     * 					
     * 
     */
    @XmlEnumValue("TaxJurisdiction")
    TAX_JURISDICTION("TaxJurisdiction"),

    /**
     * 
     * 						This enumeration value is specified to list the different eBay URLs associated with the specified eBay site.
     * 					
     * 
     */
    @XmlEnumValue("URLDetails")
    URL_DETAILS("URLDetails"),

    /**
     * 
     * 						This enumeration value is specified to list the names of the different global time zones. The returned information includes the number of hours that each time zone is either ahead or behind UTC time, and it also indicates if the time zone participates in 'Daylight Savings'.
     * 					
     * 
     */
    @XmlEnumValue("TimeZoneDetails")
    TIME_ZONE_DETAILS("TimeZoneDetails"),

    /**
     * 
     * 						This enumeration value is specified to list all international regions and individual countries.
     * 					
     * 
     */
    @XmlEnumValue("RegionOfOriginDetails")
    REGION_OF_ORIGIN_DETAILS("RegionOfOriginDetails"),

    /**
     * 
     * 						This enumeration value is specified to list the handling time values (in number of business days) that the seller can set on a listing. The seller must ship an order line item within this time or risk getting a seller defect. For the US, the supported handling times are 0-3 days. Some listing categories supported 'extended handling' time, and if this is the case, the handling times will be longer, and the <b>ExtendedHandling</b> field will be returned as <code>true</code>.
     * 					
     * 
     */
    @XmlEnumValue("DispatchTimeMaxDetails")
    DISPATCH_TIME_MAX_DETAILS("DispatchTimeMaxDetails"),

    /**
     * 
     * 						This enumeration value is specified to list the maximum thresholds for Item Specifics in listings. These thresholds include the maximum number of item specifics that can be used for an item (or item variation), as well as the maximum number of characters that can be used for Item Specific names and values.
     * 					
     * 
     */
    @XmlEnumValue("ItemSpecificDetails")
    ITEM_SPECIFIC_DETAILS("ItemSpecificDetails"),

    /**
     * 
     * 					This enumeration value is no longer applicable, and should not be used.
     * 					
     * 				
     * 
     */
    @XmlEnumValue("UnitOfMeasurementDetails")
    UNIT_OF_MEASUREMENT_DETAILS("UnitOfMeasurementDetails"),

    /**
     * 
     * 						This enumeration value is specified to list the shipping package types that are supported by the specified eBay site. A seller can also just use the <b>ShippingServiceDetails</b> filter, and the supported shipping package types for each shipping service option will be returned.
     * 					
     * 
     */
    @XmlEnumValue("ShippingPackageDetails")
    SHIPPING_PACKAGE_DETAILS("ShippingPackageDetails"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This enumeration value is specified to list the shipping carriers supported by the specified eBay site for domestic and international shipping.
     * 					
     * 
     */
    @XmlEnumValue("ShippingCarrierDetails")
    SHIPPING_CARRIER_DETAILS("ShippingCarrierDetails"),

    /**
     * 
     * 						This enumeration value is specified to list the minimum starting prices for each applicable listing format for the specified eBay site. The price input into the <b>StartPrice</b> field of an <b>AddItem</b> call must be at or above this minimum threshold value or the listing will be blocked.
     * 					
     * 
     */
    @XmlEnumValue("ListingStartPriceDetails")
    LISTING_START_PRICE_DETAILS("ListingStartPriceDetails"),

    /**
     * 
     * 						This enumeration value is specified to list the return policy values that can be passed in through the <b>ReturnPolicy</b> container of an Add/Revise/Relist API call. These value include the 'Money back' options that the seller can make available to the buyers, the return period, and the restocking fee percentage (if the seller decides to charge a restocking fee.
     * 					
     * 
     */
    @XmlEnumValue("ReturnPolicyDetails")
    RETURN_POLICY_DETAILS("ReturnPolicyDetails"),

    /**
     * 
     * 						This value is specified to list the Buyer Requirement values that can be passed in through the <b>BuyerRequirementDetails</b> container of an Add/Revise/Relist API call.
     * 					
     * 
     */
    @XmlEnumValue("BuyerRequirementDetails")
    BUYER_REQUIREMENT_DETAILS("BuyerRequirementDetails"),

    /**
     * 
     * 						This value is specified to list the listing features/upgrades that are enabled or disabled for the specified site.
     * 					
     * 
     */
    @XmlEnumValue("ListingFeatureDetails")
    LISTING_FEATURE_DETAILS("ListingFeatureDetails"),

    /**
     * 
     * 						This value is specified to list the maximum thresholds when using multi-variation listings.
     * 					
     * 
     */
    @XmlEnumValue("VariationDetails")
    VARIATION_DETAILS("VariationDetails"),

    /**
     * 
     * 						This value is specified to list the geographical regions and individual countries that can be passed in to the <b>ShippingDetails.ExcludeShipToLocation</b> field in an Add/Revise/Relist API call. Multiple <b>ShippingDetails.ExcludeShipToLocation</b> can be used, and any region or country value that is passed in to one of these fields will exclude that region or country as a "ship-to" location.
     * 					
     * 
     */
    @XmlEnumValue("ExcludeShippingLocationDetails")
    EXCLUDE_SHIPPING_LOCATION_DETAILS("ExcludeShippingLocationDetails"),

    /**
     * 
     * 						This value is specified to list whether or not a recoupment policy is enforced on either the listing site or the seller's registration site.
     * 					
     * 
     */
    @XmlEnumValue("RecoupmentPolicyDetails")
    RECOUPMENT_POLICY_DETAILS("RecoupmentPolicyDetails"),

    /**
     * 
     * 						This value is specified to list the shipping service categories (Standard, Expedited, Economy) supported for the site.
     * 					
     * 
     */
    @XmlEnumValue("ShippingCategoryDetails")
    SHIPPING_CATEGORY_DETAILS("ShippingCategoryDetails"),

    /**
     * 
     * 						Specify this value to get the appropriate text to insert into a product
     * 						identifier field (EAN, ISBN, UPC, MPN/Brand) if eBay is prompting/expecting
     * 						one of these fields in the call request, but the identifiers do not
     * 						exist/apply for the product. The
     * 						<b>ProductDetails.ProductIdentifierUnavailableText</b> field that
     * 						is returned in the response will contain the actual text that should be passed
     * 						into the relevant product identification fields when creating a listing.
     * 					
     * 
     */
    @XmlEnumValue("ProductDetails")
    PRODUCT_DETAILS("ProductDetails");
    private final String value;

    DetailNameCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DetailNameCodeType fromValue(String v) {
        for (DetailNameCodeType c: DetailNameCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

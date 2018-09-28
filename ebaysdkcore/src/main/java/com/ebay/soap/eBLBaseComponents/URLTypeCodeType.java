
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for URLTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="URLTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ViewItemURL"/>
 *     &lt;enumeration value="ViewUserURL"/>
 *     &lt;enumeration value="MyeBayURL"/>
 *     &lt;enumeration value="MyeBayBiddingURL"/>
 *     &lt;enumeration value="MyeBayNotWonURL"/>
 *     &lt;enumeration value="MyeBayWonURL"/>
 *     &lt;enumeration value="MyeBayWatchingURL"/>
 *     &lt;enumeration value="eBayStoreURL"/>
 *     &lt;enumeration value="SmallLogoURL"/>
 *     &lt;enumeration value="MediumLogoURL"/>
 *     &lt;enumeration value="LargeLogoURL"/>
 *     &lt;enumeration value="CreateProductUrl"/>
 *     &lt;enumeration value="AppealProductUrl"/>
 *     &lt;enumeration value="ManageProductUrl"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "URLTypeCodeType")
@XmlEnum
public enum URLTypeCodeType {


    /**
     * 
     * 						This value indicates that the URL in the corresponding <b>URL</b> field is the base URL for the View Item page. The user will just input the Item ID for a listing at the end of the URL to retrieve the View Item page for that listing.
     * 					
     * 
     */
    @XmlEnumValue("ViewItemURL")
    VIEW_ITEM_URL("ViewItemURL"),

    /**
     * 
     * 						This value indicates that the URL in the corresponding <b>URL</b> field is the base URL for the eBay User page. The user will just input the user ID for an eBay user at the end of the URL to retrieve the eBay User page.
     * 					
     * 
     */
    @XmlEnumValue("ViewUserURL")
    VIEW_USER_URL("ViewUserURL"),

    /**
     * 
     * 						This value indicates that the URL in the corresponding <b>URL</b> field is the URL for the My eBay home page.
     * 					
     * 
     */
    @XmlEnumValue("MyeBayURL")
    MYE_BAY_URL("MyeBayURL"),

    /**
     * 
     * 						This value indicates that the URL in the corresponding <b>URL</b> field is the URL for the user's My eBay Bids/Offer page.
     * 					
     * 
     */
    @XmlEnumValue("MyeBayBiddingURL")
    MYE_BAY_BIDDING_URL("MyeBayBiddingURL"),

    /**
     * 
     * 						This value indicates that the URL in the corresponding <b>URL</b> field is the URL to the 'Didn't Win' section on the user's My eBay Bids/Offer page.
     * 					
     * 
     */
    @XmlEnumValue("MyeBayNotWonURL")
    MYE_BAY_NOT_WON_URL("MyeBayNotWonURL"),

    /**
     * 
     * 						This value indicates that the URL in the corresponding <b>URL</b> field is the URL to the 'Bidding' section on the user's My eBay Bids/Offer page.
     * 					
     * 
     */
    @XmlEnumValue("MyeBayWonURL")
    MYE_BAY_WON_URL("MyeBayWonURL"),

    /**
     * 
     * 						This value indicates that the URL in the corresponding <b>URL</b> field is the URL to the user's My eBay Watch List page.
     * 					
     * 
     */
    @XmlEnumValue("MyeBayWatchingURL")
    MYE_BAY_WATCHING_URL("MyeBayWatchingURL"),

    /**
     * 
     * 						This value indicates that the URL in the corresponding <b>URL</b> field is the base URL to the user's eBay Store page. The seller will just add a forward slash (/) and their eBay Store name to get to their eBay Store home page.
     * 					
     * 
     */
    @XmlEnumValue("eBayStoreURL")
    E_BAY_STORE_URL("eBayStoreURL"),

    /**
     * 
     * 						This value indicates that the URL in the corresponding <b>URL</b> field is the full URL to the small version of the eBay Marketplace logo.
     * 					
     * 
     */
    @XmlEnumValue("SmallLogoURL")
    SMALL_LOGO_URL("SmallLogoURL"),

    /**
     * 
     * 						This value indicates that the URL in the corresponding <b>URL</b> field is the full URL to the medium version of the eBay Marketplace logo.
     * 					
     * 
     */
    @XmlEnumValue("MediumLogoURL")
    MEDIUM_LOGO_URL("MediumLogoURL"),

    /**
     * 
     * 						This value indicates that the URL in the corresponding <b>URL</b> field is the full URL to the large version of the eBay Marketplace logo.
     * 					
     * 
     */
    @XmlEnumValue("LargeLogoURL")
    LARGE_LOGO_URL("LargeLogoURL"),

    /**
     * 
     * 						This value indicates that the URL in the corresponding <b>URL</b> field is the base URL that a seller needs to enter the UI flow to make a request that a missing product be added to the eBay Catalog.
     * 						<br/>
     * 						<br/>
     * 						The seller will also have to use a valid OAuth token, and will pass in this OAuth token through an <b>id_token</b> query parameter. So, for the US site (the base URL will vary by site), the HTTPS Sandbox endpoint might look like the following:
     * 						<br/>
     * 						<br/>
     * 						<code>https://www.sandbox.ebay.com/slr/prd?id_token</code>=<em>Oauth_token</em>
     * 						<br/>
     * 						<br/>
     * 						Different base URLs will be returned depending on whether you call <b>GeteBayDetails</b> in Sandbox or Production environment. As of April 2018, this URL and the create catalog product flow is only available in the Sandbox environment. This URL and the create catalog product flow will become available in the Production environment in August 2018 with the launch of Product-Based Shopping Experience Phase 2. See the <a href="
     *             https://developer.ebay.com/pbse" target="_blank">Product-Based Shopping Experience landing page</a> for more information.
     * 						<br/>
     * 						<br/>
     * 						For more information on getting OAuth access tokens, see our <a href="
     *             https://developer.ebay.com/api-docs/static/oauth-tokens.html" target="_blank">OAuth access tokens</a> help topic.
     * 					
     * 
     */
    @XmlEnumValue("CreateProductUrl")
    CREATE_PRODUCT_URL("CreateProductUrl"),

    /**
     * 
     * 						This value indicates that the URL in the corresponding <b>URL</b> field is the base URL that a seller needs to enter the UI flow to make a request that an existing eBay Catalog product be revised. The seller will have to append the ePID value of the catalog product to the end of the URL.
     * 						<br/>
     * 						<br/>
     * 						The seller will also have to use a valid OAuth token, and will pass in this OAuth token through an <b>id_token</b> query parameter. So, for the US site (the base URL will vary by site), the HTTPS Sandbox endpoint might look like the following:
     * 						<br/>
     * 						<br/>
     * 						<code>https://www.sandbox.ebay.com/slr/prd/149167716?id_token</code>=<em>Oauth_token</em>, where '149167716' is the ePID of the catalog product.
     * 						<br/>
     * 						<br/>
     * 						Different base URLs will be returned depending on whether you call <b>GeteBayDetails</b> in Sandbox or Production environment. As of April 2018, this URL and the appeal catalog product flow is only available in the Sandbox environment. This URL and the create catalog product flow will become available in the Production environment in August 2018 with the launch of Product-Based Shopping Experience Phase 2. See the <a href="
     *             https://developer.ebay.com/pbse" target="_blank">Product-Based Shopping Experience landing page</a> for more information.
     * 						<br/>
     * 						<br/>
     * 						For more information on getting OAuth access tokens, see our <a href="
     *             https://developer.ebay.com/api-docs/static/oauth-tokens.html" target="_blank">OAuth access tokens</a> help topic.
     * 					
     * 
     */
    @XmlEnumValue("AppealProductUrl")
    APPEAL_PRODUCT_URL("AppealProductUrl"),

    /**
     * 
     * 						This value indicates that the URL in the corresponding <b>URL</b> field is the base URL that a seller needs to enter the UI flow to get the status of a catalog change request (request for a new catalog product or request to revise an existing product). The seller will have to append the identifier of the catalog change request to the end of the URL.
     * 						<br/>
     * 						<br/>
     * 						The seller will also have to use a valid token, and will pass in this token through an <b>id_token</b> query parameter. The authentication tokens are not yet available, but eBay will be sharing detailed instructions on how to authenticate and invoke these pages soon.
     * 						<br/>
     * 						<br/>
     * 						For the US site (the base URL will vary by site), the HTTPS Sandbox endpoint might look like the following:
     * 						<br/>
     * 						<br/>
     * 						<code>https://www.sandbox.ebay.com/slr/prd/status/5ac3cf22ca4c591b0c324749?id_token</code>=<em>token_value</em>, where '5ac3cf22ca4c591b0c324749' is the identifier of the catalog change request.
     * 						<br/>
     * 						<br/>
     * 						Different base URLs will be returned depending on whether you call <b>GeteBayDetails</b> in Sandbox or Production environment. Currently, this URL and the manage catalog change request flow is only available in the Sandbox environment. This URL and the create catalog product flow will become available in the Production environment in August 2018 with the launch of Phase 2 of the Product-Based Shopping Experience. See the <a href="
     *             https://developer.ebay.com/pbse" target="_blank">Product-Based Shopping Experience landing page</a> for more information.
     * 					
     * 
     */
    @XmlEnumValue("ManageProductUrl")
    MANAGE_PRODUCT_URL("ManageProductUrl"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    URLTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static URLTypeCodeType fromValue(String v) {
        for (URLTypeCodeType c: URLTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

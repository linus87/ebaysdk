
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingEnhancementsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingEnhancementsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Border"/>
 *     &lt;enumeration value="BoldTitle"/>
 *     &lt;enumeration value="Featured"/>
 *     &lt;enumeration value="Highlight"/>
 *     &lt;enumeration value="HomePageFeatured"/>
 *     &lt;enumeration value="ProPackBundle"/>
 *     &lt;enumeration value="BasicUpgradePackBundle"/>
 *     &lt;enumeration value="ValuePackBundle"/>
 *     &lt;enumeration value="ProPackPlusBundle"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ListingEnhancementsCodeType")
@XmlEnum
public enum ListingEnhancementsCodeType {


    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						The Picture Border feature is no longer available on any eBay Marketplace sites, so this value should not be used in Add/Revise/Relist calls, and will not be returned in 'Get' calls.
     * 						</span>
     * 						<br>
     * 						If specified, the seller wants to add a border around the listing's pictures. Applicable listing fees apply.
     * 						<br>
     * 						<br>
     * 					
     * 
     */
    @XmlEnumValue("Border")
    BORDER("Border"),

    /**
     * 
     * 						This value is used if the seller wants the listing title to
     * 						be in boldface type. This feature will incur a listing fee.
     * 						Note that this enhancement will not put the listing subtitle in boldface type (if a subtitle is used).
     * 						<br>
     * 						<br>
     * 						Currently, Bold Titles are only supported on eBay US, both Canada sites, eBay Netherlands, and eBay Poland.
     * 					
     * 
     */
    @XmlEnumValue("BoldTitle")
    BOLD_TITLE("BoldTitle"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						The Featured listing feature is no longer available on any eBay Marketplace sites, so this value should not be used in Add/Revise/Relist calls, and will not be returned in 'Get' calls.
     * 						</span>
     * 						<br>
     * 						Listing is a "Featured Plus" item. The item will display
     * 						prominently in the Featured Items section of its category list, and it will
     * 						stand out on search results pages. It will also display in the regular, non-
     * 						featured item list. Only available to users with a Feedback rating of 10 or
     * 						greater.
     * 					
     * 
     */
    @XmlEnumValue("Featured")
    FEATURED("Featured"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						The Highlighted listing feature is no longer available on any eBay Marketplace sites, so this value should not be used in Add/Revise/Relist calls, and will not be returned in 'Get' calls.
     * 						</span>
     * 						<br>
     * 						Listing is highlighted in a different color in lists.
     * 					
     * 
     */
    @XmlEnumValue("Highlight")
    HIGHLIGHT("Highlight"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						The Featured Gallery listing feature is no longer available on any eBay sites, so this value should not be used in Add/Revise/Relist calls, and will not be returned in 'Get' calls.
     * 						</span>
     * 						<br>
     * 						Listing will have a chance to rotate into a special display
     * 						on eBay's Home page. Your item is very likely to show up on the Home page,
     * 						although eBay does not guarantee that your item will be highlighted
     * 						in this way. This is the highest level of visibility on eBay.
     * 					
     * 
     */
    @XmlEnumValue("HomePageFeatured")
    HOME_PAGE_FEATURED("HomePageFeatured"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						The Pro Pack Bundle is no longer available on any eBay Marketplace sites, so this value should not be used in Add/Revise/Relist calls, and will not be returned in 'Get' calls.
     * 						</span>
     * 						<br>
     * 						Listing is using ProPackBundle (a feature pack).
     * 						Applies only to vehicle listings on eBay Motors (US and Canada), and
     * 						to the Parts and Accessories category in the eBay Motors US site.
     * 						Contains the BoldTitle, Border, Featured and Highlight features.
     * 					
     * 
     */
    @XmlEnumValue("ProPackBundle")
    PRO_PACK_BUNDLE("ProPackBundle"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						The Basic Upgrade Pack Bundle is no longer available on any eBay Marketplace sites, so this value should not be used in Add/Revise/Relist calls, and will not be returned in 'Get' calls.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("BasicUpgradePackBundle")
    BASIC_UPGRADE_PACK_BUNDLE("BasicUpgradePackBundle"),

    /**
     * 
     * 						If this value is specified in an Add/Revise/Relist call, a Value Pack bundle is applied to the listing. The Value Pack bundle includes the Gallery Plus feature, a listing subtitle, and use of a Listing Designer template for a discounted price. Support for this feature varies by site and category.
     * 					
     * 
     */
    @XmlEnumValue("ValuePackBundle")
    VALUE_PACK_BUNDLE("ValuePackBundle"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						The Pro Pack Plus Bundle is no longer available on any eBay Marketplace sites, so this value should not be used in Add/Revise/Relist calls, and will not be returned in 'Get' calls.
     * 						</span>
     * 						<br>
     * 						Support for this feature varies by site and category.
     * 						A ProPackPlusBundle listing is using ProPackPlus bundle (a feature pack),
     * 						which combines the features of BoldTitle, Border, Highlight, Featured (which
     * 						is equivalent to a GalleryType value of Featured), and
     * 						Gallery, for a discounted price.
     * 						Note that if, for example, in AddItem, if you use ProPackPlusBundle and
     * 						a GalleryType value of Gallery, then the resulting item will have a GalleryType
     * 						value of Featured.
     * 					
     * 
     */
    @XmlEnumValue("ProPackPlusBundle")
    PRO_PACK_PLUS_BUNDLE("ProPackPlusBundle"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ListingEnhancementsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingEnhancementsCodeType fromValue(String v) {
        for (ListingEnhancementsCodeType c: ListingEnhancementsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

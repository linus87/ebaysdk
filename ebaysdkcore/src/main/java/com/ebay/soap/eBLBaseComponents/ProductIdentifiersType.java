
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				<span class="tablenote"><strong>Note:</strong>
 * 					This type and the <b>ProductIdentifiers</b> container were originally introduced into the Trading schema with the intention of separating Global Trade Item Numbers (GTINs) and other descriptive item specifics, but the <b>ProductIdentifiers</b> container was never wired on/returned in <b>GetCategorySpecifics</b>. Instead, users will still find one or more relevant GTIN types under a <b>Recommendations.NameRecommendation.Name</b> field in the <b>GetCategorySpecifics</b> response.
 * 				</span>
 * 			
 * 
 * <p>Java class for ProductIdentifiersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentifiersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidationRules" type="{urn:ebay:apis:eBLBaseComponents}GroupValidationRulesType"/>
 *         &lt;element name="NameRecommendation" type="{urn:ebay:apis:eBLBaseComponents}NameRecommendationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentifiersType", propOrder = {
    "validationRules",
    "nameRecommendation"
})
public class ProductIdentifiersType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ValidationRules", required = true)
    protected GroupValidationRulesType validationRules;
    @XmlElement(name = "NameRecommendation")
    protected List<NameRecommendationType> nameRecommendation;

    /**
     * Gets the value of the validationRules property.
     * 
     * @return
     *     possible object is
     *     {@link GroupValidationRulesType }
     *     
     */
    public GroupValidationRulesType getValidationRules() {
        return validationRules;
    }

    /**
     * Sets the value of the validationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupValidationRulesType }
     *     
     */
    public void setValidationRules(GroupValidationRulesType value) {
        this.validationRules = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link NameRecommendationType }
     *     
     */
    public NameRecommendationType[] getNameRecommendation() {
        if (this.nameRecommendation == null) {
            return new NameRecommendationType[ 0 ] ;
        }
        return ((NameRecommendationType[]) this.nameRecommendation.toArray(new NameRecommendationType[this.nameRecommendation.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link NameRecommendationType }
     *     
     */
    public NameRecommendationType getNameRecommendation(int idx) {
        if (this.nameRecommendation == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.nameRecommendation.get(idx);
    }

    public int getNameRecommendationLength() {
        if (this.nameRecommendation == null) {
            return  0;
        }
        return this.nameRecommendation.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link NameRecommendationType }
     *     
     */
    public void setNameRecommendation(NameRecommendationType[] values) {
        this._getNameRecommendation().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.nameRecommendation.add(values[i]);
        }
    }

    protected List<NameRecommendationType> _getNameRecommendation() {
        if (nameRecommendation == null) {
            nameRecommendation = new ArrayList<NameRecommendationType>();
        }
        return nameRecommendation;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link NameRecommendationType }
     *     
     */
    public NameRecommendationType setNameRecommendation(int idx, NameRecommendationType value) {
        return this.nameRecommendation.set(idx, value);
    }

}

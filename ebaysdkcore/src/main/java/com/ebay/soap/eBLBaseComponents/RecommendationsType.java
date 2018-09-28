
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 			This type is used to provide details about recommended Item Specifics and Product Identifier types.
 * 		
 * 
 * <p>Java class for RecommendationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecommendationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductIdentifiers" type="{urn:ebay:apis:eBLBaseComponents}ProductIdentifiersType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NameRecommendation" type="{urn:ebay:apis:eBLBaseComponents}NameRecommendationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecommendationsType", propOrder = {
    "categoryID",
    "productIdentifiers",
    "nameRecommendation",
    "updated",
    "any"
})
public class RecommendationsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "ProductIdentifiers")
    protected List<ProductIdentifiersType> productIdentifiers;
    @XmlElement(name = "NameRecommendation")
    protected List<NameRecommendationType> nameRecommendation;
    @XmlElement(name = "Updated")
    protected Boolean updated;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ProductIdentifiersType }
     *     
     */
    public ProductIdentifiersType[] getProductIdentifiers() {
        if (this.productIdentifiers == null) {
            return new ProductIdentifiersType[ 0 ] ;
        }
        return ((ProductIdentifiersType[]) this.productIdentifiers.toArray(new ProductIdentifiersType[this.productIdentifiers.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ProductIdentifiersType }
     *     
     */
    public ProductIdentifiersType getProductIdentifiers(int idx) {
        if (this.productIdentifiers == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.productIdentifiers.get(idx);
    }

    public int getProductIdentifiersLength() {
        if (this.productIdentifiers == null) {
            return  0;
        }
        return this.productIdentifiers.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ProductIdentifiersType }
     *     
     */
    public void setProductIdentifiers(ProductIdentifiersType[] values) {
        this._getProductIdentifiers().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.productIdentifiers.add(values[i]);
        }
    }

    protected List<ProductIdentifiersType> _getProductIdentifiers() {
        if (productIdentifiers == null) {
            productIdentifiers = new ArrayList<ProductIdentifiersType>();
        }
        return productIdentifiers;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentifiersType }
     *     
     */
    public ProductIdentifiersType setProductIdentifiers(int idx, ProductIdentifiersType value) {
        return this.productIdentifiers.set(idx, value);
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

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdated(Boolean value) {
        this.updated = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[ 0 ] ;
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return  0;
        }
        return this.any.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}

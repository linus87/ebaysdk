
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
 * 				PowerSeller discount information (e.g., to show in a Seller Dashboard). As a
 * 				PowerSeller, you can earn discounts on your monthly invoice Final Value Fees based
 * 				on how well you're doing as a seller.
 * 			
 * 
 * <p>Java class for SellerFeeDiscountDashboardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerFeeDiscountDashboardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "SellerFeeDiscountDashboardType", propOrder = {
    "percent",
    "any"
})
public class SellerFeeDiscountDashboardType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Percent")
    protected Float percent;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPercent(Float value) {
        this.percent = value;
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


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
 * 				Type used by the <b>PolicyViolationDuration</b> container. A <b>PolicyViolationDuration</b> container is returned for each supported period that a seller may specify through the <b>BuyerRequirementDetails.MaximumBuyerPolicyViolations</b> container in an add/revise/relist call. The <b>BuyerRequirementDetails.MaximumBuyerPolicyViolations</b> container can be used by the seller to limit the number of buyer policy violations a buyer may have during a set period before being restricted from buying an item.
 * 			
 * 
 * <p>Java class for PolicyViolationDurationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyViolationDurationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period" type="{urn:ebay:apis:eBLBaseComponents}PeriodCodeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PolicyViolationDurationDetailsType", propOrder = {
    "period",
    "description",
    "any"
})
public class PolicyViolationDurationDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Period")
    protected PeriodCodeType period;
    @XmlElement(name = "Description")
    protected String description;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodCodeType }
     *     
     */
    public PeriodCodeType getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodCodeType }
     *     
     */
    public void setPeriod(PeriodCodeType value) {
        this.period = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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

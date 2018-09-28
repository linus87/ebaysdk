
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			 This type is used to specify how many of the corresponding Product Identifier types are required to be specified at listing time.
 * 			
 * 
 * <p>Java class for GroupValidationRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupValidationRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinRequired" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupValidationRulesType", propOrder = {
    "minRequired"
})
public class GroupValidationRulesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MinRequired")
    protected int minRequired;

    /**
     * Gets the value of the minRequired property.
     * 
     */
    public int getMinRequired() {
        return minRequired;
    }

    /**
     * Sets the value of the minRequired property.
     * 
     */
    public void setMinRequired(int value) {
        this.minRequired = value;
    }

}


package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			 This type is used to specify how many of the corresponding Product Identifier types are required to be specified at listing time.
 * 			 <br/><br/>
 * 			 <span class="tablenote"><strong>Note:</strong>
 * 				This type and the <b>ProductIdentifiers</b> container was originally introduced into the Trading schema with the intention of separating Global Trade Item Numbers (GTINs) and other descriptive item specifics, but <b>ProductIdentifiers</b> container was never wired on/returned in <b>GetCategorySpecifics</b>. Instead, users will still find one or more relevant GTIN types under a <b>Recommendations.NameRecommendation.Name</b> field.
 * 			 </span>
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

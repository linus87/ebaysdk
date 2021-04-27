
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base request type for the <b>GetApiAccessRules</b> call, which returns details on how many calls your application has made and is allowed to make per hour or day.
 * 			
 * 
 * <p>Java class for GetApiAccessRulesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetApiAccessRulesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetApiAccessRulesRequestType")
public class GetApiAccessRulesRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;

}


package com.aonaware.services.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefineInDictResult" type="{http://services.aonaware.com/webservices/}WordDefinition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "defineInDictResult"
})
@XmlRootElement(name = "DefineInDictResponse")
public class DefineInDictResponse {

    @XmlElement(name = "DefineInDictResult")
    protected WordDefinition defineInDictResult;

    /**
     * Gets the value of the defineInDictResult property.
     * 
     * @return
     *     possible object is
     *     {@link WordDefinition }
     *     
     */
    public WordDefinition getDefineInDictResult() {
        return defineInDictResult;
    }

    /**
     * Sets the value of the defineInDictResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WordDefinition }
     *     
     */
    public void setDefineInDictResult(WordDefinition value) {
        this.defineInDictResult = value;
    }

}

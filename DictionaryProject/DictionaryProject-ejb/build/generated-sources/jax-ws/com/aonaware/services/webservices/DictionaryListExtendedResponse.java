
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
 *         &lt;element name="DictionaryListExtendedResult" type="{http://services.aonaware.com/webservices/}ArrayOfDictionary" minOccurs="0"/&gt;
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
    "dictionaryListExtendedResult"
})
@XmlRootElement(name = "DictionaryListExtendedResponse")
public class DictionaryListExtendedResponse {

    @XmlElement(name = "DictionaryListExtendedResult")
    protected ArrayOfDictionary dictionaryListExtendedResult;

    /**
     * Gets the value of the dictionaryListExtendedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDictionary }
     *     
     */
    public ArrayOfDictionary getDictionaryListExtendedResult() {
        return dictionaryListExtendedResult;
    }

    /**
     * Sets the value of the dictionaryListExtendedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDictionary }
     *     
     */
    public void setDictionaryListExtendedResult(ArrayOfDictionary value) {
        this.dictionaryListExtendedResult = value;
    }

}

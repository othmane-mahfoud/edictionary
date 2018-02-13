
package com.aonaware.services.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WordDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WordDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Word" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Definitions" type="{http://services.aonaware.com/webservices/}ArrayOfDefinition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WordDefinition", propOrder = {
    "word",
    "definitions"
})
public class WordDefinition {

    @XmlElement(name = "Word")
    protected String word;
    @XmlElement(name = "Definitions")
    protected ArrayOfDefinition definitions;

    /**
     * Gets the value of the word property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWord() {
        return word;
    }

    /**
     * Sets the value of the word property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWord(String value) {
        this.word = value;
    }

    /**
     * Gets the value of the definitions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDefinition }
     *     
     */
    public ArrayOfDefinition getDefinitions() {
        return definitions;
    }

    /**
     * Sets the value of the definitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDefinition }
     *     
     */
    public void setDefinitions(ArrayOfDefinition value) {
        this.definitions = value;
    }

}


package com.aonaware.services.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Definition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Word" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Dictionary" type="{http://services.aonaware.com/webservices/}Dictionary" minOccurs="0"/&gt;
 *         &lt;element name="WordDefinition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Definition", propOrder = {
    "word",
    "dictionary",
    "wordDefinition"
})
public class Definition {

    @XmlElement(name = "Word")
    protected String word;
    @XmlElement(name = "Dictionary")
    protected Dictionary dictionary;
    @XmlElement(name = "WordDefinition")
    protected String wordDefinition;

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
     * Gets the value of the dictionary property.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getDictionary() {
        return dictionary;
    }

    /**
     * Sets the value of the dictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setDictionary(Dictionary value) {
        this.dictionary = value;
    }

    /**
     * Gets the value of the wordDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWordDefinition() {
        return wordDefinition;
    }

    /**
     * Sets the value of the wordDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWordDefinition(String value) {
        this.wordDefinition = value;
    }

}

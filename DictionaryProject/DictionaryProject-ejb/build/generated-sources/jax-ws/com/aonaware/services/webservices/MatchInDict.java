
package com.aonaware.services.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="dictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="word" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strategy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "dictId",
    "word",
    "strategy"
})
@XmlRootElement(name = "MatchInDict")
public class MatchInDict {

    protected String dictId;
    protected String word;
    protected String strategy;

    /**
     * Gets the value of the dictId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictId() {
        return dictId;
    }

    /**
     * Sets the value of the dictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictId(String value) {
        this.dictId = value;
    }

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
     * Gets the value of the strategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategy() {
        return strategy;
    }

    /**
     * Sets the value of the strategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategy(String value) {
        this.strategy = value;
    }

}

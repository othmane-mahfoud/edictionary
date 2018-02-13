
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
 *         &lt;element name="StrategyListResult" type="{http://services.aonaware.com/webservices/}ArrayOfStrategy" minOccurs="0"/&gt;
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
    "strategyListResult"
})
@XmlRootElement(name = "StrategyListResponse")
public class StrategyListResponse {

    @XmlElement(name = "StrategyListResult")
    protected ArrayOfStrategy strategyListResult;

    /**
     * Gets the value of the strategyListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStrategy }
     *     
     */
    public ArrayOfStrategy getStrategyListResult() {
        return strategyListResult;
    }

    /**
     * Sets the value of the strategyListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStrategy }
     *     
     */
    public void setStrategyListResult(ArrayOfStrategy value) {
        this.strategyListResult = value;
    }

}

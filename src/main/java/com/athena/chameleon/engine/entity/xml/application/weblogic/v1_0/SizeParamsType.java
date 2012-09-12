//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.12 at 01:39:08 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.weblogic.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for size-paramsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="size-paramsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="initial-capacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="max-capacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="capacity-increment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="shrinking-enabled" type="{http://www.bea.com/ns/weblogic/weblogic-application}true-falseType" minOccurs="0"/>
 *         &lt;element name="shrink-period-minutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="shrink-frequency-seconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="highest-num-waiters" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="highest-num-unavailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "size-paramsType", namespace = "http://www.bea.com/ns/weblogic/weblogic-application", propOrder = {
    "initialCapacity",
    "maxCapacity",
    "capacityIncrement",
    "shrinkingEnabled",
    "shrinkPeriodMinutes",
    "shrinkFrequencySeconds",
    "highestNumWaiters",
    "highestNumUnavailable"
})
public class SizeParamsType {

    @XmlElement(name = "initial-capacity", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected Integer initialCapacity;
    @XmlElement(name = "max-capacity", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected Integer maxCapacity;
    @XmlElement(name = "capacity-increment", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected Integer capacityIncrement;
    @XmlElement(name = "shrinking-enabled", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected TrueFalseType shrinkingEnabled;
    @XmlElement(name = "shrink-period-minutes", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected Integer shrinkPeriodMinutes;
    @XmlElement(name = "shrink-frequency-seconds", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected Integer shrinkFrequencySeconds;
    @XmlElement(name = "highest-num-waiters", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected Integer highestNumWaiters;
    @XmlElement(name = "highest-num-unavailable", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected Integer highestNumUnavailable;

    /**
     * Gets the value of the initialCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialCapacity() {
        return initialCapacity;
    }

    /**
     * Sets the value of the initialCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialCapacity(Integer value) {
        this.initialCapacity = value;
    }

    /**
     * Gets the value of the maxCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Sets the value of the maxCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCapacity(Integer value) {
        this.maxCapacity = value;
    }

    /**
     * Gets the value of the capacityIncrement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapacityIncrement() {
        return capacityIncrement;
    }

    /**
     * Sets the value of the capacityIncrement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapacityIncrement(Integer value) {
        this.capacityIncrement = value;
    }

    /**
     * Gets the value of the shrinkingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getShrinkingEnabled() {
        return shrinkingEnabled;
    }

    /**
     * Sets the value of the shrinkingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setShrinkingEnabled(TrueFalseType value) {
        this.shrinkingEnabled = value;
    }

    /**
     * Gets the value of the shrinkPeriodMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShrinkPeriodMinutes() {
        return shrinkPeriodMinutes;
    }

    /**
     * Sets the value of the shrinkPeriodMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShrinkPeriodMinutes(Integer value) {
        this.shrinkPeriodMinutes = value;
    }

    /**
     * Gets the value of the shrinkFrequencySeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShrinkFrequencySeconds() {
        return shrinkFrequencySeconds;
    }

    /**
     * Sets the value of the shrinkFrequencySeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShrinkFrequencySeconds(Integer value) {
        this.shrinkFrequencySeconds = value;
    }

    /**
     * Gets the value of the highestNumWaiters property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHighestNumWaiters() {
        return highestNumWaiters;
    }

    /**
     * Sets the value of the highestNumWaiters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHighestNumWaiters(Integer value) {
        this.highestNumWaiters = value;
    }

    /**
     * Gets the value of the highestNumUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHighestNumUnavailable() {
        return highestNumUnavailable;
    }

    /**
     * Sets the value of the highestNumUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHighestNumUnavailable(Integer value) {
        this.highestNumUnavailable = value;
    }

}
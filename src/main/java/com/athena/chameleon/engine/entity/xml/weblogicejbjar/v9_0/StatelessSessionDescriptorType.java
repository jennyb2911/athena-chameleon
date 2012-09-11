//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.06 at 09:23:00 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.weblogicejbjar.v9_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for stateless-session-descriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stateless-session-descriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pool" type="{http://www.bea.com/ns/weblogic/90}poolType" minOccurs="0"/>
 *         &lt;element name="timer-descriptor" type="{http://www.bea.com/ns/weblogic/90}timer-descriptorType" minOccurs="0"/>
 *         &lt;element name="stateless-clustering" type="{http://www.bea.com/ns/weblogic/90}stateless-clusteringType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stateless-session-descriptorType", propOrder = {
    "pool",
    "timerDescriptor",
    "statelessClustering"
})
public class StatelessSessionDescriptorType {

    @XmlElement(namespace = "http://www.bea.com/ns/weblogic/90")
    protected PoolType pool;
    @XmlElement(name = "timer-descriptor", namespace = "http://www.bea.com/ns/weblogic/90")
    protected TimerDescriptorType timerDescriptor;
    @XmlElement(name = "stateless-clustering", namespace = "http://www.bea.com/ns/weblogic/90")
    protected StatelessClusteringType statelessClustering;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected java.lang.String id;

    /**
     * Gets the value of the pool property.
     * 
     * @return
     *     possible object is
     *     {@link PoolType }
     *     
     */
    public PoolType getPool() {
        return pool;
    }

    /**
     * Sets the value of the pool property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoolType }
     *     
     */
    public void setPool(PoolType value) {
        this.pool = value;
    }

    /**
     * Gets the value of the timerDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link TimerDescriptorType }
     *     
     */
    public TimerDescriptorType getTimerDescriptor() {
        return timerDescriptor;
    }

    /**
     * Sets the value of the timerDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimerDescriptorType }
     *     
     */
    public void setTimerDescriptor(TimerDescriptorType value) {
        this.timerDescriptor = value;
    }

    /**
     * Gets the value of the statelessClustering property.
     * 
     * @return
     *     possible object is
     *     {@link StatelessClusteringType }
     *     
     */
    public StatelessClusteringType getStatelessClustering() {
        return statelessClustering;
    }

    /**
     * Sets the value of the statelessClustering property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatelessClusteringType }
     *     
     */
    public void setStatelessClustering(StatelessClusteringType value) {
        this.statelessClustering = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}
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
 * <p>Java class for application-pool-paramsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="application-pool-paramsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="size-params" type="{http://www.bea.com/ns/weblogic/weblogic-application}size-paramsType" minOccurs="0"/>
 *         &lt;element name="xa-params" type="{http://www.bea.com/ns/weblogic/weblogic-application}xa-paramsType" minOccurs="0"/>
 *         &lt;element name="login-delay-seconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="leak-profiling-enabled" type="{http://www.bea.com/ns/weblogic/weblogic-application}true-falseType" minOccurs="0"/>
 *         &lt;element name="connection-check-params" type="{http://www.bea.com/ns/weblogic/weblogic-application}connection-check-paramsType" minOccurs="0"/>
 *         &lt;element name="jdbcxa-debug-level" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="remove-infected-connections-enabled" type="{http://www.bea.com/ns/weblogic/weblogic-application}true-falseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "application-pool-paramsType", namespace = "http://www.bea.com/ns/weblogic/weblogic-application", propOrder = {
    "sizeParams",
    "xaParams",
    "loginDelaySeconds",
    "leakProfilingEnabled",
    "connectionCheckParams",
    "jdbcxaDebugLevel",
    "removeInfectedConnectionsEnabled"
})
public class ApplicationPoolParamsType {

    @XmlElement(name = "size-params", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected SizeParamsType sizeParams;
    @XmlElement(name = "xa-params", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected XaParamsType xaParams;
    @XmlElement(name = "login-delay-seconds", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected Integer loginDelaySeconds;
    @XmlElement(name = "leak-profiling-enabled", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected TrueFalseType leakProfilingEnabled;
    @XmlElement(name = "connection-check-params", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected ConnectionCheckParamsType connectionCheckParams;
    @XmlElement(name = "jdbcxa-debug-level", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected Integer jdbcxaDebugLevel;
    @XmlElement(name = "remove-infected-connections-enabled", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected TrueFalseType removeInfectedConnectionsEnabled;

    /**
     * Gets the value of the sizeParams property.
     * 
     * @return
     *     possible object is
     *     {@link SizeParamsType }
     *     
     */
    public SizeParamsType getSizeParams() {
        return sizeParams;
    }

    /**
     * Sets the value of the sizeParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeParamsType }
     *     
     */
    public void setSizeParams(SizeParamsType value) {
        this.sizeParams = value;
    }

    /**
     * Gets the value of the xaParams property.
     * 
     * @return
     *     possible object is
     *     {@link XaParamsType }
     *     
     */
    public XaParamsType getXaParams() {
        return xaParams;
    }

    /**
     * Sets the value of the xaParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link XaParamsType }
     *     
     */
    public void setXaParams(XaParamsType value) {
        this.xaParams = value;
    }

    /**
     * Gets the value of the loginDelaySeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoginDelaySeconds() {
        return loginDelaySeconds;
    }

    /**
     * Sets the value of the loginDelaySeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoginDelaySeconds(Integer value) {
        this.loginDelaySeconds = value;
    }

    /**
     * Gets the value of the leakProfilingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getLeakProfilingEnabled() {
        return leakProfilingEnabled;
    }

    /**
     * Sets the value of the leakProfilingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setLeakProfilingEnabled(TrueFalseType value) {
        this.leakProfilingEnabled = value;
    }

    /**
     * Gets the value of the connectionCheckParams property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionCheckParamsType }
     *     
     */
    public ConnectionCheckParamsType getConnectionCheckParams() {
        return connectionCheckParams;
    }

    /**
     * Sets the value of the connectionCheckParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionCheckParamsType }
     *     
     */
    public void setConnectionCheckParams(ConnectionCheckParamsType value) {
        this.connectionCheckParams = value;
    }

    /**
     * Gets the value of the jdbcxaDebugLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJdbcxaDebugLevel() {
        return jdbcxaDebugLevel;
    }

    /**
     * Sets the value of the jdbcxaDebugLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJdbcxaDebugLevel(Integer value) {
        this.jdbcxaDebugLevel = value;
    }

    /**
     * Gets the value of the removeInfectedConnectionsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getRemoveInfectedConnectionsEnabled() {
        return removeInfectedConnectionsEnabled;
    }

    /**
     * Sets the value of the removeInfectedConnectionsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setRemoveInfectedConnectionsEnabled(TrueFalseType value) {
        this.removeInfectedConnectionsEnabled = value;
    }

}

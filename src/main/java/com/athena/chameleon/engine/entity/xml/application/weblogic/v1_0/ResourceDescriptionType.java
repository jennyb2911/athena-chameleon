//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.12 at 01:39:08 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.weblogic.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for resource-descriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resource-descriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="res-ref-name" type="{http://java.sun.com/xml/ns/javaee}jndi-nameType"/>
 *         &lt;group ref="{http://www.bea.com/ns/weblogic/weblogic-application}resource-lookup"/>
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
@XmlType(name = "resource-descriptionType", namespace = "http://www.bea.com/ns/weblogic/weblogic-application", propOrder = {
    "resRefName",
    "jndiName",
    "resourceLink"
})
public class ResourceDescriptionType {

    @XmlElement(name = "res-ref-name", namespace = "http://www.bea.com/ns/weblogic/weblogic-application", required = true)
    protected JndiNameType resRefName;
    @XmlElement(name = "jndi-name", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected com.athena.chameleon.engine.entity.xml.application.weblogic.v1_0.String jndiName;
    @XmlElement(name = "resource-link", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected com.athena.chameleon.engine.entity.xml.application.weblogic.v1_0.String resourceLink;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected java.lang.String id;

    /**
     * Gets the value of the resRefName property.
     * 
     * @return
     *     possible object is
     *     {@link JndiNameType }
     *     
     */
    public JndiNameType getResRefName() {
        return resRefName;
    }

    /**
     * Sets the value of the resRefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JndiNameType }
     *     
     */
    public void setResRefName(JndiNameType value) {
        this.resRefName = value;
    }

    /**
     * Gets the value of the jndiName property.
     * 
     * @return
     *     possible object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v1_0.String }
     *     
     */
    public com.athena.chameleon.engine.entity.xml.application.weblogic.v1_0.String getJndiName() {
        return jndiName;
    }

    /**
     * Sets the value of the jndiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v1_0.String }
     *     
     */
    public void setJndiName(com.athena.chameleon.engine.entity.xml.application.weblogic.v1_0.String value) {
        this.jndiName = value;
    }

    /**
     * Gets the value of the resourceLink property.
     * 
     * @return
     *     possible object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v1_0.String }
     *     
     */
    public com.athena.chameleon.engine.entity.xml.application.weblogic.v1_0.String getResourceLink() {
        return resourceLink;
    }

    /**
     * Sets the value of the resourceLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v1_0.String }
     *     
     */
    public void setResourceLink(com.athena.chameleon.engine.entity.xml.application.weblogic.v1_0.String value) {
        this.resourceLink = value;
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

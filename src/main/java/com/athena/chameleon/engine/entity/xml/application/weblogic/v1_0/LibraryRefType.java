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
 * <p>Java class for library-refType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="library-refType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="library-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="specification-version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="implementation-version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exact-match" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="context-root" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "library-refType", namespace = "http://www.bea.com/ns/weblogic/weblogic-application", propOrder = {
    "libraryName",
    "specificationVersion",
    "implementationVersion",
    "exactMatch",
    "contextRoot"
})
public class LibraryRefType {

    @XmlElement(name = "library-name", namespace = "http://www.bea.com/ns/weblogic/weblogic-application", required = true)
    protected java.lang.String libraryName;
    @XmlElement(name = "specification-version", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected java.lang.String specificationVersion;
    @XmlElement(name = "implementation-version", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected java.lang.String implementationVersion;
    @XmlElement(name = "exact-match", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected Boolean exactMatch;
    @XmlElement(name = "context-root", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected java.lang.String contextRoot;

    /**
     * Gets the value of the libraryName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLibraryName() {
        return libraryName;
    }

    /**
     * Sets the value of the libraryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLibraryName(java.lang.String value) {
        this.libraryName = value;
    }

    /**
     * Gets the value of the specificationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSpecificationVersion() {
        return specificationVersion;
    }

    /**
     * Sets the value of the specificationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSpecificationVersion(java.lang.String value) {
        this.specificationVersion = value;
    }

    /**
     * Gets the value of the implementationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getImplementationVersion() {
        return implementationVersion;
    }

    /**
     * Sets the value of the implementationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setImplementationVersion(java.lang.String value) {
        this.implementationVersion = value;
    }

    /**
     * Gets the value of the exactMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExactMatch() {
        return exactMatch;
    }

    /**
     * Sets the value of the exactMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExactMatch(Boolean value) {
        this.exactMatch = value;
    }

    /**
     * Gets the value of the contextRoot property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getContextRoot() {
        return contextRoot;
    }

    /**
     * Sets the value of the contextRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setContextRoot(java.lang.String value) {
        this.contextRoot = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.05 at 01:53:24 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parser-factoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parser-factoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saxparser-factory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="document-builder-factory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transformer-factory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parser-factoryType", propOrder = {
    "saxparserFactory",
    "documentBuilderFactory",
    "transformerFactory"
})
public class ParserFactoryType {

    @XmlElement(name = "saxparser-factory", namespace = "http://www.bea.com/ns/weblogic/90")
    protected java.lang.String saxparserFactory;
    @XmlElement(name = "document-builder-factory", namespace = "http://www.bea.com/ns/weblogic/90")
    protected java.lang.String documentBuilderFactory;
    @XmlElement(name = "transformer-factory", namespace = "http://www.bea.com/ns/weblogic/90")
    protected java.lang.String transformerFactory;

    /**
     * Gets the value of the saxparserFactory property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSaxparserFactory() {
        return saxparserFactory;
    }

    /**
     * Sets the value of the saxparserFactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSaxparserFactory(java.lang.String value) {
        this.saxparserFactory = value;
    }

    /**
     * Gets the value of the documentBuilderFactory property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDocumentBuilderFactory() {
        return documentBuilderFactory;
    }

    /**
     * Sets the value of the documentBuilderFactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDocumentBuilderFactory(java.lang.String value) {
        this.documentBuilderFactory = value;
    }

    /**
     * Gets the value of the transformerFactory property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTransformerFactory() {
        return transformerFactory;
    }

    /**
     * Sets the value of the transformerFactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTransformerFactory(java.lang.String value) {
        this.transformerFactory = value;
    }

}

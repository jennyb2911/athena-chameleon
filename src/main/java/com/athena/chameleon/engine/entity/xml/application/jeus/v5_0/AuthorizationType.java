//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.17 at 02:39:44 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.jeus.v5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authorizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authorizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="repository-service" type="{http://www.tmaxsoft.com/xml/ns/jeus}repository-serviceType" minOccurs="0"/>
 *           &lt;element name="jacc-service" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="custom-authorization-service" type="{http://www.tmaxsoft.com/xml/ns/jeus}SecurityServiceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authorizationType", propOrder = {
    "repositoryService",
    "jaccService",
    "customAuthorizationService"
})
public class AuthorizationType {

    @XmlElement(name = "repository-service", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected RepositoryServiceType repositoryService;
    @XmlElement(name = "jacc-service", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected JaccService jaccService;
    @XmlElement(name = "custom-authorization-service", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected SecurityServiceType customAuthorizationService;

    /**
     * Gets the value of the repositoryService property.
     * 
     * @return
     *     possible object is
     *     {@link RepositoryServiceType }
     *     
     */
    public RepositoryServiceType getRepositoryService() {
        return repositoryService;
    }

    /**
     * Sets the value of the repositoryService property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepositoryServiceType }
     *     
     */
    public void setRepositoryService(RepositoryServiceType value) {
        this.repositoryService = value;
    }

    /**
     * Gets the value of the jaccService property.
     * 
     * @return
     *     possible object is
     *     {@link JaccService }
     *     
     */
    public JaccService getJaccService() {
        return jaccService;
    }

    /**
     * Sets the value of the jaccService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaccService }
     *     
     */
    public void setJaccService(JaccService value) {
        this.jaccService = value;
    }

    /**
     * Gets the value of the customAuthorizationService property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityServiceType }
     *     
     */
    public SecurityServiceType getCustomAuthorizationService() {
        return customAuthorizationService;
    }

    /**
     * Sets the value of the customAuthorizationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityServiceType }
     *     
     */
    public void setCustomAuthorizationService(SecurityServiceType value) {
        this.customAuthorizationService = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class JaccService {


    }

}

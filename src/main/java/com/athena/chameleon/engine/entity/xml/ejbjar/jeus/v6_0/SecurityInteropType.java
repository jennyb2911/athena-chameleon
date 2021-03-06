//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.05 at 10:14:54 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.ejbjar.jeus.v6_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for security-interopType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="security-interopType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="integrity-confidentiality" type="{http://www.tmaxsoft.com/xml/ns/jeus}security-interopElementType" minOccurs="0"/>
 *         &lt;element name="trust-in-client" type="{http://www.tmaxsoft.com/xml/ns/jeus}security-interopElementType" minOccurs="0"/>
 *         &lt;element name="client-auth" type="{http://www.tmaxsoft.com/xml/ns/jeus}security-interopElementType" minOccurs="0"/>
 *         &lt;element name="identity-assertion" type="{http://www.tmaxsoft.com/xml/ns/jeus}security-interopElementRestrictedType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "security-interopType", propOrder = {
    "integrityConfidentiality",
    "trustInClient",
    "clientAuth",
    "identityAssertion"
})
public class SecurityInteropType {

    @XmlElement(name = "integrity-confidentiality", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "NotSupported")
    protected SecurityInteropElementType integrityConfidentiality;
    @XmlElement(name = "trust-in-client", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "NotSupported")
    protected SecurityInteropElementType trustInClient;
    @XmlElement(name = "client-auth", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "NotSupported")
    protected SecurityInteropElementType clientAuth;
    @XmlElement(name = "identity-assertion", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "NotSupported")
    protected SecurityInteropElementRestrictedType identityAssertion;

    /**
     * Gets the value of the integrityConfidentiality property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInteropElementType }
     *     
     */
    public SecurityInteropElementType getIntegrityConfidentiality() {
        return integrityConfidentiality;
    }

    /**
     * Sets the value of the integrityConfidentiality property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInteropElementType }
     *     
     */
    public void setIntegrityConfidentiality(SecurityInteropElementType value) {
        this.integrityConfidentiality = value;
    }

    /**
     * Gets the value of the trustInClient property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInteropElementType }
     *     
     */
    public SecurityInteropElementType getTrustInClient() {
        return trustInClient;
    }

    /**
     * Sets the value of the trustInClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInteropElementType }
     *     
     */
    public void setTrustInClient(SecurityInteropElementType value) {
        this.trustInClient = value;
    }

    /**
     * Gets the value of the clientAuth property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInteropElementType }
     *     
     */
    public SecurityInteropElementType getClientAuth() {
        return clientAuth;
    }

    /**
     * Sets the value of the clientAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInteropElementType }
     *     
     */
    public void setClientAuth(SecurityInteropElementType value) {
        this.clientAuth = value;
    }

    /**
     * Gets the value of the identityAssertion property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInteropElementRestrictedType }
     *     
     */
    public SecurityInteropElementRestrictedType getIdentityAssertion() {
        return identityAssertion;
    }

    /**
     * Sets the value of the identityAssertion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInteropElementRestrictedType }
     *     
     */
    public void setIdentityAssertion(SecurityInteropElementRestrictedType value) {
        this.identityAssertion = value;
    }

}

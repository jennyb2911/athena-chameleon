//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.30 at 10:54:58 오전 KST 
//


package com.athena.chameleon.engine.entity.xml.ejbjar.v2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * 	
 * 
 * 	  The ejb-nameType specifies an enterprise bean's name. It is
 * 	  used by ejb-name elements. This name is assigned by the
 * 	  ejb-jar file producer to name the enterprise bean in the
 * 	  ejb-jar file's deployment descriptor. The name must be
 * 	  unique among the names of the enterprise beans in the same
 * 	  ejb-jar file.
 * 
 * 	  There is no architected relationship between the used
 * 	  ejb-name in the deployment descriptor and the JNDI name that
 * 	  the Deployer will assign to the enterprise bean's home.
 * 
 * 	  The name for an entity bean must conform to the lexical
 * 	  rules for an NMTOKEN.
 * 
 * 	  Example:
 * 
 * 	  <ejb-name>EmployeeService</ejb-name>
 * 
 * 	  
 *       
 * 
 * <p>Java class for ejb-nameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ejb-nameType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://java.sun.com/xml/ns/j2ee>xsdNMTOKENType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejb-nameType")
public class EjbNameType
    extends XsdNMTOKENType
{


}

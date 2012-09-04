//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.04 at 12:32:21 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.jeusejbdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for jsp-engineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jsp-engineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keep-generated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="java-compiler" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="jsp-work-dir" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="compile-output-dir" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="compile-option" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="compile-encoding" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="check-included-jspfile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jsp-engineType", propOrder = {
    "keepGenerated",
    "javaCompiler",
    "jspWorkDir",
    "compileOutputDir",
    "compileOption",
    "compileEncoding",
    "checkIncludedJspfile"
})
public class JspEngineType {

    @XmlElement(name = "keep-generated", defaultValue = "true")
    protected Boolean keepGenerated;
    @XmlElement(name = "java-compiler", defaultValue = "com.sun.tools.javac")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String javaCompiler;
    @XmlElement(name = "jsp-work-dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String jspWorkDir;
    @XmlElement(name = "compile-output-dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String compileOutputDir;
    @XmlElement(name = "compile-option")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String compileOption;
    @XmlElement(name = "compile-encoding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String compileEncoding;
    @XmlElement(name = "check-included-jspfile", defaultValue = "false")
    protected Boolean checkIncludedJspfile;

    /**
     * Gets the value of the keepGenerated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepGenerated() {
        return keepGenerated;
    }

    /**
     * Sets the value of the keepGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepGenerated(Boolean value) {
        this.keepGenerated = value;
    }

    /**
     * Gets the value of the javaCompiler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavaCompiler() {
        return javaCompiler;
    }

    /**
     * Sets the value of the javaCompiler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavaCompiler(String value) {
        this.javaCompiler = value;
    }

    /**
     * Gets the value of the jspWorkDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJspWorkDir() {
        return jspWorkDir;
    }

    /**
     * Sets the value of the jspWorkDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJspWorkDir(String value) {
        this.jspWorkDir = value;
    }

    /**
     * Gets the value of the compileOutputDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompileOutputDir() {
        return compileOutputDir;
    }

    /**
     * Sets the value of the compileOutputDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompileOutputDir(String value) {
        this.compileOutputDir = value;
    }

    /**
     * Gets the value of the compileOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompileOption() {
        return compileOption;
    }

    /**
     * Sets the value of the compileOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompileOption(String value) {
        this.compileOption = value;
    }

    /**
     * Gets the value of the compileEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompileEncoding() {
        return compileEncoding;
    }

    /**
     * Sets the value of the compileEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompileEncoding(String value) {
        this.compileEncoding = value;
    }

    /**
     * Gets the value of the checkIncludedJspfile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckIncludedJspfile() {
        return checkIncludedJspfile;
    }

    /**
     * Sets the value of the checkIncludedJspfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckIncludedJspfile(Boolean value) {
        this.checkIncludedJspfile = value;
    }

}

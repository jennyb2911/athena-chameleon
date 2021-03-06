//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.6 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2012.10.05 시간 10:52:30 AM KST 
//


package com.athena.chameleon.engine.entity.xml.application.weblogic.v8_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "saxparserFactory",
    "documentBuilderFactory",
    "transformerFactory"
})
@XmlRootElement(name = "parser-factory")
public class ParserFactory {

    @XmlElement(name = "saxparser-factory")
    protected String saxparserFactory;
    @XmlElement(name = "document-builder-factory")
    protected String documentBuilderFactory;
    @XmlElement(name = "transformer-factory")
    protected String transformerFactory;

    /**
     * saxparserFactory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaxparserFactory() {
        return saxparserFactory;
    }

    /**
     * saxparserFactory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaxparserFactory(String value) {
        this.saxparserFactory = value;
    }

    /**
     * documentBuilderFactory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentBuilderFactory() {
        return documentBuilderFactory;
    }

    /**
     * documentBuilderFactory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentBuilderFactory(String value) {
        this.documentBuilderFactory = value;
    }

    /**
     * transformerFactory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformerFactory() {
        return transformerFactory;
    }

    /**
     * transformerFactory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformerFactory(String value) {
        this.transformerFactory = value;
    }

}

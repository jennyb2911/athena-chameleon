//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.04 at 12:32:21 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.jeusejbdd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for canonicalizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="canonicalizationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="http://www.w3.org/2001/10/xml-exc-c14n#"/>
 *     &lt;enumeration value="http://www.w3.org/2001/10/xml-exc-c14n#WithComments"/>
 *     &lt;enumeration value="http://www.w3.org/TR/2001/REC-xml-c14n-20010315"/>
 *     &lt;enumeration value="http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "canonicalizationType")
@XmlEnum
public enum CanonicalizationType {


    /**
     * 
     * 						[Description]: Exclusive XML Canonicalization omit comments
     * 					
     * 
     */
    @XmlEnumValue("http://www.w3.org/2001/10/xml-exc-c14n#")
    HTTP_WWW_W_3_ORG_2001_10_XML_EXC_C_14_N("http://www.w3.org/2001/10/xml-exc-c14n#"),

    /**
     * 
     * 						[Description]: Exclusive XML Canonicalization with comments
     * 					
     * 
     */
    @XmlEnumValue("http://www.w3.org/2001/10/xml-exc-c14n#WithComments")
    HTTP_WWW_W_3_ORG_2001_10_XML_EXC_C_14_N_WITH_COMMENTS("http://www.w3.org/2001/10/xml-exc-c14n#WithComments"),

    /**
     * 
     * 						[Description]: Inclusive XML Canonicalization omit comments
     * 					
     * 
     */
    @XmlEnumValue("http://www.w3.org/TR/2001/REC-xml-c14n-20010315")
    HTTP_WWW_W_3_ORG_TR_2001_REC_XML_C_14_N_20010315("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"),

    /**
     * 
     * 						[Description]: Inclusive XML Canonicalization with comments
     * 					
     * 
     */
    @XmlEnumValue("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments")
    HTTP_WWW_W_3_ORG_TR_2001_REC_XML_C_14_N_20010315_WITH_COMMENTS("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    private final String value;

    CanonicalizationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CanonicalizationType fromValue(String v) {
        for (CanonicalizationType c: CanonicalizationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

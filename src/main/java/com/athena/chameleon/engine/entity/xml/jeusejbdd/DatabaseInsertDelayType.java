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
 * <p>Java class for database-insert-delayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="database-insert-delayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ejbCreate"/>
 *     &lt;enumeration value="ejbPostCreate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "database-insert-delayType")
@XmlEnum
public enum DatabaseInsertDelayType {


    /**
     * 
     *                         [Description]: ejbCreate 메소드 후에 EJB 데이터를 DB table에 추가한다.
     *                     
     * 
     */
    @XmlEnumValue("ejbCreate")
    EJB_CREATE("ejbCreate"),

    /**
     * 
     *                         [Description]: ejbPostCreate 메소드 후에 EJB 데이터를 DB table에 추가한다.
     *                     
     * 
     */
    @XmlEnumValue("ejbPostCreate")
    EJB_POST_CREATE("ejbPostCreate");
    private final String value;

    DatabaseInsertDelayType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatabaseInsertDelayType fromValue(String v) {
        for (DatabaseInsertDelayType c: DatabaseInsertDelayType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

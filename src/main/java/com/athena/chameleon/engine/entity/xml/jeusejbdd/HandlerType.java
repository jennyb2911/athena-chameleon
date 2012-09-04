//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.04 at 12:32:21 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.jeusejbdd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for handlerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="handlerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="console-handler" type="{http://www.tmaxsoft.com/xml/ns/jeus}console-handlerType"/>
 *         &lt;element name="file-handler" type="{http://www.tmaxsoft.com/xml/ns/jeus}file-handlerType"/>
 *         &lt;element name="smtp-handler" type="{http://www.tmaxsoft.com/xml/ns/jeus}smtp-handlerType"/>
 *         &lt;element name="socket-handler" type="{http://www.tmaxsoft.com/xml/ns/jeus}socket-handlerType"/>
 *         &lt;element name="user-handler" type="{http://www.tmaxsoft.com/xml/ns/jeus}user-handlerType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "handlerType", propOrder = {
    "consoleHandlerOrFileHandlerOrSmtpHandler"
})
public class HandlerType {

    @XmlElements({
        @XmlElement(name = "console-handler", type = ConsoleHandlerType.class),
        @XmlElement(name = "smtp-handler", type = SmtpHandlerType.class),
        @XmlElement(name = "user-handler", type = UserHandlerType.class),
        @XmlElement(name = "socket-handler", type = SocketHandlerType.class),
        @XmlElement(name = "file-handler", type = FileHandlerType.class)
    })
    protected List<CommonHandlerType> consoleHandlerOrFileHandlerOrSmtpHandler;

    /**
     * Gets the value of the consoleHandlerOrFileHandlerOrSmtpHandler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consoleHandlerOrFileHandlerOrSmtpHandler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsoleHandlerOrFileHandlerOrSmtpHandler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsoleHandlerType }
     * {@link SmtpHandlerType }
     * {@link UserHandlerType }
     * {@link SocketHandlerType }
     * {@link FileHandlerType }
     * 
     * 
     */
    public List<CommonHandlerType> getConsoleHandlerOrFileHandlerOrSmtpHandler() {
        if (consoleHandlerOrFileHandlerOrSmtpHandler == null) {
            consoleHandlerOrFileHandlerOrSmtpHandler = new ArrayList<CommonHandlerType>();
        }
        return this.consoleHandlerOrFileHandlerOrSmtpHandler;
    }

}

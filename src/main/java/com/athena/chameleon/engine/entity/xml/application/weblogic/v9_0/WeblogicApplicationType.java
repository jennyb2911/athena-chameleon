//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.05 at 01:53:24 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


/**
 * <p>Java class for weblogic-applicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="weblogic-applicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ejb" type="{http://www.bea.com/ns/weblogic/90}ejbType" minOccurs="0"/>
 *         &lt;element name="xml" type="{http://www.bea.com/ns/weblogic/90}xmlType" minOccurs="0"/>
 *         &lt;element name="jdbc-connection-pool" type="{http://www.bea.com/ns/weblogic/90}jdbc-connection-poolType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="security" type="{http://www.bea.com/ns/weblogic/90}securityType" minOccurs="0"/>
 *         &lt;element name="application-param" type="{http://www.bea.com/ns/weblogic/90}application-paramType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="classloader-structure" type="{http://www.bea.com/ns/weblogic/90}classloader-structureType" minOccurs="0"/>
 *         &lt;element name="listener" type="{http://www.bea.com/ns/weblogic/90}listenerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="singleton-service" type="{http://www.bea.com/ns/weblogic/90}singletonServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startup" type="{http://www.bea.com/ns/weblogic/90}startupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shutdown" type="{http://www.bea.com/ns/weblogic/90}shutdownType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="module" type="{http://www.bea.com/ns/weblogic/90}weblogic-moduleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="library-ref" type="{http://www.bea.com/ns/weblogic/90}library-refType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fair-share-request" type="{http://www.bea.com/ns/weblogic/90}fair-share-request-classType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="response-time-request" type="{http://www.bea.com/ns/weblogic/90}response-time-request-classType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="context-request" type="{http://www.bea.com/ns/weblogic/90}context-request-classType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="max-threads-constraint" type="{http://www.bea.com/ns/weblogic/90}max-threads-constraintType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="min-threads-constraint" type="{http://www.bea.com/ns/weblogic/90}min-threads-constraintType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="capacity" type="{http://www.bea.com/ns/weblogic/90}capacityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="work-manager" type="{http://www.bea.com/ns/weblogic/90}work-managerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="application-admin-mode-trigger" type="{http://www.bea.com/ns/weblogic/90}application-admin-mode-triggerType" minOccurs="0"/>
 *         &lt;element name="session-descriptor" type="{http://www.bea.com/ns/weblogic/90}session-descriptorType" minOccurs="0"/>
 *         &lt;element name="library-context-root-override" type="{http://www.bea.com/ns/weblogic/90}library-context-root-overrideType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prefer-application-packages" type="{http://www.bea.com/ns/weblogic/90}prefer-application-packagesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@javax.xml.bind.annotation.XmlType(name = "weblogic-applicationType", propOrder = {
    "ejb",
    "xml",
    "jdbcConnectionPool",
    "security",
    "applicationParam",
    "classloaderStructure",
    "listener",
    "singletonService",
    "startup",
    "shutdown",
    "module",
    "libraryRef",
    "fairShareRequest",
    "responseTimeRequest",
    "contextRequest",
    "maxThreadsConstraint",
    "minThreadsConstraint",
    "capacity",
    "workManager",
    "applicationAdminModeTrigger",
    "sessionDescriptor",
    "libraryContextRootOverride",
    "preferApplicationPackages"
})
public class WeblogicApplicationType {

    @XmlElement(namespace = "http://www.bea.com/ns/weblogic/90")
    protected EjbType ejb;
    @XmlElement(namespace = "http://www.bea.com/ns/weblogic/90")
    protected com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.XmlType xml;
    @XmlElement(name = "jdbc-connection-pool", namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<JdbcConnectionPoolType> jdbcConnectionPool;
    @XmlElement(namespace = "http://www.bea.com/ns/weblogic/90")
    protected SecurityType security;
    @XmlElement(name = "application-param", namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<ApplicationParamType> applicationParam;
    @XmlElement(name = "classloader-structure", namespace = "http://www.bea.com/ns/weblogic/90")
    protected ClassloaderStructureType classloaderStructure;
    @XmlElement(namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<ListenerType> listener;
    @XmlElement(name = "singleton-service", namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<SingletonServiceType> singletonService;
    @XmlElement(namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<StartupType> startup;
    @XmlElement(namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<ShutdownType> shutdown;
    @XmlElement(namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<WeblogicModuleType> module;
    @XmlElement(name = "library-ref", namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<LibraryRefType> libraryRef;
    @XmlElement(name = "fair-share-request", namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<FairShareRequestClassType> fairShareRequest;
    @XmlElement(name = "response-time-request", namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<ResponseTimeRequestClassType> responseTimeRequest;
    @XmlElement(name = "context-request", namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<ContextRequestClassType> contextRequest;
    @XmlElement(name = "max-threads-constraint", namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<MaxThreadsConstraintType> maxThreadsConstraint;
    @XmlElement(name = "min-threads-constraint", namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<MinThreadsConstraintType> minThreadsConstraint;
    @XmlElement(namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<CapacityType> capacity;
    @XmlElement(name = "work-manager", namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<WorkManagerType> workManager;
    @XmlElement(name = "application-admin-mode-trigger", namespace = "http://www.bea.com/ns/weblogic/90")
    protected ApplicationAdminModeTriggerType applicationAdminModeTrigger;
    @XmlElement(name = "session-descriptor", namespace = "http://www.bea.com/ns/weblogic/90")
    protected SessionDescriptorType sessionDescriptor;
    @XmlElement(name = "library-context-root-override", namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected List<LibraryContextRootOverrideType> libraryContextRootOverride;
    @XmlElement(name = "prefer-application-packages", namespace = "http://www.bea.com/ns/weblogic/90")
    protected PreferApplicationPackagesType preferApplicationPackages;

    /**
     * Gets the value of the ejb property.
     * 
     * @return
     *     possible object is
     *     {@link EjbType }
     *     
     */
    public EjbType getEjb() {
        return ejb;
    }

    /**
     * Sets the value of the ejb property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjbType }
     *     
     */
    public void setEjb(EjbType value) {
        this.ejb = value;
    }

    /**
     * Gets the value of the xml property.
     * 
     * @return
     *     possible object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.XmlType }
     *     
     */
    public com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.XmlType getXml() {
        return xml;
    }

    /**
     * Sets the value of the xml property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.XmlType }
     *     
     */
    public void setXml(com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.XmlType value) {
        this.xml = value;
    }

    /**
     * Gets the value of the jdbcConnectionPool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jdbcConnectionPool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJdbcConnectionPool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JdbcConnectionPoolType }
     * 
     * 
     */
    public List<JdbcConnectionPoolType> getJdbcConnectionPool() {
        if (jdbcConnectionPool == null) {
            jdbcConnectionPool = new ArrayList<JdbcConnectionPoolType>();
        }
        return this.jdbcConnectionPool;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityType }
     *     
     */
    public SecurityType getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityType }
     *     
     */
    public void setSecurity(SecurityType value) {
        this.security = value;
    }

    /**
     * Gets the value of the applicationParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationParamType }
     * 
     * 
     */
    public List<ApplicationParamType> getApplicationParam() {
        if (applicationParam == null) {
            applicationParam = new ArrayList<ApplicationParamType>();
        }
        return this.applicationParam;
    }

    /**
     * Gets the value of the classloaderStructure property.
     * 
     * @return
     *     possible object is
     *     {@link ClassloaderStructureType }
     *     
     */
    public ClassloaderStructureType getClassloaderStructure() {
        return classloaderStructure;
    }

    /**
     * Sets the value of the classloaderStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassloaderStructureType }
     *     
     */
    public void setClassloaderStructure(ClassloaderStructureType value) {
        this.classloaderStructure = value;
    }

    /**
     * Gets the value of the listener property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listener property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListener().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListenerType }
     * 
     * 
     */
    public List<ListenerType> getListener() {
        if (listener == null) {
            listener = new ArrayList<ListenerType>();
        }
        return this.listener;
    }

    /**
     * Gets the value of the singletonService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the singletonService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSingletonService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SingletonServiceType }
     * 
     * 
     */
    public List<SingletonServiceType> getSingletonService() {
        if (singletonService == null) {
            singletonService = new ArrayList<SingletonServiceType>();
        }
        return this.singletonService;
    }

    /**
     * Gets the value of the startup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StartupType }
     * 
     * 
     */
    public List<StartupType> getStartup() {
        if (startup == null) {
            startup = new ArrayList<StartupType>();
        }
        return this.startup;
    }

    /**
     * Gets the value of the shutdown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shutdown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShutdown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShutdownType }
     * 
     * 
     */
    public List<ShutdownType> getShutdown() {
        if (shutdown == null) {
            shutdown = new ArrayList<ShutdownType>();
        }
        return this.shutdown;
    }

    /**
     * Gets the value of the module property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the module property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeblogicModuleType }
     * 
     * 
     */
    public List<WeblogicModuleType> getModule() {
        if (module == null) {
            module = new ArrayList<WeblogicModuleType>();
        }
        return this.module;
    }

    /**
     * Gets the value of the libraryRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libraryRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibraryRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibraryRefType }
     * 
     * 
     */
    public List<LibraryRefType> getLibraryRef() {
        if (libraryRef == null) {
            libraryRef = new ArrayList<LibraryRefType>();
        }
        return this.libraryRef;
    }

    /**
     * Gets the value of the fairShareRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fairShareRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFairShareRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FairShareRequestClassType }
     * 
     * 
     */
    public List<FairShareRequestClassType> getFairShareRequest() {
        if (fairShareRequest == null) {
            fairShareRequest = new ArrayList<FairShareRequestClassType>();
        }
        return this.fairShareRequest;
    }

    /**
     * Gets the value of the responseTimeRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseTimeRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseTimeRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseTimeRequestClassType }
     * 
     * 
     */
    public List<ResponseTimeRequestClassType> getResponseTimeRequest() {
        if (responseTimeRequest == null) {
            responseTimeRequest = new ArrayList<ResponseTimeRequestClassType>();
        }
        return this.responseTimeRequest;
    }

    /**
     * Gets the value of the contextRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contextRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContextRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextRequestClassType }
     * 
     * 
     */
    public List<ContextRequestClassType> getContextRequest() {
        if (contextRequest == null) {
            contextRequest = new ArrayList<ContextRequestClassType>();
        }
        return this.contextRequest;
    }

    /**
     * Gets the value of the maxThreadsConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maxThreadsConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaxThreadsConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaxThreadsConstraintType }
     * 
     * 
     */
    public List<MaxThreadsConstraintType> getMaxThreadsConstraint() {
        if (maxThreadsConstraint == null) {
            maxThreadsConstraint = new ArrayList<MaxThreadsConstraintType>();
        }
        return this.maxThreadsConstraint;
    }

    /**
     * Gets the value of the minThreadsConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minThreadsConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinThreadsConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MinThreadsConstraintType }
     * 
     * 
     */
    public List<MinThreadsConstraintType> getMinThreadsConstraint() {
        if (minThreadsConstraint == null) {
            minThreadsConstraint = new ArrayList<MinThreadsConstraintType>();
        }
        return this.minThreadsConstraint;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capacity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapacity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapacityType }
     * 
     * 
     */
    public List<CapacityType> getCapacity() {
        if (capacity == null) {
            capacity = new ArrayList<CapacityType>();
        }
        return this.capacity;
    }

    /**
     * Gets the value of the workManager property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workManager property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkManager().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkManagerType }
     * 
     * 
     */
    public List<WorkManagerType> getWorkManager() {
        if (workManager == null) {
            workManager = new ArrayList<WorkManagerType>();
        }
        return this.workManager;
    }

    /**
     * Gets the value of the applicationAdminModeTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationAdminModeTriggerType }
     *     
     */
    public ApplicationAdminModeTriggerType getApplicationAdminModeTrigger() {
        return applicationAdminModeTrigger;
    }

    /**
     * Sets the value of the applicationAdminModeTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationAdminModeTriggerType }
     *     
     */
    public void setApplicationAdminModeTrigger(ApplicationAdminModeTriggerType value) {
        this.applicationAdminModeTrigger = value;
    }

    /**
     * Gets the value of the sessionDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link SessionDescriptorType }
     *     
     */
    public SessionDescriptorType getSessionDescriptor() {
        return sessionDescriptor;
    }

    /**
     * Sets the value of the sessionDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionDescriptorType }
     *     
     */
    public void setSessionDescriptor(SessionDescriptorType value) {
        this.sessionDescriptor = value;
    }

    /**
     * Gets the value of the libraryContextRootOverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libraryContextRootOverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibraryContextRootOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibraryContextRootOverrideType }
     * 
     * 
     */
    public List<LibraryContextRootOverrideType> getLibraryContextRootOverride() {
        if (libraryContextRootOverride == null) {
            libraryContextRootOverride = new ArrayList<LibraryContextRootOverrideType>();
        }
        return this.libraryContextRootOverride;
    }

    /**
     * Gets the value of the preferApplicationPackages property.
     * 
     * @return
     *     possible object is
     *     {@link PreferApplicationPackagesType }
     *     
     */
    public PreferApplicationPackagesType getPreferApplicationPackages() {
        return preferApplicationPackages;
    }

    /**
     * Sets the value of the preferApplicationPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferApplicationPackagesType }
     *     
     */
    public void setPreferApplicationPackages(PreferApplicationPackagesType value) {
        this.preferApplicationPackages = value;
    }

}
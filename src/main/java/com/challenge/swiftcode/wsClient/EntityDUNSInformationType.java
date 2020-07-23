
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entityDUNSInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entityDUNSInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNS" type="{http://www.sam.gov}DUNSType" minOccurs="0"/>
 *         &lt;element name="hqParentDUNS" type="{http://www.sam.gov}DUNSType" minOccurs="0"/>
 *         &lt;element name="domesticParentDUNS" type="{http://www.sam.gov}DUNSType" minOccurs="0"/>
 *         &lt;element name="globalParentDUNS" type="{http://www.sam.gov}DUNSType" minOccurs="0"/>
 *         &lt;element name="DNBMonitoring" type="{http://www.sam.gov}DNBMonitoringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entityDUNSInformationType", propOrder = {
    "duns",
    "hqParentDUNS",
    "domesticParentDUNS",
    "globalParentDUNS",
    "dnbMonitoring"
})
public class EntityDUNSInformationType {

    @XmlElement(name = "DUNS")
    protected DUNSType duns;
    protected DUNSType hqParentDUNS;
    protected DUNSType domesticParentDUNS;
    protected DUNSType globalParentDUNS;
    @XmlElement(name = "DNBMonitoring")
    protected DNBMonitoringType dnbMonitoring;

    /**
     * Gets the value of the duns property.
     * 
     * @return
     *     possible object is
     *     {@link DUNSType }
     *     
     */
    public DUNSType getDUNS() {
        return duns;
    }

    /**
     * Sets the value of the duns property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUNSType }
     *     
     */
    public void setDUNS(DUNSType value) {
        this.duns = value;
    }

    /**
     * Gets the value of the hqParentDUNS property.
     * 
     * @return
     *     possible object is
     *     {@link DUNSType }
     *     
     */
    public DUNSType getHqParentDUNS() {
        return hqParentDUNS;
    }

    /**
     * Sets the value of the hqParentDUNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUNSType }
     *     
     */
    public void setHqParentDUNS(DUNSType value) {
        this.hqParentDUNS = value;
    }

    /**
     * Gets the value of the domesticParentDUNS property.
     * 
     * @return
     *     possible object is
     *     {@link DUNSType }
     *     
     */
    public DUNSType getDomesticParentDUNS() {
        return domesticParentDUNS;
    }

    /**
     * Sets the value of the domesticParentDUNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUNSType }
     *     
     */
    public void setDomesticParentDUNS(DUNSType value) {
        this.domesticParentDUNS = value;
    }

    /**
     * Gets the value of the globalParentDUNS property.
     * 
     * @return
     *     possible object is
     *     {@link DUNSType }
     *     
     */
    public DUNSType getGlobalParentDUNS() {
        return globalParentDUNS;
    }

    /**
     * Sets the value of the globalParentDUNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUNSType }
     *     
     */
    public void setGlobalParentDUNS(DUNSType value) {
        this.globalParentDUNS = value;
    }

    /**
     * Gets the value of the dnbMonitoring property.
     * 
     * @return
     *     possible object is
     *     {@link DNBMonitoringType }
     *     
     */
    public DNBMonitoringType getDNBMonitoring() {
        return dnbMonitoring;
    }

    /**
     * Sets the value of the dnbMonitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBMonitoringType }
     *     
     */
    public void setDNBMonitoring(DNBMonitoringType value) {
        this.dnbMonitoring = value;
    }

}

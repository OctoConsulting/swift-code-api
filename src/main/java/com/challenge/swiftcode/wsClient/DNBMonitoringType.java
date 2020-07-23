
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBMonitoringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBMonitoringType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legalBusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DBAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corporationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outOfBusinessFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="monitoringStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.sam.gov}dnbaddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBMonitoringType", propOrder = {
    "legalBusinessName",
    "dbaName",
    "corporationName",
    "outOfBusinessFlag",
    "monitoringStatus",
    "lastUpdated",
    "address"
})
public class DNBMonitoringType {

    @XmlElementRef(name = "legalBusinessName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legalBusinessName;
    @XmlElementRef(name = "DBAName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dbaName;
    protected String corporationName;
    @XmlElementRef(name = "outOfBusinessFlag", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> outOfBusinessFlag;
    @XmlElementRef(name = "monitoringStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monitoringStatus;
    @XmlElementRef(name = "lastUpdated", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdated;
    @XmlElementRef(name = "address", type = JAXBElement.class, required = false)
    protected JAXBElement<DnbaddressType> address;

    /**
     * Gets the value of the legalBusinessName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalBusinessName() {
        return legalBusinessName;
    }

    /**
     * Sets the value of the legalBusinessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalBusinessName(JAXBElement<String> value) {
        this.legalBusinessName = value;
    }

    /**
     * Gets the value of the dbaName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDBAName() {
        return dbaName;
    }

    /**
     * Sets the value of the dbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDBAName(JAXBElement<String> value) {
        this.dbaName = value;
    }

    /**
     * Gets the value of the corporationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporationName() {
        return corporationName;
    }

    /**
     * Sets the value of the corporationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporationName(String value) {
        this.corporationName = value;
    }

    /**
     * Gets the value of the outOfBusinessFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOutOfBusinessFlag() {
        return outOfBusinessFlag;
    }

    /**
     * Sets the value of the outOfBusinessFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOutOfBusinessFlag(JAXBElement<Boolean> value) {
        this.outOfBusinessFlag = value;
    }

    /**
     * Gets the value of the monitoringStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonitoringStatus() {
        return monitoringStatus;
    }

    /**
     * Sets the value of the monitoringStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonitoringStatus(JAXBElement<String> value) {
        this.monitoringStatus = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdated(JAXBElement<String> value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DnbaddressType }{@code >}
     *     
     */
    public JAXBElement<DnbaddressType> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DnbaddressType }{@code >}
     *     
     */
    public void setAddress(JAXBElement<DnbaddressType> value) {
        this.address = value;
    }

}

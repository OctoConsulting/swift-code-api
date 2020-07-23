
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registrationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrationInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSPlus4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAGECode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NCAGECode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DODAAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalBusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DBAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noPublicDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exclusionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrationInformationType", propOrder = {
    "duns",
    "dunsPlus4",
    "cageCode",
    "ncageCode",
    "dodaac",
    "legalBusinessName",
    "dbaName",
    "registrationPurpose",
    "registrationStatus",
    "registrationDate",
    "lastUpdateDate",
    "expirationDate",
    "activationDate",
    "noPublicDisplay",
    "exclusionStatus"
})
public class RegistrationInformationType {

    @XmlElementRef(name = "DUNS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> duns;
    @XmlElementRef(name = "DUNSPlus4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dunsPlus4;
    @XmlElementRef(name = "CAGECode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cageCode;
    @XmlElementRef(name = "NCAGECode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ncageCode;
    @XmlElementRef(name = "DODAAC", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dodaac;
    protected String legalBusinessName;
    @XmlElement(name = "DBAName")
    protected String dbaName;
    @XmlElementRef(name = "registrationPurpose", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationPurpose;
    @XmlElementRef(name = "registrationStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationStatus;
    @XmlElementRef(name = "registrationDate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationDate;
    @XmlElementRef(name = "lastUpdateDate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateDate;
    @XmlElementRef(name = "expirationDate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expirationDate;
    protected String activationDate;
    @XmlElementRef(name = "noPublicDisplay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noPublicDisplay;
    @XmlElementRef(name = "exclusionStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exclusionStatus;

    /**
     * Gets the value of the duns property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNS() {
        return duns;
    }

    /**
     * Sets the value of the duns property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNS(JAXBElement<String> value) {
        this.duns = value;
    }

    /**
     * Gets the value of the dunsPlus4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNSPlus4() {
        return dunsPlus4;
    }

    /**
     * Sets the value of the dunsPlus4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNSPlus4(JAXBElement<String> value) {
        this.dunsPlus4 = value;
    }

    /**
     * Gets the value of the cageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCAGECode() {
        return cageCode;
    }

    /**
     * Sets the value of the cageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCAGECode(JAXBElement<String> value) {
        this.cageCode = value;
    }

    /**
     * Gets the value of the ncageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNCAGECode() {
        return ncageCode;
    }

    /**
     * Sets the value of the ncageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNCAGECode(JAXBElement<String> value) {
        this.ncageCode = value;
    }

    /**
     * Gets the value of the dodaac property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDODAAC() {
        return dodaac;
    }

    /**
     * Sets the value of the dodaac property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDODAAC(JAXBElement<String> value) {
        this.dodaac = value;
    }

    /**
     * Gets the value of the legalBusinessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalBusinessName() {
        return legalBusinessName;
    }

    /**
     * Sets the value of the legalBusinessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalBusinessName(String value) {
        this.legalBusinessName = value;
    }

    /**
     * Gets the value of the dbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBAName() {
        return dbaName;
    }

    /**
     * Sets the value of the dbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBAName(String value) {
        this.dbaName = value;
    }

    /**
     * Gets the value of the registrationPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationPurpose() {
        return registrationPurpose;
    }

    /**
     * Sets the value of the registrationPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationPurpose(JAXBElement<String> value) {
        this.registrationPurpose = value;
    }

    /**
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationStatus(JAXBElement<String> value) {
        this.registrationStatus = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationDate(JAXBElement<String> value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdateDate(JAXBElement<String> value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpirationDate(JAXBElement<String> value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationDate(String value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the noPublicDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoPublicDisplay() {
        return noPublicDisplay;
    }

    /**
     * Sets the value of the noPublicDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoPublicDisplay(JAXBElement<String> value) {
        this.noPublicDisplay = value;
    }

    /**
     * Gets the value of the exclusionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExclusionStatus() {
        return exclusionStatus;
    }

    /**
     * Sets the value of the exclusionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExclusionStatus(JAXBElement<String> value) {
        this.exclusionStatus = value;
    }

}

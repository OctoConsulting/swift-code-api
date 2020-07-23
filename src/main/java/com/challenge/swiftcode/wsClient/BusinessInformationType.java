
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corporateURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyDivisionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyDivisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fiscalYearEndCloseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correspondenceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="physicalAddress" type="{http://www.sam.gov}addressTypes" minOccurs="0"/>
 *         &lt;element name="mailingAddress" type="{http://www.sam.gov}mailingAddressTypes" minOccurs="0"/>
 *         &lt;element name="MPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyBusinessPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessInformationType", propOrder = {
    "corporateURL",
    "companyDivisionName",
    "companyDivisionNumber",
    "businessStartDate",
    "fiscalYearEndCloseDate",
    "correspondenceFlag",
    "physicalAddress",
    "mailingAddress",
    "mpin",
    "agencyBusinessPurpose",
    "organizationType"
})
public class BusinessInformationType {

    @XmlElementRef(name = "corporateURL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corporateURL;
    @XmlElementRef(name = "companyDivisionName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyDivisionName;
    @XmlElementRef(name = "companyDivisionNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyDivisionNumber;
    @XmlElementRef(name = "businessStartDate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessStartDate;
    @XmlElementRef(name = "fiscalYearEndCloseDate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fiscalYearEndCloseDate;
    @XmlElementRef(name = "correspondenceFlag", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> correspondenceFlag;
    @XmlElementRef(name = "physicalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressTypes> physicalAddress;
    @XmlElementRef(name = "mailingAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<MailingAddressTypes> mailingAddress;
    @XmlElement(name = "MPIN")
    protected String mpin;
    @XmlElementRef(name = "agencyBusinessPurpose", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agencyBusinessPurpose;
    @XmlElementRef(name = "organizationType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationType;

    /**
     * Gets the value of the corporateURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorporateURL() {
        return corporateURL;
    }

    /**
     * Sets the value of the corporateURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorporateURL(JAXBElement<String> value) {
        this.corporateURL = value;
    }

    /**
     * Gets the value of the companyDivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyDivisionName() {
        return companyDivisionName;
    }

    /**
     * Sets the value of the companyDivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyDivisionName(JAXBElement<String> value) {
        this.companyDivisionName = value;
    }

    /**
     * Gets the value of the companyDivisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyDivisionNumber() {
        return companyDivisionNumber;
    }

    /**
     * Sets the value of the companyDivisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyDivisionNumber(JAXBElement<String> value) {
        this.companyDivisionNumber = value;
    }

    /**
     * Gets the value of the businessStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessStartDate() {
        return businessStartDate;
    }

    /**
     * Sets the value of the businessStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessStartDate(JAXBElement<String> value) {
        this.businessStartDate = value;
    }

    /**
     * Gets the value of the fiscalYearEndCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscalYearEndCloseDate() {
        return fiscalYearEndCloseDate;
    }

    /**
     * Sets the value of the fiscalYearEndCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscalYearEndCloseDate(JAXBElement<String> value) {
        this.fiscalYearEndCloseDate = value;
    }

    /**
     * Gets the value of the correspondenceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCorrespondenceFlag() {
        return correspondenceFlag;
    }

    /**
     * Sets the value of the correspondenceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCorrespondenceFlag(JAXBElement<Boolean> value) {
        this.correspondenceFlag = value;
    }

    /**
     * Gets the value of the physicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressTypes }{@code >}
     *     
     */
    public JAXBElement<AddressTypes> getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Sets the value of the physicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressTypes }{@code >}
     *     
     */
    public void setPhysicalAddress(JAXBElement<AddressTypes> value) {
        this.physicalAddress = value;
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailingAddressTypes }{@code >}
     *     
     */
    public JAXBElement<MailingAddressTypes> getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailingAddressTypes }{@code >}
     *     
     */
    public void setMailingAddress(JAXBElement<MailingAddressTypes> value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the mpin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPIN() {
        return mpin;
    }

    /**
     * Sets the value of the mpin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPIN(String value) {
        this.mpin = value;
    }

    /**
     * Gets the value of the agencyBusinessPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgencyBusinessPurpose() {
        return agencyBusinessPurpose;
    }

    /**
     * Sets the value of the agencyBusinessPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgencyBusinessPurpose(JAXBElement<String> value) {
        this.agencyBusinessPurpose = value;
    }

    /**
     * Gets the value of the organizationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationType() {
        return organizationType;
    }

    /**
     * Sets the value of the organizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationType(JAXBElement<String> value) {
        this.organizationType = value;
    }

}

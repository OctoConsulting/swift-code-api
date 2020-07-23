
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for financialAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="financialAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorizationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EFTInformation" type="{http://www.sam.gov}EFTInformationType" minOccurs="0"/>
 *         &lt;element name="ACHInformation" type="{http://www.sam.gov}ACHInformationType" minOccurs="0"/>
 *         &lt;element name="remittanceInformation" type="{http://www.sam.gov}remittanceInformationType" minOccurs="0"/>
 *         &lt;element name="merchantID1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantID2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disbursingOfficeSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountingStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "financialAccountType", propOrder = {
    "authorizationDate",
    "eftInformation",
    "achInformation",
    "remittanceInformation",
    "merchantID1",
    "merchantID2",
    "departmentCode",
    "agencyLocationCode",
    "disbursingOfficeSymbol",
    "accountingStation"
})
public class FinancialAccountType {

    @XmlElementRef(name = "authorizationDate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authorizationDate;
    @XmlElementRef(name = "EFTInformation", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTInformationType> eftInformation;
    @XmlElementRef(name = "ACHInformation", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHInformationType> achInformation;
    @XmlElementRef(name = "remittanceInformation", type = JAXBElement.class, required = false)
    protected JAXBElement<RemittanceInformationType> remittanceInformation;
    @XmlElementRef(name = "merchantID1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> merchantID1;
    @XmlElementRef(name = "merchantID2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> merchantID2;
    @XmlElementRef(name = "departmentCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departmentCode;
    @XmlElementRef(name = "agencyLocationCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agencyLocationCode;
    @XmlElementRef(name = "disbursingOfficeSymbol", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disbursingOfficeSymbol;
    @XmlElementRef(name = "accountingStation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountingStation;

    /**
     * Gets the value of the authorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * Sets the value of the authorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthorizationDate(JAXBElement<String> value) {
        this.authorizationDate = value;
    }

    /**
     * Gets the value of the eftInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTInformationType }{@code >}
     *     
     */
    public JAXBElement<EFTInformationType> getEFTInformation() {
        return eftInformation;
    }

    /**
     * Sets the value of the eftInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTInformationType }{@code >}
     *     
     */
    public void setEFTInformation(JAXBElement<EFTInformationType> value) {
        this.eftInformation = value;
    }

    /**
     * Gets the value of the achInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHInformationType }{@code >}
     *     
     */
    public JAXBElement<ACHInformationType> getACHInformation() {
        return achInformation;
    }

    /**
     * Sets the value of the achInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHInformationType }{@code >}
     *     
     */
    public void setACHInformation(JAXBElement<ACHInformationType> value) {
        this.achInformation = value;
    }

    /**
     * Gets the value of the remittanceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemittanceInformationType }{@code >}
     *     
     */
    public JAXBElement<RemittanceInformationType> getRemittanceInformation() {
        return remittanceInformation;
    }

    /**
     * Sets the value of the remittanceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemittanceInformationType }{@code >}
     *     
     */
    public void setRemittanceInformation(JAXBElement<RemittanceInformationType> value) {
        this.remittanceInformation = value;
    }

    /**
     * Gets the value of the merchantID1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMerchantID1() {
        return merchantID1;
    }

    /**
     * Sets the value of the merchantID1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMerchantID1(JAXBElement<String> value) {
        this.merchantID1 = value;
    }

    /**
     * Gets the value of the merchantID2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMerchantID2() {
        return merchantID2;
    }

    /**
     * Sets the value of the merchantID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMerchantID2(JAXBElement<String> value) {
        this.merchantID2 = value;
    }

    /**
     * Gets the value of the departmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartmentCode() {
        return departmentCode;
    }

    /**
     * Sets the value of the departmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartmentCode(JAXBElement<String> value) {
        this.departmentCode = value;
    }

    /**
     * Gets the value of the agencyLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgencyLocationCode() {
        return agencyLocationCode;
    }

    /**
     * Sets the value of the agencyLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgencyLocationCode(JAXBElement<String> value) {
        this.agencyLocationCode = value;
    }

    /**
     * Gets the value of the disbursingOfficeSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisbursingOfficeSymbol() {
        return disbursingOfficeSymbol;
    }

    /**
     * Sets the value of the disbursingOfficeSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisbursingOfficeSymbol(JAXBElement<String> value) {
        this.disbursingOfficeSymbol = value;
    }

    /**
     * Gets the value of the accountingStation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountingStation() {
        return accountingStation;
    }

    /**
     * Sets the value of the accountingStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountingStation(JAXBElement<String> value) {
        this.accountingStation = value;
    }

}


package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EFTInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="financialInstitute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ABARoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EFTWaiver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lockboxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTInformationType", propOrder = {
    "accountType",
    "financialInstitute",
    "accountNumber",
    "abaRoutingNumber",
    "eftWaiver",
    "lockboxNumber"
})
public class EFTInformationType {

    @XmlElementRef(name = "accountType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountType;
    @XmlElementRef(name = "financialInstitute", type = JAXBElement.class, required = false)
    protected JAXBElement<String> financialInstitute;
    @XmlElementRef(name = "accountNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountNumber;
    @XmlElementRef(name = "ABARoutingNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> abaRoutingNumber;
    @XmlElementRef(name = "EFTWaiver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eftWaiver;
    @XmlElementRef(name = "lockboxNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lockboxNumber;

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountType(JAXBElement<String> value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the financialInstitute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinancialInstitute() {
        return financialInstitute;
    }

    /**
     * Sets the value of the financialInstitute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinancialInstitute(JAXBElement<String> value) {
        this.financialInstitute = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountNumber(JAXBElement<String> value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the abaRoutingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getABARoutingNumber() {
        return abaRoutingNumber;
    }

    /**
     * Sets the value of the abaRoutingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setABARoutingNumber(JAXBElement<String> value) {
        this.abaRoutingNumber = value;
    }

    /**
     * Gets the value of the eftWaiver property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEFTWaiver() {
        return eftWaiver;
    }

    /**
     * Sets the value of the eftWaiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEFTWaiver(JAXBElement<String> value) {
        this.eftWaiver = value;
    }

    /**
     * Gets the value of the lockboxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLockboxNumber() {
        return lockboxNumber;
    }

    /**
     * Sets the value of the lockboxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLockboxNumber(JAXBElement<String> value) {
        this.lockboxNumber = value;
    }

}

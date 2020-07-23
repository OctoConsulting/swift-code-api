
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identificationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identificationInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="cageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="NPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="primaryAddress" type="{http://www.sam.gov}addressType" minOccurs="0" form="qualified"/>
 *         &lt;element name="listOfAlternateAddress" type="{http://www.sam.gov}listOfAddressesType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificationInformationType", propOrder = {
    "organizationName",
    "dunsNumber",
    "firstName",
    "lastName",
    "middleName",
    "prefix",
    "suffix",
    "cageCode",
    "tin",
    "npi",
    "primaryAddress",
    "listOfAlternateAddress"
})
public class IdentificationInformationType {

    @XmlElementRef(name = "organizationName", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationName;
    @XmlElementRef(name = "DUNSNumber", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dunsNumber;
    @XmlElementRef(name = "firstName", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "lastName", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "middleName", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middleName;
    @XmlElementRef(name = "prefix", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prefix;
    @XmlElementRef(name = "suffix", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suffix;
    @XmlElementRef(name = "cageCode", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cageCode;
    @XmlElementRef(name = "TIN", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tin;
    @XmlElementRef(name = "NPI", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> npi;
    @XmlElementRef(name = "primaryAddress", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressType> primaryAddress;
    @XmlElementRef(name = "listOfAlternateAddress", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfAddressesType> listOfAlternateAddress;

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationName(JAXBElement<String> value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNSNumber(JAXBElement<String> value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddleName(JAXBElement<String> value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefix(JAXBElement<String> value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuffix(JAXBElement<String> value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the cageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCageCode() {
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
    public void setCageCode(JAXBElement<String> value) {
        this.cageCode = value;
    }

    /**
     * Gets the value of the tin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTIN() {
        return tin;
    }

    /**
     * Sets the value of the tin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTIN(JAXBElement<String> value) {
        this.tin = value;
    }

    /**
     * Gets the value of the npi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNPI() {
        return npi;
    }

    /**
     * Sets the value of the npi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNPI(JAXBElement<String> value) {
        this.npi = value;
    }

    /**
     * Gets the value of the primaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public JAXBElement<AddressType> getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public void setPrimaryAddress(JAXBElement<AddressType> value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the listOfAlternateAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfAddressesType }{@code >}
     *     
     */
    public JAXBElement<ListOfAddressesType> getListOfAlternateAddress() {
        return listOfAlternateAddress;
    }

    /**
     * Sets the value of the listOfAlternateAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfAddressesType }{@code >}
     *     
     */
    public void setListOfAlternateAddress(JAXBElement<ListOfAddressesType> value) {
        this.listOfAlternateAddress = value;
    }

}

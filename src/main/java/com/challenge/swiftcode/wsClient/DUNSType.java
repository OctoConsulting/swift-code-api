
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DUNSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DUNSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNBLegalBusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalBusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DBAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.sam.gov}addressTypes" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DUNSType", propOrder = {
    "dunsNumber",
    "dnbLegalBusinessName",
    "legalBusinessName",
    "dbaName",
    "address",
    "phone"
})
public class DUNSType {

    @XmlElementRef(name = "DUNSNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dunsNumber;
    @XmlElement(name = "DNBLegalBusinessName")
    protected String dnbLegalBusinessName;
    @XmlElementRef(name = "legalBusinessName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legalBusinessName;
    @XmlElement(name = "DBAName")
    protected String dbaName;
    protected AddressTypes address;
    protected String phone;

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
     * Gets the value of the dnbLegalBusinessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBLegalBusinessName() {
        return dnbLegalBusinessName;
    }

    /**
     * Sets the value of the dnbLegalBusinessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBLegalBusinessName(String value) {
        this.dnbLegalBusinessName = value;
    }

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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressTypes }
     *     
     */
    public AddressTypes getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressTypes }
     *     
     */
    public void setAddress(AddressTypes value) {
        this.address = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

}

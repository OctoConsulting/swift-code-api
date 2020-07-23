
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entitySearchCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entitySearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSList" type="{http://www.sam.gov}DUNSList" minOccurs="0"/>
 *         &lt;element name="DoDAAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAGECode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAGECodeList" type="{http://www.sam.gov}CAGECodeList" minOccurs="0"/>
 *         &lt;element name="taxpayerIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entitySearchCriteriaType", propOrder = {
    "dunsNumber",
    "dunsList",
    "doDAAC",
    "cageCode",
    "cageCodeList",
    "taxpayerIdentificationNumber",
    "registrationStatus",
    "startDate",
    "endDate"
})
public class EntitySearchCriteriaType {

    @XmlElementRef(name = "DUNSNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dunsNumber;
    @XmlElement(name = "DUNSList")
    protected DUNSList dunsList;
    @XmlElementRef(name = "DoDAAC", type = JAXBElement.class, required = false)
    protected JAXBElement<String> doDAAC;
    @XmlElementRef(name = "CAGECode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cageCode;
    @XmlElement(name = "CAGECodeList")
    protected CAGECodeList cageCodeList;
    @XmlElementRef(name = "taxpayerIdentificationNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxpayerIdentificationNumber;
    @XmlElementRef(name = "registrationStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationStatus;
    @XmlElementRef(name = "startDate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startDate;
    @XmlElementRef(name = "endDate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endDate;

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
     * Gets the value of the dunsList property.
     * 
     * @return
     *     possible object is
     *     {@link DUNSList }
     *     
     */
    public DUNSList getDUNSList() {
        return dunsList;
    }

    /**
     * Sets the value of the dunsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUNSList }
     *     
     */
    public void setDUNSList(DUNSList value) {
        this.dunsList = value;
    }

    /**
     * Gets the value of the doDAAC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoDAAC() {
        return doDAAC;
    }

    /**
     * Sets the value of the doDAAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoDAAC(JAXBElement<String> value) {
        this.doDAAC = value;
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
     * Gets the value of the cageCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link CAGECodeList }
     *     
     */
    public CAGECodeList getCAGECodeList() {
        return cageCodeList;
    }

    /**
     * Sets the value of the cageCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAGECodeList }
     *     
     */
    public void setCAGECodeList(CAGECodeList value) {
        this.cageCodeList = value;
    }

    /**
     * Gets the value of the taxpayerIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxpayerIdentificationNumber() {
        return taxpayerIdentificationNumber;
    }

    /**
     * Sets the value of the taxpayerIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxpayerIdentificationNumber(JAXBElement<String> value) {
        this.taxpayerIdentificationNumber = value;
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<String> value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<String> value) {
        this.endDate = value;
    }

}

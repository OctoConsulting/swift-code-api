
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SBASizeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SBASizeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAICSCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="NAICSYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="NAICSExceptionSeqNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="NAICSQualityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="revenueSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="employeeSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="NAICSDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="megawattHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="oilBarrel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="NAICSTotalAsset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="activeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="NAICSExceptionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="NAICSExceptionMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBASizeType", propOrder = {
    "naicsCode",
    "naicsYear",
    "naicsExceptionSeqNumber",
    "status",
    "naicsQualityCode",
    "revenueSize",
    "employeeSize",
    "naicsDescription",
    "megawattHours",
    "oilBarrel",
    "naicsTotalAsset",
    "activeFlag",
    "naicsExceptionFlag",
    "naicsExceptionMod"
})
public class SBASizeType {

    @XmlElement(name = "NAICSCode", namespace = "http://www.sam.gov", required = true)
    protected String naicsCode;
    @XmlElementRef(name = "NAICSYear", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> naicsYear;
    @XmlElementRef(name = "NAICSExceptionSeqNumber", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> naicsExceptionSeqNumber;
    @XmlElementRef(name = "status", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "NAICSQualityCode", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> naicsQualityCode;
    @XmlElementRef(name = "revenueSize", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> revenueSize;
    @XmlElementRef(name = "employeeSize", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeSize;
    @XmlElementRef(name = "NAICSDescription", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> naicsDescription;
    @XmlElementRef(name = "megawattHours", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> megawattHours;
    @XmlElementRef(name = "oilBarrel", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oilBarrel;
    @XmlElementRef(name = "NAICSTotalAsset", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> naicsTotalAsset;
    @XmlElementRef(name = "activeFlag", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeFlag;
    @XmlElementRef(name = "NAICSExceptionFlag", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> naicsExceptionFlag;
    @XmlElementRef(name = "NAICSExceptionMod", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> naicsExceptionMod;

    /**
     * Gets the value of the naicsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAICSCode() {
        return naicsCode;
    }

    /**
     * Sets the value of the naicsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAICSCode(String value) {
        this.naicsCode = value;
    }

    /**
     * Gets the value of the naicsYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAICSYear() {
        return naicsYear;
    }

    /**
     * Sets the value of the naicsYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAICSYear(JAXBElement<String> value) {
        this.naicsYear = value;
    }

    /**
     * Gets the value of the naicsExceptionSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAICSExceptionSeqNumber() {
        return naicsExceptionSeqNumber;
    }

    /**
     * Sets the value of the naicsExceptionSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAICSExceptionSeqNumber(JAXBElement<String> value) {
        this.naicsExceptionSeqNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the naicsQualityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAICSQualityCode() {
        return naicsQualityCode;
    }

    /**
     * Sets the value of the naicsQualityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAICSQualityCode(JAXBElement<String> value) {
        this.naicsQualityCode = value;
    }

    /**
     * Gets the value of the revenueSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRevenueSize() {
        return revenueSize;
    }

    /**
     * Sets the value of the revenueSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRevenueSize(JAXBElement<String> value) {
        this.revenueSize = value;
    }

    /**
     * Gets the value of the employeeSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeSize() {
        return employeeSize;
    }

    /**
     * Sets the value of the employeeSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeSize(JAXBElement<String> value) {
        this.employeeSize = value;
    }

    /**
     * Gets the value of the naicsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAICSDescription() {
        return naicsDescription;
    }

    /**
     * Sets the value of the naicsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAICSDescription(JAXBElement<String> value) {
        this.naicsDescription = value;
    }

    /**
     * Gets the value of the megawattHours property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMegawattHours() {
        return megawattHours;
    }

    /**
     * Sets the value of the megawattHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMegawattHours(JAXBElement<String> value) {
        this.megawattHours = value;
    }

    /**
     * Gets the value of the oilBarrel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOilBarrel() {
        return oilBarrel;
    }

    /**
     * Sets the value of the oilBarrel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOilBarrel(JAXBElement<String> value) {
        this.oilBarrel = value;
    }

    /**
     * Gets the value of the naicsTotalAsset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAICSTotalAsset() {
        return naicsTotalAsset;
    }

    /**
     * Sets the value of the naicsTotalAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAICSTotalAsset(JAXBElement<String> value) {
        this.naicsTotalAsset = value;
    }

    /**
     * Gets the value of the activeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveFlag(JAXBElement<String> value) {
        this.activeFlag = value;
    }

    /**
     * Gets the value of the naicsExceptionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAICSExceptionFlag() {
        return naicsExceptionFlag;
    }

    /**
     * Sets the value of the naicsExceptionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAICSExceptionFlag(JAXBElement<String> value) {
        this.naicsExceptionFlag = value;
    }

    /**
     * Gets the value of the naicsExceptionMod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAICSExceptionMod() {
        return naicsExceptionMod;
    }

    /**
     * Sets the value of the naicsExceptionMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAICSExceptionMod(JAXBElement<String> value) {
        this.naicsExceptionMod = value;
    }

}

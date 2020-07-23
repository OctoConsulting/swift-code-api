
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExclusionFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExclusionFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CTCodes" type="{http://www.sam.gov}CTCodeListType" minOccurs="0" form="qualified"/>
 *         &lt;element name="DebarringAgencies" type="{http://www.sam.gov}DebarringAgencyListType" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExclusionTypes" type="{http://www.sam.gov}ExclusionTypeListType" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExclusionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionFilter", propOrder = {
    "ctCodes",
    "debarringAgencies",
    "exclusionTypes",
    "exclusionStatus"
})
public class ExclusionFilter {

    @XmlElementRef(name = "CTCodes", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<CTCodeListType> ctCodes;
    @XmlElementRef(name = "DebarringAgencies", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<DebarringAgencyListType> debarringAgencies;
    @XmlElementRef(name = "ExclusionTypes", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionTypeListType> exclusionTypes;
    @XmlElement(name = "ExclusionStatus", namespace = "http://www.sam.gov", defaultValue = "ACTIVE")
    protected String exclusionStatus;

    /**
     * Gets the value of the ctCodes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CTCodeListType }{@code >}
     *     
     */
    public JAXBElement<CTCodeListType> getCTCodes() {
        return ctCodes;
    }

    /**
     * Sets the value of the ctCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CTCodeListType }{@code >}
     *     
     */
    public void setCTCodes(JAXBElement<CTCodeListType> value) {
        this.ctCodes = value;
    }

    /**
     * Gets the value of the debarringAgencies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DebarringAgencyListType }{@code >}
     *     
     */
    public JAXBElement<DebarringAgencyListType> getDebarringAgencies() {
        return debarringAgencies;
    }

    /**
     * Sets the value of the debarringAgencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DebarringAgencyListType }{@code >}
     *     
     */
    public void setDebarringAgencies(JAXBElement<DebarringAgencyListType> value) {
        this.debarringAgencies = value;
    }

    /**
     * Gets the value of the exclusionTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclusionTypeListType }{@code >}
     *     
     */
    public JAXBElement<ExclusionTypeListType> getExclusionTypes() {
        return exclusionTypes;
    }

    /**
     * Sets the value of the exclusionTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclusionTypeListType }{@code >}
     *     
     */
    public void setExclusionTypes(JAXBElement<ExclusionTypeListType> value) {
        this.exclusionTypes = value;
    }

    /**
     * Gets the value of the exclusionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusionStatus() {
        return exclusionStatus;
    }

    /**
     * Sets the value of the exclusionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusionStatus(String value) {
        this.exclusionStatus = value;
    }

}

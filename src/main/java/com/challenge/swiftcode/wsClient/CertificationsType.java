
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for certificationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="certificationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FARResponses" type="{http://www.sam.gov}FARResponseType" minOccurs="0"/>
 *         &lt;element name="DFARResponses" type="{http://www.sam.gov}FARResponseType" minOccurs="0"/>
 *         &lt;element name="certificationURLs" type="{http://www.sam.gov}certificationURLsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certificationsType", propOrder = {
    "farResponses",
    "dfarResponses",
    "certificationURLs"
})
public class CertificationsType {

    @XmlElementRef(name = "FARResponses", type = JAXBElement.class, required = false)
    protected JAXBElement<FARResponseType> farResponses;
    @XmlElementRef(name = "DFARResponses", type = JAXBElement.class, required = false)
    protected JAXBElement<FARResponseType> dfarResponses;
    @XmlElementRef(name = "certificationURLs", type = JAXBElement.class, required = false)
    protected JAXBElement<CertificationURLsType> certificationURLs;

    /**
     * Gets the value of the farResponses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FARResponseType }{@code >}
     *     
     */
    public JAXBElement<FARResponseType> getFARResponses() {
        return farResponses;
    }

    /**
     * Sets the value of the farResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FARResponseType }{@code >}
     *     
     */
    public void setFARResponses(JAXBElement<FARResponseType> value) {
        this.farResponses = value;
    }

    /**
     * Gets the value of the dfarResponses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FARResponseType }{@code >}
     *     
     */
    public JAXBElement<FARResponseType> getDFARResponses() {
        return dfarResponses;
    }

    /**
     * Sets the value of the dfarResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FARResponseType }{@code >}
     *     
     */
    public void setDFARResponses(JAXBElement<FARResponseType> value) {
        this.dfarResponses = value;
    }

    /**
     * Gets the value of the certificationURLs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CertificationURLsType }{@code >}
     *     
     */
    public JAXBElement<CertificationURLsType> getCertificationURLs() {
        return certificationURLs;
    }

    /**
     * Sets the value of the certificationURLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CertificationURLsType }{@code >}
     *     
     */
    public void setCertificationURLs(JAXBElement<CertificationURLsType> value) {
        this.certificationURLs = value;
    }

}


package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qualificationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qualificationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="architectEngineerResponses" type="{http://www.sam.gov}FARResponseType" minOccurs="0"/>
 *         &lt;element name="qualificationURLs" type="{http://www.sam.gov}certificationURLsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qualificationsType", propOrder = {
    "architectEngineerResponses",
    "qualificationURLs"
})
public class QualificationsType {

    @XmlElementRef(name = "architectEngineerResponses", type = JAXBElement.class, required = false)
    protected JAXBElement<FARResponseType> architectEngineerResponses;
    @XmlElementRef(name = "qualificationURLs", type = JAXBElement.class, required = false)
    protected JAXBElement<CertificationURLsType> qualificationURLs;

    /**
     * Gets the value of the architectEngineerResponses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FARResponseType }{@code >}
     *     
     */
    public JAXBElement<FARResponseType> getArchitectEngineerResponses() {
        return architectEngineerResponses;
    }

    /**
     * Sets the value of the architectEngineerResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FARResponseType }{@code >}
     *     
     */
    public void setArchitectEngineerResponses(JAXBElement<FARResponseType> value) {
        this.architectEngineerResponses = value;
    }

    /**
     * Gets the value of the qualificationURLs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CertificationURLsType }{@code >}
     *     
     */
    public JAXBElement<CertificationURLsType> getQualificationURLs() {
        return qualificationURLs;
    }

    /**
     * Sets the value of the qualificationURLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CertificationURLsType }{@code >}
     *     
     */
    public void setQualificationURLs(JAXBElement<CertificationURLsType> value) {
        this.qualificationURLs = value;
    }

}

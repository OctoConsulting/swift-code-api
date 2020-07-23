
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repsAndCertsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="repsAndCertsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="certifications" type="{http://www.sam.gov}certificationsType" minOccurs="0"/>
 *         &lt;element name="qualifications" type="{http://www.sam.gov}qualificationsType" minOccurs="0"/>
 *         &lt;element name="financialAssistanceCertifications" type="{http://www.sam.gov}financialAssistanceCertificationsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repsAndCertsType", propOrder = {
    "certifications",
    "qualifications",
    "financialAssistanceCertifications"
})
public class RepsAndCertsType {

    @XmlElementRef(name = "certifications", type = JAXBElement.class, required = false)
    protected JAXBElement<CertificationsType> certifications;
    @XmlElementRef(name = "qualifications", type = JAXBElement.class, required = false)
    protected JAXBElement<QualificationsType> qualifications;
    @XmlElementRef(name = "financialAssistanceCertifications", type = JAXBElement.class, required = false)
    protected JAXBElement<FinancialAssistanceCertificationsType> financialAssistanceCertifications;

    /**
     * Gets the value of the certifications property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CertificationsType }{@code >}
     *     
     */
    public JAXBElement<CertificationsType> getCertifications() {
        return certifications;
    }

    /**
     * Sets the value of the certifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CertificationsType }{@code >}
     *     
     */
    public void setCertifications(JAXBElement<CertificationsType> value) {
        this.certifications = value;
    }

    /**
     * Gets the value of the qualifications property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualificationsType }{@code >}
     *     
     */
    public JAXBElement<QualificationsType> getQualifications() {
        return qualifications;
    }

    /**
     * Sets the value of the qualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualificationsType }{@code >}
     *     
     */
    public void setQualifications(JAXBElement<QualificationsType> value) {
        this.qualifications = value;
    }

    /**
     * Gets the value of the financialAssistanceCertifications property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FinancialAssistanceCertificationsType }{@code >}
     *     
     */
    public JAXBElement<FinancialAssistanceCertificationsType> getFinancialAssistanceCertifications() {
        return financialAssistanceCertifications;
    }

    /**
     * Sets the value of the financialAssistanceCertifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FinancialAssistanceCertificationsType }{@code >}
     *     
     */
    public void setFinancialAssistanceCertifications(JAXBElement<FinancialAssistanceCertificationsType> value) {
        this.financialAssistanceCertifications = value;
    }

}

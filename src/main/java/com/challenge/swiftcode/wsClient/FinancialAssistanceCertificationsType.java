
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for financialAssistanceCertificationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="financialAssistanceCertificationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="financialAssistanceResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="financialAssistanceResponseURLs" type="{http://www.sam.gov}financialAssistanceResponseURLsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "financialAssistanceCertificationsType", propOrder = {
    "financialAssistanceResponse",
    "financialAssistanceResponseURLs"
})
public class FinancialAssistanceCertificationsType {

    @XmlElementRef(name = "financialAssistanceResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> financialAssistanceResponse;
    @XmlElementRef(name = "financialAssistanceResponseURLs", type = JAXBElement.class, required = false)
    protected JAXBElement<FinancialAssistanceResponseURLsType> financialAssistanceResponseURLs;

    /**
     * Gets the value of the financialAssistanceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinancialAssistanceResponse() {
        return financialAssistanceResponse;
    }

    /**
     * Sets the value of the financialAssistanceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinancialAssistanceResponse(JAXBElement<String> value) {
        this.financialAssistanceResponse = value;
    }

    /**
     * Gets the value of the financialAssistanceResponseURLs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FinancialAssistanceResponseURLsType }{@code >}
     *     
     */
    public JAXBElement<FinancialAssistanceResponseURLsType> getFinancialAssistanceResponseURLs() {
        return financialAssistanceResponseURLs;
    }

    /**
     * Sets the value of the financialAssistanceResponseURLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FinancialAssistanceResponseURLsType }{@code >}
     *     
     */
    public void setFinancialAssistanceResponseURLs(JAXBElement<FinancialAssistanceResponseURLsType> value) {
        this.financialAssistanceResponseURLs = value;
    }

}

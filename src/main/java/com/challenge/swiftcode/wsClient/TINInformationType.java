
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TINInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TINInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxpayerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxpayerIdentificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxpayerIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TINInformationType", propOrder = {
    "taxpayerName",
    "taxpayerIdentificationType",
    "taxpayerIdentificationNumber"
})
public class TINInformationType {

    protected String taxpayerName;
    @XmlElementRef(name = "taxpayerIdentificationType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxpayerIdentificationType;
    @XmlElementRef(name = "taxpayerIdentificationNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxpayerIdentificationNumber;

    /**
     * Gets the value of the taxpayerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxpayerName() {
        return taxpayerName;
    }

    /**
     * Sets the value of the taxpayerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxpayerName(String value) {
        this.taxpayerName = value;
    }

    /**
     * Gets the value of the taxpayerIdentificationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxpayerIdentificationType() {
        return taxpayerIdentificationType;
    }

    /**
     * Sets the value of the taxpayerIdentificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxpayerIdentificationType(JAXBElement<String> value) {
        this.taxpayerIdentificationType = value;
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

}

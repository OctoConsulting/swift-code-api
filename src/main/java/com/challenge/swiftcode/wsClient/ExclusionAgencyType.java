
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exclusionAgencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exclusionAgencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exclusionAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="exclusionAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exclusionAgencyType", propOrder = {
    "exclusionAgencyCode",
    "exclusionAgency"
})
public class ExclusionAgencyType {

    @XmlElementRef(name = "exclusionAgencyCode", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exclusionAgencyCode;
    @XmlElementRef(name = "exclusionAgency", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exclusionAgency;

    /**
     * Gets the value of the exclusionAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExclusionAgencyCode() {
        return exclusionAgencyCode;
    }

    /**
     * Sets the value of the exclusionAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExclusionAgencyCode(JAXBElement<String> value) {
        this.exclusionAgencyCode = value;
    }

    /**
     * Gets the value of the exclusionAgency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExclusionAgency() {
        return exclusionAgency;
    }

    /**
     * Sets the value of the exclusionAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExclusionAgency(JAXBElement<String> value) {
        this.exclusionAgency = value;
    }

}

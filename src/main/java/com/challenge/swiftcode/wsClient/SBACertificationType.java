
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SBACertificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SBACertificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SBAEntryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="SBAExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="SBACertificationProgram" type="{http://www.sam.gov}SBACertificationProgramType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBACertificationType", propOrder = {
    "sbaEntryDate",
    "sbaExitDate",
    "sbaCertificationProgram"
})
public class SBACertificationType {

    @XmlElementRef(name = "SBAEntryDate", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sbaEntryDate;
    @XmlElementRef(name = "SBAExitDate", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sbaExitDate;
    @XmlElementRef(name = "SBACertificationProgram", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<SBACertificationProgramType> sbaCertificationProgram;

    /**
     * Gets the value of the sbaEntryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSBAEntryDate() {
        return sbaEntryDate;
    }

    /**
     * Sets the value of the sbaEntryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSBAEntryDate(JAXBElement<String> value) {
        this.sbaEntryDate = value;
    }

    /**
     * Gets the value of the sbaExitDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSBAExitDate() {
        return sbaExitDate;
    }

    /**
     * Sets the value of the sbaExitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSBAExitDate(JAXBElement<String> value) {
        this.sbaExitDate = value;
    }

    /**
     * Gets the value of the sbaCertificationProgram property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SBACertificationProgramType }{@code >}
     *     
     */
    public JAXBElement<SBACertificationProgramType> getSBACertificationProgram() {
        return sbaCertificationProgram;
    }

    /**
     * Sets the value of the sbaCertificationProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SBACertificationProgramType }{@code >}
     *     
     */
    public void setSBACertificationProgram(JAXBElement<SBACertificationProgramType> value) {
        this.sbaCertificationProgram = value;
    }

}

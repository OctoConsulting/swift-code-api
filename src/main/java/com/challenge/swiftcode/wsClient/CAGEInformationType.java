
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CAGEInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAGEInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAGECode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NCAGECode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAGEInformationType", propOrder = {
    "cageCode",
    "ncageCode"
})
public class CAGEInformationType {

    @XmlElementRef(name = "CAGECode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cageCode;
    @XmlElementRef(name = "NCAGECode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ncageCode;

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
     * Gets the value of the ncageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNCAGECode() {
        return ncageCode;
    }

    /**
     * Sets the value of the ncageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNCAGECode(JAXBElement<String> value) {
        this.ncageCode = value;
    }

}

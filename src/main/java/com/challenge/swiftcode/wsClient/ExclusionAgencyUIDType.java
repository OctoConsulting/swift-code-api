
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExclusionAgencyUIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExclusionAgencyUIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uidType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uidValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionAgencyUIDType", propOrder = {
    "uidType",
    "uidValue"
})
public class ExclusionAgencyUIDType {

    @XmlElementRef(name = "uidType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uidType;
    @XmlElementRef(name = "uidValue", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uidValue;

    /**
     * Gets the value of the uidType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUidType() {
        return uidType;
    }

    /**
     * Sets the value of the uidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUidType(JAXBElement<String> value) {
        this.uidType = value;
    }

    /**
     * Gets the value of the uidValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUidValue() {
        return uidValue;
    }

    /**
     * Sets the value of the uidValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUidValue(JAXBElement<String> value) {
        this.uidValue = value;
    }

}


package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addAlternateAddressResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addAlternateAddressResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}responseType">
 *       &lt;sequence>
 *         &lt;element name="isAdded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addAlternateAddressResponseType", propOrder = {
    "isAdded"
})
public class AddAlternateAddressResponseType
    extends ResponseType
{

    @XmlElementRef(name = "isAdded", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAdded;

    /**
     * Gets the value of the isAdded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAdded() {
        return isAdded;
    }

    /**
     * Sets the value of the isAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAdded(JAXBElement<Boolean> value) {
        this.isAdded = value;
    }

}

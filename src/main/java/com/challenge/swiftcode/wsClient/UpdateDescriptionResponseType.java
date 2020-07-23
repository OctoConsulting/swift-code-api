
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateDescriptionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateDescriptionResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}responseType">
 *       &lt;sequence>
 *         &lt;element name="isUpdated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateDescriptionResponseType", propOrder = {
    "isUpdated"
})
public class UpdateDescriptionResponseType
    extends ResponseType
{

    @XmlElementRef(name = "isUpdated", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isUpdated;

    /**
     * Gets the value of the isUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsUpdated() {
        return isUpdated;
    }

    /**
     * Sets the value of the isUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsUpdated(JAXBElement<Boolean> value) {
        this.isUpdated = value;
    }

}

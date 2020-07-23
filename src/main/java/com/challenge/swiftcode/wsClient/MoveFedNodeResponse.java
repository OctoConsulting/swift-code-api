
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moveFedNodeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moveFedNodeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outputMessages" type="{http://www.sam.gov}OutputMessages" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moveFedNodeResponse", propOrder = {
    "outputMessages"
})
public class MoveFedNodeResponse {

    @XmlElementRef(name = "outputMessages", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<OutputMessages> outputMessages;

    /**
     * Gets the value of the outputMessages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OutputMessages }{@code >}
     *     
     */
    public JAXBElement<OutputMessages> getOutputMessages() {
        return outputMessages;
    }

    /**
     * Sets the value of the outputMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OutputMessages }{@code >}
     *     
     */
    public void setOutputMessages(JAXBElement<OutputMessages> value) {
        this.outputMessages = value;
    }

}

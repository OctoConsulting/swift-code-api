
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestedData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coreData" type="{http://www.sam.gov}YorNType" minOccurs="0"/>
 *         &lt;element name="assertions" type="{http://www.sam.gov}YorNType" minOccurs="0"/>
 *         &lt;element name="repsAndCerts" type="{http://www.sam.gov}YorNType" minOccurs="0"/>
 *         &lt;element name="pointsOfContact" type="{http://www.sam.gov}YorNType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestedData", propOrder = {
    "coreData",
    "assertions",
    "repsAndCerts",
    "pointsOfContact"
})
public class RequestedData {

    @XmlElementRef(name = "coreData", type = JAXBElement.class, required = false)
    protected JAXBElement<YorNType> coreData;
    @XmlElementRef(name = "assertions", type = JAXBElement.class, required = false)
    protected JAXBElement<YorNType> assertions;
    @XmlElementRef(name = "repsAndCerts", type = JAXBElement.class, required = false)
    protected JAXBElement<YorNType> repsAndCerts;
    @XmlElementRef(name = "pointsOfContact", type = JAXBElement.class, required = false)
    protected JAXBElement<YorNType> pointsOfContact;

    /**
     * Gets the value of the coreData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YorNType }{@code >}
     *     
     */
    public JAXBElement<YorNType> getCoreData() {
        return coreData;
    }

    /**
     * Sets the value of the coreData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YorNType }{@code >}
     *     
     */
    public void setCoreData(JAXBElement<YorNType> value) {
        this.coreData = value;
    }

    /**
     * Gets the value of the assertions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YorNType }{@code >}
     *     
     */
    public JAXBElement<YorNType> getAssertions() {
        return assertions;
    }

    /**
     * Sets the value of the assertions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YorNType }{@code >}
     *     
     */
    public void setAssertions(JAXBElement<YorNType> value) {
        this.assertions = value;
    }

    /**
     * Gets the value of the repsAndCerts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YorNType }{@code >}
     *     
     */
    public JAXBElement<YorNType> getRepsAndCerts() {
        return repsAndCerts;
    }

    /**
     * Sets the value of the repsAndCerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YorNType }{@code >}
     *     
     */
    public void setRepsAndCerts(JAXBElement<YorNType> value) {
        this.repsAndCerts = value;
    }

    /**
     * Gets the value of the pointsOfContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YorNType }{@code >}
     *     
     */
    public JAXBElement<YorNType> getPointsOfContact() {
        return pointsOfContact;
    }

    /**
     * Sets the value of the pointsOfContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YorNType }{@code >}
     *     
     */
    public void setPointsOfContact(JAXBElement<YorNType> value) {
        this.pointsOfContact = value;
    }

}

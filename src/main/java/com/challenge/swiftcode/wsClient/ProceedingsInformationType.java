
package com.challenge.swiftcode.wsClient;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for proceedingsInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="proceedingsInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proceedingId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="proceedingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proceedingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instrumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instrumentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proceedingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispositionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proceedingsInformationType", propOrder = {
    "proceedingId",
    "proceedingType",
    "proceedingState",
    "instrumentNumber",
    "instrumentID",
    "description",
    "proceedingDate",
    "dispositionID"
})
public class ProceedingsInformationType {

    protected BigInteger proceedingId;
    @XmlElementRef(name = "proceedingType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proceedingType;
    @XmlElementRef(name = "proceedingState", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proceedingState;
    @XmlElementRef(name = "instrumentNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instrumentNumber;
    @XmlElementRef(name = "instrumentID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instrumentID;
    @XmlElementRef(name = "description", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "proceedingDate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proceedingDate;
    @XmlElementRef(name = "dispositionID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispositionID;

    /**
     * Gets the value of the proceedingId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProceedingId() {
        return proceedingId;
    }

    /**
     * Sets the value of the proceedingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProceedingId(BigInteger value) {
        this.proceedingId = value;
    }

    /**
     * Gets the value of the proceedingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProceedingType() {
        return proceedingType;
    }

    /**
     * Sets the value of the proceedingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProceedingType(JAXBElement<String> value) {
        this.proceedingType = value;
    }

    /**
     * Gets the value of the proceedingState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProceedingState() {
        return proceedingState;
    }

    /**
     * Sets the value of the proceedingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProceedingState(JAXBElement<String> value) {
        this.proceedingState = value;
    }

    /**
     * Gets the value of the instrumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstrumentNumber() {
        return instrumentNumber;
    }

    /**
     * Sets the value of the instrumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstrumentNumber(JAXBElement<String> value) {
        this.instrumentNumber = value;
    }

    /**
     * Gets the value of the instrumentID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstrumentID() {
        return instrumentID;
    }

    /**
     * Sets the value of the instrumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstrumentID(JAXBElement<String> value) {
        this.instrumentID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the proceedingDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProceedingDate() {
        return proceedingDate;
    }

    /**
     * Sets the value of the proceedingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProceedingDate(JAXBElement<String> value) {
        this.proceedingDate = value;
    }

    /**
     * Gets the value of the dispositionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispositionID() {
        return dispositionID;
    }

    /**
     * Sets the value of the dispositionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispositionID(JAXBElement<String> value) {
        this.dispositionID = value;
    }

}

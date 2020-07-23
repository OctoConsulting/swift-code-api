
package com.challenge.swiftcode.wsClient;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestNumber" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
 *         &lt;element name="confirmationNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0" form="qualified"/>
 *         &lt;element name="listOfParameters" type="{http://www.sam.gov}listOfParametersType" minOccurs="0" form="qualified"/>
 *         &lt;element name="outputMessages" type="{http://www.sam.gov}outputMessagesType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseType", propOrder = {
    "requestNumber",
    "confirmationNumber",
    "listOfParameters",
    "outputMessages"
})
@XmlSeeAlso({
    SBASizeResponseType.class,
    SBAManualCertificationUpdateResponseType.class,
    AddAlternateAddressResponseType.class,
    AddDescriptionResponseType.class,
    DeleteDescriptionResponseType.class,
    UpdateDescriptionResponseType.class,
    UpdateAlternateAddressResponseType.class,
    DeleteExclusionResponseType.class,
    UpdateExclusionResponseType.class,
    GetExclusionsListType.class,
    CreateExclusionResponseType.class,
    DeleteAlternateAddressResponseType.class
})
public class ResponseType {

    @XmlElement(namespace = "http://www.sam.gov", required = true)
    protected BigInteger requestNumber;
    @XmlElementRef(name = "confirmationNumber", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> confirmationNumber;
    @XmlElementRef(name = "listOfParameters", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfParametersType> listOfParameters;
    @XmlElementRef(name = "outputMessages", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<OutputMessagesType> outputMessages;

    /**
     * Gets the value of the requestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestNumber() {
        return requestNumber;
    }

    /**
     * Sets the value of the requestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestNumber(BigInteger value) {
        this.requestNumber = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setConfirmationNumber(JAXBElement<BigInteger> value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the listOfParameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfParametersType }{@code >}
     *     
     */
    public JAXBElement<ListOfParametersType> getListOfParameters() {
        return listOfParameters;
    }

    /**
     * Sets the value of the listOfParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfParametersType }{@code >}
     *     
     */
    public void setListOfParameters(JAXBElement<ListOfParametersType> value) {
        this.listOfParameters = value;
    }

    /**
     * Gets the value of the outputMessages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OutputMessagesType }{@code >}
     *     
     */
    public JAXBElement<OutputMessagesType> getOutputMessages() {
        return outputMessages;
    }

    /**
     * Sets the value of the outputMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OutputMessagesType }{@code >}
     *     
     */
    public void setOutputMessages(JAXBElement<OutputMessagesType> value) {
        this.outputMessages = value;
    }

}


package com.challenge.swiftcode.wsClient;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEntities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEntities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInformation" type="{http://www.sam.gov}transactionInfoType" minOccurs="0"/>
 *         &lt;element name="listOfEntities" type="{http://www.sam.gov}listOfEntitiesType" minOccurs="0"/>
 *         &lt;element name="outputMessages" type="{http://www.sam.gov}outputMessagesType" minOccurs="0"/>
 *         &lt;element name="confirmationNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEntities", propOrder = {
    "transactionInformation",
    "listOfEntities",
    "outputMessages",
    "confirmationNumber"
})
public class GetEntities {

    @XmlElementRef(name = "transactionInformation", type = JAXBElement.class, required = false)
    protected JAXBElement<TransactionInfoType> transactionInformation;
    @XmlElementRef(name = "listOfEntities", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfEntitiesType> listOfEntities;
    protected OutputMessagesType outputMessages;
    protected BigInteger confirmationNumber;

    /**
     * Gets the value of the transactionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransactionInfoType }{@code >}
     *     
     */
    public JAXBElement<TransactionInfoType> getTransactionInformation() {
        return transactionInformation;
    }

    /**
     * Sets the value of the transactionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransactionInfoType }{@code >}
     *     
     */
    public void setTransactionInformation(JAXBElement<TransactionInfoType> value) {
        this.transactionInformation = value;
    }

    /**
     * Gets the value of the listOfEntities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfEntitiesType }{@code >}
     *     
     */
    public JAXBElement<ListOfEntitiesType> getListOfEntities() {
        return listOfEntities;
    }

    /**
     * Sets the value of the listOfEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfEntitiesType }{@code >}
     *     
     */
    public void setListOfEntities(JAXBElement<ListOfEntitiesType> value) {
        this.listOfEntities = value;
    }

    /**
     * Gets the value of the outputMessages property.
     * 
     * @return
     *     possible object is
     *     {@link OutputMessagesType }
     *     
     */
    public OutputMessagesType getOutputMessages() {
        return outputMessages;
    }

    /**
     * Sets the value of the outputMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputMessagesType }
     *     
     */
    public void setOutputMessages(OutputMessagesType value) {
        this.outputMessages = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConfirmationNumber(BigInteger value) {
        this.confirmationNumber = value;
    }

}

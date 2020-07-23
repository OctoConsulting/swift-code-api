
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataRetrievalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfRecordsReturned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionInfoType", propOrder = {
    "transactionStatus",
    "transactionMessage",
    "dataRetrievalTime",
    "numberOfRecordsReturned"
})
public class TransactionInfoType {

    @XmlElementRef(name = "transactionStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionStatus;
    @XmlElementRef(name = "transactionMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionMessage;
    @XmlElementRef(name = "dataRetrievalTime", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataRetrievalTime;
    @XmlElementRef(name = "numberOfRecordsReturned", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberOfRecordsReturned;

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionStatus(JAXBElement<String> value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the transactionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionMessage() {
        return transactionMessage;
    }

    /**
     * Sets the value of the transactionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionMessage(JAXBElement<String> value) {
        this.transactionMessage = value;
    }

    /**
     * Gets the value of the dataRetrievalTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataRetrievalTime() {
        return dataRetrievalTime;
    }

    /**
     * Sets the value of the dataRetrievalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataRetrievalTime(JAXBElement<String> value) {
        this.dataRetrievalTime = value;
    }

    /**
     * Gets the value of the numberOfRecordsReturned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberOfRecordsReturned() {
        return numberOfRecordsReturned;
    }

    /**
     * Sets the value of the numberOfRecordsReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberOfRecordsReturned(JAXBElement<String> value) {
        this.numberOfRecordsReturned = value;
    }

}

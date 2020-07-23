
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exdescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exdescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificationInformation" type="{http://www.sam.gov}identificationInformationType" minOccurs="0" form="qualified"/>
 *         &lt;element name="listOfComments" type="{http://www.sam.gov}listOfCommentType" minOccurs="0" form="qualified"/>
 *         &lt;element name="transactionInformation" type="{http://www.sam.gov}transactionInformationType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exdescriptionType", propOrder = {
    "identificationInformation",
    "listOfComments",
    "transactionInformation"
})
public class ExdescriptionType {

    @XmlElementRef(name = "identificationInformation", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<IdentificationInformationType> identificationInformation;
    @XmlElementRef(name = "listOfComments", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCommentType> listOfComments;
    @XmlElementRef(name = "transactionInformation", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<TransactionInformationType> transactionInformation;

    /**
     * Gets the value of the identificationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdentificationInformationType }{@code >}
     *     
     */
    public JAXBElement<IdentificationInformationType> getIdentificationInformation() {
        return identificationInformation;
    }

    /**
     * Sets the value of the identificationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdentificationInformationType }{@code >}
     *     
     */
    public void setIdentificationInformation(JAXBElement<IdentificationInformationType> value) {
        this.identificationInformation = value;
    }

    /**
     * Gets the value of the listOfComments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCommentType }{@code >}
     *     
     */
    public JAXBElement<ListOfCommentType> getListOfComments() {
        return listOfComments;
    }

    /**
     * Sets the value of the listOfComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCommentType }{@code >}
     *     
     */
    public void setListOfComments(JAXBElement<ListOfCommentType> value) {
        this.listOfComments = value;
    }

    /**
     * Gets the value of the transactionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransactionInformationType }{@code >}
     *     
     */
    public JAXBElement<TransactionInformationType> getTransactionInformation() {
        return transactionInformation;
    }

    /**
     * Sets the value of the transactionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransactionInformationType }{@code >}
     *     
     */
    public void setTransactionInformation(JAXBElement<TransactionInformationType> value) {
        this.transactionInformation = value;
    }

}

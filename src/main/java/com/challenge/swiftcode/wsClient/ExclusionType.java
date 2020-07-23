
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exclusionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exclusionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificationInformation" type="{http://www.sam.gov}identificationInformationType" minOccurs="0" form="qualified"/>
 *         &lt;element name="exclusionDetails" type="{http://www.sam.gov}exclusionDetailsType" minOccurs="0" form="qualified"/>
 *         &lt;element name="exclusionAgency" type="{http://www.sam.gov}exclusionAgencyType" minOccurs="0" form="qualified"/>
 *         &lt;element name="crossReferences" type="{http://www.sam.gov}listOfCrossReferenceExclusionsType" minOccurs="0" form="qualified"/>
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
@XmlType(name = "exclusionType", propOrder = {
    "identificationInformation",
    "exclusionDetails",
    "exclusionAgency",
    "crossReferences",
    "transactionInformation"
})
public class ExclusionType {

    @XmlElementRef(name = "identificationInformation", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<IdentificationInformationType> identificationInformation;
    @XmlElementRef(name = "exclusionDetails", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionDetailsType> exclusionDetails;
    @XmlElementRef(name = "exclusionAgency", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionAgencyType> exclusionAgency;
    @XmlElementRef(name = "crossReferences", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCrossReferenceExclusionsType> crossReferences;
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
     * Gets the value of the exclusionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclusionDetailsType }{@code >}
     *     
     */
    public JAXBElement<ExclusionDetailsType> getExclusionDetails() {
        return exclusionDetails;
    }

    /**
     * Sets the value of the exclusionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclusionDetailsType }{@code >}
     *     
     */
    public void setExclusionDetails(JAXBElement<ExclusionDetailsType> value) {
        this.exclusionDetails = value;
    }

    /**
     * Gets the value of the exclusionAgency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclusionAgencyType }{@code >}
     *     
     */
    public JAXBElement<ExclusionAgencyType> getExclusionAgency() {
        return exclusionAgency;
    }

    /**
     * Sets the value of the exclusionAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclusionAgencyType }{@code >}
     *     
     */
    public void setExclusionAgency(JAXBElement<ExclusionAgencyType> value) {
        this.exclusionAgency = value;
    }

    /**
     * Gets the value of the crossReferences property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCrossReferenceExclusionsType }{@code >}
     *     
     */
    public JAXBElement<ListOfCrossReferenceExclusionsType> getCrossReferences() {
        return crossReferences;
    }

    /**
     * Sets the value of the crossReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCrossReferenceExclusionsType }{@code >}
     *     
     */
    public void setCrossReferences(JAXBElement<ListOfCrossReferenceExclusionsType> value) {
        this.crossReferences = value;
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

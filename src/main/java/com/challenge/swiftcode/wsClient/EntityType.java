
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityIdentification" type="{http://www.sam.gov}registrationInformationType" minOccurs="0"/>
 *         &lt;element name="entityCoreData" type="{http://www.sam.gov}entityCoreDataType" minOccurs="0"/>
 *         &lt;element name="coreData" type="{http://www.sam.gov}entityCoreDataType" minOccurs="0"/>
 *         &lt;element name="assertions" type="{http://www.sam.gov}assertionsType" minOccurs="0"/>
 *         &lt;element name="repsAndCerts" type="{http://www.sam.gov}repsAndCertsType" minOccurs="0"/>
 *         &lt;element name="pointsOfContact" type="{http://www.sam.gov}pointsOfContactType" minOccurs="0"/>
 *         &lt;element name="transactionInformation" type="{http://www.sam.gov}transactionInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entityType", propOrder = {
    "entityIdentification",
    "entityCoreData",
    "coreData",
    "assertions",
    "repsAndCerts",
    "pointsOfContact",
    "transactionInformation"
})
public class EntityType {

    @XmlElementRef(name = "entityIdentification", type = JAXBElement.class, required = false)
    protected JAXBElement<RegistrationInformationType> entityIdentification;
    protected EntityCoreDataType entityCoreData;
    @XmlElementRef(name = "coreData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityCoreDataType> coreData;
    @XmlElementRef(name = "assertions", type = JAXBElement.class, required = false)
    protected JAXBElement<AssertionsType> assertions;
    @XmlElementRef(name = "repsAndCerts", type = JAXBElement.class, required = false)
    protected JAXBElement<RepsAndCertsType> repsAndCerts;
    @XmlElementRef(name = "pointsOfContact", type = JAXBElement.class, required = false)
    protected JAXBElement<PointsOfContactType> pointsOfContact;
    protected TransactionInformationType transactionInformation;

    /**
     * Gets the value of the entityIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegistrationInformationType }{@code >}
     *     
     */
    public JAXBElement<RegistrationInformationType> getEntityIdentification() {
        return entityIdentification;
    }

    /**
     * Sets the value of the entityIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegistrationInformationType }{@code >}
     *     
     */
    public void setEntityIdentification(JAXBElement<RegistrationInformationType> value) {
        this.entityIdentification = value;
    }

    /**
     * Gets the value of the entityCoreData property.
     * 
     * @return
     *     possible object is
     *     {@link EntityCoreDataType }
     *     
     */
    public EntityCoreDataType getEntityCoreData() {
        return entityCoreData;
    }

    /**
     * Sets the value of the entityCoreData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityCoreDataType }
     *     
     */
    public void setEntityCoreData(EntityCoreDataType value) {
        this.entityCoreData = value;
    }

    /**
     * Gets the value of the coreData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityCoreDataType }{@code >}
     *     
     */
    public JAXBElement<EntityCoreDataType> getCoreData() {
        return coreData;
    }

    /**
     * Sets the value of the coreData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityCoreDataType }{@code >}
     *     
     */
    public void setCoreData(JAXBElement<EntityCoreDataType> value) {
        this.coreData = value;
    }

    /**
     * Gets the value of the assertions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssertionsType }{@code >}
     *     
     */
    public JAXBElement<AssertionsType> getAssertions() {
        return assertions;
    }

    /**
     * Sets the value of the assertions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssertionsType }{@code >}
     *     
     */
    public void setAssertions(JAXBElement<AssertionsType> value) {
        this.assertions = value;
    }

    /**
     * Gets the value of the repsAndCerts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RepsAndCertsType }{@code >}
     *     
     */
    public JAXBElement<RepsAndCertsType> getRepsAndCerts() {
        return repsAndCerts;
    }

    /**
     * Sets the value of the repsAndCerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RepsAndCertsType }{@code >}
     *     
     */
    public void setRepsAndCerts(JAXBElement<RepsAndCertsType> value) {
        this.repsAndCerts = value;
    }

    /**
     * Gets the value of the pointsOfContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointsOfContactType }{@code >}
     *     
     */
    public JAXBElement<PointsOfContactType> getPointsOfContact() {
        return pointsOfContact;
    }

    /**
     * Sets the value of the pointsOfContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointsOfContactType }{@code >}
     *     
     */
    public void setPointsOfContact(JAXBElement<PointsOfContactType> value) {
        this.pointsOfContact = value;
    }

    /**
     * Gets the value of the transactionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInformationType }
     *     
     */
    public TransactionInformationType getTransactionInformation() {
        return transactionInformation;
    }

    /**
     * Sets the value of the transactionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInformationType }
     *     
     */
    public void setTransactionInformation(TransactionInformationType value) {
        this.transactionInformation = value;
    }

}

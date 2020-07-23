
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registrationPurposeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrationPurposeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeOfEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bidOnContracts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="performIGTContracts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eligibleForGrants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrationPurposeType", propOrder = {
    "typeOfEntity",
    "bidOnContracts",
    "performIGTContracts",
    "eligibleForGrants",
    "purpose"
})
public class RegistrationPurposeType {

    protected String typeOfEntity;
    protected String bidOnContracts;
    protected String performIGTContracts;
    protected String eligibleForGrants;
    @XmlElementRef(name = "purpose", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purpose;

    /**
     * Gets the value of the typeOfEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfEntity() {
        return typeOfEntity;
    }

    /**
     * Sets the value of the typeOfEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfEntity(String value) {
        this.typeOfEntity = value;
    }

    /**
     * Gets the value of the bidOnContracts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidOnContracts() {
        return bidOnContracts;
    }

    /**
     * Sets the value of the bidOnContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidOnContracts(String value) {
        this.bidOnContracts = value;
    }

    /**
     * Gets the value of the performIGTContracts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformIGTContracts() {
        return performIGTContracts;
    }

    /**
     * Sets the value of the performIGTContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformIGTContracts(String value) {
        this.performIGTContracts = value;
    }

    /**
     * Gets the value of the eligibleForGrants property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibleForGrants() {
        return eligibleForGrants;
    }

    /**
     * Sets the value of the eligibleForGrants property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibleForGrants(String value) {
        this.eligibleForGrants = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurpose(JAXBElement<String> value) {
        this.purpose = value;
    }

}

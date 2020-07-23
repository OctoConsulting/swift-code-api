
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeignGovtControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForeignGovtControl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}businessObjectType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}anyType" form="qualified"/>
 *         &lt;element name="interestDescription" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="ownershipPercentageType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="govtCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignGovtControl", propOrder = {
    "name",
    "interestDescription",
    "ownershipPercentageType",
    "address",
    "govtCountry"
})
public class ForeignGovtControl
    extends BusinessObjectType
{

    @XmlElement(namespace = "http://www.sam.gov", required = true)
    protected Object name;
    @XmlElement(required = true)
    protected Object interestDescription;
    @XmlElement(required = true)
    protected Object ownershipPercentageType;
    protected Object address;
    @XmlElement(required = true)
    protected String govtCountry;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setName(Object value) {
        this.name = value;
    }

    /**
     * Gets the value of the interestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInterestDescription() {
        return interestDescription;
    }

    /**
     * Sets the value of the interestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInterestDescription(Object value) {
        this.interestDescription = value;
    }

    /**
     * Gets the value of the ownershipPercentageType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOwnershipPercentageType() {
        return ownershipPercentageType;
    }

    /**
     * Sets the value of the ownershipPercentageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOwnershipPercentageType(Object value) {
        this.ownershipPercentageType = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAddress(Object value) {
        this.address = value;
    }

    /**
     * Gets the value of the govtCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovtCountry() {
        return govtCountry;
    }

    /**
     * Sets the value of the govtCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovtCountry(String value) {
        this.govtCountry = value;
    }

}

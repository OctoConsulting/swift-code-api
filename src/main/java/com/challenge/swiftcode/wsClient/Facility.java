
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Facility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Facility">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}businessObjectType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ownerAddress" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Facility", propOrder = {
    "address",
    "owner",
    "ownerAddress"
})
public class Facility
    extends BusinessObjectType
{

    protected Object address;
    protected Object owner;
    protected Object ownerAddress;

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
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOwner(Object value) {
        this.owner = value;
    }

    /**
     * Gets the value of the ownerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOwnerAddress() {
        return ownerAddress;
    }

    /**
     * Sets the value of the ownerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOwnerAddress(Object value) {
        this.ownerAddress = value;
    }

}

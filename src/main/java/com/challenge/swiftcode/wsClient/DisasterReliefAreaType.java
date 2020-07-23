
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disasterReliefAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disasterReliefAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listOfGeographicAreaServed" type="{http://www.sam.gov}listOfGeographicAreaServedType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disasterReliefAreaType", propOrder = {
    "type",
    "listOfGeographicAreaServed"
})
public class DisasterReliefAreaType {

    @XmlElementRef(name = "type", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;
    @XmlElement(required = true)
    protected ListOfGeographicAreaServedType listOfGeographicAreaServed;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

    /**
     * Gets the value of the listOfGeographicAreaServed property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfGeographicAreaServedType }
     *     
     */
    public ListOfGeographicAreaServedType getListOfGeographicAreaServed() {
        return listOfGeographicAreaServed;
    }

    /**
     * Sets the value of the listOfGeographicAreaServed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfGeographicAreaServedType }
     *     
     */
    public void setListOfGeographicAreaServed(ListOfGeographicAreaServedType value) {
        this.listOfGeographicAreaServed = value;
    }

}

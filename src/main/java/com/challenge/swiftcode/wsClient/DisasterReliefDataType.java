
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disasterReliefDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disasterReliefDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfBondingLevels" type="{http://www.sam.gov}listOfBondingLevelsType" minOccurs="0"/>
 *         &lt;element name="disasterReliefArea" type="{http://www.sam.gov}disasterReliefAreaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disasterReliefDataType", propOrder = {
    "listOfBondingLevels",
    "disasterReliefArea"
})
public class DisasterReliefDataType {

    @XmlElementRef(name = "listOfBondingLevels", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfBondingLevelsType> listOfBondingLevels;
    @XmlElementRef(name = "disasterReliefArea", type = JAXBElement.class, required = false)
    protected JAXBElement<DisasterReliefAreaType> disasterReliefArea;

    /**
     * Gets the value of the listOfBondingLevels property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfBondingLevelsType }{@code >}
     *     
     */
    public JAXBElement<ListOfBondingLevelsType> getListOfBondingLevels() {
        return listOfBondingLevels;
    }

    /**
     * Sets the value of the listOfBondingLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfBondingLevelsType }{@code >}
     *     
     */
    public void setListOfBondingLevels(JAXBElement<ListOfBondingLevelsType> value) {
        this.listOfBondingLevels = value;
    }

    /**
     * Gets the value of the disasterReliefArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DisasterReliefAreaType }{@code >}
     *     
     */
    public JAXBElement<DisasterReliefAreaType> getDisasterReliefArea() {
        return disasterReliefArea;
    }

    /**
     * Sets the value of the disasterReliefArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DisasterReliefAreaType }{@code >}
     *     
     */
    public void setDisasterReliefArea(JAXBElement<DisasterReliefAreaType> value) {
        this.disasterReliefArea = value;
    }

}

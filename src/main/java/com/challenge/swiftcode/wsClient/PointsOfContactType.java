
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pointsOfContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pointsOfContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfPOCs" type="{http://www.sam.gov}listOfPOCsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pointsOfContactType", propOrder = {
    "listOfPOCs"
})
public class PointsOfContactType {

    @XmlElementRef(name = "listOfPOCs", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfPOCsType> listOfPOCs;

    /**
     * Gets the value of the listOfPOCs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfPOCsType }{@code >}
     *     
     */
    public JAXBElement<ListOfPOCsType> getListOfPOCs() {
        return listOfPOCs;
    }

    /**
     * Sets the value of the listOfPOCs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfPOCsType }{@code >}
     *     
     */
    public void setListOfPOCs(JAXBElement<ListOfPOCsType> value) {
        this.listOfPOCs = value;
    }

}

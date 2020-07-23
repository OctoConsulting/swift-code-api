
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for goodsAndServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="goodsAndServicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfNAICS" type="{http://www.sam.gov}listOfNAICSType" minOccurs="0"/>
 *         &lt;element name="listOfPSC" type="{http://www.sam.gov}listOfPSCType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goodsAndServicesType", propOrder = {
    "listOfNAICS",
    "listOfPSC"
})
public class GoodsAndServicesType {

    @XmlElementRef(name = "listOfNAICS", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfNAICSType> listOfNAICS;
    @XmlElementRef(name = "listOfPSC", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfPSCType> listOfPSC;

    /**
     * Gets the value of the listOfNAICS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfNAICSType }{@code >}
     *     
     */
    public JAXBElement<ListOfNAICSType> getListOfNAICS() {
        return listOfNAICS;
    }

    /**
     * Sets the value of the listOfNAICS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfNAICSType }{@code >}
     *     
     */
    public void setListOfNAICS(JAXBElement<ListOfNAICSType> value) {
        this.listOfNAICS = value;
    }

    /**
     * Gets the value of the listOfPSC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfPSCType }{@code >}
     *     
     */
    public JAXBElement<ListOfPSCType> getListOfPSC() {
        return listOfPSC;
    }

    /**
     * Sets the value of the listOfPSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfPSCType }{@code >}
     *     
     */
    public void setListOfPSC(JAXBElement<ListOfPSCType> value) {
        this.listOfPSC = value;
    }

}

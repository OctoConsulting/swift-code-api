
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SBASizeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SBASizeRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfSBASize" type="{http://www.sam.gov}listOfSBASizeType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBASizeRequestType", propOrder = {
    "listOfSBASize"
})
public class SBASizeRequestType {

    @XmlElementRef(name = "listOfSBASize", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfSBASizeType> listOfSBASize;

    /**
     * Gets the value of the listOfSBASize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfSBASizeType }{@code >}
     *     
     */
    public JAXBElement<ListOfSBASizeType> getListOfSBASize() {
        return listOfSBASize;
    }

    /**
     * Sets the value of the listOfSBASize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfSBASizeType }{@code >}
     *     
     */
    public void setListOfSBASize(JAXBElement<ListOfSBASizeType> value) {
        this.listOfSBASize = value;
    }

}

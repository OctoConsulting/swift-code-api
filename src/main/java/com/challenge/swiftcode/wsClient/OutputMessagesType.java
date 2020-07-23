
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputMessagesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outputMessagesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfErrors" type="{http://www.sam.gov}listOfErrorsType" minOccurs="0"/>
 *         &lt;element name="listOfWarnings" type="{http://www.sam.gov}listOfWarningsType" minOccurs="0"/>
 *         &lt;element name="listOfInfoMessages" type="{http://www.sam.gov}listOfInfoMessagesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outputMessagesType", propOrder = {
    "listOfErrors",
    "listOfWarnings",
    "listOfInfoMessages"
})
public class OutputMessagesType {

    protected ListOfErrorsType listOfErrors;
    protected ListOfWarningsType listOfWarnings;
    protected ListOfInfoMessagesType listOfInfoMessages;

    /**
     * Gets the value of the listOfErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfErrorsType }
     *     
     */
    public ListOfErrorsType getListOfErrors() {
        return listOfErrors;
    }

    /**
     * Sets the value of the listOfErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfErrorsType }
     *     
     */
    public void setListOfErrors(ListOfErrorsType value) {
        this.listOfErrors = value;
    }

    /**
     * Gets the value of the listOfWarnings property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfWarningsType }
     *     
     */
    public ListOfWarningsType getListOfWarnings() {
        return listOfWarnings;
    }

    /**
     * Sets the value of the listOfWarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfWarningsType }
     *     
     */
    public void setListOfWarnings(ListOfWarningsType value) {
        this.listOfWarnings = value;
    }

    /**
     * Gets the value of the listOfInfoMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfInfoMessagesType }
     *     
     */
    public ListOfInfoMessagesType getListOfInfoMessages() {
        return listOfInfoMessages;
    }

    /**
     * Sets the value of the listOfInfoMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfInfoMessagesType }
     *     
     */
    public void setListOfInfoMessages(ListOfInfoMessagesType value) {
        this.listOfInfoMessages = value;
    }

}

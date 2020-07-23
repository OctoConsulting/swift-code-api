
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for naicsAnswerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="naicsAnswerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}answerType">
 *       &lt;sequence>
 *         &lt;element name="listOfNAICS" type="{http://www.sam.gov}listOfNAICSType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "naicsAnswerType", propOrder = {
    "listOfNAICS"
})
public class NaicsAnswerType
    extends AnswerType
{

    @XmlElementRef(name = "listOfNAICS", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfNAICSType> listOfNAICS;

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

}

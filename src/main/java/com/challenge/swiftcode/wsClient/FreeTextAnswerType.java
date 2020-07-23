
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for freeTextAnswerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="freeTextAnswerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}answerType">
 *       &lt;sequence>
 *         &lt;element name="answerText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "freeTextAnswerType", propOrder = {
    "answerText"
})
public class FreeTextAnswerType
    extends AnswerType
{

    @XmlElementRef(name = "answerText", type = JAXBElement.class, required = false)
    protected JAXBElement<String> answerText;

    /**
     * Gets the value of the answerText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnswerText() {
        return answerText;
    }

    /**
     * Sets the value of the answerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnswerText(JAXBElement<String> value) {
        this.answerText = value;
    }

}

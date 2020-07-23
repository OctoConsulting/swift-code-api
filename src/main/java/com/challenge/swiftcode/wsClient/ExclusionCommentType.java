
package com.challenge.swiftcode.wsClient;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exclusionCommentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exclusionCommentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descriptionId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0" form="qualified"/>
 *         &lt;element name="additionalComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exclusionCommentType", propOrder = {
    "descriptionId",
    "additionalComments"
})
public class ExclusionCommentType {

    @XmlElementRef(name = "descriptionId", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> descriptionId;
    @XmlElementRef(name = "additionalComments", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalComments;

    /**
     * Gets the value of the descriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getDescriptionId() {
        return descriptionId;
    }

    /**
     * Sets the value of the descriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setDescriptionId(JAXBElement<BigInteger> value) {
        this.descriptionId = value;
    }

    /**
     * Gets the value of the additionalComments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalComments() {
        return additionalComments;
    }

    /**
     * Sets the value of the additionalComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalComments(JAXBElement<String> value) {
        this.additionalComments = value;
    }

}

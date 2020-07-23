
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EDIInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDIInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VANProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISAQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISAIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="functionalGroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestFlag820s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDIInformationType", propOrder = {
    "vanProvider",
    "isaQualifier",
    "isaIdentifier",
    "functionalGroupIdentifier",
    "requestFlag820S"
})
public class EDIInformationType {

    @XmlElementRef(name = "VANProvider", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vanProvider;
    @XmlElementRef(name = "ISAQualifier", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isaQualifier;
    @XmlElementRef(name = "ISAIdentifier", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isaIdentifier;
    @XmlElementRef(name = "functionalGroupIdentifier", type = JAXBElement.class, required = false)
    protected JAXBElement<String> functionalGroupIdentifier;
    @XmlElementRef(name = "requestFlag820s", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestFlag820S;

    /**
     * Gets the value of the vanProvider property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVANProvider() {
        return vanProvider;
    }

    /**
     * Sets the value of the vanProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVANProvider(JAXBElement<String> value) {
        this.vanProvider = value;
    }

    /**
     * Gets the value of the isaQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getISAQualifier() {
        return isaQualifier;
    }

    /**
     * Sets the value of the isaQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setISAQualifier(JAXBElement<String> value) {
        this.isaQualifier = value;
    }

    /**
     * Gets the value of the isaIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getISAIdentifier() {
        return isaIdentifier;
    }

    /**
     * Sets the value of the isaIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setISAIdentifier(JAXBElement<String> value) {
        this.isaIdentifier = value;
    }

    /**
     * Gets the value of the functionalGroupIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunctionalGroupIdentifier() {
        return functionalGroupIdentifier;
    }

    /**
     * Sets the value of the functionalGroupIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunctionalGroupIdentifier(JAXBElement<String> value) {
        this.functionalGroupIdentifier = value;
    }

    /**
     * Gets the value of the requestFlag820S property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestFlag820S() {
        return requestFlag820S;
    }

    /**
     * Sets the value of the requestFlag820S property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestFlag820S(JAXBElement<String> value) {
        this.requestFlag820S = value;
    }

}

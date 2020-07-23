
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationExSSNSearchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationExSSNSearchType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}ExclusionValueObjectType">
 *       &lt;sequence>
 *         &lt;element name="exactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssnOrTin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationExSSNSearchType", propOrder = {
    "exactName",
    "ssnOrTin"
})
public class OperationExSSNSearchType
    extends ExclusionValueObjectType
{

    @XmlElementRef(name = "exactName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exactName;
    protected String ssnOrTin;

    /**
     * Gets the value of the exactName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExactName() {
        return exactName;
    }

    /**
     * Sets the value of the exactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExactName(JAXBElement<String> value) {
        this.exactName = value;
    }

    /**
     * Gets the value of the ssnOrTin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsnOrTin() {
        return ssnOrTin;
    }

    /**
     * Sets the value of the ssnOrTin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsnOrTin(String value) {
        this.ssnOrTin = value;
    }

}


package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for warningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="warningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elementName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="warningCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="warningMessage" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "warningType", propOrder = {
    "elementName",
    "warningCode",
    "warningMessage"
})
public class WarningType {

    @XmlElement(namespace = "http://www.sam.gov", nillable = true)
    protected List<String> elementName;
    @XmlElementRef(name = "warningCode", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warningCode;
    @XmlElement(namespace = "http://www.sam.gov", required = true)
    protected String warningMessage;

    /**
     * Gets the value of the elementName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getElementName() {
        if (elementName == null) {
            elementName = new ArrayList<String>();
        }
        return this.elementName;
    }

    /**
     * Gets the value of the warningCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarningCode() {
        return warningCode;
    }

    /**
     * Sets the value of the warningCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarningCode(JAXBElement<String> value) {
        this.warningCode = value;
    }

    /**
     * Gets the value of the warningMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningMessage() {
        return warningMessage;
    }

    /**
     * Sets the value of the warningMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningMessage(String value) {
        this.warningMessage = value;
    }

}

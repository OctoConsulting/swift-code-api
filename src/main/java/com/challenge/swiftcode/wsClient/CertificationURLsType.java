
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for certificationURLsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="certificationURLsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PDFURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HtmlURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certificationURLsType", propOrder = {
    "pdfurl",
    "htmlURL"
})
public class CertificationURLsType {

    @XmlElementRef(name = "PDFURL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pdfurl;
    @XmlElementRef(name = "HtmlURL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> htmlURL;

    /**
     * Gets the value of the pdfurl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPDFURL() {
        return pdfurl;
    }

    /**
     * Sets the value of the pdfurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPDFURL(JAXBElement<String> value) {
        this.pdfurl = value;
    }

    /**
     * Gets the value of the htmlURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHtmlURL() {
        return htmlURL;
    }

    /**
     * Sets the value of the htmlURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHtmlURL(JAXBElement<String> value) {
        this.htmlURL = value;
    }

}

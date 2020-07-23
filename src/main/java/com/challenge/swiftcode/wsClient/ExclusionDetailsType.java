
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exclusionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exclusionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exclusionProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="classificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="exclusionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="indefiniteIndicatorFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="additionalComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="exclusionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exclusionDetailsType", propOrder = {
    "exclusionProgram",
    "classificationType",
    "exclusionType",
    "activeDate",
    "terminationDate",
    "indefiniteIndicatorFlag",
    "additionalComments",
    "exclusionStatus"
})
public class ExclusionDetailsType {

    @XmlElementRef(name = "exclusionProgram", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exclusionProgram;
    @XmlElementRef(name = "classificationType", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> classificationType;
    @XmlElementRef(name = "exclusionType", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exclusionType;
    @XmlElementRef(name = "activeDate", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeDate;
    @XmlElementRef(name = "terminationDate", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> terminationDate;
    @XmlElementRef(name = "indefiniteIndicatorFlag", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indefiniteIndicatorFlag;
    @XmlElementRef(name = "additionalComments", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalComments;
    @XmlElementRef(name = "exclusionStatus", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exclusionStatus;

    /**
     * Gets the value of the exclusionProgram property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExclusionProgram() {
        return exclusionProgram;
    }

    /**
     * Sets the value of the exclusionProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExclusionProgram(JAXBElement<String> value) {
        this.exclusionProgram = value;
    }

    /**
     * Gets the value of the classificationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassificationType() {
        return classificationType;
    }

    /**
     * Sets the value of the classificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassificationType(JAXBElement<String> value) {
        this.classificationType = value;
    }

    /**
     * Gets the value of the exclusionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExclusionType() {
        return exclusionType;
    }

    /**
     * Sets the value of the exclusionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExclusionType(JAXBElement<String> value) {
        this.exclusionType = value;
    }

    /**
     * Gets the value of the activeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveDate() {
        return activeDate;
    }

    /**
     * Sets the value of the activeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveDate(JAXBElement<String> value) {
        this.activeDate = value;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTerminationDate(JAXBElement<String> value) {
        this.terminationDate = value;
    }

    /**
     * Gets the value of the indefiniteIndicatorFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndefiniteIndicatorFlag() {
        return indefiniteIndicatorFlag;
    }

    /**
     * Sets the value of the indefiniteIndicatorFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndefiniteIndicatorFlag(JAXBElement<String> value) {
        this.indefiniteIndicatorFlag = value;
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

    /**
     * Gets the value of the exclusionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExclusionStatus() {
        return exclusionStatus;
    }

    /**
     * Sets the value of the exclusionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExclusionStatus(JAXBElement<String> value) {
        this.exclusionStatus = value;
    }

}


package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExclusionActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExclusionActionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}ExclusionValueObjectType">
 *       &lt;sequence>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="termDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="termType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionActionType", propOrder = {
    "createDate",
    "updateDate",
    "activeDate",
    "actionStatus",
    "agencyComponent",
    "termDate",
    "termType"
})
public class ExclusionActionType
    extends ExclusionValueObjectType
{

    @XmlElementRef(name = "createDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createDate;
    @XmlElementRef(name = "updateDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> updateDate;
    @XmlElementRef(name = "activeDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> activeDate;
    @XmlElementRef(name = "actionStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actionStatus;
    @XmlElementRef(name = "agencyComponent", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agencyComponent;
    @XmlElementRef(name = "termDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> termDate;
    @XmlElementRef(name = "termType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> termType;

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the activeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActiveDate() {
        return activeDate;
    }

    /**
     * Sets the value of the activeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActiveDate(JAXBElement<XMLGregorianCalendar> value) {
        this.activeDate = value;
    }

    /**
     * Gets the value of the actionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActionStatus() {
        return actionStatus;
    }

    /**
     * Sets the value of the actionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActionStatus(JAXBElement<String> value) {
        this.actionStatus = value;
    }

    /**
     * Gets the value of the agencyComponent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgencyComponent() {
        return agencyComponent;
    }

    /**
     * Sets the value of the agencyComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgencyComponent(JAXBElement<String> value) {
        this.agencyComponent = value;
    }

    /**
     * Gets the value of the termDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTermDate() {
        return termDate;
    }

    /**
     * Sets the value of the termDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTermDate(JAXBElement<XMLGregorianCalendar> value) {
        this.termDate = value;
    }

    /**
     * Gets the value of the termType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTermType() {
        return termType;
    }

    /**
     * Sets the value of the termType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTermType(JAXBElement<String> value) {
        this.termType = value;
    }

}


package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionDateRange" type="{http://www.sam.gov}DateRangeType" minOccurs="0" form="qualified"/>
 *         &lt;element name="terminationDateRange" type="{http://www.sam.gov}DateRangeType" minOccurs="0" form="qualified"/>
 *         &lt;element name="createDateRange" type="{http://www.sam.gov}DateRangeType" minOccurs="0" form="qualified"/>
 *         &lt;element name="updateDateRange" type="{http://www.sam.gov}DateRangeType" minOccurs="0" form="qualified"/>
 *         &lt;element name="deleteDateRange" type="{http://www.sam.gov}DateRangeType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateFilterType", propOrder = {
    "actionDateRange",
    "terminationDateRange",
    "createDateRange",
    "updateDateRange",
    "deleteDateRange"
})
public class DateFilterType {

    @XmlElementRef(name = "actionDateRange", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<DateRangeType> actionDateRange;
    @XmlElementRef(name = "terminationDateRange", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<DateRangeType> terminationDateRange;
    @XmlElementRef(name = "createDateRange", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<DateRangeType> createDateRange;
    @XmlElementRef(name = "updateDateRange", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<DateRangeType> updateDateRange;
    @XmlElementRef(name = "deleteDateRange", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<DateRangeType> deleteDateRange;

    /**
     * Gets the value of the actionDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}
     *     
     */
    public JAXBElement<DateRangeType> getActionDateRange() {
        return actionDateRange;
    }

    /**
     * Sets the value of the actionDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}
     *     
     */
    public void setActionDateRange(JAXBElement<DateRangeType> value) {
        this.actionDateRange = value;
    }

    /**
     * Gets the value of the terminationDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}
     *     
     */
    public JAXBElement<DateRangeType> getTerminationDateRange() {
        return terminationDateRange;
    }

    /**
     * Sets the value of the terminationDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}
     *     
     */
    public void setTerminationDateRange(JAXBElement<DateRangeType> value) {
        this.terminationDateRange = value;
    }

    /**
     * Gets the value of the createDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}
     *     
     */
    public JAXBElement<DateRangeType> getCreateDateRange() {
        return createDateRange;
    }

    /**
     * Sets the value of the createDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}
     *     
     */
    public void setCreateDateRange(JAXBElement<DateRangeType> value) {
        this.createDateRange = value;
    }

    /**
     * Gets the value of the updateDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}
     *     
     */
    public JAXBElement<DateRangeType> getUpdateDateRange() {
        return updateDateRange;
    }

    /**
     * Sets the value of the updateDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}
     *     
     */
    public void setUpdateDateRange(JAXBElement<DateRangeType> value) {
        this.updateDateRange = value;
    }

    /**
     * Gets the value of the deleteDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}
     *     
     */
    public JAXBElement<DateRangeType> getDeleteDateRange() {
        return deleteDateRange;
    }

    /**
     * Sets the value of the deleteDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}
     *     
     */
    public void setDeleteDateRange(JAXBElement<DateRangeType> value) {
        this.deleteDateRange = value;
    }

}

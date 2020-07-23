
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exclusionSearchCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exclusionSearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityFilter" type="{http://www.sam.gov}EntityFilterType" minOccurs="0" form="qualified"/>
 *         &lt;element name="exclusionFilter" type="{http://www.sam.gov}ExclusionFilter" minOccurs="0" form="qualified"/>
 *         &lt;element name="dateFilter" type="{http://www.sam.gov}DateFilterType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exclusionSearchCriteriaType", propOrder = {
    "entityFilter",
    "exclusionFilter",
    "dateFilter"
})
public class ExclusionSearchCriteriaType {

    @XmlElementRef(name = "entityFilter", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityFilterType> entityFilter;
    @XmlElementRef(name = "exclusionFilter", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionFilter> exclusionFilter;
    @XmlElementRef(name = "dateFilter", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<DateFilterType> dateFilter;

    /**
     * Gets the value of the entityFilter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityFilterType }{@code >}
     *     
     */
    public JAXBElement<EntityFilterType> getEntityFilter() {
        return entityFilter;
    }

    /**
     * Sets the value of the entityFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityFilterType }{@code >}
     *     
     */
    public void setEntityFilter(JAXBElement<EntityFilterType> value) {
        this.entityFilter = value;
    }

    /**
     * Gets the value of the exclusionFilter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclusionFilter }{@code >}
     *     
     */
    public JAXBElement<ExclusionFilter> getExclusionFilter() {
        return exclusionFilter;
    }

    /**
     * Sets the value of the exclusionFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclusionFilter }{@code >}
     *     
     */
    public void setExclusionFilter(JAXBElement<ExclusionFilter> value) {
        this.exclusionFilter = value;
    }

    /**
     * Gets the value of the dateFilter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateFilterType }{@code >}
     *     
     */
    public JAXBElement<DateFilterType> getDateFilter() {
        return dateFilter;
    }

    /**
     * Sets the value of the dateFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateFilterType }{@code >}
     *     
     */
    public void setDateFilter(JAXBElement<DateFilterType> value) {
        this.dateFilter = value;
    }

}

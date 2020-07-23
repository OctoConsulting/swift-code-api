
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoryCountDataPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoryCountDataPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="activeCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inactiveCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryCountDataPointType", propOrder = {
    "date",
    "activeCount",
    "inactiveCount"
})
public class HistoryCountDataPointType {

    @XmlElement(required = true, nillable = true)
    protected String date;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer activeCount;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer inactiveCount;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the activeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActiveCount() {
        return activeCount;
    }

    /**
     * Sets the value of the activeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActiveCount(Integer value) {
        this.activeCount = value;
    }

    /**
     * Gets the value of the inactiveCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInactiveCount() {
        return inactiveCount;
    }

    /**
     * Sets the value of the inactiveCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInactiveCount(Integer value) {
        this.inactiveCount = value;
    }

}

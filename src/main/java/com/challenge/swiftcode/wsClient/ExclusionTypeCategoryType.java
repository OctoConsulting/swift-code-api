
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExclusionTypeCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExclusionTypeCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prohibitionCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ineligibleCompletedCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ineligiblePendingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="voluntaryCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inactiveProhibitionCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inactiveIneligibleCompletedCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inactiveIneligiblePendingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inactiveVoluntaryCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionTypeCategoryType", propOrder = {
    "prohibitionCount",
    "ineligibleCompletedCount",
    "ineligiblePendingCount",
    "voluntaryCount",
    "inactiveProhibitionCount",
    "inactiveIneligibleCompletedCount",
    "inactiveIneligiblePendingCount",
    "inactiveVoluntaryCount"
})
public class ExclusionTypeCategoryType {

    protected Integer prohibitionCount;
    protected Integer ineligibleCompletedCount;
    protected Integer ineligiblePendingCount;
    protected Integer voluntaryCount;
    protected Integer inactiveProhibitionCount;
    protected Integer inactiveIneligibleCompletedCount;
    protected Integer inactiveIneligiblePendingCount;
    protected Integer inactiveVoluntaryCount;

    /**
     * Gets the value of the prohibitionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProhibitionCount() {
        return prohibitionCount;
    }

    /**
     * Sets the value of the prohibitionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProhibitionCount(Integer value) {
        this.prohibitionCount = value;
    }

    /**
     * Gets the value of the ineligibleCompletedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIneligibleCompletedCount() {
        return ineligibleCompletedCount;
    }

    /**
     * Sets the value of the ineligibleCompletedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIneligibleCompletedCount(Integer value) {
        this.ineligibleCompletedCount = value;
    }

    /**
     * Gets the value of the ineligiblePendingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIneligiblePendingCount() {
        return ineligiblePendingCount;
    }

    /**
     * Sets the value of the ineligiblePendingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIneligiblePendingCount(Integer value) {
        this.ineligiblePendingCount = value;
    }

    /**
     * Gets the value of the voluntaryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVoluntaryCount() {
        return voluntaryCount;
    }

    /**
     * Sets the value of the voluntaryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVoluntaryCount(Integer value) {
        this.voluntaryCount = value;
    }

    /**
     * Gets the value of the inactiveProhibitionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInactiveProhibitionCount() {
        return inactiveProhibitionCount;
    }

    /**
     * Sets the value of the inactiveProhibitionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInactiveProhibitionCount(Integer value) {
        this.inactiveProhibitionCount = value;
    }

    /**
     * Gets the value of the inactiveIneligibleCompletedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInactiveIneligibleCompletedCount() {
        return inactiveIneligibleCompletedCount;
    }

    /**
     * Sets the value of the inactiveIneligibleCompletedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInactiveIneligibleCompletedCount(Integer value) {
        this.inactiveIneligibleCompletedCount = value;
    }

    /**
     * Gets the value of the inactiveIneligiblePendingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInactiveIneligiblePendingCount() {
        return inactiveIneligiblePendingCount;
    }

    /**
     * Sets the value of the inactiveIneligiblePendingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInactiveIneligiblePendingCount(Integer value) {
        this.inactiveIneligiblePendingCount = value;
    }

    /**
     * Gets the value of the inactiveVoluntaryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInactiveVoluntaryCount() {
        return inactiveVoluntaryCount;
    }

    /**
     * Sets the value of the inactiveVoluntaryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInactiveVoluntaryCount(Integer value) {
        this.inactiveVoluntaryCount = value;
    }

}


package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExclusionClassificationCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExclusionClassificationCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="individualCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="firmCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="vesselCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entityCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inactiveIndividualCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inactiveFirmCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inactiveVesselCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inactiveEentitiyCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionClassificationCategoryType", propOrder = {
    "individualCount",
    "firmCount",
    "vesselCount",
    "entityCount",
    "inactiveIndividualCount",
    "inactiveFirmCount",
    "inactiveVesselCount",
    "inactiveEentitiyCount"
})
public class ExclusionClassificationCategoryType {

    protected Integer individualCount;
    protected Integer firmCount;
    protected Integer vesselCount;
    protected Integer entityCount;
    protected Integer inactiveIndividualCount;
    protected Integer inactiveFirmCount;
    protected Integer inactiveVesselCount;
    protected Integer inactiveEentitiyCount;

    /**
     * Gets the value of the individualCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndividualCount() {
        return individualCount;
    }

    /**
     * Sets the value of the individualCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndividualCount(Integer value) {
        this.individualCount = value;
    }

    /**
     * Gets the value of the firmCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirmCount() {
        return firmCount;
    }

    /**
     * Sets the value of the firmCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirmCount(Integer value) {
        this.firmCount = value;
    }

    /**
     * Gets the value of the vesselCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVesselCount() {
        return vesselCount;
    }

    /**
     * Sets the value of the vesselCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVesselCount(Integer value) {
        this.vesselCount = value;
    }

    /**
     * Gets the value of the entityCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntityCount() {
        return entityCount;
    }

    /**
     * Sets the value of the entityCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntityCount(Integer value) {
        this.entityCount = value;
    }

    /**
     * Gets the value of the inactiveIndividualCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInactiveIndividualCount() {
        return inactiveIndividualCount;
    }

    /**
     * Sets the value of the inactiveIndividualCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInactiveIndividualCount(Integer value) {
        this.inactiveIndividualCount = value;
    }

    /**
     * Gets the value of the inactiveFirmCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInactiveFirmCount() {
        return inactiveFirmCount;
    }

    /**
     * Sets the value of the inactiveFirmCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInactiveFirmCount(Integer value) {
        this.inactiveFirmCount = value;
    }

    /**
     * Gets the value of the inactiveVesselCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInactiveVesselCount() {
        return inactiveVesselCount;
    }

    /**
     * Sets the value of the inactiveVesselCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInactiveVesselCount(Integer value) {
        this.inactiveVesselCount = value;
    }

    /**
     * Gets the value of the inactiveEentitiyCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInactiveEentitiyCount() {
        return inactiveEentitiyCount;
    }

    /**
     * Sets the value of the inactiveEentitiyCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInactiveEentitiyCount(Integer value) {
        this.inactiveEentitiyCount = value;
    }

}

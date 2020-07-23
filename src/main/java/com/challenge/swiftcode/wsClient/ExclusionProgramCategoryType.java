
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExclusionProgramCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExclusionProgramCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReciprocalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NonProcurementCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProcurementCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inactiveReciprocalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inactiveNonProcurementCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inactiveProcurementCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionProgramCategoryType", propOrder = {
    "reciprocalCount",
    "nonProcurementCount",
    "procurementCount",
    "inactiveReciprocalCount",
    "inactiveNonProcurementCount",
    "inactiveProcurementCount"
})
public class ExclusionProgramCategoryType {

    @XmlElement(name = "ReciprocalCount")
    protected Integer reciprocalCount;
    @XmlElement(name = "NonProcurementCount")
    protected Integer nonProcurementCount;
    @XmlElement(name = "ProcurementCount")
    protected Integer procurementCount;
    protected Integer inactiveReciprocalCount;
    protected Integer inactiveNonProcurementCount;
    protected Integer inactiveProcurementCount;

    /**
     * Gets the value of the reciprocalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReciprocalCount() {
        return reciprocalCount;
    }

    /**
     * Sets the value of the reciprocalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReciprocalCount(Integer value) {
        this.reciprocalCount = value;
    }

    /**
     * Gets the value of the nonProcurementCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNonProcurementCount() {
        return nonProcurementCount;
    }

    /**
     * Sets the value of the nonProcurementCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNonProcurementCount(Integer value) {
        this.nonProcurementCount = value;
    }

    /**
     * Gets the value of the procurementCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcurementCount() {
        return procurementCount;
    }

    /**
     * Sets the value of the procurementCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcurementCount(Integer value) {
        this.procurementCount = value;
    }

    /**
     * Gets the value of the inactiveReciprocalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInactiveReciprocalCount() {
        return inactiveReciprocalCount;
    }

    /**
     * Sets the value of the inactiveReciprocalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInactiveReciprocalCount(Integer value) {
        this.inactiveReciprocalCount = value;
    }

    /**
     * Gets the value of the inactiveNonProcurementCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInactiveNonProcurementCount() {
        return inactiveNonProcurementCount;
    }

    /**
     * Sets the value of the inactiveNonProcurementCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInactiveNonProcurementCount(Integer value) {
        this.inactiveNonProcurementCount = value;
    }

    /**
     * Gets the value of the inactiveProcurementCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInactiveProcurementCount() {
        return inactiveProcurementCount;
    }

    /**
     * Sets the value of the inactiveProcurementCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInactiveProcurementCount(Integer value) {
        this.inactiveProcurementCount = value;
    }

}

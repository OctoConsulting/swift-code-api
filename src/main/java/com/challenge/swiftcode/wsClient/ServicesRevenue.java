
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServicesRevenue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicesRevenue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}businessObjectType">
 *       &lt;sequence>
 *         &lt;element name="federalRevenueCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="federalRevenueDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nonFedRevenueCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nonFedRevenueDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalRevenueCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalRevenueDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicesRevenue", propOrder = {
    "federalRevenueCode",
    "federalRevenueDescription",
    "nonFedRevenueCode",
    "nonFedRevenueDescription",
    "totalRevenueCode",
    "totalRevenueDescription"
})
public class ServicesRevenue
    extends BusinessObjectType
{

    @XmlElement(required = true)
    protected String federalRevenueCode;
    @XmlElement(required = true)
    protected String federalRevenueDescription;
    @XmlElement(required = true)
    protected String nonFedRevenueCode;
    @XmlElement(required = true)
    protected String nonFedRevenueDescription;
    @XmlElement(required = true)
    protected String totalRevenueCode;
    @XmlElement(required = true)
    protected String totalRevenueDescription;

    /**
     * Gets the value of the federalRevenueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalRevenueCode() {
        return federalRevenueCode;
    }

    /**
     * Sets the value of the federalRevenueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalRevenueCode(String value) {
        this.federalRevenueCode = value;
    }

    /**
     * Gets the value of the federalRevenueDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalRevenueDescription() {
        return federalRevenueDescription;
    }

    /**
     * Sets the value of the federalRevenueDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalRevenueDescription(String value) {
        this.federalRevenueDescription = value;
    }

    /**
     * Gets the value of the nonFedRevenueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonFedRevenueCode() {
        return nonFedRevenueCode;
    }

    /**
     * Sets the value of the nonFedRevenueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonFedRevenueCode(String value) {
        this.nonFedRevenueCode = value;
    }

    /**
     * Gets the value of the nonFedRevenueDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonFedRevenueDescription() {
        return nonFedRevenueDescription;
    }

    /**
     * Sets the value of the nonFedRevenueDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonFedRevenueDescription(String value) {
        this.nonFedRevenueDescription = value;
    }

    /**
     * Gets the value of the totalRevenueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRevenueCode() {
        return totalRevenueCode;
    }

    /**
     * Sets the value of the totalRevenueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRevenueCode(String value) {
        this.totalRevenueCode = value;
    }

    /**
     * Gets the value of the totalRevenueDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRevenueDescription() {
        return totalRevenueDescription;
    }

    /**
     * Sets the value of the totalRevenueDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRevenueDescription(String value) {
        this.totalRevenueDescription = value;
    }

}

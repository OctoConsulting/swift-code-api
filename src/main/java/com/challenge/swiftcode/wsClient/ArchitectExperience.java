
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArchitectExperience complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchitectExperience">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}businessObjectType">
 *       &lt;sequence>
 *         &lt;element name="experienceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="experienceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="annualAvgRevenueCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="annualAvgRevenueDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchitectExperience", propOrder = {
    "experienceCode",
    "experienceDescription",
    "annualAvgRevenueCode",
    "annualAvgRevenueDescription"
})
public class ArchitectExperience
    extends BusinessObjectType
{

    @XmlElement(required = true)
    protected String experienceCode;
    @XmlElement(required = true)
    protected String experienceDescription;
    @XmlElement(required = true)
    protected String annualAvgRevenueCode;
    @XmlElement(required = true)
    protected String annualAvgRevenueDescription;

    /**
     * Gets the value of the experienceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperienceCode() {
        return experienceCode;
    }

    /**
     * Sets the value of the experienceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperienceCode(String value) {
        this.experienceCode = value;
    }

    /**
     * Gets the value of the experienceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperienceDescription() {
        return experienceDescription;
    }

    /**
     * Sets the value of the experienceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperienceDescription(String value) {
        this.experienceDescription = value;
    }

    /**
     * Gets the value of the annualAvgRevenueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnualAvgRevenueCode() {
        return annualAvgRevenueCode;
    }

    /**
     * Sets the value of the annualAvgRevenueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnualAvgRevenueCode(String value) {
        this.annualAvgRevenueCode = value;
    }

    /**
     * Gets the value of the annualAvgRevenueDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnualAvgRevenueDescription() {
        return annualAvgRevenueDescription;
    }

    /**
     * Sets the value of the annualAvgRevenueDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnualAvgRevenueDescription(String value) {
        this.annualAvgRevenueDescription = value;
    }

}

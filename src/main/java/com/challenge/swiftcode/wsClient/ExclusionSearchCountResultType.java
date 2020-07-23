
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExclusionSearchCountResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExclusionSearchCountResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classifications" type="{http://www.sam.gov}ExclusionClassificationCategoryType" minOccurs="0"/>
 *         &lt;element name="exclusionTypes" type="{http://www.sam.gov}ExclusionTypeCategoryType" minOccurs="0"/>
 *         &lt;element name="exclusionPrograms" type="{http://www.sam.gov}ExclusionProgramCategoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionSearchCountResultType", propOrder = {
    "classifications",
    "exclusionTypes",
    "exclusionPrograms"
})
public class ExclusionSearchCountResultType {

    protected ExclusionClassificationCategoryType classifications;
    protected ExclusionTypeCategoryType exclusionTypes;
    protected ExclusionProgramCategoryType exclusionPrograms;

    /**
     * Gets the value of the classifications property.
     * 
     * @return
     *     possible object is
     *     {@link ExclusionClassificationCategoryType }
     *     
     */
    public ExclusionClassificationCategoryType getClassifications() {
        return classifications;
    }

    /**
     * Sets the value of the classifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclusionClassificationCategoryType }
     *     
     */
    public void setClassifications(ExclusionClassificationCategoryType value) {
        this.classifications = value;
    }

    /**
     * Gets the value of the exclusionTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ExclusionTypeCategoryType }
     *     
     */
    public ExclusionTypeCategoryType getExclusionTypes() {
        return exclusionTypes;
    }

    /**
     * Sets the value of the exclusionTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclusionTypeCategoryType }
     *     
     */
    public void setExclusionTypes(ExclusionTypeCategoryType value) {
        this.exclusionTypes = value;
    }

    /**
     * Gets the value of the exclusionPrograms property.
     * 
     * @return
     *     possible object is
     *     {@link ExclusionProgramCategoryType }
     *     
     */
    public ExclusionProgramCategoryType getExclusionPrograms() {
        return exclusionPrograms;
    }

    /**
     * Sets the value of the exclusionPrograms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclusionProgramCategoryType }
     *     
     */
    public void setExclusionPrograms(ExclusionProgramCategoryType value) {
        this.exclusionPrograms = value;
    }

}

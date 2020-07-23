
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for crossReferenceExclusionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="crossReferenceExclusionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exclusion" type="{http://www.sam.gov}exclusionType" form="qualified"/>
 *         &lt;element name="aliasAttachCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="crossReferenceComments" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crossReferenceExclusionType", propOrder = {
    "exclusion",
    "aliasAttachCode",
    "crossReferenceComments"
})
public class CrossReferenceExclusionType {

    @XmlElement(namespace = "http://www.sam.gov", required = true, nillable = true)
    protected ExclusionType exclusion;
    @XmlElement(namespace = "http://www.sam.gov", required = true, nillable = true)
    protected String aliasAttachCode;
    @XmlElement(namespace = "http://www.sam.gov", required = true, nillable = true)
    protected String crossReferenceComments;

    /**
     * Gets the value of the exclusion property.
     * 
     * @return
     *     possible object is
     *     {@link ExclusionType }
     *     
     */
    public ExclusionType getExclusion() {
        return exclusion;
    }

    /**
     * Sets the value of the exclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclusionType }
     *     
     */
    public void setExclusion(ExclusionType value) {
        this.exclusion = value;
    }

    /**
     * Gets the value of the aliasAttachCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasAttachCode() {
        return aliasAttachCode;
    }

    /**
     * Sets the value of the aliasAttachCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasAttachCode(String value) {
        this.aliasAttachCode = value;
    }

    /**
     * Gets the value of the crossReferenceComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossReferenceComments() {
        return crossReferenceComments;
    }

    /**
     * Sets the value of the crossReferenceComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossReferenceComments(String value) {
        this.crossReferenceComments = value;
    }

}

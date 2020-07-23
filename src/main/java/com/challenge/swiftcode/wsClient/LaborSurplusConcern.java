
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LaborSurplusConcern complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaborSurplusConcern">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}businessObjectType">
 *       &lt;sequence>
 *         &lt;element name="surplusArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="civilJurisdiction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaborSurplusConcern", propOrder = {
    "surplusArea",
    "civilJurisdiction",
    "state"
})
public class LaborSurplusConcern
    extends BusinessObjectType
{

    @XmlElement(required = true)
    protected String surplusArea;
    @XmlElement(required = true)
    protected String civilJurisdiction;
    @XmlElement(required = true)
    protected String state;

    /**
     * Gets the value of the surplusArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurplusArea() {
        return surplusArea;
    }

    /**
     * Sets the value of the surplusArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurplusArea(String value) {
        this.surplusArea = value;
    }

    /**
     * Gets the value of the civilJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilJurisdiction() {
        return civilJurisdiction;
    }

    /**
     * Sets the value of the civilJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilJurisdiction(String value) {
        this.civilJurisdiction = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}

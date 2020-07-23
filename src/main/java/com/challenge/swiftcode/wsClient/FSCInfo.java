
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FSCInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FSCInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}businessObjectType">
 *       &lt;sequence>
 *         &lt;element name="placeOfManufacture" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fscCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FSCInfo", propOrder = {
    "placeOfManufacture",
    "fscCode"
})
public class FSCInfo
    extends BusinessObjectType
{

    @XmlElement(required = true)
    protected String placeOfManufacture;
    @XmlElement(required = true)
    protected String fscCode;

    /**
     * Gets the value of the placeOfManufacture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfManufacture() {
        return placeOfManufacture;
    }

    /**
     * Sets the value of the placeOfManufacture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfManufacture(String value) {
        this.placeOfManufacture = value;
    }

    /**
     * Gets the value of the fscCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFscCode() {
        return fscCode;
    }

    /**
     * Sets the value of the fscCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFscCode(String value) {
        this.fscCode = value;
    }

}

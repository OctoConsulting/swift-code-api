
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Owner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Owner">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}businessObjectType">
 *       &lt;sequence>
 *         &lt;element name="legalBusinessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CAGECode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Owner", propOrder = {
    "legalBusinessName",
    "cageCode"
})
public class Owner
    extends BusinessObjectType
{

    @XmlElement(required = true)
    protected String legalBusinessName;
    @XmlElement(name = "CAGECode", required = true)
    protected String cageCode;

    /**
     * Gets the value of the legalBusinessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalBusinessName() {
        return legalBusinessName;
    }

    /**
     * Sets the value of the legalBusinessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalBusinessName(String value) {
        this.legalBusinessName = value;
    }

    /**
     * Gets the value of the cageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAGECode() {
        return cageCode;
    }

    /**
     * Sets the value of the cageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAGECode(String value) {
        this.cageCode = value;
    }

}

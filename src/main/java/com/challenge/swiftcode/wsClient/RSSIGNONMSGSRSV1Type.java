
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RS_SIGNONMSGSRSV1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RS_SIGNONMSGSRSV1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sam.gov}SONRS"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RS_SIGNONMSGSRSV1Type", propOrder = {
    "sonrs"
})
public class RSSIGNONMSGSRSV1Type {

    @XmlElement(name = "SONRS", namespace = "http://www.sam.gov", required = true)
    protected SONRS sonrs;

    /**
     * Gets the value of the sonrs property.
     * 
     * @return
     *     possible object is
     *     {@link SONRS }
     *     
     */
    public SONRS getSONRS() {
        return sonrs;
    }

    /**
     * Sets the value of the sonrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SONRS }
     *     
     */
    public void setSONRS(SONRS value) {
        this.sonrs = value;
    }

}

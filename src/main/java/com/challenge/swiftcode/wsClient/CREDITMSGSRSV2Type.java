
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CREDITMSGSRSV2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDITMSGSRSV2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FAMTREETRNRS" type="{http://www.sam.gov}FAMTREETRNRSType" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CREDITMSGSRSV2Type", propOrder = {
    "famtreetrnrs"
})
public class CREDITMSGSRSV2Type {

    @XmlElement(name = "FAMTREETRNRS", namespace = "http://www.sam.gov", required = true)
    protected FAMTREETRNRSType famtreetrnrs;

    /**
     * Gets the value of the famtreetrnrs property.
     * 
     * @return
     *     possible object is
     *     {@link FAMTREETRNRSType }
     *     
     */
    public FAMTREETRNRSType getFAMTREETRNRS() {
        return famtreetrnrs;
    }

    /**
     * Sets the value of the famtreetrnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAMTREETRNRSType }
     *     
     */
    public void setFAMTREETRNRS(FAMTREETRNRSType value) {
        this.famtreetrnrs = value;
    }

}

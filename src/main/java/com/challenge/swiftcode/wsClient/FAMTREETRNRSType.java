
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FAMTREETRNRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FAMTREETRNRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="TRNUID" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="STATUS" type="{http://www.sam.gov}RS_STATUSType" form="qualified"/>
 *         &lt;element name="FAMTREERS" type="{http://www.sam.gov}FAMTREERSType" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAMTREETRNRSType", propOrder = {

})
public class FAMTREETRNRSType {

    @XmlElement(name = "TRNUID", namespace = "http://www.sam.gov", required = true)
    protected String trnuid;
    @XmlElement(name = "STATUS", namespace = "http://www.sam.gov", required = true)
    protected RSSTATUSType status;
    @XmlElement(name = "FAMTREERS", namespace = "http://www.sam.gov")
    protected FAMTREERSType famtreers;

    /**
     * Gets the value of the trnuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRNUID() {
        return trnuid;
    }

    /**
     * Sets the value of the trnuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRNUID(String value) {
        this.trnuid = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RSSTATUSType }
     *     
     */
    public RSSTATUSType getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSSTATUSType }
     *     
     */
    public void setSTATUS(RSSTATUSType value) {
        this.status = value;
    }

    /**
     * Gets the value of the famtreers property.
     * 
     * @return
     *     possible object is
     *     {@link FAMTREERSType }
     *     
     */
    public FAMTREERSType getFAMTREERS() {
        return famtreers;
    }

    /**
     * Sets the value of the famtreers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAMTREERSType }
     *     
     */
    public void setFAMTREERS(FAMTREERSType value) {
        this.famtreers = value;
    }

}


package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIGNONMSGSRSV1" type="{http://www.sam.gov}RS_SIGNONMSGSRSV1Type" form="qualified"/>
 *         &lt;element name="CREDITMSGSRSV2" type="{http://www.sam.gov}CREDITMSGSRSV2Type" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "signonmsgsrsv1",
    "creditmsgsrsv2"
})
@XmlRootElement(name = "DGX")
public class DGX {

    @XmlElement(name = "SIGNONMSGSRSV1", namespace = "http://www.sam.gov", required = true)
    protected RSSIGNONMSGSRSV1Type signonmsgsrsv1;
    @XmlElement(name = "CREDITMSGSRSV2", namespace = "http://www.sam.gov")
    protected CREDITMSGSRSV2Type creditmsgsrsv2;

    /**
     * Gets the value of the signonmsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link RSSIGNONMSGSRSV1Type }
     *     
     */
    public RSSIGNONMSGSRSV1Type getSIGNONMSGSRSV1() {
        return signonmsgsrsv1;
    }

    /**
     * Sets the value of the signonmsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSSIGNONMSGSRSV1Type }
     *     
     */
    public void setSIGNONMSGSRSV1(RSSIGNONMSGSRSV1Type value) {
        this.signonmsgsrsv1 = value;
    }

    /**
     * Gets the value of the creditmsgsrsv2 property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITMSGSRSV2Type }
     *     
     */
    public CREDITMSGSRSV2Type getCREDITMSGSRSV2() {
        return creditmsgsrsv2;
    }

    /**
     * Sets the value of the creditmsgsrsv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITMSGSRSV2Type }
     *     
     */
    public void setCREDITMSGSRSV2(CREDITMSGSRSV2Type value) {
        this.creditmsgsrsv2 = value;
    }

}

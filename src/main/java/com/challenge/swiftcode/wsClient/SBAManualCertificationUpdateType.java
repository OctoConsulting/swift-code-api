
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SBAManualCertificationUpdateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SBAManualCertificationUpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="SBACertification" type="{http://www.sam.gov}SBACertificationType" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="SBAFormallyDeterminedSizes" type="{http://www.sam.gov}SBAFormallyDeterminedSizesType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBAManualCertificationUpdateType", propOrder = {
    "dunsNumber",
    "sbaCertification",
    "sbaFormallyDeterminedSizes"
})
public class SBAManualCertificationUpdateType {

    @XmlElement(name = "DUNSNumber", namespace = "http://www.sam.gov", required = true)
    protected String dunsNumber;
    @XmlElement(name = "SBACertification", namespace = "http://www.sam.gov", nillable = true)
    protected List<SBACertificationType> sbaCertification;
    @XmlElementRef(name = "SBAFormallyDeterminedSizes", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<SBAFormallyDeterminedSizesType> sbaFormallyDeterminedSizes;

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the sbaCertification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbaCertification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSBACertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SBACertificationType }
     * 
     * 
     */
    public List<SBACertificationType> getSBACertification() {
        if (sbaCertification == null) {
            sbaCertification = new ArrayList<SBACertificationType>();
        }
        return this.sbaCertification;
    }

    /**
     * Gets the value of the sbaFormallyDeterminedSizes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SBAFormallyDeterminedSizesType }{@code >}
     *     
     */
    public JAXBElement<SBAFormallyDeterminedSizesType> getSBAFormallyDeterminedSizes() {
        return sbaFormallyDeterminedSizes;
    }

    /**
     * Sets the value of the sbaFormallyDeterminedSizes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SBAFormallyDeterminedSizesType }{@code >}
     *     
     */
    public void setSBAFormallyDeterminedSizes(JAXBElement<SBAFormallyDeterminedSizesType> value) {
        this.sbaFormallyDeterminedSizes = value;
    }

}

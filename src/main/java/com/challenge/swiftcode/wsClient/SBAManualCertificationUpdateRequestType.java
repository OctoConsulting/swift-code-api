
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SBAManualCertificationUpdateRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SBAManualCertificationUpdateRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfSBAManualCertificationUpdate" type="{http://www.sam.gov}listOfSBAManualCertificationUpdateType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBAManualCertificationUpdateRequestType", propOrder = {
    "listOfSBAManualCertificationUpdate"
})
public class SBAManualCertificationUpdateRequestType {

    @XmlElementRef(name = "listOfSBAManualCertificationUpdate", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfSBAManualCertificationUpdateType> listOfSBAManualCertificationUpdate;

    /**
     * Gets the value of the listOfSBAManualCertificationUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfSBAManualCertificationUpdateType }{@code >}
     *     
     */
    public JAXBElement<ListOfSBAManualCertificationUpdateType> getListOfSBAManualCertificationUpdate() {
        return listOfSBAManualCertificationUpdate;
    }

    /**
     * Sets the value of the listOfSBAManualCertificationUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfSBAManualCertificationUpdateType }{@code >}
     *     
     */
    public void setListOfSBAManualCertificationUpdate(JAXBElement<ListOfSBAManualCertificationUpdateType> value) {
        this.listOfSBAManualCertificationUpdate = value;
    }

}

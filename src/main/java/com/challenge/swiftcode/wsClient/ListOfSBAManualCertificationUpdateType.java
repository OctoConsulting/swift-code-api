
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listOfSBAManualCertificationUpdateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfSBAManualCertificationUpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SBAManualCertificationUpdate" type="{http://www.sam.gov}SBAManualCertificationUpdateType" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfSBAManualCertificationUpdateType", propOrder = {
    "sbaManualCertificationUpdate"
})
public class ListOfSBAManualCertificationUpdateType {

    @XmlElement(name = "SBAManualCertificationUpdate", namespace = "http://www.sam.gov", nillable = true)
    protected List<SBAManualCertificationUpdateType> sbaManualCertificationUpdate;

    /**
     * Gets the value of the sbaManualCertificationUpdate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbaManualCertificationUpdate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSBAManualCertificationUpdate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SBAManualCertificationUpdateType }
     * 
     * 
     */
    public List<SBAManualCertificationUpdateType> getSBAManualCertificationUpdate() {
        if (sbaManualCertificationUpdate == null) {
            sbaManualCertificationUpdate = new ArrayList<SBAManualCertificationUpdateType>();
        }
        return this.sbaManualCertificationUpdate;
    }

}

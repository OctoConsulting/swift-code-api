
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listOfProceedingsInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfProceedingsInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proceedingsInformation" type="{http://www.sam.gov}proceedingsInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfProceedingsInformationType", propOrder = {
    "proceedingsInformation"
})
public class ListOfProceedingsInformationType {

    @XmlElement(nillable = true)
    protected List<ProceedingsInformationType> proceedingsInformation;

    /**
     * Gets the value of the proceedingsInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proceedingsInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProceedingsInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProceedingsInformationType }
     * 
     * 
     */
    public List<ProceedingsInformationType> getProceedingsInformation() {
        if (proceedingsInformation == null) {
            proceedingsInformation = new ArrayList<ProceedingsInformationType>();
        }
        return this.proceedingsInformation;
    }

}

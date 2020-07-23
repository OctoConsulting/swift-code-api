
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listOfExecutiveCompensationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfExecutiveCompensationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="executiveCompensationDetail" type="{http://www.sam.gov}executiveDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfExecutiveCompensationDetailsType", propOrder = {
    "executiveCompensationDetail"
})
public class ListOfExecutiveCompensationDetailsType {

    @XmlElement(nillable = true)
    protected List<ExecutiveDetailsType> executiveCompensationDetail;

    /**
     * Gets the value of the executiveCompensationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executiveCompensationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecutiveCompensationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExecutiveDetailsType }
     * 
     * 
     */
    public List<ExecutiveDetailsType> getExecutiveCompensationDetail() {
        if (executiveCompensationDetail == null) {
            executiveCompensationDetail = new ArrayList<ExecutiveDetailsType>();
        }
        return this.executiveCompensationDetail;
    }

}

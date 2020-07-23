
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listOfSizeMetricDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfSizeMetricDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sizeMetricDetails" type="{http://www.sam.gov}sizeMetricDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfSizeMetricDetailsType", propOrder = {
    "sizeMetricDetails"
})
public class ListOfSizeMetricDetailsType {

    @XmlElement(nillable = true)
    protected List<SizeMetricDetailsType> sizeMetricDetails;

    /**
     * Gets the value of the sizeMetricDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sizeMetricDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSizeMetricDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SizeMetricDetailsType }
     * 
     * 
     */
    public List<SizeMetricDetailsType> getSizeMetricDetails() {
        if (sizeMetricDetails == null) {
            sizeMetricDetails = new ArrayList<SizeMetricDetailsType>();
        }
        return this.sizeMetricDetails;
    }

}

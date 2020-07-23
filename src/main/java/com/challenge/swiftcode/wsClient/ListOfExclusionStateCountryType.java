
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listOfExclusionStateCountryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfExclusionStateCountryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stateCountry" type="{http://www.sam.gov}ExclusionStateCountryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfExclusionStateCountryType", propOrder = {
    "stateCountry"
})
public class ListOfExclusionStateCountryType {

    @XmlElement(nillable = true)
    protected List<ExclusionStateCountryType> stateCountry;

    /**
     * Gets the value of the stateCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExclusionStateCountryType }
     * 
     * 
     */
    public List<ExclusionStateCountryType> getStateCountry() {
        if (stateCountry == null) {
            stateCountry = new ArrayList<ExclusionStateCountryType>();
        }
        return this.stateCountry;
    }

}

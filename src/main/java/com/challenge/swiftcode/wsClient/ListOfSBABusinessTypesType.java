
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listOfSBABusinessTypesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfSBABusinessTypesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SBABusinessType" type="{http://www.sam.gov}SBABusinessTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfSBABusinessTypesType", propOrder = {
    "sbaBusinessType"
})
public class ListOfSBABusinessTypesType {

    @XmlElement(name = "SBABusinessType", nillable = true)
    protected List<SBABusinessTypeType> sbaBusinessType;

    /**
     * Gets the value of the sbaBusinessType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbaBusinessType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSBABusinessType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SBABusinessTypeType }
     * 
     * 
     */
    public List<SBABusinessTypeType> getSBABusinessType() {
        if (sbaBusinessType == null) {
            sbaBusinessType = new ArrayList<SBABusinessTypeType>();
        }
        return this.sbaBusinessType;
    }

}

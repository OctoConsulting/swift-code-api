
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listOfCrossReferenceExclusionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfCrossReferenceExclusionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crossReferenceExclusions" type="{http://www.sam.gov}crossReferenceExclusionType" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfCrossReferenceExclusionsType", propOrder = {
    "crossReferenceExclusions"
})
public class ListOfCrossReferenceExclusionsType {

    @XmlElement(namespace = "http://www.sam.gov", nillable = true)
    protected List<CrossReferenceExclusionType> crossReferenceExclusions;

    /**
     * Gets the value of the crossReferenceExclusions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossReferenceExclusions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossReferenceExclusions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrossReferenceExclusionType }
     * 
     * 
     */
    public List<CrossReferenceExclusionType> getCrossReferenceExclusions() {
        if (crossReferenceExclusions == null) {
            crossReferenceExclusions = new ArrayList<CrossReferenceExclusionType>();
        }
        return this.crossReferenceExclusions;
    }

}


package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listOfExclusionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfExclusionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *         &lt;element name="exclusion" type="{http://www.sam.gov}exclusionType" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="added" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfExclusionsType", propOrder = {
    "count",
    "exclusion",
    "added"
})
public class ListOfExclusionsType {

    @XmlElement(namespace = "http://www.sam.gov")
    protected int count;
    @XmlElement(namespace = "http://www.sam.gov", nillable = true)
    protected List<ExclusionType> exclusion;
    @XmlElement(namespace = "http://www.sam.gov", type = Boolean.class)
    protected List<Boolean> added;

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the exclusion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExclusionType }
     * 
     * 
     */
    public List<ExclusionType> getExclusion() {
        if (exclusion == null) {
            exclusion = new ArrayList<ExclusionType>();
        }
        return this.exclusion;
    }

    /**
     * Gets the value of the added property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the added property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdded().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getAdded() {
        if (added == null) {
            added = new ArrayList<Boolean>();
        }
        return this.added;
    }

}

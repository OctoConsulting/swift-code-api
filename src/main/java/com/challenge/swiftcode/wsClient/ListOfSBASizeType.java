
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listOfSBASizeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfSBASizeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SBASize" type="{http://www.sam.gov}SBASizeType" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfSBASizeType", propOrder = {
    "sbaSize"
})
public class ListOfSBASizeType {

    @XmlElement(name = "SBASize", namespace = "http://www.sam.gov", nillable = true)
    protected List<SBASizeType> sbaSize;

    /**
     * Gets the value of the sbaSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbaSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSBASize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SBASizeType }
     * 
     * 
     */
    public List<SBASizeType> getSBASize() {
        if (sbaSize == null) {
            sbaSize = new ArrayList<SBASizeType>();
        }
        return this.sbaSize;
    }

}


package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RS_US_COMMENTARY_GRPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RS_US_COMMENTARY_GRPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="US_COMMENTARY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RS_US_COMMENTARY_GRPType", propOrder = {
    "uscommentary"
})
public class RSUSCOMMENTARYGRPType {

    @XmlElement(name = "US_COMMENTARY", namespace = "http://www.sam.gov")
    protected List<String> uscommentary;

    /**
     * Gets the value of the uscommentary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uscommentary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUSCOMMENTARY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUSCOMMENTARY() {
        if (uscommentary == null) {
            uscommentary = new ArrayList<String>();
        }
        return this.uscommentary;
    }

}

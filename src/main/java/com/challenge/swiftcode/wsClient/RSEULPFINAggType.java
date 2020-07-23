
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RS_EULP_FINAggType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RS_EULP_FINAggType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="EULP_PL" type="{http://www.sam.gov}RS_EULP_PLAggType" form="qualified"/>
 *           &lt;element name="EULP_BS" type="{http://www.sam.gov}RS_EULP_BSAggType" form="qualified"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RS_EULP_FINAggType", propOrder = {
    "eulpplOrEULPBS"
})
public class RSEULPFINAggType {

    @XmlElements({
        @XmlElement(name = "EULP_PL", namespace = "http://www.sam.gov", type = RSEULPPLAggType.class),
        @XmlElement(name = "EULP_BS", namespace = "http://www.sam.gov", type = RSEULPBSAggType.class)
    })
    protected List<Object> eulpplOrEULPBS;

    /**
     * Gets the value of the eulpplOrEULPBS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eulpplOrEULPBS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEULPPLOrEULPBS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RSEULPPLAggType }
     * {@link RSEULPBSAggType }
     * 
     * 
     */
    public List<Object> getEULPPLOrEULPBS() {
        if (eulpplOrEULPBS == null) {
            eulpplOrEULPBS = new ArrayList<Object>();
        }
        return this.eulpplOrEULPBS;
    }

}

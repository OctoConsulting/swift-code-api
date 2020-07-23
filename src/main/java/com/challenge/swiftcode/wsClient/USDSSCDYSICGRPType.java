
package com.challenge.swiftcode.wsClient;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USDS_SCDY_SIC_GRPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USDS_SCDY_SIC_GRPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="USDS_DSPL_SEQ_NBR" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="USDS_SCDY_SIC" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
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
@XmlType(name = "USDS_SCDY_SIC_GRPType", propOrder = {
    "usdsdsplseqnbrOrUSDSSCDYSIC"
})
public class USDSSCDYSICGRPType {

    @XmlElements({
        @XmlElement(name = "USDS_DSPL_SEQ_NBR", namespace = "http://www.sam.gov", type = String.class),
        @XmlElement(name = "USDS_SCDY_SIC", namespace = "http://www.sam.gov", type = BigInteger.class)
    })
    protected List<Serializable> usdsdsplseqnbrOrUSDSSCDYSIC;

    /**
     * Gets the value of the usdsdsplseqnbrOrUSDSSCDYSIC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usdsdsplseqnbrOrUSDSSCDYSIC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUSDSDSPLSEQNBROrUSDSSCDYSIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link BigInteger }
     * 
     * 
     */
    public List<Serializable> getUSDSDSPLSEQNBROrUSDSSCDYSIC() {
        if (usdsdsplseqnbrOrUSDSSCDYSIC == null) {
            usdsdsplseqnbrOrUSDSSCDYSIC = new ArrayList<Serializable>();
        }
        return this.usdsdsplseqnbrOrUSDSSCDYSIC;
    }

}

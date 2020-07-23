
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USDS_PAYD_GRPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USDS_PAYD_GRPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="USDS_PAYD_SCR" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="USDS_PAYD_PRD" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
@XmlType(name = "USDS_PAYD_GRPType", propOrder = {
    "usdspaydscrOrUSDSPAYDPRD"
})
public class USDSPAYDGRPType {

    @XmlElementRefs({
        @XmlElementRef(name = "USDS_PAYD_PRD", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "USDS_PAYD_SCR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> usdspaydscrOrUSDSPAYDPRD;

    /**
     * Gets the value of the usdspaydscrOrUSDSPAYDPRD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usdspaydscrOrUSDSPAYDPRD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUSDSPAYDSCROrUSDSPAYDPRD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getUSDSPAYDSCROrUSDSPAYDPRD() {
        if (usdspaydscrOrUSDSPAYDPRD == null) {
            usdspaydscrOrUSDSPAYDPRD = new ArrayList<JAXBElement<String>>();
        }
        return this.usdspaydscrOrUSDSPAYDPRD;
    }

}


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
 * <p>Java class for RS_EULP_PAYD_HISTAggType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RS_EULP_PAYD_HISTAggType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="EULP_PAYD_HIST_DT" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="EULP_PAYD_HIST_SCR" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
@XmlType(name = "RS_EULP_PAYD_HISTAggType", propOrder = {
    "eulppaydhistdtOrEULPPAYDHISTSCR"
})
public class RSEULPPAYDHISTAggType {

    @XmlElementRefs({
        @XmlElementRef(name = "EULP_PAYD_HIST_DT", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_PAYD_HIST_SCR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> eulppaydhistdtOrEULPPAYDHISTSCR;

    /**
     * Gets the value of the eulppaydhistdtOrEULPPAYDHISTSCR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eulppaydhistdtOrEULPPAYDHISTSCR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEULPPAYDHISTDTOrEULPPAYDHISTSCR().add(newItem);
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
    public List<JAXBElement<String>> getEULPPAYDHISTDTOrEULPPAYDHISTSCR() {
        if (eulppaydhistdtOrEULPPAYDHISTSCR == null) {
            eulppaydhistdtOrEULPPAYDHISTSCR = new ArrayList<JAXBElement<String>>();
        }
        return this.eulppaydhistdtOrEULPPAYDHISTSCR;
    }

}

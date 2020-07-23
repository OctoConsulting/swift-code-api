
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
 * <p>Java class for RS_EULP_FIN_CALCAggType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RS_EULP_FIN_CALCAggType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="EULP_PFT_MRGN" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_NET_WRTH" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_LQD_RATO" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_RTN_CAPL" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_RATO_YR" type="{http://www.w3.org/2001/XMLSchema}short" form="qualified"/>
 *           &lt;element name="EULP_QK_RATO" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_RTN_ASET" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_WRKG_CAPL" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
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
@XmlType(name = "RS_EULP_FIN_CALCAggType", propOrder = {
    "eulppftmrgnOrEULPNETWRTHOrEULPLQDRATO"
})
public class RSEULPFINCALCAggType {

    @XmlElementRefs({
        @XmlElementRef(name = "EULP_QK_RATO", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_LQD_RATO", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_RATO_YR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_PFT_MRGN", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_RTN_ASET", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_RTN_CAPL", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_WRKG_CAPL", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_NET_WRTH", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Comparable>> eulppftmrgnOrEULPNETWRTHOrEULPLQDRATO;

    /**
     * Gets the value of the eulppftmrgnOrEULPNETWRTHOrEULPLQDRATO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eulppftmrgnOrEULPNETWRTHOrEULPLQDRATO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEULPPFTMRGNOrEULPNETWRTHOrEULPLQDRATO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Comparable>> getEULPPFTMRGNOrEULPNETWRTHOrEULPLQDRATO() {
        if (eulppftmrgnOrEULPNETWRTHOrEULPLQDRATO == null) {
            eulppftmrgnOrEULPNETWRTHOrEULPLQDRATO = new ArrayList<JAXBElement<? extends Comparable>>();
        }
        return this.eulppftmrgnOrEULPNETWRTHOrEULPLQDRATO;
    }

}

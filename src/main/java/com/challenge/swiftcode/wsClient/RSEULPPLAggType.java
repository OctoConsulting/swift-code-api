
package com.challenge.swiftcode.wsClient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RS_EULP_PLAggType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RS_EULP_PLAggType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="EULP_PFT_PST_TAX" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_TOT_FINL_INCM" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_NET_LOSS" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_PFT_STMT_DT" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="EULP_NET_TAX" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_PFT_PRE_TAX" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_SLS" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_NET_OPRG_INCM" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_GRS_PFT" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_NET_SLS" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_EMP_CST" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_COGS" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_DPRE" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_NET_PFT" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_TOT_FINL_EXPE" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
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
@XmlType(name = "RS_EULP_PLAggType", propOrder = {
    "eulppftpsttaxOrEULPTOTFINLINCMOrEULPNETLOSS"
})
public class RSEULPPLAggType {

    @XmlElementRefs({
        @XmlElementRef(name = "EULP_NET_OPRG_INCM", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_DPRE", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_PFT_PST_TAX", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_NET_TAX", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_TOT_FINL_INCM", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_GRS_PFT", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_NET_LOSS", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_SLS", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_COGS", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_EMP_CST", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_TOT_FINL_EXPE", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_PFT_PRE_TAX", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_NET_SLS", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_PFT_STMT_DT", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_NET_PFT", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> eulppftpsttaxOrEULPTOTFINLINCMOrEULPNETLOSS;

    /**
     * Gets the value of the eulppftpsttaxOrEULPTOTFINLINCMOrEULPNETLOSS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eulppftpsttaxOrEULPTOTFINLINCMOrEULPNETLOSS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEULPPFTPSTTAXOrEULPTOTFINLINCMOrEULPNETLOSS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getEULPPFTPSTTAXOrEULPTOTFINLINCMOrEULPNETLOSS() {
        if (eulppftpsttaxOrEULPTOTFINLINCMOrEULPNETLOSS == null) {
            eulppftpsttaxOrEULPTOTFINLINCMOrEULPNETLOSS = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.eulppftpsttaxOrEULPTOTFINLINCMOrEULPNETLOSS;
    }

}

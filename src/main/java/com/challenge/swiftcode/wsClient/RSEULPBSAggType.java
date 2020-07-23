
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
 * <p>Java class for RS_EULP_BSAggType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RS_EULP_BSAggType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="EULP_CAPL" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_GDWI" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_PFT_LOS_FRWD" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_BANK" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_SHR_PREM" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_LT_LIAB_DUE_1YR" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_PFT" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_TRD_CRR" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_TOT_ASET" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_RESV" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_TOT_NCUR_ASET" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_LT_IVSM" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_TOT_DBT" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_AR_OVR_1YR" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_TOT_CURR_LIAB" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_INTA_ASET" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_FIXT_EQPT" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_TOT_STK_EQTY" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_OTH_LOAN" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_TRD_DBTR" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_INDV_CONS_IND" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="EULP_RETD_EARN" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_TOT_NET_STK_WIP" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_BLDG" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_LT_LIAB_OTH" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_CRCY_CD" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="EULP_MTGE_LOAN" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_NET_WRTH" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_LAND" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_ST_IVSM" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_TOT_CA" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_BANK_LOAN" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_ISS_CAPL" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_OTH_FA" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_CSH_LQD_ASET" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_LAND_BLDG" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_LT_LIAB" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_TOT_TANG_ASET" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_AR_OTH" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_TOT_FINL_ASET" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_TOT_LIAB" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="EULP_STMT_DT" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="EULP_FURN_VHCL" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
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
@XmlType(name = "RS_EULP_BSAggType", propOrder = {
    "eulpcaplOrEULPGDWIOrEULPPFTLOSFRWD"
})
public class RSEULPBSAggType {

    @XmlElementRefs({
        @XmlElementRef(name = "EULP_TRD_CRR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_OTH_LOAN", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_AR_OVR_1YR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_TOT_CA", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_PFT", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_NET_WRTH", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_TOT_FINL_ASET", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_TOT_STK_EQTY", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_BANK", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_ST_IVSM", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_BANK_LOAN", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_LT_LIAB_DUE_1YR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_OTH_FA", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_BLDG", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_TRD_DBTR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_INTA_ASET", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_FURN_VHCL", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_LAND_BLDG", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_TOT_TANG_ASET", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_STMT_DT", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_RESV", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_LAND", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_RETD_EARN", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_MTGE_LOAN", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_PFT_LOS_FRWD", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_TOT_DBT", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_LT_LIAB_OTH", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_TOT_NCUR_ASET", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_TOT_ASET", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_INDV_CONS_IND", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_ISS_CAPL", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_AR_OTH", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_LT_IVSM", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_GDWI", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_TOT_NET_STK_WIP", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_TOT_LIAB", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_CSH_LQD_ASET", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_CAPL", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_SHR_PREM", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_LT_LIAB", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_TOT_CURR_LIAB", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_FIXT_EQPT", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EULP_CRCY_CD", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> eulpcaplOrEULPGDWIOrEULPPFTLOSFRWD;

    /**
     * Gets the value of the eulpcaplOrEULPGDWIOrEULPPFTLOSFRWD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eulpcaplOrEULPGDWIOrEULPPFTLOSFRWD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEULPCAPLOrEULPGDWIOrEULPPFTLOSFRWD().add(newItem);
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
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
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
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getEULPCAPLOrEULPGDWIOrEULPPFTLOSFRWD() {
        if (eulpcaplOrEULPGDWIOrEULPPFTLOSFRWD == null) {
            eulpcaplOrEULPGDWIOrEULPPFTLOSFRWD = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.eulpcaplOrEULPGDWIOrEULPPFTLOSFRWD;
    }

}

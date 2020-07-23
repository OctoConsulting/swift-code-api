
package com.challenge.swiftcode.wsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FAM_TREE_MBRType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FAM_TREE_MBRType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="POST_CODE" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="PRIM_GEO_AREA" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="SIC_TYPE_CD" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="BR_IND" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="INTL_DLNG_CD" type="{http://www.w3.org/2001/XMLSchema}short" form="qualified"/>
 *           &lt;element name="FAX_NBR" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="SCDY_GEO_AREA" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="STRT_YR" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="FAM_TREE_MBR" type="{http://www.sam.gov}FAM_TREE_MBRType" form="qualified"/>
 *           &lt;element name="OUT_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="PRIM_NME" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="BUS_REGN_NBR_TYPE_CD" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="CTRY_CD" type="{http://www.sam.gov}GA_ISOCountries_AlphaType" form="qualified"/>
 *           &lt;element name="PNT_DUNS" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="BUS_REGN_NBR" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="DUNS_NBR" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="DOM_ULT_PNT_DUNS" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="POST_TOWN" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="BUS_STRU" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="LOCN_STAT" type="{http://www.sam.gov}RS_LOCN_STATType" form="qualified"/>
 *           &lt;element name="GBL_ULT_PNT_DUNS" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="TLCM_NBR" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="TRDG_STYL" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="ADR_LINE" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="HQ_DUNS" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="PRIM_SIC" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
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
@XmlType(name = "FAM_TREE_MBRType", propOrder = {
    "postcodeOrPRIMGEOAREAOrSICTYPECD"
})
public class FAMTREEMBRType {

    @XmlElementRefs({
        @XmlElementRef(name = "SCDY_GEO_AREA", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GBL_ULT_PNT_DUNS", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "POST_CODE", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PRIM_GEO_AREA", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TRDG_STYL", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BR_IND", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "POST_TOWN", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DUNS_NBR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HQ_DUNS", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SIC_TYPE_CD", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "STRT_YR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BUS_STRU", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ADR_LINE", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BUS_REGN_NBR_TYPE_CD", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PNT_DUNS", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LOCN_STAT", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FAX_NBR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PRIM_NME", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BUS_REGN_NBR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FAM_TREE_MBR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CTRY_CD", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DOM_ULT_PNT_DUNS", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "INTL_DLNG_CD", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OUT_BUS_IND", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PRIM_SIC", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TLCM_NBR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> postcodeOrPRIMGEOAREAOrSICTYPECD;

    /**
     * Gets the value of the postcodeOrPRIMGEOAREAOrSICTYPECD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postcodeOrPRIMGEOAREAOrSICTYPECD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOSTCODEOrPRIMGEOAREAOrSICTYPECD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link RSLOCNSTATType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link FAMTREEMBRType }{@code >}
     * {@link JAXBElement }{@code <}{@link GAISOCountriesAlphaType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPOSTCODEOrPRIMGEOAREAOrSICTYPECD() {
        if (postcodeOrPRIMGEOAREAOrSICTYPECD == null) {
            postcodeOrPRIMGEOAREAOrSICTYPECD = new ArrayList<JAXBElement<?>>();
        }
        return this.postcodeOrPRIMGEOAREAOrSICTYPECD;
    }

}

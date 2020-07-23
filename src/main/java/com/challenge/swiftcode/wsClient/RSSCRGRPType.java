
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
 * <p>Java class for RS_SCR_GRPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RS_SCR_GRPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="SCR_AGE" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="INDS_DEFU_INDN" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="ASMT_DT" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="SCR_CMTY_CD" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="SCR_OVRD_CD" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="SCR_CLAS" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="DEFU_INDN" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="RAW_SCR" type="{http://www.w3.org/2001/XMLSchema}float" form="qualified"/>
 *           &lt;element name="SCR" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="NATL_PCTL" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="INDS_NORM" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="ALGM_ID" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
@XmlType(name = "RS_SCR_GRPType", propOrder = {
    "scrageOrINDSDEFUINDNOrASMTDT"
})
public class RSSCRGRPType {

    @XmlElementRefs({
        @XmlElementRef(name = "SCR_OVRD_CD", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ASMT_DT", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SCR_CMTY_CD", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NATL_PCTL", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DEFU_INDN", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SCR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SCR_AGE", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SCR_CLAS", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "INDS_NORM", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ALGM_ID", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RAW_SCR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "INDS_DEFU_INDN", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> scrageOrINDSDEFUINDNOrASMTDT;

    /**
     * Gets the value of the scrageOrINDSDEFUINDNOrASMTDT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scrageOrINDSDEFUINDNOrASMTDT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSCRAGEOrINDSDEFUINDNOrASMTDT().add(newItem);
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
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getSCRAGEOrINDSDEFUINDNOrASMTDT() {
        if (scrageOrINDSDEFUINDNOrASMTDT == null) {
            scrageOrINDSDEFUINDNOrASMTDT = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.scrageOrINDSDEFUINDNOrASMTDT;
    }

}


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
 * <p>Java class for FAMTREERSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FAMTREERSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="BUS_REL_CD" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
 *           &lt;element name="FAM_TREE_MBR" type="{http://www.sam.gov}FAM_TREE_MBRType" form="qualified"/>
 *           &lt;element name="EXCL_BR_IND" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="DUNS_NBR" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
@XmlType(name = "FAMTREERSType", propOrder = {
    "busrelcdOrFAMTREEMBROrEXCLBRIND"
})
public class FAMTREERSType {

    @XmlElementRefs({
        @XmlElementRef(name = "BUS_REL_CD", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DUNS_NBR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FAM_TREE_MBR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EXCL_BR_IND", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> busrelcdOrFAMTREEMBROrEXCLBRIND;

    /**
     * Gets the value of the busrelcdOrFAMTREEMBROrEXCLBRIND property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the busrelcdOrFAMTREEMBROrEXCLBRIND property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBUSRELCDOrFAMTREEMBROrEXCLBRIND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link FAMTREEMBRType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getBUSRELCDOrFAMTREEMBROrEXCLBRIND() {
        if (busrelcdOrFAMTREEMBROrEXCLBRIND == null) {
            busrelcdOrFAMTREEMBROrEXCLBRIND = new ArrayList<JAXBElement<?>>();
        }
        return this.busrelcdOrFAMTREEMBROrEXCLBRIND;
    }

}


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
 * <p>Java class for RS_US_PRNT_BKCY_FILG_GRPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RS_US_PRNT_BKCY_FILG_GRPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="US_PRNT_BKCY_FILG_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="US_PRNT_BKCY_FILG_DT" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="US_PRNT_BKCY_FILG_CH_NBR" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
@XmlType(name = "RS_US_PRNT_BKCY_FILG_GRPType", propOrder = {
    "usprntbkcyfilgtypeOrUSPRNTBKCYFILGDTOrUSPRNTBKCYFILGCHNBR"
})
public class RSUSPRNTBKCYFILGGRPType {

    @XmlElementRefs({
        @XmlElementRef(name = "US_PRNT_BKCY_FILG_CH_NBR", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "US_PRNT_BKCY_FILG_TYPE", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "US_PRNT_BKCY_FILG_DT", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> usprntbkcyfilgtypeOrUSPRNTBKCYFILGDTOrUSPRNTBKCYFILGCHNBR;

    /**
     * Gets the value of the usprntbkcyfilgtypeOrUSPRNTBKCYFILGDTOrUSPRNTBKCYFILGCHNBR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usprntbkcyfilgtypeOrUSPRNTBKCYFILGDTOrUSPRNTBKCYFILGCHNBR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUSPRNTBKCYFILGTYPEOrUSPRNTBKCYFILGDTOrUSPRNTBKCYFILGCHNBR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getUSPRNTBKCYFILGTYPEOrUSPRNTBKCYFILGDTOrUSPRNTBKCYFILGCHNBR() {
        if (usprntbkcyfilgtypeOrUSPRNTBKCYFILGDTOrUSPRNTBKCYFILGCHNBR == null) {
            usprntbkcyfilgtypeOrUSPRNTBKCYFILGDTOrUSPRNTBKCYFILGCHNBR = new ArrayList<JAXBElement<String>>();
        }
        return this.usprntbkcyfilgtypeOrUSPRNTBKCYFILGDTOrUSPRNTBKCYFILGCHNBR;
    }

}

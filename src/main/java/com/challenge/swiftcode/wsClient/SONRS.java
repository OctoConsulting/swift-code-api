
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="DTSERVER" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="STATUS" type="{http://www.sam.gov}RS_STATUSType" form="qualified"/>
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
@XmlType(name = "", propOrder = {
    "languageOrDTSERVEROrSTATUS"
})
@XmlRootElement(name = "SONRS")
public class SONRS {

    @XmlElementRefs({
        @XmlElementRef(name = "LANGUAGE", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "STATUS", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DTSERVER", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> languageOrDTSERVEROrSTATUS;

    /**
     * Gets the value of the languageOrDTSERVEROrSTATUS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageOrDTSERVEROrSTATUS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLANGUAGEOrDTSERVEROrSTATUS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link RSSTATUSType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getLANGUAGEOrDTSERVEROrSTATUS() {
        if (languageOrDTSERVEROrSTATUS == null) {
            languageOrDTSERVEROrSTATUS = new ArrayList<JAXBElement<?>>();
        }
        return this.languageOrDTSERVEROrSTATUS;
    }

}

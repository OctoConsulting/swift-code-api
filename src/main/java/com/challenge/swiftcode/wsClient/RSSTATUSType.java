
package com.challenge.swiftcode.wsClient;

import java.io.Serializable;
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
 * <p>Java class for RS_STATUSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RS_STATUSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="SUPPORT_MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
 *           &lt;element name="SEVERITY" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *           &lt;element name="TECH_MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
@XmlType(name = "RS_STATUSType", propOrder = {
    "messageOrSUPPORTMESSAGEOrCODE"
})
public class RSSTATUSType {

    @XmlElementRefs({
        @XmlElementRef(name = "SUPPORT_MESSAGE", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CODE", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TECH_MESSAGE", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MESSAGE", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SEVERITY", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> messageOrSUPPORTMESSAGEOrCODE;

    /**
     * Gets the value of the messageOrSUPPORTMESSAGEOrCODE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageOrSUPPORTMESSAGEOrCODE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMESSAGEOrSUPPORTMESSAGEOrCODE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getMESSAGEOrSUPPORTMESSAGEOrCODE() {
        if (messageOrSUPPORTMESSAGEOrCODE == null) {
            messageOrSUPPORTMESSAGEOrCODE = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.messageOrSUPPORTMESSAGEOrCODE;
    }

}

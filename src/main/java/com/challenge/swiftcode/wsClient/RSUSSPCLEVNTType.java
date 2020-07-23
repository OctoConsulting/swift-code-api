
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RS_US_SPCL_EVNTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RS_US_SPCL_EVNTType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="US_SPCL_EVNT_GRP" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="US_DT_OF_DATA" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *                     &lt;element name="US_SPCL_EVNT_TXT" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RS_US_SPCL_EVNTType", propOrder = {
    "usspclevntgrp"
})
public class RSUSSPCLEVNTType {

    @XmlElement(name = "US_SPCL_EVNT_GRP", namespace = "http://www.sam.gov")
    protected List<RSUSSPCLEVNTType.USSPCLEVNTGRP> usspclevntgrp;

    /**
     * Gets the value of the usspclevntgrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usspclevntgrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUSSPCLEVNTGRP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RSUSSPCLEVNTType.USSPCLEVNTGRP }
     * 
     * 
     */
    public List<RSUSSPCLEVNTType.USSPCLEVNTGRP> getUSSPCLEVNTGRP() {
        if (usspclevntgrp == null) {
            usspclevntgrp = new ArrayList<RSUSSPCLEVNTType.USSPCLEVNTGRP>();
        }
        return this.usspclevntgrp;
    }


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
     *           &lt;element name="US_DT_OF_DATA" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
     *           &lt;element name="US_SPCL_EVNT_TXT" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
        "usdtofdataOrUSSPCLEVNTTXT"
    })
    public static class USSPCLEVNTGRP {

        @XmlElementRefs({
            @XmlElementRef(name = "US_SPCL_EVNT_TXT", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "US_DT_OF_DATA", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<String>> usdtofdataOrUSSPCLEVNTTXT;

        /**
         * Gets the value of the usdtofdataOrUSSPCLEVNTTXT property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the usdtofdataOrUSSPCLEVNTTXT property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUSDTOFDATAOrUSSPCLEVNTTXT().add(newItem);
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
        public List<JAXBElement<String>> getUSDTOFDATAOrUSSPCLEVNTTXT() {
            if (usdtofdataOrUSSPCLEVNTTXT == null) {
                usdtofdataOrUSSPCLEVNTTXT = new ArrayList<JAXBElement<String>>();
            }
            return this.usdtofdataOrUSSPCLEVNTTXT;
        }

    }

}

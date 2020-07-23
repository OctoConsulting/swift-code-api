
package com.challenge.swiftcode.wsClient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RS_UPD_FLDS_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RS_UPD_FLDS_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UPD_FLD" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NME" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *                   &lt;element name="VAL" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
@XmlType(name = "RS_UPD_FLDS_TYPE", propOrder = {
    "content"
})
public class RSUPDFLDSTYPE {

    @XmlElementRef(name = "UPD_FLD", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<Serializable> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link JAXBElement }{@code <}{@link RSUPDFLDSTYPE.UPDFLD }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
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
     *         &lt;element name="NME" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
     *         &lt;element name="VAL" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
        "nme",
        "val"
    })
    public static class UPDFLD {

        @XmlElement(name = "NME", namespace = "http://www.sam.gov", required = true)
        protected String nme;
        @XmlElement(name = "VAL", namespace = "http://www.sam.gov", required = true)
        protected String val;

        /**
         * Gets the value of the nme property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNME() {
            return nme;
        }

        /**
         * Sets the value of the nme property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNME(String value) {
            this.nme = value;
        }

        /**
         * Gets the value of the val property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVAL() {
            return val;
        }

        /**
         * Sets the value of the val property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVAL(String value) {
            this.val = value;
        }

    }

}

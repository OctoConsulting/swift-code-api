
package com.challenge.swiftcode.wsClient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RS_KEY_FLDS2_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RS_KEY_FLDS2_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEY_FLD" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="VAL" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *                     &lt;element name="NME" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
@XmlType(name = "RS_KEY_FLDS2_TYPE", propOrder = {
    "keyfld"
})
public class RSKEYFLDS2TYPE {

    @XmlElement(name = "KEY_FLD", namespace = "http://www.sam.gov")
    protected List<RSKEYFLDS2TYPE.KEYFLD> keyfld;

    /**
     * Gets the value of the keyfld property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyfld property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKEYFLD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RSKEYFLDS2TYPE.KEYFLD }
     * 
     * 
     */
    public List<RSKEYFLDS2TYPE.KEYFLD> getKEYFLD() {
        if (keyfld == null) {
            keyfld = new ArrayList<RSKEYFLDS2TYPE.KEYFLD>();
        }
        return this.keyfld;
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
     *           &lt;element name="VAL" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
     *           &lt;element name="NME" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
        "content"
    })
    public static class KEYFLD {

        @XmlElementRefs({
            @XmlElementRef(name = "NME", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "VAL", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
        })
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
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link String }
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

    }

}

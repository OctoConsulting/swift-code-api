
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExclusionSearchResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExclusionSearchResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exclusionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exclusionProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityIdentification" type="{http://www.sam.gov}EntityIdentificationType"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ofacProgram" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listOfactions" type="{http://www.sam.gov}listOfExclusionsActionType" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.sam.gov}ExclusionAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionSearchResultType", propOrder = {
    "classification",
    "exclusionType",
    "exclusionProgram",
    "entityIdentification",
    "comments",
    "ofacProgram",
    "listOfactions",
    "address"
})
public class ExclusionSearchResultType {

    @XmlElement(required = true, nillable = true)
    protected String classification;
    @XmlElementRef(name = "exclusionType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exclusionType;
    @XmlElementRef(name = "exclusionProgram", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exclusionProgram;
    @XmlElement(required = true)
    protected EntityIdentificationType entityIdentification;
    @XmlElement(nillable = true)
    protected List<String> comments;
    @XmlElement(nillable = true)
    protected List<String> ofacProgram;
    @XmlElementRef(name = "listOfactions", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfExclusionsActionType> listOfactions;
    @XmlElement(nillable = true)
    protected List<ExclusionAddressType> address;

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassification(String value) {
        this.classification = value;
    }

    /**
     * Gets the value of the exclusionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExclusionType() {
        return exclusionType;
    }

    /**
     * Sets the value of the exclusionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExclusionType(JAXBElement<String> value) {
        this.exclusionType = value;
    }

    /**
     * Gets the value of the exclusionProgram property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExclusionProgram() {
        return exclusionProgram;
    }

    /**
     * Sets the value of the exclusionProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExclusionProgram(JAXBElement<String> value) {
        this.exclusionProgram = value;
    }

    /**
     * Gets the value of the entityIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdentificationType }
     *     
     */
    public EntityIdentificationType getEntityIdentification() {
        return entityIdentification;
    }

    /**
     * Sets the value of the entityIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdentificationType }
     *     
     */
    public void setEntityIdentification(EntityIdentificationType value) {
        this.entityIdentification = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComments() {
        if (comments == null) {
            comments = new ArrayList<String>();
        }
        return this.comments;
    }

    /**
     * Gets the value of the ofacProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ofacProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfacProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOfacProgram() {
        if (ofacProgram == null) {
            ofacProgram = new ArrayList<String>();
        }
        return this.ofacProgram;
    }

    /**
     * Gets the value of the listOfactions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfExclusionsActionType }{@code >}
     *     
     */
    public JAXBElement<ListOfExclusionsActionType> getListOfactions() {
        return listOfactions;
    }

    /**
     * Sets the value of the listOfactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfExclusionsActionType }{@code >}
     *     
     */
    public void setListOfactions(JAXBElement<ListOfExclusionsActionType> value) {
        this.listOfactions = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExclusionAddressType }
     * 
     * 
     */
    public List<ExclusionAddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<ExclusionAddressType>();
        }
        return this.address;
    }

}

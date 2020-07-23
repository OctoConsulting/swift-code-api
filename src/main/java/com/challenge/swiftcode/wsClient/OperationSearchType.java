
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
 * <p>Java class for OperationSearchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationSearchType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}ExclusionValueObjectType">
 *       &lt;sequence>
 *         &lt;element name="actionDate" type="{http://www.sam.gov}ExclusionDateRangeType" minOccurs="0"/>
 *         &lt;element name="agency" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="agencyUID" type="{http://www.sam.gov}ExclusionAgencyUIDType" minOccurs="0"/>
 *         &lt;element name="classification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.sam.gov}ExclusionDateRangeType" minOccurs="0"/>
 *         &lt;element name="deleteDate" type="{http://www.sam.gov}ExclusionDateRangeType" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exclusionType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="includeInactive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="first" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifyDate" type="{http://www.sam.gov}ExclusionDateRangeType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exclusionProgram" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ssnOrTin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="termDate" type="{http://www.sam.gov}ExclusionDateRangeType" minOccurs="0"/>
 *         &lt;element name="periodicity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationSearchType", propOrder = {
    "actionDate",
    "agency",
    "agencyUID",
    "classification",
    "country",
    "createDate",
    "deleteDate",
    "dunsNumber",
    "exactName",
    "exclusionType",
    "includeInactive",
    "first",
    "last",
    "middle",
    "modifyDate",
    "name",
    "partialName",
    "prefix",
    "exclusionProgram",
    "ssnOrTin",
    "state",
    "suffix",
    "termDate",
    "periodicity"
})
public class OperationSearchType
    extends ExclusionValueObjectType
{

    @XmlElementRef(name = "actionDate", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionDateRangeType> actionDate;
    @XmlElement(nillable = true)
    protected List<String> agency;
    @XmlElementRef(name = "agencyUID", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionAgencyUIDType> agencyUID;
    @XmlElement(nillable = true)
    protected List<String> classification;
    @XmlElement(nillable = true)
    protected List<String> country;
    @XmlElementRef(name = "createDate", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionDateRangeType> createDate;
    @XmlElementRef(name = "deleteDate", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionDateRangeType> deleteDate;
    @XmlElementRef(name = "DUNSNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dunsNumber;
    @XmlElementRef(name = "exactName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exactName;
    @XmlElement(nillable = true)
    protected List<String> exclusionType;
    @XmlElementRef(name = "includeInactive", type = JAXBElement.class, required = false)
    protected JAXBElement<String> includeInactive;
    @XmlElementRef(name = "first", type = JAXBElement.class, required = false)
    protected JAXBElement<String> first;
    @XmlElementRef(name = "last", type = JAXBElement.class, required = false)
    protected JAXBElement<String> last;
    @XmlElementRef(name = "middle", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middle;
    @XmlElementRef(name = "modifyDate", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionDateRangeType> modifyDate;
    @XmlElementRef(name = "name", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "partialName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partialName;
    @XmlElementRef(name = "prefix", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prefix;
    @XmlElement(nillable = true)
    protected List<String> exclusionProgram;
    protected String ssnOrTin;
    @XmlElement(nillable = true)
    protected List<String> state;
    @XmlElementRef(name = "suffix", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suffix;
    @XmlElementRef(name = "termDate", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionDateRangeType> termDate;
    @XmlElementRef(name = "periodicity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> periodicity;

    /**
     * Gets the value of the actionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}
     *     
     */
    public JAXBElement<ExclusionDateRangeType> getActionDate() {
        return actionDate;
    }

    /**
     * Sets the value of the actionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}
     *     
     */
    public void setActionDate(JAXBElement<ExclusionDateRangeType> value) {
        this.actionDate = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAgency() {
        if (agency == null) {
            agency = new ArrayList<String>();
        }
        return this.agency;
    }

    /**
     * Gets the value of the agencyUID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclusionAgencyUIDType }{@code >}
     *     
     */
    public JAXBElement<ExclusionAgencyUIDType> getAgencyUID() {
        return agencyUID;
    }

    /**
     * Sets the value of the agencyUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclusionAgencyUIDType }{@code >}
     *     
     */
    public void setAgencyUID(JAXBElement<ExclusionAgencyUIDType> value) {
        this.agencyUID = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClassification() {
        if (classification == null) {
            classification = new ArrayList<String>();
        }
        return this.classification;
    }

    /**
     * Gets the value of the country property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the country property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountry() {
        if (country == null) {
            country = new ArrayList<String>();
        }
        return this.country;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}
     *     
     */
    public JAXBElement<ExclusionDateRangeType> getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}
     *     
     */
    public void setCreateDate(JAXBElement<ExclusionDateRangeType> value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the deleteDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}
     *     
     */
    public JAXBElement<ExclusionDateRangeType> getDeleteDate() {
        return deleteDate;
    }

    /**
     * Sets the value of the deleteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}
     *     
     */
    public void setDeleteDate(JAXBElement<ExclusionDateRangeType> value) {
        this.deleteDate = value;
    }

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNSNumber(JAXBElement<String> value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the exactName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExactName() {
        return exactName;
    }

    /**
     * Sets the value of the exactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExactName(JAXBElement<String> value) {
        this.exactName = value;
    }

    /**
     * Gets the value of the exclusionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExclusionType() {
        if (exclusionType == null) {
            exclusionType = new ArrayList<String>();
        }
        return this.exclusionType;
    }

    /**
     * Gets the value of the includeInactive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIncludeInactive() {
        return includeInactive;
    }

    /**
     * Sets the value of the includeInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIncludeInactive(JAXBElement<String> value) {
        this.includeInactive = value;
    }

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirst(JAXBElement<String> value) {
        this.first = value;
    }

    /**
     * Gets the value of the last property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLast() {
        return last;
    }

    /**
     * Sets the value of the last property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLast(JAXBElement<String> value) {
        this.last = value;
    }

    /**
     * Gets the value of the middle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddle() {
        return middle;
    }

    /**
     * Sets the value of the middle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddle(JAXBElement<String> value) {
        this.middle = value;
    }

    /**
     * Gets the value of the modifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}
     *     
     */
    public JAXBElement<ExclusionDateRangeType> getModifyDate() {
        return modifyDate;
    }

    /**
     * Sets the value of the modifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}
     *     
     */
    public void setModifyDate(JAXBElement<ExclusionDateRangeType> value) {
        this.modifyDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the partialName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartialName() {
        return partialName;
    }

    /**
     * Sets the value of the partialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartialName(JAXBElement<String> value) {
        this.partialName = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefix(JAXBElement<String> value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the exclusionProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusionProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusionProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExclusionProgram() {
        if (exclusionProgram == null) {
            exclusionProgram = new ArrayList<String>();
        }
        return this.exclusionProgram;
    }

    /**
     * Gets the value of the ssnOrTin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsnOrTin() {
        return ssnOrTin;
    }

    /**
     * Sets the value of the ssnOrTin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsnOrTin(String value) {
        this.ssnOrTin = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the state property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getState() {
        if (state == null) {
            state = new ArrayList<String>();
        }
        return this.state;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuffix(JAXBElement<String> value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the termDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}
     *     
     */
    public JAXBElement<ExclusionDateRangeType> getTermDate() {
        return termDate;
    }

    /**
     * Sets the value of the termDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}
     *     
     */
    public void setTermDate(JAXBElement<ExclusionDateRangeType> value) {
        this.termDate = value;
    }

    /**
     * Gets the value of the periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPeriodicity() {
        return periodicity;
    }

    /**
     * Sets the value of the periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPeriodicity(JAXBElement<String> value) {
        this.periodicity = value;
    }

}


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
 * <p>Java class for OperationExclusionHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationExclusionHistoryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}ExclusionValueObjectType">
 *       &lt;sequence>
 *         &lt;element name="actionDate" type="{http://www.sam.gov}ExclusionDateRangeType" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.sam.gov}ExclusionDateRangeType" minOccurs="0"/>
 *         &lt;element name="deleteDate" type="{http://www.sam.gov}ExclusionDateRangeType" minOccurs="0"/>
 *         &lt;element name="modifyDate" type="{http://www.sam.gov}ExclusionDateRangeType" minOccurs="0"/>
 *         &lt;element name="termDate" type="{http://www.sam.gov}ExclusionDateRangeType" minOccurs="0"/>
 *         &lt;element name="agency" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "OperationExclusionHistoryType", propOrder = {
    "actionDate",
    "createDate",
    "deleteDate",
    "modifyDate",
    "termDate",
    "agency",
    "periodicity"
})
public class OperationExclusionHistoryType
    extends ExclusionValueObjectType
{

    @XmlElementRef(name = "actionDate", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionDateRangeType> actionDate;
    @XmlElementRef(name = "createDate", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionDateRangeType> createDate;
    @XmlElementRef(name = "deleteDate", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionDateRangeType> deleteDate;
    @XmlElementRef(name = "modifyDate", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionDateRangeType> modifyDate;
    @XmlElementRef(name = "termDate", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionDateRangeType> termDate;
    @XmlElement(nillable = true)
    protected List<String> agency;
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

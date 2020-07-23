
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessObject" type="{http://www.sam.gov}businessObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessObjectType", propOrder = {
    "id",
    "businessObject"
})
@XmlSeeAlso({
    Owner.class,
    TINHolderStatus.class,
    EndProduct.class,
    ForeignGovtControl.class,
    FSCInfo.class,
    DisciplineInfo.class,
    LaborSurplusConcern.class,
    ServicesRevenue.class,
    SocioEconomic.class,
    PointOfContact.class,
    Address.class,
    Person.class,
    Organization.class,
    URL.class,
    ArchitectExperience.class,
    Facility.class,
    Company.class,
    Discipline.class
})
public class BusinessObjectType {

    @XmlElementRef(name = "id", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElement(nillable = true)
    protected List<BusinessObjectType> businessObject;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the businessObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessObjectType }
     * 
     * 
     */
    public List<BusinessObjectType> getBusinessObject() {
        if (businessObject == null) {
            businessObject = new ArrayList<BusinessObjectType>();
        }
        return this.businessObject;
    }

}

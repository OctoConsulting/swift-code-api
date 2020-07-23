
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for federalHierarchyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="federalHierarchyInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hierarchyDepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hierarchyDepartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hierarchyAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hierarchyAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hierarchyOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "federalHierarchyInformationType", propOrder = {
    "source",
    "hierarchyDepartmentCode",
    "hierarchyDepartmentName",
    "hierarchyAgencyCode",
    "hierarchyAgencyName",
    "hierarchyOfficeCode"
})
public class FederalHierarchyInformationType {

    protected String source;
    @XmlElementRef(name = "hierarchyDepartmentCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hierarchyDepartmentCode;
    @XmlElementRef(name = "hierarchyDepartmentName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hierarchyDepartmentName;
    @XmlElementRef(name = "hierarchyAgencyCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hierarchyAgencyCode;
    @XmlElementRef(name = "hierarchyAgencyName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hierarchyAgencyName;
    @XmlElementRef(name = "hierarchyOfficeCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hierarchyOfficeCode;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the hierarchyDepartmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHierarchyDepartmentCode() {
        return hierarchyDepartmentCode;
    }

    /**
     * Sets the value of the hierarchyDepartmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHierarchyDepartmentCode(JAXBElement<String> value) {
        this.hierarchyDepartmentCode = value;
    }

    /**
     * Gets the value of the hierarchyDepartmentName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHierarchyDepartmentName() {
        return hierarchyDepartmentName;
    }

    /**
     * Sets the value of the hierarchyDepartmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHierarchyDepartmentName(JAXBElement<String> value) {
        this.hierarchyDepartmentName = value;
    }

    /**
     * Gets the value of the hierarchyAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHierarchyAgencyCode() {
        return hierarchyAgencyCode;
    }

    /**
     * Sets the value of the hierarchyAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHierarchyAgencyCode(JAXBElement<String> value) {
        this.hierarchyAgencyCode = value;
    }

    /**
     * Gets the value of the hierarchyAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHierarchyAgencyName() {
        return hierarchyAgencyName;
    }

    /**
     * Sets the value of the hierarchyAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHierarchyAgencyName(JAXBElement<String> value) {
        this.hierarchyAgencyName = value;
    }

    /**
     * Gets the value of the hierarchyOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHierarchyOfficeCode() {
        return hierarchyOfficeCode;
    }

    /**
     * Sets the value of the hierarchyOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHierarchyOfficeCode(JAXBElement<String> value) {
        this.hierarchyOfficeCode = value;
    }

}

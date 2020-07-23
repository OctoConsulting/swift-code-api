
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SBAFormallyDeterminedSizesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SBAFormallyDeterminedSizesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="revenueSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="employeeSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="megawattHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="oilBarrel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="totalAssets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="determinationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBAFormallyDeterminedSizesType", propOrder = {
    "revenueSize",
    "employeeSize",
    "megawattHours",
    "oilBarrel",
    "totalAssets",
    "determinationDate"
})
public class SBAFormallyDeterminedSizesType {

    @XmlElementRef(name = "revenueSize", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> revenueSize;
    @XmlElementRef(name = "employeeSize", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeSize;
    @XmlElementRef(name = "megawattHours", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> megawattHours;
    @XmlElementRef(name = "oilBarrel", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oilBarrel;
    @XmlElementRef(name = "totalAssets", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalAssets;
    @XmlElementRef(name = "determinationDate", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> determinationDate;

    /**
     * Gets the value of the revenueSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRevenueSize() {
        return revenueSize;
    }

    /**
     * Sets the value of the revenueSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRevenueSize(JAXBElement<String> value) {
        this.revenueSize = value;
    }

    /**
     * Gets the value of the employeeSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeSize() {
        return employeeSize;
    }

    /**
     * Sets the value of the employeeSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeSize(JAXBElement<String> value) {
        this.employeeSize = value;
    }

    /**
     * Gets the value of the megawattHours property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMegawattHours() {
        return megawattHours;
    }

    /**
     * Sets the value of the megawattHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMegawattHours(JAXBElement<String> value) {
        this.megawattHours = value;
    }

    /**
     * Gets the value of the oilBarrel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOilBarrel() {
        return oilBarrel;
    }

    /**
     * Sets the value of the oilBarrel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOilBarrel(JAXBElement<String> value) {
        this.oilBarrel = value;
    }

    /**
     * Gets the value of the totalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalAssets() {
        return totalAssets;
    }

    /**
     * Sets the value of the totalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalAssets(JAXBElement<String> value) {
        this.totalAssets = value;
    }

    /**
     * Gets the value of the determinationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeterminationDate() {
        return determinationDate;
    }

    /**
     * Sets the value of the determinationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeterminationDate(JAXBElement<String> value) {
        this.determinationDate = value;
    }

}

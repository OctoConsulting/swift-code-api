
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sizeMetricDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sizeMetricDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employeesLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiptsLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industrySpecificSizeMetrics" type="{http://www.sam.gov}industrySpecificSizeMetricsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sizeMetricDetailsType", propOrder = {
    "employeesLocation",
    "receiptsLocation",
    "industrySpecificSizeMetrics"
})
public class SizeMetricDetailsType {

    @XmlElementRef(name = "employeesLocation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeesLocation;
    @XmlElementRef(name = "receiptsLocation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptsLocation;
    @XmlElementRef(name = "industrySpecificSizeMetrics", type = JAXBElement.class, required = false)
    protected JAXBElement<IndustrySpecificSizeMetricsType> industrySpecificSizeMetrics;

    /**
     * Gets the value of the employeesLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeesLocation() {
        return employeesLocation;
    }

    /**
     * Sets the value of the employeesLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeesLocation(JAXBElement<String> value) {
        this.employeesLocation = value;
    }

    /**
     * Gets the value of the receiptsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptsLocation() {
        return receiptsLocation;
    }

    /**
     * Sets the value of the receiptsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptsLocation(JAXBElement<String> value) {
        this.receiptsLocation = value;
    }

    /**
     * Gets the value of the industrySpecificSizeMetrics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndustrySpecificSizeMetricsType }{@code >}
     *     
     */
    public JAXBElement<IndustrySpecificSizeMetricsType> getIndustrySpecificSizeMetrics() {
        return industrySpecificSizeMetrics;
    }

    /**
     * Sets the value of the industrySpecificSizeMetrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndustrySpecificSizeMetricsType }{@code >}
     *     
     */
    public void setIndustrySpecificSizeMetrics(JAXBElement<IndustrySpecificSizeMetricsType> value) {
        this.industrySpecificSizeMetrics = value;
    }

}

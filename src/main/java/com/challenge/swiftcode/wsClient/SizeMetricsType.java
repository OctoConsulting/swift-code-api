
package com.challenge.swiftcode.wsClient;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sizeMetricsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sizeMetricsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annualRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="averageAnnualRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="averageNumberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="listOfSizeMetricDetails" type="{http://www.sam.gov}listOfSizeMetricDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sizeMetricsType", propOrder = {
    "annualRevenue",
    "averageAnnualRevenue",
    "averageNumberOfEmployees",
    "listOfSizeMetricDetails"
})
public class SizeMetricsType {

    protected BigDecimal annualRevenue;
    protected BigDecimal averageAnnualRevenue;
    protected BigInteger averageNumberOfEmployees;
    @XmlElementRef(name = "listOfSizeMetricDetails", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfSizeMetricDetailsType> listOfSizeMetricDetails;

    /**
     * Gets the value of the annualRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualRevenue() {
        return annualRevenue;
    }

    /**
     * Sets the value of the annualRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualRevenue(BigDecimal value) {
        this.annualRevenue = value;
    }

    /**
     * Gets the value of the averageAnnualRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageAnnualRevenue() {
        return averageAnnualRevenue;
    }

    /**
     * Sets the value of the averageAnnualRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageAnnualRevenue(BigDecimal value) {
        this.averageAnnualRevenue = value;
    }

    /**
     * Gets the value of the averageNumberOfEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAverageNumberOfEmployees() {
        return averageNumberOfEmployees;
    }

    /**
     * Sets the value of the averageNumberOfEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAverageNumberOfEmployees(BigInteger value) {
        this.averageNumberOfEmployees = value;
    }

    /**
     * Gets the value of the listOfSizeMetricDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfSizeMetricDetailsType }{@code >}
     *     
     */
    public JAXBElement<ListOfSizeMetricDetailsType> getListOfSizeMetricDetails() {
        return listOfSizeMetricDetails;
    }

    /**
     * Sets the value of the listOfSizeMetricDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfSizeMetricDetailsType }{@code >}
     *     
     */
    public void setListOfSizeMetricDetails(JAXBElement<ListOfSizeMetricDetailsType> value) {
        this.listOfSizeMetricDetails = value;
    }

}

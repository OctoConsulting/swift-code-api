
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExclusionSearchHistoryCountResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExclusionSearchHistoryCountResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateRange" type="{http://www.sam.gov}ExclusionDateRangeType"/>
 *         &lt;element name="monthlyScale" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="yearlyScale" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="monthlyCounts" type="{http://www.sam.gov}HistoryCountDataPointType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="yearlyCounts" type="{http://www.sam.gov}HistoryCountDataPointType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionSearchHistoryCountResultType", propOrder = {
    "dateRange",
    "monthlyScale",
    "yearlyScale",
    "monthlyCounts",
    "yearlyCounts"
})
public class ExclusionSearchHistoryCountResultType {

    @XmlElement(required = true, nillable = true)
    protected ExclusionDateRangeType dateRange;
    @XmlElement(nillable = true)
    protected List<String> monthlyScale;
    @XmlElement(nillable = true)
    protected List<String> yearlyScale;
    @XmlElement(nillable = true)
    protected List<HistoryCountDataPointType> monthlyCounts;
    @XmlElement(nillable = true)
    protected List<HistoryCountDataPointType> yearlyCounts;

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link ExclusionDateRangeType }
     *     
     */
    public ExclusionDateRangeType getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclusionDateRangeType }
     *     
     */
    public void setDateRange(ExclusionDateRangeType value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the monthlyScale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthlyScale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthlyScale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMonthlyScale() {
        if (monthlyScale == null) {
            monthlyScale = new ArrayList<String>();
        }
        return this.monthlyScale;
    }

    /**
     * Gets the value of the yearlyScale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yearlyScale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYearlyScale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getYearlyScale() {
        if (yearlyScale == null) {
            yearlyScale = new ArrayList<String>();
        }
        return this.yearlyScale;
    }

    /**
     * Gets the value of the monthlyCounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthlyCounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthlyCounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryCountDataPointType }
     * 
     * 
     */
    public List<HistoryCountDataPointType> getMonthlyCounts() {
        if (monthlyCounts == null) {
            monthlyCounts = new ArrayList<HistoryCountDataPointType>();
        }
        return this.monthlyCounts;
    }

    /**
     * Gets the value of the yearlyCounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yearlyCounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYearlyCounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryCountDataPointType }
     * 
     * 
     */
    public List<HistoryCountDataPointType> getYearlyCounts() {
        if (yearlyCounts == null) {
            yearlyCounts = new ArrayList<HistoryCountDataPointType>();
        }
        return this.yearlyCounts;
    }

}


package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assertionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assertionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="goodsAndServices" type="{http://www.sam.gov}goodsAndServicesType" minOccurs="0"/>
 *         &lt;element name="sizeMetrics" type="{http://www.sam.gov}sizeMetricsType" minOccurs="0"/>
 *         &lt;element name="EDIInformation" type="{http://www.sam.gov}EDIInformationType" minOccurs="0"/>
 *         &lt;element name="disasterReliefData" type="{http://www.sam.gov}disasterReliefDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assertionsType", propOrder = {
    "goodsAndServices",
    "sizeMetrics",
    "ediInformation",
    "disasterReliefData"
})
public class AssertionsType {

    @XmlElementRef(name = "goodsAndServices", type = JAXBElement.class, required = false)
    protected JAXBElement<GoodsAndServicesType> goodsAndServices;
    protected SizeMetricsType sizeMetrics;
    @XmlElement(name = "EDIInformation")
    protected EDIInformationType ediInformation;
    @XmlElementRef(name = "disasterReliefData", type = JAXBElement.class, required = false)
    protected JAXBElement<DisasterReliefDataType> disasterReliefData;

    /**
     * Gets the value of the goodsAndServices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GoodsAndServicesType }{@code >}
     *     
     */
    public JAXBElement<GoodsAndServicesType> getGoodsAndServices() {
        return goodsAndServices;
    }

    /**
     * Sets the value of the goodsAndServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GoodsAndServicesType }{@code >}
     *     
     */
    public void setGoodsAndServices(JAXBElement<GoodsAndServicesType> value) {
        this.goodsAndServices = value;
    }

    /**
     * Gets the value of the sizeMetrics property.
     * 
     * @return
     *     possible object is
     *     {@link SizeMetricsType }
     *     
     */
    public SizeMetricsType getSizeMetrics() {
        return sizeMetrics;
    }

    /**
     * Sets the value of the sizeMetrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeMetricsType }
     *     
     */
    public void setSizeMetrics(SizeMetricsType value) {
        this.sizeMetrics = value;
    }

    /**
     * Gets the value of the ediInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EDIInformationType }
     *     
     */
    public EDIInformationType getEDIInformation() {
        return ediInformation;
    }

    /**
     * Sets the value of the ediInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIInformationType }
     *     
     */
    public void setEDIInformation(EDIInformationType value) {
        this.ediInformation = value;
    }

    /**
     * Gets the value of the disasterReliefData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DisasterReliefDataType }{@code >}
     *     
     */
    public JAXBElement<DisasterReliefDataType> getDisasterReliefData() {
        return disasterReliefData;
    }

    /**
     * Sets the value of the disasterReliefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DisasterReliefDataType }{@code >}
     *     
     */
    public void setDisasterReliefData(JAXBElement<DisasterReliefDataType> value) {
        this.disasterReliefData = value;
    }

}

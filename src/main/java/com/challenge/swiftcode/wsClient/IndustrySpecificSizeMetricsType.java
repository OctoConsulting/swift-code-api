
package com.challenge.swiftcode.wsClient;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for industrySpecificSizeMetricsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="industrySpecificSizeMetricsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="barrelsCapacity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="totalAssets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="megawattHours" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "industrySpecificSizeMetricsType", propOrder = {
    "barrelsCapacity",
    "totalAssets",
    "megawattHours"
})
public class IndustrySpecificSizeMetricsType {

    @XmlElementRef(name = "barrelsCapacity", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> barrelsCapacity;
    @XmlElementRef(name = "totalAssets", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalAssets;
    @XmlElementRef(name = "megawattHours", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> megawattHours;

    /**
     * Gets the value of the barrelsCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getBarrelsCapacity() {
        return barrelsCapacity;
    }

    /**
     * Sets the value of the barrelsCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setBarrelsCapacity(JAXBElement<BigInteger> value) {
        this.barrelsCapacity = value;
    }

    /**
     * Gets the value of the totalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalAssets() {
        return totalAssets;
    }

    /**
     * Sets the value of the totalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalAssets(JAXBElement<BigDecimal> value) {
        this.totalAssets = value;
    }

    /**
     * Gets the value of the megawattHours property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMegawattHours() {
        return megawattHours;
    }

    /**
     * Sets the value of the megawattHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMegawattHours(JAXBElement<BigDecimal> value) {
        this.megawattHours = value;
    }

}

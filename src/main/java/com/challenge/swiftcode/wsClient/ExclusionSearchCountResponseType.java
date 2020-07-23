
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExclusionSearchCountResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExclusionSearchCountResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInformation" type="{http://www.sam.gov}exTransactionInfoType" minOccurs="0"/>
 *         &lt;element name="counts" type="{http://www.sam.gov}ExclusionSearchCountResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionSearchCountResponseType", propOrder = {
    "transactionInformation",
    "counts"
})
public class ExclusionSearchCountResponseType {

    @XmlElementRef(name = "transactionInformation", type = JAXBElement.class, required = false)
    protected JAXBElement<ExTransactionInfoType> transactionInformation;
    @XmlElementRef(name = "counts", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionSearchCountResultType> counts;

    /**
     * Gets the value of the transactionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExTransactionInfoType }{@code >}
     *     
     */
    public JAXBElement<ExTransactionInfoType> getTransactionInformation() {
        return transactionInformation;
    }

    /**
     * Sets the value of the transactionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExTransactionInfoType }{@code >}
     *     
     */
    public void setTransactionInformation(JAXBElement<ExTransactionInfoType> value) {
        this.transactionInformation = value;
    }

    /**
     * Gets the value of the counts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclusionSearchCountResultType }{@code >}
     *     
     */
    public JAXBElement<ExclusionSearchCountResultType> getCounts() {
        return counts;
    }

    /**
     * Sets the value of the counts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclusionSearchCountResultType }{@code >}
     *     
     */
    public void setCounts(JAXBElement<ExclusionSearchCountResultType> value) {
        this.counts = value;
    }

}

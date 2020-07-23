
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
 * <p>Java class for ExclusionSearchResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExclusionSearchResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInformation" type="{http://www.sam.gov}exTransactionInfoType" minOccurs="0"/>
 *         &lt;element name="excludedEntity" type="{http://www.sam.gov}ExclusionSearchResultType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionSearchResponseType", propOrder = {
    "transactionInformation",
    "excludedEntity"
})
public class ExclusionSearchResponseType {

    @XmlElementRef(name = "transactionInformation", type = JAXBElement.class, required = false)
    protected JAXBElement<ExTransactionInfoType> transactionInformation;
    @XmlElement(nillable = true)
    protected List<ExclusionSearchResultType> excludedEntity;

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
     * Gets the value of the excludedEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExclusionSearchResultType }
     * 
     * 
     */
    public List<ExclusionSearchResultType> getExcludedEntity() {
        if (excludedEntity == null) {
            excludedEntity = new ArrayList<ExclusionSearchResultType>();
        }
        return this.excludedEntity;
    }

}

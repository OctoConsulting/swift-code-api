
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for financialInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="financialInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditCardUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debtSubjectToOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listOfFinancialInformation" type="{http://www.sam.gov}listOfFinancialInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "financialInformationType", propOrder = {
    "creditCardUsage",
    "debtSubjectToOffset",
    "listOfFinancialInformation"
})
public class FinancialInformationType {

    @XmlElementRef(name = "creditCardUsage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditCardUsage;
    @XmlElementRef(name = "debtSubjectToOffset", type = JAXBElement.class, required = false)
    protected JAXBElement<String> debtSubjectToOffset;
    protected ListOfFinancialInformationType listOfFinancialInformation;

    /**
     * Gets the value of the creditCardUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditCardUsage() {
        return creditCardUsage;
    }

    /**
     * Sets the value of the creditCardUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditCardUsage(JAXBElement<String> value) {
        this.creditCardUsage = value;
    }

    /**
     * Gets the value of the debtSubjectToOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDebtSubjectToOffset() {
        return debtSubjectToOffset;
    }

    /**
     * Sets the value of the debtSubjectToOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDebtSubjectToOffset(JAXBElement<String> value) {
        this.debtSubjectToOffset = value;
    }

    /**
     * Gets the value of the listOfFinancialInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfFinancialInformationType }
     *     
     */
    public ListOfFinancialInformationType getListOfFinancialInformation() {
        return listOfFinancialInformation;
    }

    /**
     * Sets the value of the listOfFinancialInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfFinancialInformationType }
     *     
     */
    public void setListOfFinancialInformation(ListOfFinancialInformationType value) {
        this.listOfFinancialInformation = value;
    }

}

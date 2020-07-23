
package com.challenge.swiftcode.wsClient;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generalInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generalInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stateOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companySecurityLevel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="highestEmployeeSecurityLevel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="listOfBusinessTypes" type="{http://www.sam.gov}listOfBusinessTypesType" minOccurs="0"/>
 *         &lt;element name="listOfSBABusinessTypes" type="{http://www.sam.gov}listOfSBABusinessTypesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalInformationType", propOrder = {
    "stateOfIncorporation",
    "countryOfIncorporation",
    "companySecurityLevel",
    "highestEmployeeSecurityLevel",
    "listOfBusinessTypes",
    "listOfSBABusinessTypes"
})
public class GeneralInformationType {

    @XmlElementRef(name = "stateOfIncorporation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateOfIncorporation;
    @XmlElementRef(name = "countryOfIncorporation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryOfIncorporation;
    protected BigInteger companySecurityLevel;
    protected BigInteger highestEmployeeSecurityLevel;
    @XmlElementRef(name = "listOfBusinessTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfBusinessTypesType> listOfBusinessTypes;
    @XmlElementRef(name = "listOfSBABusinessTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfSBABusinessTypesType> listOfSBABusinessTypes;

    /**
     * Gets the value of the stateOfIncorporation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateOfIncorporation() {
        return stateOfIncorporation;
    }

    /**
     * Sets the value of the stateOfIncorporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateOfIncorporation(JAXBElement<String> value) {
        this.stateOfIncorporation = value;
    }

    /**
     * Gets the value of the countryOfIncorporation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryOfIncorporation() {
        return countryOfIncorporation;
    }

    /**
     * Sets the value of the countryOfIncorporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryOfIncorporation(JAXBElement<String> value) {
        this.countryOfIncorporation = value;
    }

    /**
     * Gets the value of the companySecurityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCompanySecurityLevel() {
        return companySecurityLevel;
    }

    /**
     * Sets the value of the companySecurityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCompanySecurityLevel(BigInteger value) {
        this.companySecurityLevel = value;
    }

    /**
     * Gets the value of the highestEmployeeSecurityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHighestEmployeeSecurityLevel() {
        return highestEmployeeSecurityLevel;
    }

    /**
     * Sets the value of the highestEmployeeSecurityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHighestEmployeeSecurityLevel(BigInteger value) {
        this.highestEmployeeSecurityLevel = value;
    }

    /**
     * Gets the value of the listOfBusinessTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfBusinessTypesType }{@code >}
     *     
     */
    public JAXBElement<ListOfBusinessTypesType> getListOfBusinessTypes() {
        return listOfBusinessTypes;
    }

    /**
     * Sets the value of the listOfBusinessTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfBusinessTypesType }{@code >}
     *     
     */
    public void setListOfBusinessTypes(JAXBElement<ListOfBusinessTypesType> value) {
        this.listOfBusinessTypes = value;
    }

    /**
     * Gets the value of the listOfSBABusinessTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfSBABusinessTypesType }{@code >}
     *     
     */
    public JAXBElement<ListOfSBABusinessTypesType> getListOfSBABusinessTypes() {
        return listOfSBABusinessTypes;
    }

    /**
     * Sets the value of the listOfSBABusinessTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfSBABusinessTypesType }{@code >}
     *     
     */
    public void setListOfSBABusinessTypes(JAXBElement<ListOfSBABusinessTypesType> value) {
        this.listOfSBABusinessTypes = value;
    }

}

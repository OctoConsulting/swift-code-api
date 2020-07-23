
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entityCoreDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entityCoreDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSInformation" type="{http://www.sam.gov}entityDUNSInformationType" minOccurs="0"/>
 *         &lt;element name="federalHierarchy" type="{http://www.sam.gov}federalHierarchyInformationType" minOccurs="0"/>
 *         &lt;element name="businessInformation" type="{http://www.sam.gov}businessInformationType" minOccurs="0"/>
 *         &lt;element name="TINInformation" type="{http://www.sam.gov}TINInformationType" minOccurs="0"/>
 *         &lt;element name="CAGEInformation" type="{http://www.sam.gov}CAGEInformationType" minOccurs="0"/>
 *         &lt;element name="generalInformation" type="{http://www.sam.gov}generalInformationType" minOccurs="0"/>
 *         &lt;element name="financialInformation" type="{http://www.sam.gov}financialInformationType" minOccurs="0"/>
 *         &lt;element name="listOfExecutiveCompensationQuestions" type="{http://www.sam.gov}listOfExecutiveCompensationQuestionsType" minOccurs="0"/>
 *         &lt;element name="listOfExecutiveCompensationInformation" type="{http://www.sam.gov}listOfExecutiveCompensationDetailsType" minOccurs="0"/>
 *         &lt;element name="listOfProceedingsQuestions" type="{http://www.sam.gov}listOfProceedingsQuestionsType" minOccurs="0"/>
 *         &lt;element name="listOfProceedingsInformation" type="{http://www.sam.gov}listOfProceedingsInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entityCoreDataType", propOrder = {
    "dunsInformation",
    "federalHierarchy",
    "businessInformation",
    "tinInformation",
    "cageInformation",
    "generalInformation",
    "financialInformation",
    "listOfExecutiveCompensationQuestions",
    "listOfExecutiveCompensationInformation",
    "listOfProceedingsQuestions",
    "listOfProceedingsInformation"
})
public class EntityCoreDataType {

    @XmlElement(name = "DUNSInformation")
    protected EntityDUNSInformationType dunsInformation;
    protected FederalHierarchyInformationType federalHierarchy;
    @XmlElementRef(name = "businessInformation", type = JAXBElement.class, required = false)
    protected JAXBElement<BusinessInformationType> businessInformation;
    @XmlElement(name = "TINInformation")
    protected TINInformationType tinInformation;
    @XmlElement(name = "CAGEInformation")
    protected CAGEInformationType cageInformation;
    @XmlElementRef(name = "generalInformation", type = JAXBElement.class, required = false)
    protected JAXBElement<GeneralInformationType> generalInformation;
    @XmlElementRef(name = "financialInformation", type = JAXBElement.class, required = false)
    protected JAXBElement<FinancialInformationType> financialInformation;
    protected ListOfExecutiveCompensationQuestionsType listOfExecutiveCompensationQuestions;
    protected ListOfExecutiveCompensationDetailsType listOfExecutiveCompensationInformation;
    protected ListOfProceedingsQuestionsType listOfProceedingsQuestions;
    protected ListOfProceedingsInformationType listOfProceedingsInformation;

    /**
     * Gets the value of the dunsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityDUNSInformationType }
     *     
     */
    public EntityDUNSInformationType getDUNSInformation() {
        return dunsInformation;
    }

    /**
     * Sets the value of the dunsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityDUNSInformationType }
     *     
     */
    public void setDUNSInformation(EntityDUNSInformationType value) {
        this.dunsInformation = value;
    }

    /**
     * Gets the value of the federalHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link FederalHierarchyInformationType }
     *     
     */
    public FederalHierarchyInformationType getFederalHierarchy() {
        return federalHierarchy;
    }

    /**
     * Sets the value of the federalHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link FederalHierarchyInformationType }
     *     
     */
    public void setFederalHierarchy(FederalHierarchyInformationType value) {
        this.federalHierarchy = value;
    }

    /**
     * Gets the value of the businessInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BusinessInformationType }{@code >}
     *     
     */
    public JAXBElement<BusinessInformationType> getBusinessInformation() {
        return businessInformation;
    }

    /**
     * Sets the value of the businessInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BusinessInformationType }{@code >}
     *     
     */
    public void setBusinessInformation(JAXBElement<BusinessInformationType> value) {
        this.businessInformation = value;
    }

    /**
     * Gets the value of the tinInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TINInformationType }
     *     
     */
    public TINInformationType getTINInformation() {
        return tinInformation;
    }

    /**
     * Sets the value of the tinInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TINInformationType }
     *     
     */
    public void setTINInformation(TINInformationType value) {
        this.tinInformation = value;
    }

    /**
     * Gets the value of the cageInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CAGEInformationType }
     *     
     */
    public CAGEInformationType getCAGEInformation() {
        return cageInformation;
    }

    /**
     * Sets the value of the cageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAGEInformationType }
     *     
     */
    public void setCAGEInformation(CAGEInformationType value) {
        this.cageInformation = value;
    }

    /**
     * Gets the value of the generalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeneralInformationType }{@code >}
     *     
     */
    public JAXBElement<GeneralInformationType> getGeneralInformation() {
        return generalInformation;
    }

    /**
     * Sets the value of the generalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeneralInformationType }{@code >}
     *     
     */
    public void setGeneralInformation(JAXBElement<GeneralInformationType> value) {
        this.generalInformation = value;
    }

    /**
     * Gets the value of the financialInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FinancialInformationType }{@code >}
     *     
     */
    public JAXBElement<FinancialInformationType> getFinancialInformation() {
        return financialInformation;
    }

    /**
     * Sets the value of the financialInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FinancialInformationType }{@code >}
     *     
     */
    public void setFinancialInformation(JAXBElement<FinancialInformationType> value) {
        this.financialInformation = value;
    }

    /**
     * Gets the value of the listOfExecutiveCompensationQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfExecutiveCompensationQuestionsType }
     *     
     */
    public ListOfExecutiveCompensationQuestionsType getListOfExecutiveCompensationQuestions() {
        return listOfExecutiveCompensationQuestions;
    }

    /**
     * Sets the value of the listOfExecutiveCompensationQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfExecutiveCompensationQuestionsType }
     *     
     */
    public void setListOfExecutiveCompensationQuestions(ListOfExecutiveCompensationQuestionsType value) {
        this.listOfExecutiveCompensationQuestions = value;
    }

    /**
     * Gets the value of the listOfExecutiveCompensationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfExecutiveCompensationDetailsType }
     *     
     */
    public ListOfExecutiveCompensationDetailsType getListOfExecutiveCompensationInformation() {
        return listOfExecutiveCompensationInformation;
    }

    /**
     * Sets the value of the listOfExecutiveCompensationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfExecutiveCompensationDetailsType }
     *     
     */
    public void setListOfExecutiveCompensationInformation(ListOfExecutiveCompensationDetailsType value) {
        this.listOfExecutiveCompensationInformation = value;
    }

    /**
     * Gets the value of the listOfProceedingsQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProceedingsQuestionsType }
     *     
     */
    public ListOfProceedingsQuestionsType getListOfProceedingsQuestions() {
        return listOfProceedingsQuestions;
    }

    /**
     * Sets the value of the listOfProceedingsQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProceedingsQuestionsType }
     *     
     */
    public void setListOfProceedingsQuestions(ListOfProceedingsQuestionsType value) {
        this.listOfProceedingsQuestions = value;
    }

    /**
     * Gets the value of the listOfProceedingsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProceedingsInformationType }
     *     
     */
    public ListOfProceedingsInformationType getListOfProceedingsInformation() {
        return listOfProceedingsInformation;
    }

    /**
     * Sets the value of the listOfProceedingsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProceedingsInformationType }
     *     
     */
    public void setListOfProceedingsInformation(ListOfProceedingsInformationType value) {
        this.listOfProceedingsInformation = value;
    }

}

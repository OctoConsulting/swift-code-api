
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TINSSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="CAGEList" type="{http://www.sam.gov}CAGEListType" minOccurs="0" form="qualified"/>
 *         &lt;element name="NPIList" type="{http://www.sam.gov}NPIListType" minOccurs="0" form="qualified"/>
 *         &lt;element name="ClassificationList" type="{http://www.sam.gov}ClassificationListType" minOccurs="0" form="qualified"/>
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="Individual" type="{http://www.sam.gov}IndividualType" minOccurs="0" form="qualified"/>
 *         &lt;element name="StateList" type="{http://www.sam.gov}StateListType" minOccurs="0" form="qualified"/>
 *         &lt;element name="CountryList" type="{http://www.sam.gov}CountryListType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityFilterType", propOrder = {
    "duns",
    "tinssn",
    "cageList",
    "npiList",
    "classificationList",
    "entityName",
    "individual",
    "stateList",
    "countryList"
})
public class EntityFilterType {

    @XmlElementRef(name = "DUNS", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> duns;
    @XmlElementRef(name = "TINSSN", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tinssn;
    @XmlElementRef(name = "CAGEList", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<CAGEListType> cageList;
    @XmlElementRef(name = "NPIList", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<NPIListType> npiList;
    @XmlElementRef(name = "ClassificationList", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<ClassificationListType> classificationList;
    @XmlElementRef(name = "EntityName", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityName;
    @XmlElementRef(name = "Individual", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<IndividualType> individual;
    @XmlElementRef(name = "StateList", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<StateListType> stateList;
    @XmlElementRef(name = "CountryList", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<CountryListType> countryList;

    /**
     * Gets the value of the duns property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNS() {
        return duns;
    }

    /**
     * Sets the value of the duns property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNS(JAXBElement<String> value) {
        this.duns = value;
    }

    /**
     * Gets the value of the tinssn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTINSSN() {
        return tinssn;
    }

    /**
     * Sets the value of the tinssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTINSSN(JAXBElement<String> value) {
        this.tinssn = value;
    }

    /**
     * Gets the value of the cageList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CAGEListType }{@code >}
     *     
     */
    public JAXBElement<CAGEListType> getCAGEList() {
        return cageList;
    }

    /**
     * Sets the value of the cageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CAGEListType }{@code >}
     *     
     */
    public void setCAGEList(JAXBElement<CAGEListType> value) {
        this.cageList = value;
    }

    /**
     * Gets the value of the npiList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NPIListType }{@code >}
     *     
     */
    public JAXBElement<NPIListType> getNPIList() {
        return npiList;
    }

    /**
     * Sets the value of the npiList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NPIListType }{@code >}
     *     
     */
    public void setNPIList(JAXBElement<NPIListType> value) {
        this.npiList = value;
    }

    /**
     * Gets the value of the classificationList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClassificationListType }{@code >}
     *     
     */
    public JAXBElement<ClassificationListType> getClassificationList() {
        return classificationList;
    }

    /**
     * Sets the value of the classificationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClassificationListType }{@code >}
     *     
     */
    public void setClassificationList(JAXBElement<ClassificationListType> value) {
        this.classificationList = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityName(JAXBElement<String> value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndividualType }{@code >}
     *     
     */
    public JAXBElement<IndividualType> getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndividualType }{@code >}
     *     
     */
    public void setIndividual(JAXBElement<IndividualType> value) {
        this.individual = value;
    }

    /**
     * Gets the value of the stateList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateListType }{@code >}
     *     
     */
    public JAXBElement<StateListType> getStateList() {
        return stateList;
    }

    /**
     * Sets the value of the stateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateListType }{@code >}
     *     
     */
    public void setStateList(JAXBElement<StateListType> value) {
        this.stateList = value;
    }

    /**
     * Gets the value of the countryList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CountryListType }{@code >}
     *     
     */
    public JAXBElement<CountryListType> getCountryList() {
        return countryList;
    }

    /**
     * Sets the value of the countryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CountryListType }{@code >}
     *     
     */
    public void setCountryList(JAXBElement<CountryListType> value) {
        this.countryList = value;
    }

}

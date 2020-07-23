
package com.challenge.swiftcode.wsClient;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="createUser" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0" form="qualified"/>
 *         &lt;element name="updateUser" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0" form="qualified"/>
 *         &lt;element name="legacyCreateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="legacyUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="legacyCreateUser" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0" form="qualified"/>
 *         &lt;element name="legacyUpdateUser" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0" form="qualified"/>
 *         &lt;element name="deleteDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="deleteFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionInformationType", propOrder = {
    "createDate",
    "updateDate",
    "createUser",
    "updateUser",
    "legacyCreateDate",
    "legacyUpdateDate",
    "legacyCreateUser",
    "legacyUpdateUser",
    "deleteDate",
    "deleteFlag"
})
public class TransactionInformationType {

    @XmlElementRef(name = "createDate", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createDate;
    @XmlElementRef(name = "updateDate", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> updateDate;
    @XmlElementRef(name = "createUser", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> createUser;
    @XmlElementRef(name = "updateUser", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> updateUser;
    @XmlElementRef(name = "legacyCreateDate", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legacyCreateDate;
    @XmlElementRef(name = "legacyUpdateDate", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legacyUpdateDate;
    @XmlElementRef(name = "legacyCreateUser", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> legacyCreateUser;
    @XmlElementRef(name = "legacyUpdateUser", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> legacyUpdateUser;
    @XmlElementRef(name = "deleteDate", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deleteDate;
    @XmlElementRef(name = "deleteFlag", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deleteFlag;

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreateDate(JAXBElement<String> value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpdateDate(JAXBElement<String> value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the createUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getCreateUser() {
        return createUser;
    }

    /**
     * Sets the value of the createUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setCreateUser(JAXBElement<BigInteger> value) {
        this.createUser = value;
    }

    /**
     * Gets the value of the updateUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getUpdateUser() {
        return updateUser;
    }

    /**
     * Sets the value of the updateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setUpdateUser(JAXBElement<BigInteger> value) {
        this.updateUser = value;
    }

    /**
     * Gets the value of the legacyCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegacyCreateDate() {
        return legacyCreateDate;
    }

    /**
     * Sets the value of the legacyCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegacyCreateDate(JAXBElement<String> value) {
        this.legacyCreateDate = value;
    }

    /**
     * Gets the value of the legacyUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegacyUpdateDate() {
        return legacyUpdateDate;
    }

    /**
     * Sets the value of the legacyUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegacyUpdateDate(JAXBElement<String> value) {
        this.legacyUpdateDate = value;
    }

    /**
     * Gets the value of the legacyCreateUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getLegacyCreateUser() {
        return legacyCreateUser;
    }

    /**
     * Sets the value of the legacyCreateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setLegacyCreateUser(JAXBElement<BigInteger> value) {
        this.legacyCreateUser = value;
    }

    /**
     * Gets the value of the legacyUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getLegacyUpdateUser() {
        return legacyUpdateUser;
    }

    /**
     * Sets the value of the legacyUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setLegacyUpdateUser(JAXBElement<BigInteger> value) {
        this.legacyUpdateUser = value;
    }

    /**
     * Gets the value of the deleteDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeleteDate() {
        return deleteDate;
    }

    /**
     * Sets the value of the deleteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeleteDate(JAXBElement<String> value) {
        this.deleteDate = value;
    }

    /**
     * Gets the value of the deleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Sets the value of the deleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeleteFlag(JAXBElement<String> value) {
        this.deleteFlag = value;
    }

}

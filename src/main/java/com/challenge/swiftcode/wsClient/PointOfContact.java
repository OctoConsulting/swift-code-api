
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOfContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOfContact">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}businessObjectType">
 *       &lt;sequence>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="internationalNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfContact", propOrder = {
    "firstName",
    "mi",
    "lastName",
    "title",
    "telephoneNumber",
    "extension",
    "internationalNum"
})
public class PointOfContact
    extends BusinessObjectType
{

    @XmlElement(required = true)
    protected String firstName;
    protected String mi;
    protected String lastName;
    protected String title;
    protected int telephoneNumber;
    protected int extension;
    protected int internationalNum;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the mi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMi() {
        return mi;
    }

    /**
     * Sets the value of the mi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMi(String value) {
        this.mi = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     */
    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     */
    public void setTelephoneNumber(int value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     */
    public int getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     */
    public void setExtension(int value) {
        this.extension = value;
    }

    /**
     * Gets the value of the internationalNum property.
     * 
     */
    public int getInternationalNum() {
        return internationalNum;
    }

    /**
     * Sets the value of the internationalNum property.
     * 
     */
    public void setInternationalNum(int value) {
        this.internationalNum = value;
    }

}

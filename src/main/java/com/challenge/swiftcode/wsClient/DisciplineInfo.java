
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisciplineInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisciplineInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}businessObjectType">
 *       &lt;sequence>
 *         &lt;element name="displineID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firmNumOfEmployees" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="branchNumOfEmployees" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="disciplineDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisciplineInfo", propOrder = {
    "displineID",
    "firmNumOfEmployees",
    "branchNumOfEmployees",
    "disciplineDescription"
})
public class DisciplineInfo
    extends BusinessObjectType
{

    @XmlElement(required = true)
    protected String displineID;
    protected int firmNumOfEmployees;
    protected int branchNumOfEmployees;
    @XmlElement(required = true)
    protected String disciplineDescription;

    /**
     * Gets the value of the displineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplineID() {
        return displineID;
    }

    /**
     * Sets the value of the displineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplineID(String value) {
        this.displineID = value;
    }

    /**
     * Gets the value of the firmNumOfEmployees property.
     * 
     */
    public int getFirmNumOfEmployees() {
        return firmNumOfEmployees;
    }

    /**
     * Sets the value of the firmNumOfEmployees property.
     * 
     */
    public void setFirmNumOfEmployees(int value) {
        this.firmNumOfEmployees = value;
    }

    /**
     * Gets the value of the branchNumOfEmployees property.
     * 
     */
    public int getBranchNumOfEmployees() {
        return branchNumOfEmployees;
    }

    /**
     * Sets the value of the branchNumOfEmployees property.
     * 
     */
    public void setBranchNumOfEmployees(int value) {
        this.branchNumOfEmployees = value;
    }

    /**
     * Gets the value of the disciplineDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplineDescription() {
        return disciplineDescription;
    }

    /**
     * Sets the value of the disciplineDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplineDescription(String value) {
        this.disciplineDescription = value;
    }

}

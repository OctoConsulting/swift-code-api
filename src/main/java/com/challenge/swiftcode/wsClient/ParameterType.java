
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameterName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="parameterType" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="parameterValue" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parameterType", propOrder = {
    "parameterName",
    "parameterType",
    "parameterValue"
})
public class ParameterType {

    @XmlElement(namespace = "http://www.sam.gov", required = true)
    protected String parameterName;
    @XmlElement(namespace = "http://www.sam.gov", required = true)
    protected String parameterType;
    @XmlElement(namespace = "http://www.sam.gov", required = true)
    protected String parameterValue;

    /**
     * Gets the value of the parameterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * Sets the value of the parameterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterName(String value) {
        this.parameterName = value;
    }

    /**
     * Gets the value of the parameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterType() {
        return parameterType;
    }

    /**
     * Sets the value of the parameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterType(String value) {
        this.parameterType = value;
    }

    /**
     * Gets the value of the parameterValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterValue() {
        return parameterValue;
    }

    /**
     * Sets the value of the parameterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterValue(String value) {
        this.parameterValue = value;
    }

}

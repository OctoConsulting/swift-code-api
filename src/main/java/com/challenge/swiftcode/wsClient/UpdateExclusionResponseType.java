
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateExclusionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateExclusionResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}responseType">
 *       &lt;sequence>
 *         &lt;element name="exclusion" type="{http://www.sam.gov}exclusionType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateExclusionResponseType", propOrder = {
    "exclusion"
})
public class UpdateExclusionResponseType
    extends ResponseType
{

    @XmlElementRef(name = "exclusion", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclusionType> exclusion;

    /**
     * Gets the value of the exclusion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclusionType }{@code >}
     *     
     */
    public JAXBElement<ExclusionType> getExclusion() {
        return exclusion;
    }

    /**
     * Sets the value of the exclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclusionType }{@code >}
     *     
     */
    public void setExclusion(JAXBElement<ExclusionType> value) {
        this.exclusion = value;
    }

}

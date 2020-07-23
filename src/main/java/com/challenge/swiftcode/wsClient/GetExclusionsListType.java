
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getExclusionsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getExclusionsListType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}responseType">
 *       &lt;sequence>
 *         &lt;element name="listOfExclusions" type="{http://www.sam.gov}listOfExclusionsType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExclusionsListType", propOrder = {
    "listOfExclusions"
})
public class GetExclusionsListType
    extends ResponseType
{

    @XmlElementRef(name = "listOfExclusions", namespace = "http://www.sam.gov", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfExclusionsType> listOfExclusions;

    /**
     * Gets the value of the listOfExclusions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfExclusionsType }{@code >}
     *     
     */
    public JAXBElement<ListOfExclusionsType> getListOfExclusions() {
        return listOfExclusions;
    }

    /**
     * Sets the value of the listOfExclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfExclusionsType }{@code >}
     *     
     */
    public void setListOfExclusions(JAXBElement<ListOfExclusionsType> value) {
        this.listOfExclusions = value;
    }

}

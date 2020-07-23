
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessObjectAnswerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessObjectAnswerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sam.gov}answerType">
 *       &lt;sequence>
 *         &lt;element name="businessObject" type="{http://www.sam.gov}businessObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessObjectAnswerType", propOrder = {
    "businessObject"
})
public class BusinessObjectAnswerType
    extends AnswerType
{

    @XmlElement(nillable = true)
    protected List<BusinessObjectType> businessObject;

    /**
     * Gets the value of the businessObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessObjectType }
     * 
     * 
     */
    public List<BusinessObjectType> getBusinessObject() {
        if (businessObject == null) {
            businessObject = new ArrayList<BusinessObjectType>();
        }
        return this.businessObject;
    }

}


package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listOfProceedingsQuestionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfProceedingsQuestionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proceedingsQuestion" type="{http://www.sam.gov}simpleQuestionAnswerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfProceedingsQuestionsType", propOrder = {
    "proceedingsQuestion"
})
public class ListOfProceedingsQuestionsType {

    @XmlElement(nillable = true)
    protected List<SimpleQuestionAnswerType> proceedingsQuestion;

    /**
     * Gets the value of the proceedingsQuestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proceedingsQuestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProceedingsQuestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleQuestionAnswerType }
     * 
     * 
     */
    public List<SimpleQuestionAnswerType> getProceedingsQuestion() {
        if (proceedingsQuestion == null) {
            proceedingsQuestion = new ArrayList<SimpleQuestionAnswerType>();
        }
        return this.proceedingsQuestion;
    }

}

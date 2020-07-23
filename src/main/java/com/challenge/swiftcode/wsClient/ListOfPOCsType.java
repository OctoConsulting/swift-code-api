
package com.challenge.swiftcode.wsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listOfPOCsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfPOCsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="governmentBusinessPOC" type="{http://www.sam.gov}POCTypes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="altGovernmentBusinessPOC" type="{http://www.sam.gov}POCTypes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pastPerformancePOC" type="{http://www.sam.gov}POCTypes" maxOccurs="unbounded"/>
 *         &lt;element name="altPastPerformancePOC" type="{http://www.sam.gov}POCTypes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="electronicBusinessPOC" type="{http://www.sam.gov}POCTypes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="altElectronicBusinessPOC" type="{http://www.sam.gov}POCTypes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyPerformingCertificationPOC" type="{http://www.sam.gov}POCTypes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="soleProprietorshipPOC" type="{http://www.sam.gov}POCTypes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accountsReceivablePOC" type="{http://www.sam.gov}POCTypes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accountsPayablePOC" type="{http://www.sam.gov}POCTypes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EDIPOC" type="{http://www.sam.gov}POCTypes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="proceedingsPOC" type="{http://www.sam.gov}POCTypes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="altProceedingsPOC" type="{http://www.sam.gov}POCTypes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eliminationsPOC" type="{http://www.sam.gov}POCTypes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="salesPOC" type="{http://www.sam.gov}POCTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfPOCsType", propOrder = {
    "governmentBusinessPOC",
    "altGovernmentBusinessPOC",
    "pastPerformancePOC",
    "altPastPerformancePOC",
    "electronicBusinessPOC",
    "altElectronicBusinessPOC",
    "partyPerformingCertificationPOC",
    "soleProprietorshipPOC",
    "accountsReceivablePOC",
    "accountsPayablePOC",
    "edipoc",
    "proceedingsPOC",
    "altProceedingsPOC",
    "eliminationsPOC",
    "salesPOC"
})
public class ListOfPOCsType {

    @XmlElement(nillable = true)
    protected List<POCTypes> governmentBusinessPOC;
    @XmlElement(nillable = true)
    protected List<POCTypes> altGovernmentBusinessPOC;
    @XmlElement(required = true, nillable = true)
    protected List<POCTypes> pastPerformancePOC;
    @XmlElement(nillable = true)
    protected List<POCTypes> altPastPerformancePOC;
    @XmlElement(nillable = true)
    protected List<POCTypes> electronicBusinessPOC;
    @XmlElement(nillable = true)
    protected List<POCTypes> altElectronicBusinessPOC;
    @XmlElement(nillable = true)
    protected List<POCTypes> partyPerformingCertificationPOC;
    @XmlElement(nillable = true)
    protected List<POCTypes> soleProprietorshipPOC;
    @XmlElement(nillable = true)
    protected List<POCTypes> accountsReceivablePOC;
    @XmlElement(nillable = true)
    protected List<POCTypes> accountsPayablePOC;
    @XmlElement(name = "EDIPOC")
    protected List<POCTypes> edipoc;
    @XmlElement(nillable = true)
    protected List<POCTypes> proceedingsPOC;
    @XmlElement(nillable = true)
    protected List<POCTypes> altProceedingsPOC;
    @XmlElement(nillable = true)
    protected List<POCTypes> eliminationsPOC;
    @XmlElement(nillable = true)
    protected List<POCTypes> salesPOC;

    /**
     * Gets the value of the governmentBusinessPOC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the governmentBusinessPOC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovernmentBusinessPOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCTypes }
     * 
     * 
     */
    public List<POCTypes> getGovernmentBusinessPOC() {
        if (governmentBusinessPOC == null) {
            governmentBusinessPOC = new ArrayList<POCTypes>();
        }
        return this.governmentBusinessPOC;
    }

    /**
     * Gets the value of the altGovernmentBusinessPOC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altGovernmentBusinessPOC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltGovernmentBusinessPOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCTypes }
     * 
     * 
     */
    public List<POCTypes> getAltGovernmentBusinessPOC() {
        if (altGovernmentBusinessPOC == null) {
            altGovernmentBusinessPOC = new ArrayList<POCTypes>();
        }
        return this.altGovernmentBusinessPOC;
    }

    /**
     * Gets the value of the pastPerformancePOC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pastPerformancePOC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPastPerformancePOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCTypes }
     * 
     * 
     */
    public List<POCTypes> getPastPerformancePOC() {
        if (pastPerformancePOC == null) {
            pastPerformancePOC = new ArrayList<POCTypes>();
        }
        return this.pastPerformancePOC;
    }

    /**
     * Gets the value of the altPastPerformancePOC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altPastPerformancePOC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltPastPerformancePOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCTypes }
     * 
     * 
     */
    public List<POCTypes> getAltPastPerformancePOC() {
        if (altPastPerformancePOC == null) {
            altPastPerformancePOC = new ArrayList<POCTypes>();
        }
        return this.altPastPerformancePOC;
    }

    /**
     * Gets the value of the electronicBusinessPOC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicBusinessPOC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicBusinessPOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCTypes }
     * 
     * 
     */
    public List<POCTypes> getElectronicBusinessPOC() {
        if (electronicBusinessPOC == null) {
            electronicBusinessPOC = new ArrayList<POCTypes>();
        }
        return this.electronicBusinessPOC;
    }

    /**
     * Gets the value of the altElectronicBusinessPOC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altElectronicBusinessPOC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltElectronicBusinessPOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCTypes }
     * 
     * 
     */
    public List<POCTypes> getAltElectronicBusinessPOC() {
        if (altElectronicBusinessPOC == null) {
            altElectronicBusinessPOC = new ArrayList<POCTypes>();
        }
        return this.altElectronicBusinessPOC;
    }

    /**
     * Gets the value of the partyPerformingCertificationPOC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyPerformingCertificationPOC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyPerformingCertificationPOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCTypes }
     * 
     * 
     */
    public List<POCTypes> getPartyPerformingCertificationPOC() {
        if (partyPerformingCertificationPOC == null) {
            partyPerformingCertificationPOC = new ArrayList<POCTypes>();
        }
        return this.partyPerformingCertificationPOC;
    }

    /**
     * Gets the value of the soleProprietorshipPOC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soleProprietorshipPOC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoleProprietorshipPOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCTypes }
     * 
     * 
     */
    public List<POCTypes> getSoleProprietorshipPOC() {
        if (soleProprietorshipPOC == null) {
            soleProprietorshipPOC = new ArrayList<POCTypes>();
        }
        return this.soleProprietorshipPOC;
    }

    /**
     * Gets the value of the accountsReceivablePOC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountsReceivablePOC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountsReceivablePOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCTypes }
     * 
     * 
     */
    public List<POCTypes> getAccountsReceivablePOC() {
        if (accountsReceivablePOC == null) {
            accountsReceivablePOC = new ArrayList<POCTypes>();
        }
        return this.accountsReceivablePOC;
    }

    /**
     * Gets the value of the accountsPayablePOC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountsPayablePOC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountsPayablePOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCTypes }
     * 
     * 
     */
    public List<POCTypes> getAccountsPayablePOC() {
        if (accountsPayablePOC == null) {
            accountsPayablePOC = new ArrayList<POCTypes>();
        }
        return this.accountsPayablePOC;
    }

    /**
     * Gets the value of the edipoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edipoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEDIPOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCTypes }
     * 
     * 
     */
    public List<POCTypes> getEDIPOC() {
        if (edipoc == null) {
            edipoc = new ArrayList<POCTypes>();
        }
        return this.edipoc;
    }

    /**
     * Gets the value of the proceedingsPOC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proceedingsPOC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProceedingsPOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCTypes }
     * 
     * 
     */
    public List<POCTypes> getProceedingsPOC() {
        if (proceedingsPOC == null) {
            proceedingsPOC = new ArrayList<POCTypes>();
        }
        return this.proceedingsPOC;
    }

    /**
     * Gets the value of the altProceedingsPOC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altProceedingsPOC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltProceedingsPOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCTypes }
     * 
     * 
     */
    public List<POCTypes> getAltProceedingsPOC() {
        if (altProceedingsPOC == null) {
            altProceedingsPOC = new ArrayList<POCTypes>();
        }
        return this.altProceedingsPOC;
    }

    /**
     * Gets the value of the eliminationsPOC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eliminationsPOC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEliminationsPOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCTypes }
     * 
     * 
     */
    public List<POCTypes> getEliminationsPOC() {
        if (eliminationsPOC == null) {
            eliminationsPOC = new ArrayList<POCTypes>();
        }
        return this.eliminationsPOC;
    }

    /**
     * Gets the value of the salesPOC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesPOC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesPOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCTypes }
     * 
     * 
     */
    public List<POCTypes> getSalesPOC() {
        if (salesPOC == null) {
            salesPOC = new ArrayList<POCTypes>();
        }
        return this.salesPOC;
    }

}

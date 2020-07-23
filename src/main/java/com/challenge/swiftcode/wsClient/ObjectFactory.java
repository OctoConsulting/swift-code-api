
package com.challenge.swiftcode.wsClient;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.challenge.swiftcode.wsClient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SBASizeRequest_QNAME = new QName("http://www.sam.gov", "SBASizeRequest");
    private final static QName _SystemException_QNAME = new QName("http://www.sam.gov", "SystemException");
    private final static QName _SBAFormallyDeterminedSizes_QNAME = new QName("http://www.sam.gov", "SBAFormallyDeterminedSizes");
    private final static QName _ListOfSBAManualCertificationUpdate_QNAME = new QName("http://www.sam.gov", "listOfSBAManualCertificationUpdate");
    private final static QName _SBASizeResponse_QNAME = new QName("http://www.sam.gov", "SBASizeResponse");
    private final static QName _SBAManualCertificationUpdateRequest_QNAME = new QName("http://www.sam.gov", "SBAManualCertificationUpdateRequest");
    private final static QName _Exdescription_QNAME = new QName("http://www.sam.gov", "exdescription");
    private final static QName _SearchCriteria_QNAME = new QName("http://www.sam.gov", "searchCriteria");
    private final static QName _SizeMetrics_QNAME = new QName("http://www.sam.gov", "sizeMetrics");
    private final static QName _SBAManualCertificationUpdate_QNAME = new QName("http://www.sam.gov", "SBAManualCertificationUpdate");
    private final static QName _ListOfSBASize_QNAME = new QName("http://www.sam.gov", "listOfSBASize");
    private final static QName _ListOfAddresses_QNAME = new QName("http://www.sam.gov", "listOfAddresses");
    private final static QName _ListOfEntities_QNAME = new QName("http://www.sam.gov", "listOfEntities");
    private final static QName _CrossReferenceExclusion_QNAME = new QName("http://www.sam.gov", "crossReferenceExclusion");
    private final static QName _Exclusion_QNAME = new QName("http://www.sam.gov", "exclusion");
    private final static QName _Response_QNAME = new QName("http://www.sam.gov", "response");
    private final static QName _ListOfComments_QNAME = new QName("http://www.sam.gov", "listOfComments");
    private final static QName _SBAManualCertificationUpdateResponse_QNAME = new QName("http://www.sam.gov", "SBAManualCertificationUpdateResponse");
    private final static QName _DisasterReliefArea_QNAME = new QName("http://www.sam.gov", "disasterReliefArea");
    private final static QName _SBASize_QNAME = new QName("http://www.sam.gov", "SBASize");
    private final static QName _AdditionalComments_QNAME = new QName("http://www.sam.gov", "additionalComments");
    private final static QName _ApplicationException_QNAME = new QName("http://www.sam.gov", "ApplicationException");
    private final static QName _ListOfExclusionStateCountry_QNAME = new QName("http://www.sam.gov", "listOfExclusionStateCountry");
    private final static QName _AlternateAddress_QNAME = new QName("http://www.sam.gov", "alternateAddress");
    private final static QName _Entity_QNAME = new QName("http://www.sam.gov", "entity");
    private final static QName _ListOfPOCs_QNAME = new QName("http://www.sam.gov", "listOfPOCs");
    private final static QName _OperationType_QNAME = new QName("http://www.sam.gov", "OperationType");
    private final static QName _GovernmentBusinessPOC_QNAME = new QName("http://www.sam.gov", "GovernmentBusinessPOC");
    private final static QName _GetEntities_QNAME = new QName("http://www.sam.gov", "getEntities");
    private final static QName _ListOfProceedingsInformation_QNAME = new QName("http://www.sam.gov", "listOfProceedingsInformation");
    private final static QName _POC_QNAME = new QName("http://www.sam.gov", "POC");
    private final static QName _ListOfCrossReferenceExclusions_QNAME = new QName("http://www.sam.gov", "listOfCrossReferenceExclusions");
    private final static QName _Address_QNAME = new QName("http://www.sam.gov", "address");
    private final static QName _AddressInfo_QNAME = new QName("http://www.sam.gov", "addressInfo");
    private final static QName _ListOfExclusions_QNAME = new QName("http://www.sam.gov", "listOfExclusions");
    private final static QName _MoveFedNodeResponse_QNAME = new QName("http://www.sam.gov", "moveFedNodeResponse");
    private final static QName _IndividualTypePrefix_QNAME = new QName("http://www.sam.gov", "prefix");
    private final static QName _IndividualTypeLast_QNAME = new QName("http://www.sam.gov", "last");
    private final static QName _IndividualTypeMiddle_QNAME = new QName("http://www.sam.gov", "middle");
    private final static QName _IndividualTypeFirst_QNAME = new QName("http://www.sam.gov", "first");
    private final static QName _IndividualTypeSuffix_QNAME = new QName("http://www.sam.gov", "suffix");
    private final static QName _FederalHierarchyInformationTypeHierarchyDepartmentCode_QNAME = new QName("", "hierarchyDepartmentCode");
    private final static QName _FederalHierarchyInformationTypeHierarchyAgencyName_QNAME = new QName("", "hierarchyAgencyName");
    private final static QName _FederalHierarchyInformationTypeHierarchyDepartmentName_QNAME = new QName("", "hierarchyDepartmentName");
    private final static QName _FederalHierarchyInformationTypeHierarchyOfficeCode_QNAME = new QName("", "hierarchyOfficeCode");
    private final static QName _FederalHierarchyInformationTypeHierarchyAgencyCode_QNAME = new QName("", "hierarchyAgencyCode");
    private final static QName _FAMTREEMBRTypePRIMNME_QNAME = new QName("http://www.sam.gov", "PRIM_NME");
    private final static QName _FAMTREEMBRTypeSTRTYR_QNAME = new QName("http://www.sam.gov", "STRT_YR");
    private final static QName _FAMTREEMBRTypeFAMTREEMBR_QNAME = new QName("http://www.sam.gov", "FAM_TREE_MBR");
    private final static QName _FAMTREEMBRTypeOUTBUSIND_QNAME = new QName("http://www.sam.gov", "OUT_BUS_IND");
    private final static QName _FAMTREEMBRTypeBRIND_QNAME = new QName("http://www.sam.gov", "BR_IND");
    private final static QName _FAMTREEMBRTypePOSTCODE_QNAME = new QName("http://www.sam.gov", "POST_CODE");
    private final static QName _FAMTREEMBRTypeBUSREGNNBRTYPECD_QNAME = new QName("http://www.sam.gov", "BUS_REGN_NBR_TYPE_CD");
    private final static QName _FAMTREEMBRTypeHQDUNS_QNAME = new QName("http://www.sam.gov", "HQ_DUNS");
    private final static QName _FAMTREEMBRTypeBUSREGNNBR_QNAME = new QName("http://www.sam.gov", "BUS_REGN_NBR");
    private final static QName _FAMTREEMBRTypeLOCNSTAT_QNAME = new QName("http://www.sam.gov", "LOCN_STAT");
    private final static QName _FAMTREEMBRTypePRIMSIC_QNAME = new QName("http://www.sam.gov", "PRIM_SIC");
    private final static QName _FAMTREEMBRTypeCTRYCD_QNAME = new QName("http://www.sam.gov", "CTRY_CD");
    private final static QName _FAMTREEMBRTypeSICTYPECD_QNAME = new QName("http://www.sam.gov", "SIC_TYPE_CD");
    private final static QName _FAMTREEMBRTypeTRDGSTYL_QNAME = new QName("http://www.sam.gov", "TRDG_STYL");
    private final static QName _FAMTREEMBRTypeFAXNBR_QNAME = new QName("http://www.sam.gov", "FAX_NBR");
    private final static QName _FAMTREEMBRTypeGBLULTPNTDUNS_QNAME = new QName("http://www.sam.gov", "GBL_ULT_PNT_DUNS");
    private final static QName _FAMTREEMBRTypeTLCMNBR_QNAME = new QName("http://www.sam.gov", "TLCM_NBR");
    private final static QName _FAMTREEMBRTypeADRLINE_QNAME = new QName("http://www.sam.gov", "ADR_LINE");
    private final static QName _FAMTREEMBRTypeSCDYGEOAREA_QNAME = new QName("http://www.sam.gov", "SCDY_GEO_AREA");
    private final static QName _FAMTREEMBRTypeBUSSTRU_QNAME = new QName("http://www.sam.gov", "BUS_STRU");
    private final static QName _FAMTREEMBRTypePRIMGEOAREA_QNAME = new QName("http://www.sam.gov", "PRIM_GEO_AREA");
    private final static QName _FAMTREEMBRTypeDOMULTPNTDUNS_QNAME = new QName("http://www.sam.gov", "DOM_ULT_PNT_DUNS");
    private final static QName _FAMTREEMBRTypeDUNSNBR_QNAME = new QName("http://www.sam.gov", "DUNS_NBR");
    private final static QName _FAMTREEMBRTypePOSTTOWN_QNAME = new QName("http://www.sam.gov", "POST_TOWN");
    private final static QName _FAMTREEMBRTypeINTLDLNGCD_QNAME = new QName("http://www.sam.gov", "INTL_DLNG_CD");
    private final static QName _FAMTREEMBRTypePNTDUNS_QNAME = new QName("http://www.sam.gov", "PNT_DUNS");
    private final static QName _RSUSSPCLEVNTTypeUSSPCLEVNTGRPUSDTOFDATA_QNAME = new QName("http://www.sam.gov", "US_DT_OF_DATA");
    private final static QName _RSUSSPCLEVNTTypeUSSPCLEVNTGRPUSSPCLEVNTTXT_QNAME = new QName("http://www.sam.gov", "US_SPCL_EVNT_TXT");
    private final static QName _ExclusionFilterDebarringAgencies_QNAME = new QName("http://www.sam.gov", "DebarringAgencies");
    private final static QName _ExclusionFilterExclusionTypes_QNAME = new QName("http://www.sam.gov", "ExclusionTypes");
    private final static QName _ExclusionFilterCTCodes_QNAME = new QName("http://www.sam.gov", "CTCodes");
    private final static QName _DisasterReliefDataTypeDisasterReliefArea_QNAME = new QName("", "disasterReliefArea");
    private final static QName _DisasterReliefDataTypeListOfBondingLevels_QNAME = new QName("", "listOfBondingLevels");
    private final static QName _ExclusionCommentTypeDescriptionId_QNAME = new QName("http://www.sam.gov", "descriptionId");
    private final static QName _ExclusionSearchCountResponseTypeCounts_QNAME = new QName("", "counts");
    private final static QName _ExclusionSearchCountResponseTypeTransactionInformation_QNAME = new QName("", "transactionInformation");
    private final static QName _SBAFormallyDeterminedSizesTypeEmployeeSize_QNAME = new QName("http://www.sam.gov", "employeeSize");
    private final static QName _SBAFormallyDeterminedSizesTypeTotalAssets_QNAME = new QName("http://www.sam.gov", "totalAssets");
    private final static QName _SBAFormallyDeterminedSizesTypeRevenueSize_QNAME = new QName("http://www.sam.gov", "revenueSize");
    private final static QName _SBAFormallyDeterminedSizesTypeOilBarrel_QNAME = new QName("http://www.sam.gov", "oilBarrel");
    private final static QName _SBAFormallyDeterminedSizesTypeMegawattHours_QNAME = new QName("http://www.sam.gov", "megawattHours");
    private final static QName _SBAFormallyDeterminedSizesTypeDeterminationDate_QNAME = new QName("http://www.sam.gov", "determinationDate");
    private final static QName _RSSTATUSTypeSUPPORTMESSAGE_QNAME = new QName("http://www.sam.gov", "SUPPORT_MESSAGE");
    private final static QName _RSSTATUSTypeCODE_QNAME = new QName("http://www.sam.gov", "CODE");
    private final static QName _RSSTATUSTypeTECHMESSAGE_QNAME = new QName("http://www.sam.gov", "TECH_MESSAGE");
    private final static QName _RSSTATUSTypeMESSAGE_QNAME = new QName("http://www.sam.gov", "MESSAGE");
    private final static QName _RSSTATUSTypeSEVERITY_QNAME = new QName("http://www.sam.gov", "SEVERITY");
    private final static QName _MapItemTypeValue_QNAME = new QName("", "value");
    private final static QName _MapItemTypeKey_QNAME = new QName("", "key");
    private final static QName _EDIInformationTypeISAQualifier_QNAME = new QName("", "ISAQualifier");
    private final static QName _EDIInformationTypeISAIdentifier_QNAME = new QName("", "ISAIdentifier");
    private final static QName _EDIInformationTypeVANProvider_QNAME = new QName("", "VANProvider");
    private final static QName _EDIInformationTypeFunctionalGroupIdentifier_QNAME = new QName("", "functionalGroupIdentifier");
    private final static QName _EDIInformationTypeRequestFlag820S_QNAME = new QName("", "requestFlag820s");
    private final static QName _AddressTypesStateOrProvince_QNAME = new QName("", "stateOrProvince");
    private final static QName _AddressTypesCity_QNAME = new QName("", "city");
    private final static QName _AddressTypesAddressLine1_QNAME = new QName("", "addressLine1");
    private final static QName _AddressTypesAddressLine2_QNAME = new QName("", "addressLine2");
    private final static QName _AddAlternateAddressResponseTypeIsAdded_QNAME = new QName("http://www.sam.gov", "isAdded");
    private final static QName _AlternateAddressTypeIdentificationInformation_QNAME = new QName("http://www.sam.gov", "identificationInformation");
    private final static QName _AlternateAddressTypeTransactionInformation_QNAME = new QName("http://www.sam.gov", "transactionInformation");
    private final static QName _MoveFedNodeResponseOutputMessages_QNAME = new QName("http://www.sam.gov", "outputMessages");
    private final static QName _ExclusionSearchResultTypeExclusionProgram_QNAME = new QName("", "exclusionProgram");
    private final static QName _ExclusionSearchResultTypeListOfactions_QNAME = new QName("", "listOfactions");
    private final static QName _ExclusionSearchResultTypeExclusionType_QNAME = new QName("", "exclusionType");
    private final static QName _IdentificationInformationTypeDUNSNumber_QNAME = new QName("http://www.sam.gov", "DUNSNumber");
    private final static QName _IdentificationInformationTypeNPI_QNAME = new QName("http://www.sam.gov", "NPI");
    private final static QName _IdentificationInformationTypeOrganizationName_QNAME = new QName("http://www.sam.gov", "organizationName");
    private final static QName _IdentificationInformationTypeListOfAlternateAddress_QNAME = new QName("http://www.sam.gov", "listOfAlternateAddress");
    private final static QName _IdentificationInformationTypeFirstName_QNAME = new QName("http://www.sam.gov", "firstName");
    private final static QName _IdentificationInformationTypeLastName_QNAME = new QName("http://www.sam.gov", "lastName");
    private final static QName _IdentificationInformationTypeMiddleName_QNAME = new QName("http://www.sam.gov", "middleName");
    private final static QName _IdentificationInformationTypeCageCode_QNAME = new QName("http://www.sam.gov", "cageCode");
    private final static QName _IdentificationInformationTypePrimaryAddress_QNAME = new QName("http://www.sam.gov", "primaryAddress");
    private final static QName _IdentificationInformationTypeTIN_QNAME = new QName("http://www.sam.gov", "TIN");
    private final static QName _FARResponseTypeListOfProvisions_QNAME = new QName("", "listOfProvisions");
    private final static QName _ExclusionAgencyUIDTypeUidType_QNAME = new QName("", "uidType");
    private final static QName _ExclusionAgencyUIDTypeUidValue_QNAME = new QName("", "uidValue");
    private final static QName _RepsAndCertsTypeQualifications_QNAME = new QName("", "qualifications");
    private final static QName _RepsAndCertsTypeFinancialAssistanceCertifications_QNAME = new QName("", "financialAssistanceCertifications");
    private final static QName _RepsAndCertsTypeCertifications_QNAME = new QName("", "certifications");
    private final static QName _UpdateAlternateAddressResponseTypeIsUpdated_QNAME = new QName("http://www.sam.gov", "isUpdated");
    private final static QName _FinancialAssistanceResponseURLsTypePDFURL_QNAME = new QName("", "PDFURL");
    private final static QName _SizeMetricDetailsTypeIndustrySpecificSizeMetrics_QNAME = new QName("", "industrySpecificSizeMetrics");
    private final static QName _SizeMetricDetailsTypeReceiptsLocation_QNAME = new QName("", "receiptsLocation");
    private final static QName _SizeMetricDetailsTypeEmployeesLocation_QNAME = new QName("", "employeesLocation");
    private final static QName _OperationExclusionHistoryTypeModifyDate_QNAME = new QName("", "modifyDate");
    private final static QName _OperationExclusionHistoryTypePeriodicity_QNAME = new QName("", "periodicity");
    private final static QName _OperationExclusionHistoryTypeTermDate_QNAME = new QName("", "termDate");
    private final static QName _OperationExclusionHistoryTypeActionDate_QNAME = new QName("", "actionDate");
    private final static QName _OperationExclusionHistoryTypeCreateDate_QNAME = new QName("", "createDate");
    private final static QName _OperationExclusionHistoryTypeDeleteDate_QNAME = new QName("", "deleteDate");
    private final static QName _POCTypeEmailAddress_QNAME = new QName("http://www.sam.gov", "emailAddress");
    private final static QName _POCTypePOCId_QNAME = new QName("http://www.sam.gov", "POCId");
    private final static QName _POCTypeMiddleInitial_QNAME = new QName("http://www.sam.gov", "middleInitial");
    private final static QName _POCTypeUSPhoneExtension_QNAME = new QName("http://www.sam.gov", "USPhoneExtension");
    private final static QName _POCTypeUSPhone_QNAME = new QName("http://www.sam.gov", "USPhone");
    private final static QName _POCTypeFax_QNAME = new QName("http://www.sam.gov", "fax");
    private final static QName _POCTypePOCType_QNAME = new QName("http://www.sam.gov", "POCType");
    private final static QName _POCTypeNotes_QNAME = new QName("http://www.sam.gov", "notes");
    private final static QName _POCTypeTitle_QNAME = new QName("http://www.sam.gov", "title");
    private final static QName _POCTypeNonUSPhone_QNAME = new QName("http://www.sam.gov", "nonUSPhone");
    private final static QName _EntityIdentificationTypeDUNSNumber_QNAME = new QName("", "DUNSNumber");
    private final static QName _DeleteExclusionResponseTypeIsDeleted_QNAME = new QName("http://www.sam.gov", "isDeleted");
    private final static QName _RSUSPRNTBKCYCONVGRPTypeUSPRNTBKCYCHCONV_QNAME = new QName("http://www.sam.gov", "US_PRNT_BKCY_CH_CONV");
    private final static QName _RSUSPRNTBKCYCONVGRPTypeUSPRNTBKCYCONVDT_QNAME = new QName("http://www.sam.gov", "US_PRNT_BKCY_CONV_DT");
    private final static QName _EFTInformationTypeABARoutingNumber_QNAME = new QName("", "ABARoutingNumber");
    private final static QName _EFTInformationTypeLockboxNumber_QNAME = new QName("", "lockboxNumber");
    private final static QName _EFTInformationTypeAccountType_QNAME = new QName("", "accountType");
    private final static QName _EFTInformationTypeEFTWaiver_QNAME = new QName("", "EFTWaiver");
    private final static QName _EFTInformationTypeFinancialInstitute_QNAME = new QName("", "financialInstitute");
    private final static QName _EFTInformationTypeAccountNumber_QNAME = new QName("", "accountNumber");
    private final static QName _SBACertificationTypeSBAEntryDate_QNAME = new QName("http://www.sam.gov", "SBAEntryDate");
    private final static QName _SBACertificationTypeSBAExitDate_QNAME = new QName("http://www.sam.gov", "SBAExitDate");
    private final static QName _SBACertificationTypeSBACertificationProgram_QNAME = new QName("http://www.sam.gov", "SBACertificationProgram");
    private final static QName _MailingAddressTypesAddress_QNAME = new QName("", "address");
    private final static QName _ExclusionAddressTypeCountry_QNAME = new QName("", "country");
    private final static QName _ExclusionAddressTypeProvince_QNAME = new QName("", "province");
    private final static QName _ExclusionAddressTypeZipOrPostalcode_QNAME = new QName("", "zipOrPostalcode");
    private final static QName _ExclusionAddressTypeStreet1_QNAME = new QName("", "street1");
    private final static QName _ExclusionAddressTypeStreet2_QNAME = new QName("", "street2");
    private final static QName _ExclusionAddressTypeState_QNAME = new QName("", "state");
    private final static QName _DisasterReliefAreaTypeType_QNAME = new QName("", "type");
    private final static QName _ListOfExclusionAgencyUIDTypeAgencyUID_QNAME = new QName("", "agencyUID");
    private final static QName _RSEULPFINCALCAggTypeEULPRTNASET_QNAME = new QName("http://www.sam.gov", "EULP_RTN_ASET");
    private final static QName _RSEULPFINCALCAggTypeEULPNETWRTH_QNAME = new QName("http://www.sam.gov", "EULP_NET_WRTH");
    private final static QName _RSEULPFINCALCAggTypeEULPRTNCAPL_QNAME = new QName("http://www.sam.gov", "EULP_RTN_CAPL");
    private final static QName _RSEULPFINCALCAggTypeEULPQKRATO_QNAME = new QName("http://www.sam.gov", "EULP_QK_RATO");
    private final static QName _RSEULPFINCALCAggTypeEULPLQDRATO_QNAME = new QName("http://www.sam.gov", "EULP_LQD_RATO");
    private final static QName _RSEULPFINCALCAggTypeEULPWRKGCAPL_QNAME = new QName("http://www.sam.gov", "EULP_WRKG_CAPL");
    private final static QName _RSEULPFINCALCAggTypeEULPRATOYR_QNAME = new QName("http://www.sam.gov", "EULP_RATO_YR");
    private final static QName _RSEULPFINCALCAggTypeEULPPFTMRGN_QNAME = new QName("http://www.sam.gov", "EULP_PFT_MRGN");
    private final static QName _FreeTextAnswerTypeAnswerText_QNAME = new QName("", "answerText");
    private final static QName _RSCUSTINPDATATYPE2FLDLSTFLDATTR_QNAME = new QName("http://www.sam.gov", "FLD_ATTR");
    private final static QName _RegistrationPurposeTypePurpose_QNAME = new QName("", "purpose");
    private final static QName _AddressTypeAddressInfoName_QNAME = new QName("http://www.sam.gov", "addressInfoName");
    private final static QName _AddressTypeStateOrProvince_QNAME = new QName("http://www.sam.gov", "stateOrProvince");
    private final static QName _AddressTypeAddressSource_QNAME = new QName("http://www.sam.gov", "addressSource");
    private final static QName _AddressTypePhoneNumber_QNAME = new QName("http://www.sam.gov", "phoneNumber");
    private final static QName _AddressTypeAddressLine4_QNAME = new QName("http://www.sam.gov", "addressLine4");
    private final static QName _AddressTypeAddressLine2_QNAME = new QName("http://www.sam.gov", "addressLine2");
    private final static QName _AddressTypeAddressLine3_QNAME = new QName("http://www.sam.gov", "addressLine3");
    private final static QName _AddressTypePhoneNumberExt_QNAME = new QName("http://www.sam.gov", "phoneNumberExt");
    private final static QName _AddressTypeAddressLine1_QNAME = new QName("http://www.sam.gov", "addressLine1");
    private final static QName _AddressTypeCongressionalDistrict_QNAME = new QName("http://www.sam.gov", "congressionalDistrict");
    private final static QName _AddressTypeZIPCode_QNAME = new QName("http://www.sam.gov", "ZIPCode");
    private final static QName _AddressTypeCity_QNAME = new QName("http://www.sam.gov", "city");
    private final static QName _AddressTypeCountry_QNAME = new QName("http://www.sam.gov", "country");
    private final static QName _AddressTypeAddressId_QNAME = new QName("http://www.sam.gov", "addressId");
    private final static QName _AddressTypeCounty_QNAME = new QName("http://www.sam.gov", "county");
    private final static QName _GAFLDATTRComplexTypeFLDALWDVALVAL_QNAME = new QName("http://www.sam.gov", "VAL");
    private final static QName _GAFLDATTRComplexTypeFLDMAXVAL_QNAME = new QName("http://www.sam.gov", "FLD_MAX_VAL");
    private final static QName _GAFLDATTRComplexTypeFLDWIDTH_QNAME = new QName("http://www.sam.gov", "FLD_WIDTH");
    private final static QName _GAFLDATTRComplexTypeFLDDESC_QNAME = new QName("http://www.sam.gov", "FLD_DESC");
    private final static QName _GAFLDATTRComplexTypeFLDREQD_QNAME = new QName("http://www.sam.gov", "FLD_REQD");
    private final static QName _GAFLDATTRComplexTypeFLDALWDVAL_QNAME = new QName("http://www.sam.gov", "FLD_ALWD_VAL");
    private final static QName _GAFLDATTRComplexTypeFLDMINVAL_QNAME = new QName("http://www.sam.gov", "FLD_MIN_VAL");
    private final static QName _GAFLDATTRComplexTypeFLDVAL_QNAME = new QName("http://www.sam.gov", "FLD_VAL");
    private final static QName _GAFLDATTRComplexTypeFLDDISPSEQ_QNAME = new QName("http://www.sam.gov", "FLD_DISP_SEQ");
    private final static QName _GAFLDATTRComplexTypeFLDTYPE_QNAME = new QName("http://www.sam.gov", "FLD_TYPE");
    private final static QName _GAFLDATTRComplexTypeFLDNME_QNAME = new QName("http://www.sam.gov", "FLD_NME");
    private final static QName _GAFLDATTRComplexTypeFLDDEFUVAL_QNAME = new QName("http://www.sam.gov", "FLD_DEFU_VAL");
    private final static QName _FinancialInformationTypeCreditCardUsage_QNAME = new QName("", "creditCardUsage");
    private final static QName _FinancialInformationTypeDebtSubjectToOffset_QNAME = new QName("", "debtSubjectToOffset");
    private final static QName _SBASizeResponseTypeMessage_QNAME = new QName("http://www.sam.gov", "message");
    private final static QName _CertificationURLsTypeHtmlURL_QNAME = new QName("", "HtmlURL");
    private final static QName _InfoTypeInfoCode_QNAME = new QName("http://www.sam.gov", "infoCode");
    private final static QName _ExecutiveDetailsTypeName_QNAME = new QName("", "name");
    private final static QName _ExecutiveDetailsTypeCompensation_QNAME = new QName("", "compensation");
    private final static QName _ExecutiveDetailsTypeTitle_QNAME = new QName("", "title");
    private final static QName _GoodsAndServicesTypeListOfNAICS_QNAME = new QName("", "listOfNAICS");
    private final static QName _GoodsAndServicesTypeListOfPSC_QNAME = new QName("", "listOfPSC");
    private final static QName _DNBMonitoringTypeLastUpdated_QNAME = new QName("", "lastUpdated");
    private final static QName _DNBMonitoringTypeMonitoringStatus_QNAME = new QName("", "monitoringStatus");
    private final static QName _DNBMonitoringTypeLegalBusinessName_QNAME = new QName("", "legalBusinessName");
    private final static QName _DNBMonitoringTypeDBAName_QNAME = new QName("", "DBAName");
    private final static QName _DNBMonitoringTypeOutOfBusinessFlag_QNAME = new QName("", "outOfBusinessFlag");
    private final static QName _EntityTypeEntityIdentification_QNAME = new QName("", "entityIdentification");
    private final static QName _EntityTypePointsOfContact_QNAME = new QName("", "pointsOfContact");
    private final static QName _EntityTypeCoreData_QNAME = new QName("", "coreData");
    private final static QName _EntityTypeAssertions_QNAME = new QName("", "assertions");
    private final static QName _EntityTypeRepsAndCerts_QNAME = new QName("", "repsAndCerts");
    private final static QName _RSKEYFLDS2TYPEKEYFLDNME_QNAME = new QName("http://www.sam.gov", "NME");
    private final static QName _PSCCodeTypeCode_QNAME = new QName("", "code");
    private final static QName _ResponseTypeConfirmationNumber_QNAME = new QName("http://www.sam.gov", "confirmationNumber");
    private final static QName _ResponseTypeListOfParameters_QNAME = new QName("http://www.sam.gov", "listOfParameters");
    private final static QName _EntitySearchCriteriaTypeCAGECode_QNAME = new QName("", "CAGECode");
    private final static QName _EntitySearchCriteriaTypeRegistrationStatus_QNAME = new QName("", "registrationStatus");
    private final static QName _EntitySearchCriteriaTypeEndDate_QNAME = new QName("", "endDate");
    private final static QName _EntitySearchCriteriaTypeTaxpayerIdentificationNumber_QNAME = new QName("", "taxpayerIdentificationNumber");
    private final static QName _EntitySearchCriteriaTypeStartDate_QNAME = new QName("", "startDate");
    private final static QName _EntitySearchCriteriaTypeDoDAAC_QNAME = new QName("", "DoDAAC");
    private final static QName _RSUPDFLDSTYPEUPDFLD_QNAME = new QName("http://www.sam.gov", "UPD_FLD");
    private final static QName _CertificationsTypeFARResponses_QNAME = new QName("", "FARResponses");
    private final static QName _CertificationsTypeDFARResponses_QNAME = new QName("", "DFARResponses");
    private final static QName _CertificationsTypeCertificationURLs_QNAME = new QName("", "certificationURLs");
    private final static QName _PointsOfContactTypeListOfPOCs_QNAME = new QName("", "listOfPOCs");
    private final static QName _RSEULPPRINAggTypeEULPTTL_QNAME = new QName("http://www.sam.gov", "EULP_TTL");
    private final static QName _RSEULPPRINAggTypeEULPNME_QNAME = new QName("http://www.sam.gov", "EULP_NME");
    private final static QName _RSEULPPRINAggTypeEULPINIT_QNAME = new QName("http://www.sam.gov", "EULP_INIT");
    private final static QName _SBASizeTypeNAICSExceptionFlag_QNAME = new QName("http://www.sam.gov", "NAICSExceptionFlag");
    private final static QName _SBASizeTypeNAICSYear_QNAME = new QName("http://www.sam.gov", "NAICSYear");
    private final static QName _SBASizeTypeNAICSDescription_QNAME = new QName("http://www.sam.gov", "NAICSDescription");
    private final static QName _SBASizeTypeStatus_QNAME = new QName("http://www.sam.gov", "status");
    private final static QName _SBASizeTypeActiveFlag_QNAME = new QName("http://www.sam.gov", "activeFlag");
    private final static QName _SBASizeTypeNAICSTotalAsset_QNAME = new QName("http://www.sam.gov", "NAICSTotalAsset");
    private final static QName _SBASizeTypeNAICSExceptionSeqNumber_QNAME = new QName("http://www.sam.gov", "NAICSExceptionSeqNumber");
    private final static QName _SBASizeTypeNAICSQualityCode_QNAME = new QName("http://www.sam.gov", "NAICSQualityCode");
    private final static QName _SBASizeTypeNAICSExceptionMod_QNAME = new QName("http://www.sam.gov", "NAICSExceptionMod");
    private final static QName _ExclusionStateCountryTypeAbbreviation_QNAME = new QName("", "abbreviation");
    private final static QName _RSCUSTINPDATATYPE3FLDLST_QNAME = new QName("http://www.sam.gov", "FLD_LST");
    private final static QName _RSCUSTINPDATATYPE3TITLE_QNAME = new QName("http://www.sam.gov", "TITLE");
    private final static QName _POCTypesFirstName_QNAME = new QName("", "firstName");
    private final static QName _POCTypesLastName_QNAME = new QName("", "lastName");
    private final static QName _POCTypesMiddleInitial_QNAME = new QName("", "middleInitial");
    private final static QName _POCTypesNonUSPhone_QNAME = new QName("", "nonUSPhone");
    private final static QName _POCTypesUSPhone_QNAME = new QName("", "USPhone");
    private final static QName _POCTypesFax_QNAME = new QName("", "fax");
    private final static QName _POCTypesEmail_QNAME = new QName("", "email");
    private final static QName _POCTypesUSPhoneExtension_QNAME = new QName("", "USPhoneExtension");
    private final static QName _BusinessObjectTypeId_QNAME = new QName("", "id");
    private final static QName _WarningTypeWarningCode_QNAME = new QName("http://www.sam.gov", "warningCode");
    private final static QName _IndustrySpecificSizeMetricsTypeTotalAssets_QNAME = new QName("", "totalAssets");
    private final static QName _IndustrySpecificSizeMetricsTypeBarrelsCapacity_QNAME = new QName("", "barrelsCapacity");
    private final static QName _IndustrySpecificSizeMetricsTypeMegawattHours_QNAME = new QName("", "megawattHours");
    private final static QName _RSEULPPAYDHISTAggTypeEULPPAYDHISTDT_QNAME = new QName("http://www.sam.gov", "EULP_PAYD_HIST_DT");
    private final static QName _RSEULPPAYDHISTAggTypeEULPPAYDHISTSCR_QNAME = new QName("http://www.sam.gov", "EULP_PAYD_HIST_SCR");
    private final static QName _AnswerTypeAnswerID_QNAME = new QName("", "answerID");
    private final static QName _FinancialAssistanceCertificationsTypeFinancialAssistanceResponseURLs_QNAME = new QName("", "financialAssistanceResponseURLs");
    private final static QName _FinancialAssistanceCertificationsTypeFinancialAssistanceResponse_QNAME = new QName("", "financialAssistanceResponse");
    private final static QName _SimpleQuestionAnswerTypeQuestion_QNAME = new QName("", "question");
    private final static QName _SimpleQuestionAnswerTypeAnswer_QNAME = new QName("", "answer");
    private final static QName _OperationExArchiveSearchTypeMiddle_QNAME = new QName("", "middle");
    private final static QName _OperationExArchiveSearchTypePartialName_QNAME = new QName("", "partialName");
    private final static QName _OperationExArchiveSearchTypeLast_QNAME = new QName("", "last");
    private final static QName _OperationExArchiveSearchTypePrefix_QNAME = new QName("", "prefix");
    private final static QName _OperationExArchiveSearchTypeExactName_QNAME = new QName("", "exactName");
    private final static QName _OperationExArchiveSearchTypeSuffix_QNAME = new QName("", "suffix");
    private final static QName _OperationExArchiveSearchTypeFirst_QNAME = new QName("", "first");
    private final static QName _RSEULPBSAggTypeEULPBLDG_QNAME = new QName("http://www.sam.gov", "EULP_BLDG");
    private final static QName _RSEULPBSAggTypeEULPOTHFA_QNAME = new QName("http://www.sam.gov", "EULP_OTH_FA");
    private final static QName _RSEULPBSAggTypeEULPLANDBLDG_QNAME = new QName("http://www.sam.gov", "EULP_LAND_BLDG");
    private final static QName _RSEULPBSAggTypeEULPTOTFINLASET_QNAME = new QName("http://www.sam.gov", "EULP_TOT_FINL_ASET");
    private final static QName _RSEULPBSAggTypeEULPTRDDBTR_QNAME = new QName("http://www.sam.gov", "EULP_TRD_DBTR");
    private final static QName _RSEULPBSAggTypeEULPLTLIABOTH_QNAME = new QName("http://www.sam.gov", "EULP_LT_LIAB_OTH");
    private final static QName _RSEULPBSAggTypeEULPTOTNCURASET_QNAME = new QName("http://www.sam.gov", "EULP_TOT_NCUR_ASET");
    private final static QName _RSEULPBSAggTypeEULPAROVR1YR_QNAME = new QName("http://www.sam.gov", "EULP_AR_OVR_1YR");
    private final static QName _RSEULPBSAggTypeEULPOTHLOAN_QNAME = new QName("http://www.sam.gov", "EULP_OTH_LOAN");
    private final static QName _RSEULPBSAggTypeEULPBANKLOAN_QNAME = new QName("http://www.sam.gov", "EULP_BANK_LOAN");
    private final static QName _RSEULPBSAggTypeEULPPFTLOSFRWD_QNAME = new QName("http://www.sam.gov", "EULP_PFT_LOS_FRWD");
    private final static QName _RSEULPBSAggTypeEULPTOTCURRLIAB_QNAME = new QName("http://www.sam.gov", "EULP_TOT_CURR_LIAB");
    private final static QName _RSEULPBSAggTypeEULPTOTTANGASET_QNAME = new QName("http://www.sam.gov", "EULP_TOT_TANG_ASET");
    private final static QName _RSEULPBSAggTypeEULPINTAASET_QNAME = new QName("http://www.sam.gov", "EULP_INTA_ASET");
    private final static QName _RSEULPBSAggTypeEULPLTIVSM_QNAME = new QName("http://www.sam.gov", "EULP_LT_IVSM");
    private final static QName _RSEULPBSAggTypeEULPBANK_QNAME = new QName("http://www.sam.gov", "EULP_BANK");
    private final static QName _RSEULPBSAggTypeEULPTRDCRR_QNAME = new QName("http://www.sam.gov", "EULP_TRD_CRR");
    private final static QName _RSEULPBSAggTypeEULPGDWI_QNAME = new QName("http://www.sam.gov", "EULP_GDWI");
    private final static QName _RSEULPBSAggTypeEULPPFT_QNAME = new QName("http://www.sam.gov", "EULP_PFT");
    private final static QName _RSEULPBSAggTypeEULPRESV_QNAME = new QName("http://www.sam.gov", "EULP_RESV");
    private final static QName _RSEULPBSAggTypeEULPLTLIAB_QNAME = new QName("http://www.sam.gov", "EULP_LT_LIAB");
    private final static QName _RSEULPBSAggTypeEULPTOTDBT_QNAME = new QName("http://www.sam.gov", "EULP_TOT_DBT");
    private final static QName _RSEULPBSAggTypeEULPMTGELOAN_QNAME = new QName("http://www.sam.gov", "EULP_MTGE_LOAN");
    private final static QName _RSEULPBSAggTypeEULPTOTCA_QNAME = new QName("http://www.sam.gov", "EULP_TOT_CA");
    private final static QName _RSEULPBSAggTypeEULPLTLIABDUE1YR_QNAME = new QName("http://www.sam.gov", "EULP_LT_LIAB_DUE_1YR");
    private final static QName _RSEULPBSAggTypeEULPSTIVSM_QNAME = new QName("http://www.sam.gov", "EULP_ST_IVSM");
    private final static QName _RSEULPBSAggTypeEULPFURNVHCL_QNAME = new QName("http://www.sam.gov", "EULP_FURN_VHCL");
    private final static QName _RSEULPBSAggTypeEULPTOTSTKEQTY_QNAME = new QName("http://www.sam.gov", "EULP_TOT_STK_EQTY");
    private final static QName _RSEULPBSAggTypeEULPCSHLQDASET_QNAME = new QName("http://www.sam.gov", "EULP_CSH_LQD_ASET");
    private final static QName _RSEULPBSAggTypeEULPISSCAPL_QNAME = new QName("http://www.sam.gov", "EULP_ISS_CAPL");
    private final static QName _RSEULPBSAggTypeEULPTOTASET_QNAME = new QName("http://www.sam.gov", "EULP_TOT_ASET");
    private final static QName _RSEULPBSAggTypeEULPLAND_QNAME = new QName("http://www.sam.gov", "EULP_LAND");
    private final static QName _RSEULPBSAggTypeEULPFIXTEQPT_QNAME = new QName("http://www.sam.gov", "EULP_FIXT_EQPT");
    private final static QName _RSEULPBSAggTypeEULPRETDEARN_QNAME = new QName("http://www.sam.gov", "EULP_RETD_EARN");
    private final static QName _RSEULPBSAggTypeEULPAROTH_QNAME = new QName("http://www.sam.gov", "EULP_AR_OTH");
    private final static QName _RSEULPBSAggTypeEULPTOTLIAB_QNAME = new QName("http://www.sam.gov", "EULP_TOT_LIAB");
    private final static QName _RSEULPBSAggTypeEULPTOTNETSTKWIP_QNAME = new QName("http://www.sam.gov", "EULP_TOT_NET_STK_WIP");
    private final static QName _RSEULPBSAggTypeEULPSHRPREM_QNAME = new QName("http://www.sam.gov", "EULP_SHR_PREM");
    private final static QName _RSEULPBSAggTypeEULPSTMTDT_QNAME = new QName("http://www.sam.gov", "EULP_STMT_DT");
    private final static QName _RSEULPBSAggTypeEULPCAPL_QNAME = new QName("http://www.sam.gov", "EULP_CAPL");
    private final static QName _RSEULPBSAggTypeEULPINDVCONSIND_QNAME = new QName("http://www.sam.gov", "EULP_INDV_CONS_IND");
    private final static QName _RSEULPBSAggTypeEULPCRCYCD_QNAME = new QName("http://www.sam.gov", "EULP_CRCY_CD");
    private final static QName _FinancialAccountTypeAuthorizationDate_QNAME = new QName("", "authorizationDate");
    private final static QName _FinancialAccountTypeRemittanceInformation_QNAME = new QName("", "remittanceInformation");
    private final static QName _FinancialAccountTypeMerchantID2_QNAME = new QName("", "merchantID2");
    private final static QName _FinancialAccountTypeACHInformation_QNAME = new QName("", "ACHInformation");
    private final static QName _FinancialAccountTypeMerchantID1_QNAME = new QName("", "merchantID1");
    private final static QName _FinancialAccountTypeDepartmentCode_QNAME = new QName("", "departmentCode");
    private final static QName _FinancialAccountTypeAgencyLocationCode_QNAME = new QName("", "agencyLocationCode");
    private final static QName _FinancialAccountTypeAccountingStation_QNAME = new QName("", "accountingStation");
    private final static QName _FinancialAccountTypeDisbursingOfficeSymbol_QNAME = new QName("", "disbursingOfficeSymbol");
    private final static QName _FinancialAccountTypeEFTInformation_QNAME = new QName("", "EFTInformation");
    private final static QName _ExclusionSearchCriteriaTypeEntityFilter_QNAME = new QName("http://www.sam.gov", "entityFilter");
    private final static QName _ExclusionSearchCriteriaTypeExclusionFilter_QNAME = new QName("http://www.sam.gov", "exclusionFilter");
    private final static QName _ExclusionSearchCriteriaTypeDateFilter_QNAME = new QName("http://www.sam.gov", "dateFilter");
    private final static QName _USDSPAYDNORMQRTLGRPTypeUSDSPAYDNORM_QNAME = new QName("http://www.sam.gov", "USDS_PAYD_NORM");
    private final static QName _USDSPAYDNORMQRTLGRPTypeUSDSPAYDNORMPRD_QNAME = new QName("http://www.sam.gov", "USDS_PAYD_NORM_PRD");
    private final static QName _SBABusinessTypeTypeExpirationDate_QNAME = new QName("", "expirationDate");
    private final static QName _USDSPAYDGRPTypeUSDSPAYDSCR_QNAME = new QName("http://www.sam.gov", "USDS_PAYD_SCR");
    private final static QName _USDSPAYDGRPTypeUSDSPAYDPRD_QNAME = new QName("http://www.sam.gov", "USDS_PAYD_PRD");
    private final static QName _ExclusionActionTypeUpdateDate_QNAME = new QName("", "updateDate");
    private final static QName _ExclusionActionTypeActionStatus_QNAME = new QName("", "actionStatus");
    private final static QName _ExclusionActionTypeAgencyComponent_QNAME = new QName("", "agencyComponent");
    private final static QName _ExclusionActionTypeActiveDate_QNAME = new QName("", "activeDate");
    private final static QName _ExclusionActionTypeTermType_QNAME = new QName("", "termType");
    private final static QName _GeneralInformationTypeStateOfIncorporation_QNAME = new QName("", "stateOfIncorporation");
    private final static QName _GeneralInformationTypeListOfBusinessTypes_QNAME = new QName("", "listOfBusinessTypes");
    private final static QName _GeneralInformationTypeCountryOfIncorporation_QNAME = new QName("", "countryOfIncorporation");
    private final static QName _GeneralInformationTypeListOfSBABusinessTypes_QNAME = new QName("", "listOfSBABusinessTypes");
    private final static QName _TINInformationTypeTaxpayerIdentificationType_QNAME = new QName("", "taxpayerIdentificationType");
    private final static QName _ExclusionAgencyTypeExclusionAgencyCode_QNAME = new QName("http://www.sam.gov", "exclusionAgencyCode");
    private final static QName _ExclusionAgencyTypeExclusionAgency_QNAME = new QName("http://www.sam.gov", "exclusionAgency");
    private final static QName _ACHInformationTypeFaxNumber_QNAME = new QName("", "faxNumber");
    private final static QName _TransactionInformationTypeLegacyCreateUser_QNAME = new QName("http://www.sam.gov", "legacyCreateUser");
    private final static QName _TransactionInformationTypeUpdateDate_QNAME = new QName("http://www.sam.gov", "updateDate");
    private final static QName _TransactionInformationTypeDeleteFlag_QNAME = new QName("http://www.sam.gov", "deleteFlag");
    private final static QName _TransactionInformationTypeLegacyUpdateDate_QNAME = new QName("http://www.sam.gov", "legacyUpdateDate");
    private final static QName _TransactionInformationTypeCreateDate_QNAME = new QName("http://www.sam.gov", "createDate");
    private final static QName _TransactionInformationTypeDeleteDate_QNAME = new QName("http://www.sam.gov", "deleteDate");
    private final static QName _TransactionInformationTypeLegacyCreateDate_QNAME = new QName("http://www.sam.gov", "legacyCreateDate");
    private final static QName _TransactionInformationTypeCreateUser_QNAME = new QName("http://www.sam.gov", "createUser");
    private final static QName _TransactionInformationTypeLegacyUpdateUser_QNAME = new QName("http://www.sam.gov", "legacyUpdateUser");
    private final static QName _TransactionInformationTypeUpdateUser_QNAME = new QName("http://www.sam.gov", "updateUser");
    private final static QName _RSKEYFLDS3TYPEKEYFLDUPD_QNAME = new QName("http://www.sam.gov", "UPD");
    private final static QName _RSEULPPLAggTypeEULPNETOPRGINCM_QNAME = new QName("http://www.sam.gov", "EULP_NET_OPRG_INCM");
    private final static QName _RSEULPPLAggTypeEULPEMPCST_QNAME = new QName("http://www.sam.gov", "EULP_EMP_CST");
    private final static QName _RSEULPPLAggTypeEULPNETPFT_QNAME = new QName("http://www.sam.gov", "EULP_NET_PFT");
    private final static QName _RSEULPPLAggTypeEULPNETTAX_QNAME = new QName("http://www.sam.gov", "EULP_NET_TAX");
    private final static QName _RSEULPPLAggTypeEULPTOTFINLINCM_QNAME = new QName("http://www.sam.gov", "EULP_TOT_FINL_INCM");
    private final static QName _RSEULPPLAggTypeEULPNETLOSS_QNAME = new QName("http://www.sam.gov", "EULP_NET_LOSS");
    private final static QName _RSEULPPLAggTypeEULPDPRE_QNAME = new QName("http://www.sam.gov", "EULP_DPRE");
    private final static QName _RSEULPPLAggTypeEULPPFTPSTTAX_QNAME = new QName("http://www.sam.gov", "EULP_PFT_PST_TAX");
    private final static QName _RSEULPPLAggTypeEULPCOGS_QNAME = new QName("http://www.sam.gov", "EULP_COGS");
    private final static QName _RSEULPPLAggTypeEULPNETSLS_QNAME = new QName("http://www.sam.gov", "EULP_NET_SLS");
    private final static QName _RSEULPPLAggTypeEULPGRSPFT_QNAME = new QName("http://www.sam.gov", "EULP_GRS_PFT");
    private final static QName _RSEULPPLAggTypeEULPTOTFINLEXPE_QNAME = new QName("http://www.sam.gov", "EULP_TOT_FINL_EXPE");
    private final static QName _RSEULPPLAggTypeEULPPFTSTMTDT_QNAME = new QName("http://www.sam.gov", "EULP_PFT_STMT_DT");
    private final static QName _RSEULPPLAggTypeEULPPFTPRETAX_QNAME = new QName("http://www.sam.gov", "EULP_PFT_PRE_TAX");
    private final static QName _RSEULPPLAggTypeEULPSLS_QNAME = new QName("http://www.sam.gov", "EULP_SLS");
    private final static QName _SizeMetricsTypeListOfSizeMetricDetails_QNAME = new QName("", "listOfSizeMetricDetails");
    private final static QName _QualificationsTypeQualificationURLs_QNAME = new QName("", "qualificationURLs");
    private final static QName _QualificationsTypeArchitectEngineerResponses_QNAME = new QName("", "architectEngineerResponses");
    private final static QName _RSUSPRNTBKCYFILGGRPTypeUSPRNTBKCYFILGDT_QNAME = new QName("http://www.sam.gov", "US_PRNT_BKCY_FILG_DT");
    private final static QName _RSUSPRNTBKCYFILGGRPTypeUSPRNTBKCYFILGCHNBR_QNAME = new QName("http://www.sam.gov", "US_PRNT_BKCY_FILG_CH_NBR");
    private final static QName _RSUSPRNTBKCYFILGGRPTypeUSPRNTBKCYFILGTYPE_QNAME = new QName("http://www.sam.gov", "US_PRNT_BKCY_FILG_TYPE");
    private final static QName _ProvisionTypeListOfAnswers_QNAME = new QName("", "listOfAnswers");
    private final static QName _ListOfCommentTypeDescription_QNAME = new QName("http://www.sam.gov", "description");
    private final static QName _GetEntitiesListOfEntities_QNAME = new QName("", "listOfEntities");
    private final static QName _DateFilterTypeTerminationDateRange_QNAME = new QName("http://www.sam.gov", "terminationDateRange");
    private final static QName _DateFilterTypeCreateDateRange_QNAME = new QName("http://www.sam.gov", "createDateRange");
    private final static QName _DateFilterTypeUpdateDateRange_QNAME = new QName("http://www.sam.gov", "updateDateRange");
    private final static QName _DateFilterTypeActionDateRange_QNAME = new QName("http://www.sam.gov", "actionDateRange");
    private final static QName _DateFilterTypeDeleteDateRange_QNAME = new QName("http://www.sam.gov", "deleteDateRange");
    private final static QName _EntityCoreDataTypeFinancialInformation_QNAME = new QName("", "financialInformation");
    private final static QName _EntityCoreDataTypeBusinessInformation_QNAME = new QName("", "businessInformation");
    private final static QName _EntityCoreDataTypeGeneralInformation_QNAME = new QName("", "generalInformation");
    private final static QName _TransactionInfoTypeTransactionStatus_QNAME = new QName("", "transactionStatus");
    private final static QName _TransactionInfoTypeDataRetrievalTime_QNAME = new QName("", "dataRetrievalTime");
    private final static QName _TransactionInfoTypeNumberOfRecordsReturned_QNAME = new QName("", "numberOfRecordsReturned");
    private final static QName _TransactionInfoTypeTransactionMessage_QNAME = new QName("", "transactionMessage");
    private final static QName _FAMTREERSTypeEXCLBRIND_QNAME = new QName("http://www.sam.gov", "EXCL_BR_IND");
    private final static QName _FAMTREERSTypeBUSRELCD_QNAME = new QName("http://www.sam.gov", "BUS_REL_CD");
    private final static QName _ExclusionSearchResponseBaseTypeErrorMessage_QNAME = new QName("", "errorMessage");
    private final static QName _NAICSCodeTypeException_QNAME = new QName("", "exception");
    private final static QName _NAICSCodeTypeSBASmallBusiness_QNAME = new QName("", "SBASmallBusiness");
    private final static QName _NAICSCodeTypePrimary_QNAME = new QName("", "primary");
    private final static QName _ExclusionTypeCrossReferences_QNAME = new QName("http://www.sam.gov", "crossReferences");
    private final static QName _ExclusionTypeExclusionDetails_QNAME = new QName("http://www.sam.gov", "exclusionDetails");
    private final static QName _SONRSSTATUS_QNAME = new QName("http://www.sam.gov", "STATUS");
    private final static QName _SONRSDTSERVER_QNAME = new QName("http://www.sam.gov", "DTSERVER");
    private final static QName _SONRSLANGUAGE_QNAME = new QName("http://www.sam.gov", "LANGUAGE");
    private final static QName _RegistrationInformationTypeRegistrationPurpose_QNAME = new QName("", "registrationPurpose");
    private final static QName _RegistrationInformationTypeNCAGECode_QNAME = new QName("", "NCAGECode");
    private final static QName _RegistrationInformationTypeDUNS_QNAME = new QName("", "DUNS");
    private final static QName _RegistrationInformationTypeLastUpdateDate_QNAME = new QName("", "lastUpdateDate");
    private final static QName _RegistrationInformationTypeDUNSPlus4_QNAME = new QName("", "DUNSPlus4");
    private final static QName _RegistrationInformationTypeDODAAC_QNAME = new QName("", "DODAAC");
    private final static QName _RegistrationInformationTypeRegistrationDate_QNAME = new QName("", "registrationDate");
    private final static QName _RegistrationInformationTypeNoPublicDisplay_QNAME = new QName("", "noPublicDisplay");
    private final static QName _RegistrationInformationTypeExclusionStatus_QNAME = new QName("", "exclusionStatus");
    private final static QName _AssertionsTypeDisasterReliefData_QNAME = new QName("", "disasterReliefData");
    private final static QName _AssertionsTypeGoodsAndServices_QNAME = new QName("", "goodsAndServices");
    private final static QName _SearchCriteriaRequestAddress1_QNAME = new QName("http://www.sam.gov", "address1");
    private final static QName _SearchCriteriaRequestOfficeId_QNAME = new QName("http://www.sam.gov", "officeId");
    private final static QName _SearchCriteriaRequestAddress2_QNAME = new QName("http://www.sam.gov", "address2");
    private final static QName _SearchCriteriaRequestParentOrgId_QNAME = new QName("http://www.sam.gov", "parentOrgId");
    private final static QName _SearchCriteriaRequestParentOrgCode_QNAME = new QName("http://www.sam.gov", "parentOrgCode");
    private final static QName _SearchCriteriaRequestGovOfficeId_QNAME = new QName("http://www.sam.gov", "govOfficeId");
    private final static QName _SearchCriteriaRequestOfficeName_QNAME = new QName("http://www.sam.gov", "officeName");
    private final static QName _SearchCriteriaRequestZipCode_QNAME = new QName("http://www.sam.gov", "zipCode");
    private final static QName _SearchCriteriaRequestState_QNAME = new QName("http://www.sam.gov", "state");
    private final static QName _SearchCriteriaRequestOfficeCatId_QNAME = new QName("http://www.sam.gov", "officeCatId");
    private final static QName _ProceedingsInformationTypeProceedingType_QNAME = new QName("", "proceedingType");
    private final static QName _ProceedingsInformationTypeInstrumentNumber_QNAME = new QName("", "instrumentNumber");
    private final static QName _ProceedingsInformationTypeProceedingState_QNAME = new QName("", "proceedingState");
    private final static QName _ProceedingsInformationTypeProceedingDate_QNAME = new QName("", "proceedingDate");
    private final static QName _ProceedingsInformationTypeInstrumentID_QNAME = new QName("", "instrumentID");
    private final static QName _ProceedingsInformationTypeDescription_QNAME = new QName("", "description");
    private final static QName _ProceedingsInformationTypeDispositionID_QNAME = new QName("", "dispositionID");
    private final static QName _BusinessInformationTypeOrganizationType_QNAME = new QName("", "organizationType");
    private final static QName _BusinessInformationTypeFiscalYearEndCloseDate_QNAME = new QName("", "fiscalYearEndCloseDate");
    private final static QName _BusinessInformationTypeMailingAddress_QNAME = new QName("", "mailingAddress");
    private final static QName _BusinessInformationTypeAgencyBusinessPurpose_QNAME = new QName("", "agencyBusinessPurpose");
    private final static QName _BusinessInformationTypeCompanyDivisionName_QNAME = new QName("", "companyDivisionName");
    private final static QName _BusinessInformationTypeCompanyDivisionNumber_QNAME = new QName("", "companyDivisionNumber");
    private final static QName _BusinessInformationTypeBusinessStartDate_QNAME = new QName("", "businessStartDate");
    private final static QName _BusinessInformationTypeCorporateURL_QNAME = new QName("", "corporateURL");
    private final static QName _BusinessInformationTypePhysicalAddress_QNAME = new QName("", "physicalAddress");
    private final static QName _BusinessInformationTypeCorrespondenceFlag_QNAME = new QName("", "correspondenceFlag");
    private final static QName _EntityFilterTypeDUNS_QNAME = new QName("http://www.sam.gov", "DUNS");
    private final static QName _EntityFilterTypeCAGEList_QNAME = new QName("http://www.sam.gov", "CAGEList");
    private final static QName _EntityFilterTypeIndividual_QNAME = new QName("http://www.sam.gov", "Individual");
    private final static QName _EntityFilterTypeNPIList_QNAME = new QName("http://www.sam.gov", "NPIList");
    private final static QName _EntityFilterTypeCountryList_QNAME = new QName("http://www.sam.gov", "CountryList");
    private final static QName _EntityFilterTypeEntityName_QNAME = new QName("http://www.sam.gov", "EntityName");
    private final static QName _EntityFilterTypeTINSSN_QNAME = new QName("http://www.sam.gov", "TINSSN");
    private final static QName _EntityFilterTypeStateList_QNAME = new QName("http://www.sam.gov", "StateList");
    private final static QName _EntityFilterTypeClassificationList_QNAME = new QName("http://www.sam.gov", "ClassificationList");
    private final static QName _GeographicalAreaServedTypeMetropolitanStatisticalArea_QNAME = new QName("", "metropolitanStatisticalArea");
    private final static QName _GeographicalAreaServedTypeCounty_QNAME = new QName("", "county");
    private final static QName _RSSCRGRPTypeDEFUINDN_QNAME = new QName("http://www.sam.gov", "DEFU_INDN");
    private final static QName _RSSCRGRPTypeSCRCLAS_QNAME = new QName("http://www.sam.gov", "SCR_CLAS");
    private final static QName _RSSCRGRPTypeSCR_QNAME = new QName("http://www.sam.gov", "SCR");
    private final static QName _RSSCRGRPTypeSCROVRDCD_QNAME = new QName("http://www.sam.gov", "SCR_OVRD_CD");
    private final static QName _RSSCRGRPTypeINDSDEFUINDN_QNAME = new QName("http://www.sam.gov", "INDS_DEFU_INDN");
    private final static QName _RSSCRGRPTypeSCRCMTYCD_QNAME = new QName("http://www.sam.gov", "SCR_CMTY_CD");
    private final static QName _RSSCRGRPTypeINDSNORM_QNAME = new QName("http://www.sam.gov", "INDS_NORM");
    private final static QName _RSSCRGRPTypeASMTDT_QNAME = new QName("http://www.sam.gov", "ASMT_DT");
    private final static QName _RSSCRGRPTypeNATLPCTL_QNAME = new QName("http://www.sam.gov", "NATL_PCTL");
    private final static QName _RSSCRGRPTypeSCRAGE_QNAME = new QName("http://www.sam.gov", "SCR_AGE");
    private final static QName _RSSCRGRPTypeRAWSCR_QNAME = new QName("http://www.sam.gov", "RAW_SCR");
    private final static QName _RSSCRGRPTypeALGMID_QNAME = new QName("http://www.sam.gov", "ALGM_ID");
    private final static QName _OperationSearchTypeIncludeInactive_QNAME = new QName("", "includeInactive");
    private final static QName _ExclusionDetailsTypeExclusionProgram_QNAME = new QName("http://www.sam.gov", "exclusionProgram");
    private final static QName _ExclusionDetailsTypeIndefiniteIndicatorFlag_QNAME = new QName("http://www.sam.gov", "indefiniteIndicatorFlag");
    private final static QName _ExclusionDetailsTypeTerminationDate_QNAME = new QName("http://www.sam.gov", "terminationDate");
    private final static QName _ExclusionDetailsTypeExclusionStatus_QNAME = new QName("http://www.sam.gov", "exclusionStatus");
    private final static QName _ExclusionDetailsTypeExclusionType_QNAME = new QName("http://www.sam.gov", "exclusionType");
    private final static QName _ExclusionDetailsTypeActiveDate_QNAME = new QName("http://www.sam.gov", "activeDate");
    private final static QName _ExclusionDetailsTypeClassificationType_QNAME = new QName("http://www.sam.gov", "classificationType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.challenge.swiftcode.wsClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RSKEYFLDS2TYPE }
     * 
     */
    public RSKEYFLDS2TYPE createRSKEYFLDS2TYPE() {
        return new RSKEYFLDS2TYPE();
    }

    /**
     * Create an instance of {@link RSCUSTINPDATATYPE3 }
     * 
     */
    public RSCUSTINPDATATYPE3 createRSCUSTINPDATATYPE3() {
        return new RSCUSTINPDATATYPE3();
    }

    /**
     * Create an instance of {@link RSCUSTINPDATATYPE2 }
     * 
     */
    public RSCUSTINPDATATYPE2 createRSCUSTINPDATATYPE2() {
        return new RSCUSTINPDATATYPE2();
    }

    /**
     * Create an instance of {@link RSCUSTINPDATATYPE1 }
     * 
     */
    public RSCUSTINPDATATYPE1 createRSCUSTINPDATATYPE1() {
        return new RSCUSTINPDATATYPE1();
    }

    /**
     * Create an instance of {@link RSUPDFLDSTYPE }
     * 
     */
    public RSUPDFLDSTYPE createRSUPDFLDSTYPE() {
        return new RSUPDFLDSTYPE();
    }

    /**
     * Create an instance of {@link RSKEYFLDS3TYPE }
     * 
     */
    public RSKEYFLDS3TYPE createRSKEYFLDS3TYPE() {
        return new RSKEYFLDS3TYPE();
    }

    /**
     * Create an instance of {@link RSUSSPCLEVNTType }
     * 
     */
    public RSUSSPCLEVNTType createRSUSSPCLEVNTType() {
        return new RSUSSPCLEVNTType();
    }

    /**
     * Create an instance of {@link GAFLDATTRComplexType }
     * 
     */
    public GAFLDATTRComplexType createGAFLDATTRComplexType() {
        return new GAFLDATTRComplexType();
    }

    /**
     * Create an instance of {@link ListOfAddressesType }
     * 
     */
    public ListOfAddressesType createListOfAddressesType() {
        return new ListOfAddressesType();
    }

    /**
     * Create an instance of {@link SizeMetricsType }
     * 
     */
    public SizeMetricsType createSizeMetricsType() {
        return new SizeMetricsType();
    }

    /**
     * Create an instance of {@link SBAManualCertificationUpdateType }
     * 
     */
    public SBAManualCertificationUpdateType createSBAManualCertificationUpdateType() {
        return new SBAManualCertificationUpdateType();
    }

    /**
     * Create an instance of {@link ListOfSBASizeType }
     * 
     */
    public ListOfSBASizeType createListOfSBASizeType() {
        return new ListOfSBASizeType();
    }

    /**
     * Create an instance of {@link SBAManualCertificationUpdateRequestType }
     * 
     */
    public SBAManualCertificationUpdateRequestType createSBAManualCertificationUpdateRequestType() {
        return new SBAManualCertificationUpdateRequestType();
    }

    /**
     * Create an instance of {@link SONRS }
     * 
     */
    public SONRS createSONRS() {
        return new SONRS();
    }

    /**
     * Create an instance of {@link RSSTATUSType }
     * 
     */
    public RSSTATUSType createRSSTATUSType() {
        return new RSSTATUSType();
    }

    /**
     * Create an instance of {@link ExdescriptionType }
     * 
     */
    public ExdescriptionType createExdescriptionType() {
        return new ExdescriptionType();
    }

    /**
     * Create an instance of {@link SearchCriteria }
     * 
     */
    public SearchCriteria createSearchCriteria() {
        return new SearchCriteria();
    }

    /**
     * Create an instance of {@link ExclusionType }
     * 
     */
    public ExclusionType createExclusionType() {
        return new ExclusionType();
    }

    /**
     * Create an instance of {@link CrossReferenceExclusionType }
     * 
     */
    public CrossReferenceExclusionType createCrossReferenceExclusionType() {
        return new CrossReferenceExclusionType();
    }

    /**
     * Create an instance of {@link ListOfEntitiesType }
     * 
     */
    public ListOfEntitiesType createListOfEntitiesType() {
        return new ListOfEntitiesType();
    }

    /**
     * Create an instance of {@link ListOfSBAManualCertificationUpdateType }
     * 
     */
    public ListOfSBAManualCertificationUpdateType createListOfSBAManualCertificationUpdateType() {
        return new ListOfSBAManualCertificationUpdateType();
    }

    /**
     * Create an instance of {@link SBAFormallyDeterminedSizesType }
     * 
     */
    public SBAFormallyDeterminedSizesType createSBAFormallyDeterminedSizesType() {
        return new SBAFormallyDeterminedSizesType();
    }

    /**
     * Create an instance of {@link SystemException }
     * 
     */
    public SystemException createSystemException() {
        return new SystemException();
    }

    /**
     * Create an instance of {@link SBASizeRequestType }
     * 
     */
    public SBASizeRequestType createSBASizeRequestType() {
        return new SBASizeRequestType();
    }

    /**
     * Create an instance of {@link SBASizeResponseType }
     * 
     */
    public SBASizeResponseType createSBASizeResponseType() {
        return new SBASizeResponseType();
    }

    /**
     * Create an instance of {@link AddressTypes }
     * 
     */
    public AddressTypes createAddressTypes() {
        return new AddressTypes();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link POCType }
     * 
     */
    public POCType createPOCType() {
        return new POCType();
    }

    /**
     * Create an instance of {@link ListOfCrossReferenceExclusionsType }
     * 
     */
    public ListOfCrossReferenceExclusionsType createListOfCrossReferenceExclusionsType() {
        return new ListOfCrossReferenceExclusionsType();
    }

    /**
     * Create an instance of {@link ListOfProceedingsInformationType }
     * 
     */
    public ListOfProceedingsInformationType createListOfProceedingsInformationType() {
        return new ListOfProceedingsInformationType();
    }

    /**
     * Create an instance of {@link MoveFedNodeResponse }
     * 
     */
    public MoveFedNodeResponse createMoveFedNodeResponse() {
        return new MoveFedNodeResponse();
    }

    /**
     * Create an instance of {@link ListOfExclusionStateCountryType }
     * 
     */
    public ListOfExclusionStateCountryType createListOfExclusionStateCountryType() {
        return new ListOfExclusionStateCountryType();
    }

    /**
     * Create an instance of {@link SBASizeType }
     * 
     */
    public SBASizeType createSBASizeType() {
        return new SBASizeType();
    }

    /**
     * Create an instance of {@link ExclusionCommentType }
     * 
     */
    public ExclusionCommentType createExclusionCommentType() {
        return new ExclusionCommentType();
    }

    /**
     * Create an instance of {@link ApplicationException }
     * 
     */
    public ApplicationException createApplicationException() {
        return new ApplicationException();
    }

    /**
     * Create an instance of {@link DGX }
     * 
     */
    public DGX createDGX() {
        return new DGX();
    }

    /**
     * Create an instance of {@link RSSIGNONMSGSRSV1Type }
     * 
     */
    public RSSIGNONMSGSRSV1Type createRSSIGNONMSGSRSV1Type() {
        return new RSSIGNONMSGSRSV1Type();
    }

    /**
     * Create an instance of {@link CREDITMSGSRSV2Type }
     * 
     */
    public CREDITMSGSRSV2Type createCREDITMSGSRSV2Type() {
        return new CREDITMSGSRSV2Type();
    }

    /**
     * Create an instance of {@link ListOfCommentType }
     * 
     */
    public ListOfCommentType createListOfCommentType() {
        return new ListOfCommentType();
    }

    /**
     * Create an instance of {@link SBAManualCertificationUpdateResponseType }
     * 
     */
    public SBAManualCertificationUpdateResponseType createSBAManualCertificationUpdateResponseType() {
        return new SBAManualCertificationUpdateResponseType();
    }

    /**
     * Create an instance of {@link DisasterReliefAreaType }
     * 
     */
    public DisasterReliefAreaType createDisasterReliefAreaType() {
        return new DisasterReliefAreaType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link POCTypes }
     * 
     */
    public POCTypes createPOCTypes() {
        return new POCTypes();
    }

    /**
     * Create an instance of {@link SearchCriteriaRequest }
     * 
     */
    public SearchCriteriaRequest createSearchCriteriaRequest() {
        return new SearchCriteriaRequest();
    }

    /**
     * Create an instance of {@link GetEntities }
     * 
     */
    public GetEntities createGetEntities() {
        return new GetEntities();
    }

    /**
     * Create an instance of {@link ListOfPOCsType }
     * 
     */
    public ListOfPOCsType createListOfPOCsType() {
        return new ListOfPOCsType();
    }

    /**
     * Create an instance of {@link AlternateAddressType }
     * 
     */
    public AlternateAddressType createAlternateAddressType() {
        return new AlternateAddressType();
    }

    /**
     * Create an instance of {@link EntityType }
     * 
     */
    public EntityType createEntityType() {
        return new EntityType();
    }

    /**
     * Create an instance of {@link Owner }
     * 
     */
    public Owner createOwner() {
        return new Owner();
    }

    /**
     * Create an instance of {@link CountryListType }
     * 
     */
    public CountryListType createCountryListType() {
        return new CountryListType();
    }

    /**
     * Create an instance of {@link NAICSCodeType }
     * 
     */
    public NAICSCodeType createNAICSCodeType() {
        return new NAICSCodeType();
    }

    /**
     * Create an instance of {@link RSEULPPRINAggType }
     * 
     */
    public RSEULPPRINAggType createRSEULPPRINAggType() {
        return new RSEULPPRINAggType();
    }

    /**
     * Create an instance of {@link ProvisionType }
     * 
     */
    public ProvisionType createProvisionType() {
        return new ProvisionType();
    }

    /**
     * Create an instance of {@link BusinessObjectAnswerType }
     * 
     */
    public BusinessObjectAnswerType createBusinessObjectAnswerType() {
        return new BusinessObjectAnswerType();
    }

    /**
     * Create an instance of {@link ExclusionAgencyUIDType }
     * 
     */
    public ExclusionAgencyUIDType createExclusionAgencyUIDType() {
        return new ExclusionAgencyUIDType();
    }

    /**
     * Create an instance of {@link OperationExclusionHistoryType }
     * 
     */
    public OperationExclusionHistoryType createOperationExclusionHistoryType() {
        return new OperationExclusionHistoryType();
    }

    /**
     * Create an instance of {@link FAMTREETRNRSType }
     * 
     */
    public FAMTREETRNRSType createFAMTREETRNRSType() {
        return new FAMTREETRNRSType();
    }

    /**
     * Create an instance of {@link ListOfSizeMetricDetailsType }
     * 
     */
    public ListOfSizeMetricDetailsType createListOfSizeMetricDetailsType() {
        return new ListOfSizeMetricDetailsType();
    }

    /**
     * Create an instance of {@link BusinessTypeType }
     * 
     */
    public BusinessTypeType createBusinessTypeType() {
        return new BusinessTypeType();
    }

    /**
     * Create an instance of {@link AddAlternateAddressResponseType }
     * 
     */
    public AddAlternateAddressResponseType createAddAlternateAddressResponseType() {
        return new AddAlternateAddressResponseType();
    }

    /**
     * Create an instance of {@link ExclusionSearchResultType }
     * 
     */
    public ExclusionSearchResultType createExclusionSearchResultType() {
        return new ExclusionSearchResultType();
    }

    /**
     * Create an instance of {@link SimpleQuestionAnswerType }
     * 
     */
    public SimpleQuestionAnswerType createSimpleQuestionAnswerType() {
        return new SimpleQuestionAnswerType();
    }

    /**
     * Create an instance of {@link ExclusionDateRangeType }
     * 
     */
    public ExclusionDateRangeType createExclusionDateRangeType() {
        return new ExclusionDateRangeType();
    }

    /**
     * Create an instance of {@link ListOfPSCType }
     * 
     */
    public ListOfPSCType createListOfPSCType() {
        return new ListOfPSCType();
    }

    /**
     * Create an instance of {@link QualificationsType }
     * 
     */
    public QualificationsType createQualificationsType() {
        return new QualificationsType();
    }

    /**
     * Create an instance of {@link ListOfExclusionsActionType }
     * 
     */
    public ListOfExclusionsActionType createListOfExclusionsActionType() {
        return new ListOfExclusionsActionType();
    }

    /**
     * Create an instance of {@link FinancialAccountType }
     * 
     */
    public FinancialAccountType createFinancialAccountType() {
        return new FinancialAccountType();
    }

    /**
     * Create an instance of {@link TINInformationType }
     * 
     */
    public TINInformationType createTINInformationType() {
        return new TINInformationType();
    }

    /**
     * Create an instance of {@link ListOfExecutiveCompensationQuestionsType }
     * 
     */
    public ListOfExecutiveCompensationQuestionsType createListOfExecutiveCompensationQuestionsType() {
        return new ListOfExecutiveCompensationQuestionsType();
    }

    /**
     * Create an instance of {@link PointsOfContactType }
     * 
     */
    public PointsOfContactType createPointsOfContactType() {
        return new PointsOfContactType();
    }

    /**
     * Create an instance of {@link TINHolderStatus }
     * 
     */
    public TINHolderStatus createTINHolderStatus() {
        return new TINHolderStatus();
    }

    /**
     * Create an instance of {@link EndProduct }
     * 
     */
    public EndProduct createEndProduct() {
        return new EndProduct();
    }

    /**
     * Create an instance of {@link ForeignGovtControl }
     * 
     */
    public ForeignGovtControl createForeignGovtControl() {
        return new ForeignGovtControl();
    }

    /**
     * Create an instance of {@link AddDescriptionResponseType }
     * 
     */
    public AddDescriptionResponseType createAddDescriptionResponseType() {
        return new AddDescriptionResponseType();
    }

    /**
     * Create an instance of {@link RSEULPPAYDHISTAggType }
     * 
     */
    public RSEULPPAYDHISTAggType createRSEULPPAYDHISTAggType() {
        return new RSEULPPAYDHISTAggType();
    }

    /**
     * Create an instance of {@link DUNSType }
     * 
     */
    public DUNSType createDUNSType() {
        return new DUNSType();
    }

    /**
     * Create an instance of {@link MailingAddressType }
     * 
     */
    public MailingAddressType createMailingAddressType() {
        return new MailingAddressType();
    }

    /**
     * Create an instance of {@link ListOfSearchExclusionReferenceType }
     * 
     */
    public ListOfSearchExclusionReferenceType createListOfSearchExclusionReferenceType() {
        return new ListOfSearchExclusionReferenceType();
    }

    /**
     * Create an instance of {@link ListOfAnswerType }
     * 
     */
    public ListOfAnswerType createListOfAnswerType() {
        return new ListOfAnswerType();
    }

    /**
     * Create an instance of {@link TransactionInfoType }
     * 
     */
    public TransactionInfoType createTransactionInfoType() {
        return new TransactionInfoType();
    }

    /**
     * Create an instance of {@link FinancialInformationType }
     * 
     */
    public FinancialInformationType createFinancialInformationType() {
        return new FinancialInformationType();
    }

    /**
     * Create an instance of {@link RemittanceInformationType }
     * 
     */
    public RemittanceInformationType createRemittanceInformationType() {
        return new RemittanceInformationType();
    }

    /**
     * Create an instance of {@link GAFLDATTR2Type }
     * 
     */
    public GAFLDATTR2Type createGAFLDATTR2Type() {
        return new GAFLDATTR2Type();
    }

    /**
     * Create an instance of {@link CAGECodeList }
     * 
     */
    public CAGECodeList createCAGECodeList() {
        return new CAGECodeList();
    }

    /**
     * Create an instance of {@link ExclusionDetailsType }
     * 
     */
    public ExclusionDetailsType createExclusionDetailsType() {
        return new ExclusionDetailsType();
    }

    /**
     * Create an instance of {@link ListOfSBABusinessTypesType }
     * 
     */
    public ListOfSBABusinessTypesType createListOfSBABusinessTypesType() {
        return new ListOfSBABusinessTypesType();
    }

    /**
     * Create an instance of {@link ExclusionFilter }
     * 
     */
    public ExclusionFilter createExclusionFilter() {
        return new ExclusionFilter();
    }

    /**
     * Create an instance of {@link FSCInfo }
     * 
     */
    public FSCInfo createFSCInfo() {
        return new FSCInfo();
    }

    /**
     * Create an instance of {@link DeleteDescriptionResponseType }
     * 
     */
    public DeleteDescriptionResponseType createDeleteDescriptionResponseType() {
        return new DeleteDescriptionResponseType();
    }

    /**
     * Create an instance of {@link AssertionsType }
     * 
     */
    public AssertionsType createAssertionsType() {
        return new AssertionsType();
    }

    /**
     * Create an instance of {@link UserAuthenticationKeyType }
     * 
     */
    public UserAuthenticationKeyType createUserAuthenticationKeyType() {
        return new UserAuthenticationKeyType();
    }

    /**
     * Create an instance of {@link DisciplineInfo }
     * 
     */
    public DisciplineInfo createDisciplineInfo() {
        return new DisciplineInfo();
    }

    /**
     * Create an instance of {@link RSEULPPLAggType }
     * 
     */
    public RSEULPPLAggType createRSEULPPLAggType() {
        return new RSEULPPLAggType();
    }

    /**
     * Create an instance of {@link ListOfBondingLevelsType }
     * 
     */
    public ListOfBondingLevelsType createListOfBondingLevelsType() {
        return new ListOfBondingLevelsType();
    }

    /**
     * Create an instance of {@link ExclusionTypeListType }
     * 
     */
    public ExclusionTypeListType createExclusionTypeListType() {
        return new ExclusionTypeListType();
    }

    /**
     * Create an instance of {@link EntityFilterType }
     * 
     */
    public EntityFilterType createEntityFilterType() {
        return new EntityFilterType();
    }

    /**
     * Create an instance of {@link LaborSurplusConcern }
     * 
     */
    public LaborSurplusConcern createLaborSurplusConcern() {
        return new LaborSurplusConcern();
    }

    /**
     * Create an instance of {@link FederalHierarchyInformationType }
     * 
     */
    public FederalHierarchyInformationType createFederalHierarchyInformationType() {
        return new FederalHierarchyInformationType();
    }

    /**
     * Create an instance of {@link ListOfWarningsType }
     * 
     */
    public ListOfWarningsType createListOfWarningsType() {
        return new ListOfWarningsType();
    }

    /**
     * Create an instance of {@link ListOfExclusionsType }
     * 
     */
    public ListOfExclusionsType createListOfExclusionsType() {
        return new ListOfExclusionsType();
    }

    /**
     * Create an instance of {@link BusinessInformationType }
     * 
     */
    public BusinessInformationType createBusinessInformationType() {
        return new BusinessInformationType();
    }

    /**
     * Create an instance of {@link OutputMessagesType }
     * 
     */
    public OutputMessagesType createOutputMessagesType() {
        return new OutputMessagesType();
    }

    /**
     * Create an instance of {@link ClassificationListType }
     * 
     */
    public ClassificationListType createClassificationListType() {
        return new ClassificationListType();
    }

    /**
     * Create an instance of {@link ListOfExecutiveCompensationDetailsType }
     * 
     */
    public ListOfExecutiveCompensationDetailsType createListOfExecutiveCompensationDetailsType() {
        return new ListOfExecutiveCompensationDetailsType();
    }

    /**
     * Create an instance of {@link SizeMetricDetailsType }
     * 
     */
    public SizeMetricDetailsType createSizeMetricDetailsType() {
        return new SizeMetricDetailsType();
    }

    /**
     * Create an instance of {@link ListOfExclusionState }
     * 
     */
    public ListOfExclusionState createListOfExclusionState() {
        return new ListOfExclusionState();
    }

    /**
     * Create an instance of {@link MailingAddressTypes }
     * 
     */
    public MailingAddressTypes createMailingAddressTypes() {
        return new MailingAddressTypes();
    }

    /**
     * Create an instance of {@link EntityCoreDataType }
     * 
     */
    public EntityCoreDataType createEntityCoreDataType() {
        return new EntityCoreDataType();
    }

    /**
     * Create an instance of {@link FinancialAssistanceResponseURLsType }
     * 
     */
    public FinancialAssistanceResponseURLsType createFinancialAssistanceResponseURLsType() {
        return new FinancialAssistanceResponseURLsType();
    }

    /**
     * Create an instance of {@link ExclusionSearchCriteriaType }
     * 
     */
    public ExclusionSearchCriteriaType createExclusionSearchCriteriaType() {
        return new ExclusionSearchCriteriaType();
    }

    /**
     * Create an instance of {@link CAGEListType }
     * 
     */
    public CAGEListType createCAGEListType() {
        return new CAGEListType();
    }

    /**
     * Create an instance of {@link RSUSCOMMENTARYGRPType }
     * 
     */
    public RSUSCOMMENTARYGRPType createRSUSCOMMENTARYGRPType() {
        return new RSUSCOMMENTARYGRPType();
    }

    /**
     * Create an instance of {@link ServicesRevenue }
     * 
     */
    public ServicesRevenue createServicesRevenue() {
        return new ServicesRevenue();
    }

    /**
     * Create an instance of {@link DisasterReliefDataType }
     * 
     */
    public DisasterReliefDataType createDisasterReliefDataType() {
        return new DisasterReliefDataType();
    }

    /**
     * Create an instance of {@link SocioEconomic }
     * 
     */
    public SocioEconomic createSocioEconomic() {
        return new SocioEconomic();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link DebarringAgencyListType }
     * 
     */
    public DebarringAgencyListType createDebarringAgencyListType() {
        return new DebarringAgencyListType();
    }

    /**
     * Create an instance of {@link DateFilterType }
     * 
     */
    public DateFilterType createDateFilterType() {
        return new DateFilterType();
    }

    /**
     * Create an instance of {@link PSCCodeType }
     * 
     */
    public PSCCodeType createPSCCodeType() {
        return new PSCCodeType();
    }

    /**
     * Create an instance of {@link TransactionInformationType }
     * 
     */
    public TransactionInformationType createTransactionInformationType() {
        return new TransactionInformationType();
    }

    /**
     * Create an instance of {@link ListOfExclusionSearchAddressType }
     * 
     */
    public ListOfExclusionSearchAddressType createListOfExclusionSearchAddressType() {
        return new ListOfExclusionSearchAddressType();
    }

    /**
     * Create an instance of {@link ExclusionStateCountryType }
     * 
     */
    public ExclusionStateCountryType createExclusionStateCountryType() {
        return new ExclusionStateCountryType();
    }

    /**
     * Create an instance of {@link USDSPAYDGRPType }
     * 
     */
    public USDSPAYDGRPType createUSDSPAYDGRPType() {
        return new USDSPAYDGRPType();
    }

    /**
     * Create an instance of {@link EDIInformationType }
     * 
     */
    public EDIInformationType createEDIInformationType() {
        return new EDIInformationType();
    }

    /**
     * Create an instance of {@link ListOfGeographicAreaServedType }
     * 
     */
    public ListOfGeographicAreaServedType createListOfGeographicAreaServedType() {
        return new ListOfGeographicAreaServedType();
    }

    /**
     * Create an instance of {@link ListOfErrorsType }
     * 
     */
    public ListOfErrorsType createListOfErrorsType() {
        return new ListOfErrorsType();
    }

    /**
     * Create an instance of {@link GAFLDATTR3Type }
     * 
     */
    public GAFLDATTR3Type createGAFLDATTR3Type() {
        return new GAFLDATTR3Type();
    }

    /**
     * Create an instance of {@link NPIListType }
     * 
     */
    public NPIListType createNPIListType() {
        return new NPIListType();
    }

    /**
     * Create an instance of {@link UpdateDescriptionResponseType }
     * 
     */
    public UpdateDescriptionResponseType createUpdateDescriptionResponseType() {
        return new UpdateDescriptionResponseType();
    }

    /**
     * Create an instance of {@link PointOfContact }
     * 
     */
    public PointOfContact createPointOfContact() {
        return new PointOfContact();
    }

    /**
     * Create an instance of {@link ExclusionAddressType }
     * 
     */
    public ExclusionAddressType createExclusionAddressType() {
        return new ExclusionAddressType();
    }

    /**
     * Create an instance of {@link ExclusionSearchResponseType }
     * 
     */
    public ExclusionSearchResponseType createExclusionSearchResponseType() {
        return new ExclusionSearchResponseType();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link RepsAndCertsType }
     * 
     */
    public RepsAndCertsType createRepsAndCertsType() {
        return new RepsAndCertsType();
    }

    /**
     * Create an instance of {@link SBACertificationType }
     * 
     */
    public SBACertificationType createSBACertificationType() {
        return new SBACertificationType();
    }

    /**
     * Create an instance of {@link BusinessObjectType }
     * 
     */
    public BusinessObjectType createBusinessObjectType() {
        return new BusinessObjectType();
    }

    /**
     * Create an instance of {@link SBACertificationProgramType }
     * 
     */
    public SBACertificationProgramType createSBACertificationProgramType() {
        return new SBACertificationProgramType();
    }

    /**
     * Create an instance of {@link FAMTREEMBRType }
     * 
     */
    public FAMTREEMBRType createFAMTREEMBRType() {
        return new FAMTREEMBRType();
    }

    /**
     * Create an instance of {@link ExclusionTypeCategoryType }
     * 
     */
    public ExclusionTypeCategoryType createExclusionTypeCategoryType() {
        return new ExclusionTypeCategoryType();
    }

    /**
     * Create an instance of {@link EntityDUNSInformationType }
     * 
     */
    public EntityDUNSInformationType createEntityDUNSInformationType() {
        return new EntityDUNSInformationType();
    }

    /**
     * Create an instance of {@link OperationSearchType }
     * 
     */
    public OperationSearchType createOperationSearchType() {
        return new OperationSearchType();
    }

    /**
     * Create an instance of {@link ExclusionSearchCountResultType }
     * 
     */
    public ExclusionSearchCountResultType createExclusionSearchCountResultType() {
        return new ExclusionSearchCountResultType();
    }

    /**
     * Create an instance of {@link RSEULPBSAggType }
     * 
     */
    public RSEULPBSAggType createRSEULPBSAggType() {
        return new RSEULPBSAggType();
    }

    /**
     * Create an instance of {@link UpdateAlternateAddressResponseType }
     * 
     */
    public UpdateAlternateAddressResponseType createUpdateAlternateAddressResponseType() {
        return new UpdateAlternateAddressResponseType();
    }

    /**
     * Create an instance of {@link ExTransactionInfoType }
     * 
     */
    public ExTransactionInfoType createExTransactionInfoType() {
        return new ExTransactionInfoType();
    }

    /**
     * Create an instance of {@link ExclusionAgencyType }
     * 
     */
    public ExclusionAgencyType createExclusionAgencyType() {
        return new ExclusionAgencyType();
    }

    /**
     * Create an instance of {@link ListOfExclusionAgencyType }
     * 
     */
    public ListOfExclusionAgencyType createListOfExclusionAgencyType() {
        return new ListOfExclusionAgencyType();
    }

    /**
     * Create an instance of {@link IndustrySpecificSizeMetricsType }
     * 
     */
    public IndustrySpecificSizeMetricsType createIndustrySpecificSizeMetricsType() {
        return new IndustrySpecificSizeMetricsType();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link NaicsAnswerType }
     * 
     */
    public NaicsAnswerType createNaicsAnswerType() {
        return new NaicsAnswerType();
    }

    /**
     * Create an instance of {@link RSEULPFINCALCAggType }
     * 
     */
    public RSEULPFINCALCAggType createRSEULPFINCALCAggType() {
        return new RSEULPFINCALCAggType();
    }

    /**
     * Create an instance of {@link DNBMonitoringType }
     * 
     */
    public DNBMonitoringType createDNBMonitoringType() {
        return new DNBMonitoringType();
    }

    /**
     * Create an instance of {@link ListOfParametersType }
     * 
     */
    public ListOfParametersType createListOfParametersType() {
        return new ListOfParametersType();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link DeleteExclusionResponseType }
     * 
     */
    public DeleteExclusionResponseType createDeleteExclusionResponseType() {
        return new DeleteExclusionResponseType();
    }

    /**
     * Create an instance of {@link MapItemType }
     * 
     */
    public MapItemType createMapItemType() {
        return new MapItemType();
    }

    /**
     * Create an instance of {@link ExclusionHistoryResponseType }
     * 
     */
    public ExclusionHistoryResponseType createExclusionHistoryResponseType() {
        return new ExclusionHistoryResponseType();
    }

    /**
     * Create an instance of {@link UpdateExclusionResponseType }
     * 
     */
    public UpdateExclusionResponseType createUpdateExclusionResponseType() {
        return new UpdateExclusionResponseType();
    }

    /**
     * Create an instance of {@link URL }
     * 
     */
    public URL createURL() {
        return new URL();
    }

    /**
     * Create an instance of {@link OutputMessages }
     * 
     */
    public OutputMessages createOutputMessages() {
        return new OutputMessages();
    }

    /**
     * Create an instance of {@link CertificationsType }
     * 
     */
    public CertificationsType createCertificationsType() {
        return new CertificationsType();
    }

    /**
     * Create an instance of {@link ListOfInfoMessagesType }
     * 
     */
    public ListOfInfoMessagesType createListOfInfoMessagesType() {
        return new ListOfInfoMessagesType();
    }

    /**
     * Create an instance of {@link RegistrationPurposeType }
     * 
     */
    public RegistrationPurposeType createRegistrationPurposeType() {
        return new RegistrationPurposeType();
    }

    /**
     * Create an instance of {@link ExecutiveDetailsType }
     * 
     */
    public ExecutiveDetailsType createExecutiveDetailsType() {
        return new ExecutiveDetailsType();
    }

    /**
     * Create an instance of {@link GeographicalAreaServedType }
     * 
     */
    public GeographicalAreaServedType createGeographicalAreaServedType() {
        return new GeographicalAreaServedType();
    }

    /**
     * Create an instance of {@link RegistrationInformationType }
     * 
     */
    public RegistrationInformationType createRegistrationInformationType() {
        return new RegistrationInformationType();
    }

    /**
     * Create an instance of {@link RequestedData }
     * 
     */
    public RequestedData createRequestedData() {
        return new RequestedData();
    }

    /**
     * Create an instance of {@link CAGEInformationType }
     * 
     */
    public CAGEInformationType createCAGEInformationType() {
        return new CAGEInformationType();
    }

    /**
     * Create an instance of {@link OperationExSSNSearchType }
     * 
     */
    public OperationExSSNSearchType createOperationExSSNSearchType() {
        return new OperationExSSNSearchType();
    }

    /**
     * Create an instance of {@link ExclusionSearchHistoryCountResultType }
     * 
     */
    public ExclusionSearchHistoryCountResultType createExclusionSearchHistoryCountResultType() {
        return new ExclusionSearchHistoryCountResultType();
    }

    /**
     * Create an instance of {@link RSEULPFINAggType }
     * 
     */
    public RSEULPFINAggType createRSEULPFINAggType() {
        return new RSEULPFINAggType();
    }

    /**
     * Create an instance of {@link GoodsAndServicesType }
     * 
     */
    public GoodsAndServicesType createGoodsAndServicesType() {
        return new GoodsAndServicesType();
    }

    /**
     * Create an instance of {@link CTCodeListType }
     * 
     */
    public CTCodeListType createCTCodeListType() {
        return new CTCodeListType();
    }

    /**
     * Create an instance of {@link FARResponseType }
     * 
     */
    public FARResponseType createFARResponseType() {
        return new FARResponseType();
    }

    /**
     * Create an instance of {@link GetExclusionsListType }
     * 
     */
    public GetExclusionsListType createGetExclusionsListType() {
        return new GetExclusionsListType();
    }

    /**
     * Create an instance of {@link ExclusionActionType }
     * 
     */
    public ExclusionActionType createExclusionActionType() {
        return new ExclusionActionType();
    }

    /**
     * Create an instance of {@link CertificationURLsType }
     * 
     */
    public CertificationURLsType createCertificationURLsType() {
        return new CertificationURLsType();
    }

    /**
     * Create an instance of {@link StateListType }
     * 
     */
    public StateListType createStateListType() {
        return new StateListType();
    }

    /**
     * Create an instance of {@link SBABusinessTypeType }
     * 
     */
    public SBABusinessTypeType createSBABusinessTypeType() {
        return new SBABusinessTypeType();
    }

    /**
     * Create an instance of {@link ProceedingsInformationType }
     * 
     */
    public ProceedingsInformationType createProceedingsInformationType() {
        return new ProceedingsInformationType();
    }

    /**
     * Create an instance of {@link ArchitectExperience }
     * 
     */
    public ArchitectExperience createArchitectExperience() {
        return new ArchitectExperience();
    }

    /**
     * Create an instance of {@link ExclusionSearchResponseBaseType }
     * 
     */
    public ExclusionSearchResponseBaseType createExclusionSearchResponseBaseType() {
        return new ExclusionSearchResponseBaseType();
    }

    /**
     * Create an instance of {@link Facility }
     * 
     */
    public Facility createFacility() {
        return new Facility();
    }

    /**
     * Create an instance of {@link ListOfProvisionsType }
     * 
     */
    public ListOfProvisionsType createListOfProvisionsType() {
        return new ListOfProvisionsType();
    }

    /**
     * Create an instance of {@link GeneralInformationType }
     * 
     */
    public GeneralInformationType createGeneralInformationType() {
        return new GeneralInformationType();
    }

    /**
     * Create an instance of {@link ACHInformationType }
     * 
     */
    public ACHInformationType createACHInformationType() {
        return new ACHInformationType();
    }

    /**
     * Create an instance of {@link OperationExArchiveSearchType }
     * 
     */
    public OperationExArchiveSearchType createOperationExArchiveSearchType() {
        return new OperationExArchiveSearchType();
    }

    /**
     * Create an instance of {@link BondingLevelType }
     * 
     */
    public BondingLevelType createBondingLevelType() {
        return new BondingLevelType();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link FAMTREERSType }
     * 
     */
    public FAMTREERSType createFAMTREERSType() {
        return new FAMTREERSType();
    }

    /**
     * Create an instance of {@link RSUSPRNTBKCYFILGGRPType }
     * 
     */
    public RSUSPRNTBKCYFILGGRPType createRSUSPRNTBKCYFILGGRPType() {
        return new RSUSPRNTBKCYFILGGRPType();
    }

    /**
     * Create an instance of {@link MapType }
     * 
     */
    public MapType createMapType() {
        return new MapType();
    }

    /**
     * Create an instance of {@link InfoType }
     * 
     */
    public InfoType createInfoType() {
        return new InfoType();
    }

    /**
     * Create an instance of {@link ExclusionReferenceType }
     * 
     */
    public ExclusionReferenceType createExclusionReferenceType() {
        return new ExclusionReferenceType();
    }

    /**
     * Create an instance of {@link RSUSPRNTBKCYCONVGRPType }
     * 
     */
    public RSUSPRNTBKCYCONVGRPType createRSUSPRNTBKCYCONVGRPType() {
        return new RSUSPRNTBKCYCONVGRPType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link ListOfExclusionType }
     * 
     */
    public ListOfExclusionType createListOfExclusionType() {
        return new ListOfExclusionType();
    }

    /**
     * Create an instance of {@link EntitySearchCriteriaType }
     * 
     */
    public EntitySearchCriteriaType createEntitySearchCriteriaType() {
        return new EntitySearchCriteriaType();
    }

    /**
     * Create an instance of {@link ExclusionClassificationCategoryType }
     * 
     */
    public ExclusionClassificationCategoryType createExclusionClassificationCategoryType() {
        return new ExclusionClassificationCategoryType();
    }

    /**
     * Create an instance of {@link DateRangeType }
     * 
     */
    public DateRangeType createDateRangeType() {
        return new DateRangeType();
    }

    /**
     * Create an instance of {@link OperationSearchCountType }
     * 
     */
    public OperationSearchCountType createOperationSearchCountType() {
        return new OperationSearchCountType();
    }

    /**
     * Create an instance of {@link HistoryCountDataPointType }
     * 
     */
    public HistoryCountDataPointType createHistoryCountDataPointType() {
        return new HistoryCountDataPointType();
    }

    /**
     * Create an instance of {@link ListOfNAICSType }
     * 
     */
    public ListOfNAICSType createListOfNAICSType() {
        return new ListOfNAICSType();
    }

    /**
     * Create an instance of {@link DUNSList }
     * 
     */
    public DUNSList createDUNSList() {
        return new DUNSList();
    }

    /**
     * Create an instance of {@link IdentificationInformationType }
     * 
     */
    public IdentificationInformationType createIdentificationInformationType() {
        return new IdentificationInformationType();
    }

    /**
     * Create an instance of {@link RSSCRGRPType }
     * 
     */
    public RSSCRGRPType createRSSCRGRPType() {
        return new RSSCRGRPType();
    }

    /**
     * Create an instance of {@link ListOfProceedingsQuestionsType }
     * 
     */
    public ListOfProceedingsQuestionsType createListOfProceedingsQuestionsType() {
        return new ListOfProceedingsQuestionsType();
    }

    /**
     * Create an instance of {@link ListOfBusinessTypesType }
     * 
     */
    public ListOfBusinessTypesType createListOfBusinessTypesType() {
        return new ListOfBusinessTypesType();
    }

    /**
     * Create an instance of {@link ListOfFinancialInformationType }
     * 
     */
    public ListOfFinancialInformationType createListOfFinancialInformationType() {
        return new ListOfFinancialInformationType();
    }

    /**
     * Create an instance of {@link ExclusionProgramCategoryType }
     * 
     */
    public ExclusionProgramCategoryType createExclusionProgramCategoryType() {
        return new ExclusionProgramCategoryType();
    }

    /**
     * Create an instance of {@link FinancialAssistanceCertificationsType }
     * 
     */
    public FinancialAssistanceCertificationsType createFinancialAssistanceCertificationsType() {
        return new FinancialAssistanceCertificationsType();
    }

    /**
     * Create an instance of {@link CreateExclusionResponseType }
     * 
     */
    public CreateExclusionResponseType createCreateExclusionResponseType() {
        return new CreateExclusionResponseType();
    }

    /**
     * Create an instance of {@link ListOfExclusionAgencyUIDType }
     * 
     */
    public ListOfExclusionAgencyUIDType createListOfExclusionAgencyUIDType() {
        return new ListOfExclusionAgencyUIDType();
    }

    /**
     * Create an instance of {@link RSSCRAggType }
     * 
     */
    public RSSCRAggType createRSSCRAggType() {
        return new RSSCRAggType();
    }

    /**
     * Create an instance of {@link Discipline }
     * 
     */
    public Discipline createDiscipline() {
        return new Discipline();
    }

    /**
     * Create an instance of {@link USDSSCDYSICGRPType }
     * 
     */
    public USDSSCDYSICGRPType createUSDSSCDYSICGRPType() {
        return new USDSSCDYSICGRPType();
    }

    /**
     * Create an instance of {@link ListOfExclusionClassificationType }
     * 
     */
    public ListOfExclusionClassificationType createListOfExclusionClassificationType() {
        return new ListOfExclusionClassificationType();
    }

    /**
     * Create an instance of {@link EntityIdentificationType }
     * 
     */
    public EntityIdentificationType createEntityIdentificationType() {
        return new EntityIdentificationType();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link IndividualType }
     * 
     */
    public IndividualType createIndividualType() {
        return new IndividualType();
    }

    /**
     * Create an instance of {@link DnbaddressType }
     * 
     */
    public DnbaddressType createDnbaddressType() {
        return new DnbaddressType();
    }

    /**
     * Create an instance of {@link EFTInformationType }
     * 
     */
    public EFTInformationType createEFTInformationType() {
        return new EFTInformationType();
    }

    /**
     * Create an instance of {@link DeleteAlternateAddressResponseType }
     * 
     */
    public DeleteAlternateAddressResponseType createDeleteAlternateAddressResponseType() {
        return new DeleteAlternateAddressResponseType();
    }

    /**
     * Create an instance of {@link FreeTextAnswerType }
     * 
     */
    public FreeTextAnswerType createFreeTextAnswerType() {
        return new FreeTextAnswerType();
    }

    /**
     * Create an instance of {@link ExclusionSearchCountResponseType }
     * 
     */
    public ExclusionSearchCountResponseType createExclusionSearchCountResponseType() {
        return new ExclusionSearchCountResponseType();
    }

    /**
     * Create an instance of {@link USDSPAYDNORMQRTLGRPType }
     * 
     */
    public USDSPAYDNORMQRTLGRPType createUSDSPAYDNORMQRTLGRPType() {
        return new USDSPAYDNORMQRTLGRPType();
    }

    /**
     * Create an instance of {@link RSKEYFLDS2TYPE.KEYFLD }
     * 
     */
    public RSKEYFLDS2TYPE.KEYFLD createRSKEYFLDS2TYPEKEYFLD() {
        return new RSKEYFLDS2TYPE.KEYFLD();
    }

    /**
     * Create an instance of {@link RSCUSTINPDATATYPE3 .FLDLST }
     * 
     */
    public RSCUSTINPDATATYPE3 .FLDLST createRSCUSTINPDATATYPE3FLDLST() {
        return new RSCUSTINPDATATYPE3 .FLDLST();
    }

    /**
     * Create an instance of {@link RSCUSTINPDATATYPE2 .FLDLST }
     * 
     */
    public RSCUSTINPDATATYPE2 .FLDLST createRSCUSTINPDATATYPE2FLDLST() {
        return new RSCUSTINPDATATYPE2 .FLDLST();
    }

    /**
     * Create an instance of {@link RSCUSTINPDATATYPE1 .FLDLST }
     * 
     */
    public RSCUSTINPDATATYPE1 .FLDLST createRSCUSTINPDATATYPE1FLDLST() {
        return new RSCUSTINPDATATYPE1 .FLDLST();
    }

    /**
     * Create an instance of {@link RSUPDFLDSTYPE.UPDFLD }
     * 
     */
    public RSUPDFLDSTYPE.UPDFLD createRSUPDFLDSTYPEUPDFLD() {
        return new RSUPDFLDSTYPE.UPDFLD();
    }

    /**
     * Create an instance of {@link RSKEYFLDS3TYPE.KEYFLD }
     * 
     */
    public RSKEYFLDS3TYPE.KEYFLD createRSKEYFLDS3TYPEKEYFLD() {
        return new RSKEYFLDS3TYPE.KEYFLD();
    }

    /**
     * Create an instance of {@link RSUSSPCLEVNTType.USSPCLEVNTGRP }
     * 
     */
    public RSUSSPCLEVNTType.USSPCLEVNTGRP createRSUSSPCLEVNTTypeUSSPCLEVNTGRP() {
        return new RSUSSPCLEVNTType.USSPCLEVNTGRP();
    }

    /**
     * Create an instance of {@link GAFLDATTRComplexType.FLDALWDVAL }
     * 
     */
    public GAFLDATTRComplexType.FLDALWDVAL createGAFLDATTRComplexTypeFLDALWDVAL() {
        return new GAFLDATTRComplexType.FLDALWDVAL();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SBASizeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SBASizeRequest")
    public JAXBElement<SBASizeRequestType> createSBASizeRequest(SBASizeRequestType value) {
        return new JAXBElement<SBASizeRequestType>(_SBASizeRequest_QNAME, SBASizeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SystemException")
    public JAXBElement<SystemException> createSystemException(SystemException value) {
        return new JAXBElement<SystemException>(_SystemException_QNAME, SystemException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SBAFormallyDeterminedSizesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SBAFormallyDeterminedSizes")
    public JAXBElement<SBAFormallyDeterminedSizesType> createSBAFormallyDeterminedSizes(SBAFormallyDeterminedSizesType value) {
        return new JAXBElement<SBAFormallyDeterminedSizesType>(_SBAFormallyDeterminedSizes_QNAME, SBAFormallyDeterminedSizesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSBAManualCertificationUpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfSBAManualCertificationUpdate")
    public JAXBElement<ListOfSBAManualCertificationUpdateType> createListOfSBAManualCertificationUpdate(ListOfSBAManualCertificationUpdateType value) {
        return new JAXBElement<ListOfSBAManualCertificationUpdateType>(_ListOfSBAManualCertificationUpdate_QNAME, ListOfSBAManualCertificationUpdateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SBASizeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SBASizeResponse")
    public JAXBElement<SBASizeResponseType> createSBASizeResponse(SBASizeResponseType value) {
        return new JAXBElement<SBASizeResponseType>(_SBASizeResponse_QNAME, SBASizeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SBAManualCertificationUpdateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SBAManualCertificationUpdateRequest")
    public JAXBElement<SBAManualCertificationUpdateRequestType> createSBAManualCertificationUpdateRequest(SBAManualCertificationUpdateRequestType value) {
        return new JAXBElement<SBAManualCertificationUpdateRequestType>(_SBAManualCertificationUpdateRequest_QNAME, SBAManualCertificationUpdateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExdescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "exdescription")
    public JAXBElement<ExdescriptionType> createExdescription(ExdescriptionType value) {
        return new JAXBElement<ExdescriptionType>(_Exdescription_QNAME, ExdescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "searchCriteria")
    public JAXBElement<SearchCriteria> createSearchCriteria(SearchCriteria value) {
        return new JAXBElement<SearchCriteria>(_SearchCriteria_QNAME, SearchCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SizeMetricsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "sizeMetrics")
    public JAXBElement<SizeMetricsType> createSizeMetrics(SizeMetricsType value) {
        return new JAXBElement<SizeMetricsType>(_SizeMetrics_QNAME, SizeMetricsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SBAManualCertificationUpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SBAManualCertificationUpdate")
    public JAXBElement<SBAManualCertificationUpdateType> createSBAManualCertificationUpdate(SBAManualCertificationUpdateType value) {
        return new JAXBElement<SBAManualCertificationUpdateType>(_SBAManualCertificationUpdate_QNAME, SBAManualCertificationUpdateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSBASizeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfSBASize")
    public JAXBElement<ListOfSBASizeType> createListOfSBASize(ListOfSBASizeType value) {
        return new JAXBElement<ListOfSBASizeType>(_ListOfSBASize_QNAME, ListOfSBASizeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfAddressesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfAddresses")
    public JAXBElement<ListOfAddressesType> createListOfAddresses(ListOfAddressesType value) {
        return new JAXBElement<ListOfAddressesType>(_ListOfAddresses_QNAME, ListOfAddressesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfEntitiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfEntities")
    public JAXBElement<ListOfEntitiesType> createListOfEntities(ListOfEntitiesType value) {
        return new JAXBElement<ListOfEntitiesType>(_ListOfEntities_QNAME, ListOfEntitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrossReferenceExclusionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "crossReferenceExclusion")
    public JAXBElement<CrossReferenceExclusionType> createCrossReferenceExclusion(CrossReferenceExclusionType value) {
        return new JAXBElement<CrossReferenceExclusionType>(_CrossReferenceExclusion_QNAME, CrossReferenceExclusionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "exclusion")
    public JAXBElement<ExclusionType> createExclusion(ExclusionType value) {
        return new JAXBElement<ExclusionType>(_Exclusion_QNAME, ExclusionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "response")
    public JAXBElement<ResponseType> createResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_Response_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCommentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfComments")
    public JAXBElement<ListOfCommentType> createListOfComments(ListOfCommentType value) {
        return new JAXBElement<ListOfCommentType>(_ListOfComments_QNAME, ListOfCommentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SBAManualCertificationUpdateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SBAManualCertificationUpdateResponse")
    public JAXBElement<SBAManualCertificationUpdateResponseType> createSBAManualCertificationUpdateResponse(SBAManualCertificationUpdateResponseType value) {
        return new JAXBElement<SBAManualCertificationUpdateResponseType>(_SBAManualCertificationUpdateResponse_QNAME, SBAManualCertificationUpdateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisasterReliefAreaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "disasterReliefArea")
    public JAXBElement<DisasterReliefAreaType> createDisasterReliefArea(DisasterReliefAreaType value) {
        return new JAXBElement<DisasterReliefAreaType>(_DisasterReliefArea_QNAME, DisasterReliefAreaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SBASizeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SBASize")
    public JAXBElement<SBASizeType> createSBASize(SBASizeType value) {
        return new JAXBElement<SBASizeType>(_SBASize_QNAME, SBASizeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionCommentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "additionalComments")
    public JAXBElement<ExclusionCommentType> createAdditionalComments(ExclusionCommentType value) {
        return new JAXBElement<ExclusionCommentType>(_AdditionalComments_QNAME, ExclusionCommentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "ApplicationException")
    public JAXBElement<ApplicationException> createApplicationException(ApplicationException value) {
        return new JAXBElement<ApplicationException>(_ApplicationException_QNAME, ApplicationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfExclusionStateCountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfExclusionStateCountry")
    public JAXBElement<ListOfExclusionStateCountryType> createListOfExclusionStateCountry(ListOfExclusionStateCountryType value) {
        return new JAXBElement<ListOfExclusionStateCountryType>(_ListOfExclusionStateCountry_QNAME, ListOfExclusionStateCountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlternateAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "alternateAddress")
    public JAXBElement<AlternateAddressType> createAlternateAddress(AlternateAddressType value) {
        return new JAXBElement<AlternateAddressType>(_AlternateAddress_QNAME, AlternateAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "entity")
    public JAXBElement<EntityType> createEntity(EntityType value) {
        return new JAXBElement<EntityType>(_Entity_QNAME, EntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfPOCsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfPOCs")
    public JAXBElement<ListOfPOCsType> createListOfPOCs(ListOfPOCsType value) {
        return new JAXBElement<ListOfPOCsType>(_ListOfPOCs_QNAME, ListOfPOCsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "OperationType")
    public JAXBElement<String> createOperationType(String value) {
        return new JAXBElement<String>(_OperationType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POCTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "GovernmentBusinessPOC")
    public JAXBElement<POCTypes> createGovernmentBusinessPOC(POCTypes value) {
        return new JAXBElement<POCTypes>(_GovernmentBusinessPOC_QNAME, POCTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "getEntities")
    public JAXBElement<GetEntities> createGetEntities(GetEntities value) {
        return new JAXBElement<GetEntities>(_GetEntities_QNAME, GetEntities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfProceedingsInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfProceedingsInformation")
    public JAXBElement<ListOfProceedingsInformationType> createListOfProceedingsInformation(ListOfProceedingsInformationType value) {
        return new JAXBElement<ListOfProceedingsInformationType>(_ListOfProceedingsInformation_QNAME, ListOfProceedingsInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "POC")
    public JAXBElement<POCType> createPOC(POCType value) {
        return new JAXBElement<POCType>(_POC_QNAME, POCType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCrossReferenceExclusionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfCrossReferenceExclusions")
    public JAXBElement<ListOfCrossReferenceExclusionsType> createListOfCrossReferenceExclusions(ListOfCrossReferenceExclusionsType value) {
        return new JAXBElement<ListOfCrossReferenceExclusionsType>(_ListOfCrossReferenceExclusions_QNAME, ListOfCrossReferenceExclusionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "addressInfo")
    public JAXBElement<AddressTypes> createAddressInfo(AddressTypes value) {
        return new JAXBElement<AddressTypes>(_AddressInfo_QNAME, AddressTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfExclusions")
    public JAXBElement<ExclusionType> createListOfExclusions(ExclusionType value) {
        return new JAXBElement<ExclusionType>(_ListOfExclusions_QNAME, ExclusionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveFedNodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "moveFedNodeResponse")
    public JAXBElement<MoveFedNodeResponse> createMoveFedNodeResponse(MoveFedNodeResponse value) {
        return new JAXBElement<MoveFedNodeResponse>(_MoveFedNodeResponse_QNAME, MoveFedNodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "prefix", scope = IndividualType.class)
    public JAXBElement<String> createIndividualTypePrefix(String value) {
        return new JAXBElement<String>(_IndividualTypePrefix_QNAME, String.class, IndividualType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "last", scope = IndividualType.class)
    public JAXBElement<String> createIndividualTypeLast(String value) {
        return new JAXBElement<String>(_IndividualTypeLast_QNAME, String.class, IndividualType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "middle", scope = IndividualType.class)
    public JAXBElement<String> createIndividualTypeMiddle(String value) {
        return new JAXBElement<String>(_IndividualTypeMiddle_QNAME, String.class, IndividualType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "first", scope = IndividualType.class)
    public JAXBElement<String> createIndividualTypeFirst(String value) {
        return new JAXBElement<String>(_IndividualTypeFirst_QNAME, String.class, IndividualType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "suffix", scope = IndividualType.class)
    public JAXBElement<String> createIndividualTypeSuffix(String value) {
        return new JAXBElement<String>(_IndividualTypeSuffix_QNAME, String.class, IndividualType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hierarchyDepartmentCode", scope = FederalHierarchyInformationType.class)
    public JAXBElement<String> createFederalHierarchyInformationTypeHierarchyDepartmentCode(String value) {
        return new JAXBElement<String>(_FederalHierarchyInformationTypeHierarchyDepartmentCode_QNAME, String.class, FederalHierarchyInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hierarchyAgencyName", scope = FederalHierarchyInformationType.class)
    public JAXBElement<String> createFederalHierarchyInformationTypeHierarchyAgencyName(String value) {
        return new JAXBElement<String>(_FederalHierarchyInformationTypeHierarchyAgencyName_QNAME, String.class, FederalHierarchyInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hierarchyDepartmentName", scope = FederalHierarchyInformationType.class)
    public JAXBElement<String> createFederalHierarchyInformationTypeHierarchyDepartmentName(String value) {
        return new JAXBElement<String>(_FederalHierarchyInformationTypeHierarchyDepartmentName_QNAME, String.class, FederalHierarchyInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hierarchyOfficeCode", scope = FederalHierarchyInformationType.class)
    public JAXBElement<String> createFederalHierarchyInformationTypeHierarchyOfficeCode(String value) {
        return new JAXBElement<String>(_FederalHierarchyInformationTypeHierarchyOfficeCode_QNAME, String.class, FederalHierarchyInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hierarchyAgencyCode", scope = FederalHierarchyInformationType.class)
    public JAXBElement<String> createFederalHierarchyInformationTypeHierarchyAgencyCode(String value) {
        return new JAXBElement<String>(_FederalHierarchyInformationTypeHierarchyAgencyCode_QNAME, String.class, FederalHierarchyInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "PRIM_NME", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypePRIMNME(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypePRIMNME_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "STRT_YR", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeSTRTYR(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeSTRTYR_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FAMTREEMBRType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FAM_TREE_MBR", scope = FAMTREEMBRType.class)
    public JAXBElement<FAMTREEMBRType> createFAMTREEMBRTypeFAMTREEMBR(FAMTREEMBRType value) {
        return new JAXBElement<FAMTREEMBRType>(_FAMTREEMBRTypeFAMTREEMBR_QNAME, FAMTREEMBRType.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "OUT_BUS_IND", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeOUTBUSIND(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeOUTBUSIND_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "BR_IND", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeBRIND(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeBRIND_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "POST_CODE", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypePOSTCODE(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypePOSTCODE_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "BUS_REGN_NBR_TYPE_CD", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeBUSREGNNBRTYPECD(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeBUSREGNNBRTYPECD_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "HQ_DUNS", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeHQDUNS(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeHQDUNS_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "BUS_REGN_NBR", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeBUSREGNNBR(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeBUSREGNNBR_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSLOCNSTATType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "LOCN_STAT", scope = FAMTREEMBRType.class)
    public JAXBElement<RSLOCNSTATType> createFAMTREEMBRTypeLOCNSTAT(RSLOCNSTATType value) {
        return new JAXBElement<RSLOCNSTATType>(_FAMTREEMBRTypeLOCNSTAT_QNAME, RSLOCNSTATType.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "PRIM_SIC", scope = FAMTREEMBRType.class)
    public JAXBElement<BigInteger> createFAMTREEMBRTypePRIMSIC(BigInteger value) {
        return new JAXBElement<BigInteger>(_FAMTREEMBRTypePRIMSIC_QNAME, BigInteger.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAISOCountriesAlphaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "CTRY_CD", scope = FAMTREEMBRType.class)
    public JAXBElement<GAISOCountriesAlphaType> createFAMTREEMBRTypeCTRYCD(GAISOCountriesAlphaType value) {
        return new JAXBElement<GAISOCountriesAlphaType>(_FAMTREEMBRTypeCTRYCD_QNAME, GAISOCountriesAlphaType.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SIC_TYPE_CD", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeSICTYPECD(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeSICTYPECD_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "TRDG_STYL", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeTRDGSTYL(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeTRDGSTYL_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FAX_NBR", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeFAXNBR(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeFAXNBR_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "GBL_ULT_PNT_DUNS", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeGBLULTPNTDUNS(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeGBLULTPNTDUNS_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "TLCM_NBR", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeTLCMNBR(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeTLCMNBR_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "ADR_LINE", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeADRLINE(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeADRLINE_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SCDY_GEO_AREA", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeSCDYGEOAREA(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeSCDYGEOAREA_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "BUS_STRU", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeBUSSTRU(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeBUSSTRU_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "PRIM_GEO_AREA", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypePRIMGEOAREA(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypePRIMGEOAREA_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "DOM_ULT_PNT_DUNS", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeDOMULTPNTDUNS(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeDOMULTPNTDUNS_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "DUNS_NBR", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypeDUNSNBR(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeDUNSNBR_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "POST_TOWN", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypePOSTTOWN(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypePOSTTOWN_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "INTL_DLNG_CD", scope = FAMTREEMBRType.class)
    public JAXBElement<Short> createFAMTREEMBRTypeINTLDLNGCD(Short value) {
        return new JAXBElement<Short>(_FAMTREEMBRTypeINTLDLNGCD_QNAME, Short.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "PNT_DUNS", scope = FAMTREEMBRType.class)
    public JAXBElement<String> createFAMTREEMBRTypePNTDUNS(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypePNTDUNS_QNAME, String.class, FAMTREEMBRType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "US_DT_OF_DATA", scope = RSUSSPCLEVNTType.USSPCLEVNTGRP.class)
    public JAXBElement<String> createRSUSSPCLEVNTTypeUSSPCLEVNTGRPUSDTOFDATA(String value) {
        return new JAXBElement<String>(_RSUSSPCLEVNTTypeUSSPCLEVNTGRPUSDTOFDATA_QNAME, String.class, RSUSSPCLEVNTType.USSPCLEVNTGRP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "US_SPCL_EVNT_TXT", scope = RSUSSPCLEVNTType.USSPCLEVNTGRP.class)
    public JAXBElement<String> createRSUSSPCLEVNTTypeUSSPCLEVNTGRPUSSPCLEVNTTXT(String value) {
        return new JAXBElement<String>(_RSUSSPCLEVNTTypeUSSPCLEVNTGRPUSSPCLEVNTTXT_QNAME, String.class, RSUSSPCLEVNTType.USSPCLEVNTGRP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebarringAgencyListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "DebarringAgencies", scope = ExclusionFilter.class)
    public JAXBElement<DebarringAgencyListType> createExclusionFilterDebarringAgencies(DebarringAgencyListType value) {
        return new JAXBElement<DebarringAgencyListType>(_ExclusionFilterDebarringAgencies_QNAME, DebarringAgencyListType.class, ExclusionFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionTypeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "ExclusionTypes", scope = ExclusionFilter.class)
    public JAXBElement<ExclusionTypeListType> createExclusionFilterExclusionTypes(ExclusionTypeListType value) {
        return new JAXBElement<ExclusionTypeListType>(_ExclusionFilterExclusionTypes_QNAME, ExclusionTypeListType.class, ExclusionFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "CTCodes", scope = ExclusionFilter.class)
    public JAXBElement<CTCodeListType> createExclusionFilterCTCodes(CTCodeListType value) {
        return new JAXBElement<CTCodeListType>(_ExclusionFilterCTCodes_QNAME, CTCodeListType.class, ExclusionFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisasterReliefAreaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "disasterReliefArea", scope = DisasterReliefDataType.class)
    public JAXBElement<DisasterReliefAreaType> createDisasterReliefDataTypeDisasterReliefArea(DisasterReliefAreaType value) {
        return new JAXBElement<DisasterReliefAreaType>(_DisasterReliefDataTypeDisasterReliefArea_QNAME, DisasterReliefAreaType.class, DisasterReliefDataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfBondingLevelsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "listOfBondingLevels", scope = DisasterReliefDataType.class)
    public JAXBElement<ListOfBondingLevelsType> createDisasterReliefDataTypeListOfBondingLevels(ListOfBondingLevelsType value) {
        return new JAXBElement<ListOfBondingLevelsType>(_DisasterReliefDataTypeListOfBondingLevels_QNAME, ListOfBondingLevelsType.class, DisasterReliefDataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "descriptionId", scope = ExclusionCommentType.class)
    public JAXBElement<BigInteger> createExclusionCommentTypeDescriptionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_ExclusionCommentTypeDescriptionId_QNAME, BigInteger.class, ExclusionCommentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "additionalComments", scope = ExclusionCommentType.class)
    public JAXBElement<String> createExclusionCommentTypeAdditionalComments(String value) {
        return new JAXBElement<String>(_AdditionalComments_QNAME, String.class, ExclusionCommentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionSearchCountResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "counts", scope = ExclusionSearchCountResponseType.class)
    public JAXBElement<ExclusionSearchCountResultType> createExclusionSearchCountResponseTypeCounts(ExclusionSearchCountResultType value) {
        return new JAXBElement<ExclusionSearchCountResultType>(_ExclusionSearchCountResponseTypeCounts_QNAME, ExclusionSearchCountResultType.class, ExclusionSearchCountResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExTransactionInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transactionInformation", scope = ExclusionSearchCountResponseType.class)
    public JAXBElement<ExTransactionInfoType> createExclusionSearchCountResponseTypeTransactionInformation(ExTransactionInfoType value) {
        return new JAXBElement<ExTransactionInfoType>(_ExclusionSearchCountResponseTypeTransactionInformation_QNAME, ExTransactionInfoType.class, ExclusionSearchCountResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "employeeSize", scope = SBAFormallyDeterminedSizesType.class)
    public JAXBElement<String> createSBAFormallyDeterminedSizesTypeEmployeeSize(String value) {
        return new JAXBElement<String>(_SBAFormallyDeterminedSizesTypeEmployeeSize_QNAME, String.class, SBAFormallyDeterminedSizesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "totalAssets", scope = SBAFormallyDeterminedSizesType.class)
    public JAXBElement<String> createSBAFormallyDeterminedSizesTypeTotalAssets(String value) {
        return new JAXBElement<String>(_SBAFormallyDeterminedSizesTypeTotalAssets_QNAME, String.class, SBAFormallyDeterminedSizesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "revenueSize", scope = SBAFormallyDeterminedSizesType.class)
    public JAXBElement<String> createSBAFormallyDeterminedSizesTypeRevenueSize(String value) {
        return new JAXBElement<String>(_SBAFormallyDeterminedSizesTypeRevenueSize_QNAME, String.class, SBAFormallyDeterminedSizesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "oilBarrel", scope = SBAFormallyDeterminedSizesType.class)
    public JAXBElement<String> createSBAFormallyDeterminedSizesTypeOilBarrel(String value) {
        return new JAXBElement<String>(_SBAFormallyDeterminedSizesTypeOilBarrel_QNAME, String.class, SBAFormallyDeterminedSizesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "megawattHours", scope = SBAFormallyDeterminedSizesType.class)
    public JAXBElement<String> createSBAFormallyDeterminedSizesTypeMegawattHours(String value) {
        return new JAXBElement<String>(_SBAFormallyDeterminedSizesTypeMegawattHours_QNAME, String.class, SBAFormallyDeterminedSizesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "determinationDate", scope = SBAFormallyDeterminedSizesType.class)
    public JAXBElement<String> createSBAFormallyDeterminedSizesTypeDeterminationDate(String value) {
        return new JAXBElement<String>(_SBAFormallyDeterminedSizesTypeDeterminationDate_QNAME, String.class, SBAFormallyDeterminedSizesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SUPPORT_MESSAGE", scope = RSSTATUSType.class)
    public JAXBElement<String> createRSSTATUSTypeSUPPORTMESSAGE(String value) {
        return new JAXBElement<String>(_RSSTATUSTypeSUPPORTMESSAGE_QNAME, String.class, RSSTATUSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "CODE", scope = RSSTATUSType.class)
    public JAXBElement<BigInteger> createRSSTATUSTypeCODE(BigInteger value) {
        return new JAXBElement<BigInteger>(_RSSTATUSTypeCODE_QNAME, BigInteger.class, RSSTATUSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "TECH_MESSAGE", scope = RSSTATUSType.class)
    public JAXBElement<String> createRSSTATUSTypeTECHMESSAGE(String value) {
        return new JAXBElement<String>(_RSSTATUSTypeTECHMESSAGE_QNAME, String.class, RSSTATUSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "MESSAGE", scope = RSSTATUSType.class)
    public JAXBElement<String> createRSSTATUSTypeMESSAGE(String value) {
        return new JAXBElement<String>(_RSSTATUSTypeMESSAGE_QNAME, String.class, RSSTATUSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SEVERITY", scope = RSSTATUSType.class)
    public JAXBElement<String> createRSSTATUSTypeSEVERITY(String value) {
        return new JAXBElement<String>(_RSSTATUSTypeSEVERITY_QNAME, String.class, RSSTATUSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value", scope = MapItemType.class)
    public JAXBElement<Object> createMapItemTypeValue(Object value) {
        return new JAXBElement<Object>(_MapItemTypeValue_QNAME, Object.class, MapItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "key", scope = MapItemType.class)
    public JAXBElement<Object> createMapItemTypeKey(Object value) {
        return new JAXBElement<Object>(_MapItemTypeKey_QNAME, Object.class, MapItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ISAQualifier", scope = EDIInformationType.class)
    public JAXBElement<String> createEDIInformationTypeISAQualifier(String value) {
        return new JAXBElement<String>(_EDIInformationTypeISAQualifier_QNAME, String.class, EDIInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ISAIdentifier", scope = EDIInformationType.class)
    public JAXBElement<String> createEDIInformationTypeISAIdentifier(String value) {
        return new JAXBElement<String>(_EDIInformationTypeISAIdentifier_QNAME, String.class, EDIInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VANProvider", scope = EDIInformationType.class)
    public JAXBElement<String> createEDIInformationTypeVANProvider(String value) {
        return new JAXBElement<String>(_EDIInformationTypeVANProvider_QNAME, String.class, EDIInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "functionalGroupIdentifier", scope = EDIInformationType.class)
    public JAXBElement<String> createEDIInformationTypeFunctionalGroupIdentifier(String value) {
        return new JAXBElement<String>(_EDIInformationTypeFunctionalGroupIdentifier_QNAME, String.class, EDIInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestFlag820s", scope = EDIInformationType.class)
    public JAXBElement<String> createEDIInformationTypeRequestFlag820S(String value) {
        return new JAXBElement<String>(_EDIInformationTypeRequestFlag820S_QNAME, String.class, EDIInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stateOrProvince", scope = AddressTypes.class)
    public JAXBElement<String> createAddressTypesStateOrProvince(String value) {
        return new JAXBElement<String>(_AddressTypesStateOrProvince_QNAME, String.class, AddressTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "city", scope = AddressTypes.class)
    public JAXBElement<String> createAddressTypesCity(String value) {
        return new JAXBElement<String>(_AddressTypesCity_QNAME, String.class, AddressTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "addressLine1", scope = AddressTypes.class)
    public JAXBElement<String> createAddressTypesAddressLine1(String value) {
        return new JAXBElement<String>(_AddressTypesAddressLine1_QNAME, String.class, AddressTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "addressLine2", scope = AddressTypes.class)
    public JAXBElement<String> createAddressTypesAddressLine2(String value) {
        return new JAXBElement<String>(_AddressTypesAddressLine2_QNAME, String.class, AddressTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfExclusionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfExclusions", scope = GetExclusionsListType.class)
    public JAXBElement<ListOfExclusionsType> createGetExclusionsListTypeListOfExclusions(ListOfExclusionsType value) {
        return new JAXBElement<ListOfExclusionsType>(_ListOfExclusions_QNAME, ListOfExclusionsType.class, GetExclusionsListType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "isAdded", scope = AddAlternateAddressResponseType.class)
    public JAXBElement<Boolean> createAddAlternateAddressResponseTypeIsAdded(Boolean value) {
        return new JAXBElement<Boolean>(_AddAlternateAddressResponseTypeIsAdded_QNAME, Boolean.class, AddAlternateAddressResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "identificationInformation", scope = AlternateAddressType.class)
    public JAXBElement<IdentificationInformationType> createAlternateAddressTypeIdentificationInformation(IdentificationInformationType value) {
        return new JAXBElement<IdentificationInformationType>(_AlternateAddressTypeIdentificationInformation_QNAME, IdentificationInformationType.class, AlternateAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "transactionInformation", scope = AlternateAddressType.class)
    public JAXBElement<TransactionInformationType> createAlternateAddressTypeTransactionInformation(TransactionInformationType value) {
        return new JAXBElement<TransactionInformationType>(_AlternateAddressTypeTransactionInformation_QNAME, TransactionInformationType.class, AlternateAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "outputMessages", scope = MoveFedNodeResponse.class)
    public JAXBElement<OutputMessages> createMoveFedNodeResponseOutputMessages(OutputMessages value) {
        return new JAXBElement<OutputMessages>(_MoveFedNodeResponseOutputMessages_QNAME, OutputMessages.class, MoveFedNodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "exclusionProgram", scope = ExclusionSearchResultType.class)
    public JAXBElement<String> createExclusionSearchResultTypeExclusionProgram(String value) {
        return new JAXBElement<String>(_ExclusionSearchResultTypeExclusionProgram_QNAME, String.class, ExclusionSearchResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfExclusionsActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "listOfactions", scope = ExclusionSearchResultType.class)
    public JAXBElement<ListOfExclusionsActionType> createExclusionSearchResultTypeListOfactions(ListOfExclusionsActionType value) {
        return new JAXBElement<ListOfExclusionsActionType>(_ExclusionSearchResultTypeListOfactions_QNAME, ListOfExclusionsActionType.class, ExclusionSearchResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "exclusionType", scope = ExclusionSearchResultType.class)
    public JAXBElement<String> createExclusionSearchResultTypeExclusionType(String value) {
        return new JAXBElement<String>(_ExclusionSearchResultTypeExclusionType_QNAME, String.class, ExclusionSearchResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "DUNSNumber", scope = IdentificationInformationType.class)
    public JAXBElement<String> createIdentificationInformationTypeDUNSNumber(String value) {
        return new JAXBElement<String>(_IdentificationInformationTypeDUNSNumber_QNAME, String.class, IdentificationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "prefix", scope = IdentificationInformationType.class)
    public JAXBElement<String> createIdentificationInformationTypePrefix(String value) {
        return new JAXBElement<String>(_IndividualTypePrefix_QNAME, String.class, IdentificationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "NPI", scope = IdentificationInformationType.class)
    public JAXBElement<String> createIdentificationInformationTypeNPI(String value) {
        return new JAXBElement<String>(_IdentificationInformationTypeNPI_QNAME, String.class, IdentificationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "organizationName", scope = IdentificationInformationType.class)
    public JAXBElement<String> createIdentificationInformationTypeOrganizationName(String value) {
        return new JAXBElement<String>(_IdentificationInformationTypeOrganizationName_QNAME, String.class, IdentificationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfAddressesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfAlternateAddress", scope = IdentificationInformationType.class)
    public JAXBElement<ListOfAddressesType> createIdentificationInformationTypeListOfAlternateAddress(ListOfAddressesType value) {
        return new JAXBElement<ListOfAddressesType>(_IdentificationInformationTypeListOfAlternateAddress_QNAME, ListOfAddressesType.class, IdentificationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "firstName", scope = IdentificationInformationType.class)
    public JAXBElement<String> createIdentificationInformationTypeFirstName(String value) {
        return new JAXBElement<String>(_IdentificationInformationTypeFirstName_QNAME, String.class, IdentificationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "lastName", scope = IdentificationInformationType.class)
    public JAXBElement<String> createIdentificationInformationTypeLastName(String value) {
        return new JAXBElement<String>(_IdentificationInformationTypeLastName_QNAME, String.class, IdentificationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "suffix", scope = IdentificationInformationType.class)
    public JAXBElement<String> createIdentificationInformationTypeSuffix(String value) {
        return new JAXBElement<String>(_IndividualTypeSuffix_QNAME, String.class, IdentificationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "middleName", scope = IdentificationInformationType.class)
    public JAXBElement<String> createIdentificationInformationTypeMiddleName(String value) {
        return new JAXBElement<String>(_IdentificationInformationTypeMiddleName_QNAME, String.class, IdentificationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "cageCode", scope = IdentificationInformationType.class)
    public JAXBElement<String> createIdentificationInformationTypeCageCode(String value) {
        return new JAXBElement<String>(_IdentificationInformationTypeCageCode_QNAME, String.class, IdentificationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "primaryAddress", scope = IdentificationInformationType.class)
    public JAXBElement<AddressType> createIdentificationInformationTypePrimaryAddress(AddressType value) {
        return new JAXBElement<AddressType>(_IdentificationInformationTypePrimaryAddress_QNAME, AddressType.class, IdentificationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "TIN", scope = IdentificationInformationType.class)
    public JAXBElement<String> createIdentificationInformationTypeTIN(String value) {
        return new JAXBElement<String>(_IdentificationInformationTypeTIN_QNAME, String.class, IdentificationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfProvisionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "listOfProvisions", scope = FARResponseType.class)
    public JAXBElement<ListOfProvisionsType> createFARResponseTypeListOfProvisions(ListOfProvisionsType value) {
        return new JAXBElement<ListOfProvisionsType>(_FARResponseTypeListOfProvisions_QNAME, ListOfProvisionsType.class, FARResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uidType", scope = ExclusionAgencyUIDType.class)
    public JAXBElement<String> createExclusionAgencyUIDTypeUidType(String value) {
        return new JAXBElement<String>(_ExclusionAgencyUIDTypeUidType_QNAME, String.class, ExclusionAgencyUIDType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uidValue", scope = ExclusionAgencyUIDType.class)
    public JAXBElement<String> createExclusionAgencyUIDTypeUidValue(String value) {
        return new JAXBElement<String>(_ExclusionAgencyUIDTypeUidValue_QNAME, String.class, ExclusionAgencyUIDType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualificationsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "qualifications", scope = RepsAndCertsType.class)
    public JAXBElement<QualificationsType> createRepsAndCertsTypeQualifications(QualificationsType value) {
        return new JAXBElement<QualificationsType>(_RepsAndCertsTypeQualifications_QNAME, QualificationsType.class, RepsAndCertsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAssistanceCertificationsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "financialAssistanceCertifications", scope = RepsAndCertsType.class)
    public JAXBElement<FinancialAssistanceCertificationsType> createRepsAndCertsTypeFinancialAssistanceCertifications(FinancialAssistanceCertificationsType value) {
        return new JAXBElement<FinancialAssistanceCertificationsType>(_RepsAndCertsTypeFinancialAssistanceCertifications_QNAME, FinancialAssistanceCertificationsType.class, RepsAndCertsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificationsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "certifications", scope = RepsAndCertsType.class)
    public JAXBElement<CertificationsType> createRepsAndCertsTypeCertifications(CertificationsType value) {
        return new JAXBElement<CertificationsType>(_RepsAndCertsTypeCertifications_QNAME, CertificationsType.class, RepsAndCertsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "isUpdated", scope = UpdateAlternateAddressResponseType.class)
    public JAXBElement<Boolean> createUpdateAlternateAddressResponseTypeIsUpdated(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateAlternateAddressResponseTypeIsUpdated_QNAME, Boolean.class, UpdateAlternateAddressResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PDFURL", scope = FinancialAssistanceResponseURLsType.class)
    public JAXBElement<String> createFinancialAssistanceResponseURLsTypePDFURL(String value) {
        return new JAXBElement<String>(_FinancialAssistanceResponseURLsTypePDFURL_QNAME, String.class, FinancialAssistanceResponseURLsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "exclusion", scope = UpdateExclusionResponseType.class)
    public JAXBElement<ExclusionType> createUpdateExclusionResponseTypeExclusion(ExclusionType value) {
        return new JAXBElement<ExclusionType>(_Exclusion_QNAME, ExclusionType.class, UpdateExclusionResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustrySpecificSizeMetricsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "industrySpecificSizeMetrics", scope = SizeMetricDetailsType.class)
    public JAXBElement<IndustrySpecificSizeMetricsType> createSizeMetricDetailsTypeIndustrySpecificSizeMetrics(IndustrySpecificSizeMetricsType value) {
        return new JAXBElement<IndustrySpecificSizeMetricsType>(_SizeMetricDetailsTypeIndustrySpecificSizeMetrics_QNAME, IndustrySpecificSizeMetricsType.class, SizeMetricDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "receiptsLocation", scope = SizeMetricDetailsType.class)
    public JAXBElement<String> createSizeMetricDetailsTypeReceiptsLocation(String value) {
        return new JAXBElement<String>(_SizeMetricDetailsTypeReceiptsLocation_QNAME, String.class, SizeMetricDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "employeesLocation", scope = SizeMetricDetailsType.class)
    public JAXBElement<String> createSizeMetricDetailsTypeEmployeesLocation(String value) {
        return new JAXBElement<String>(_SizeMetricDetailsTypeEmployeesLocation_QNAME, String.class, SizeMetricDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "modifyDate", scope = OperationExclusionHistoryType.class)
    public JAXBElement<ExclusionDateRangeType> createOperationExclusionHistoryTypeModifyDate(ExclusionDateRangeType value) {
        return new JAXBElement<ExclusionDateRangeType>(_OperationExclusionHistoryTypeModifyDate_QNAME, ExclusionDateRangeType.class, OperationExclusionHistoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "periodicity", scope = OperationExclusionHistoryType.class)
    public JAXBElement<String> createOperationExclusionHistoryTypePeriodicity(String value) {
        return new JAXBElement<String>(_OperationExclusionHistoryTypePeriodicity_QNAME, String.class, OperationExclusionHistoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "termDate", scope = OperationExclusionHistoryType.class)
    public JAXBElement<ExclusionDateRangeType> createOperationExclusionHistoryTypeTermDate(ExclusionDateRangeType value) {
        return new JAXBElement<ExclusionDateRangeType>(_OperationExclusionHistoryTypeTermDate_QNAME, ExclusionDateRangeType.class, OperationExclusionHistoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actionDate", scope = OperationExclusionHistoryType.class)
    public JAXBElement<ExclusionDateRangeType> createOperationExclusionHistoryTypeActionDate(ExclusionDateRangeType value) {
        return new JAXBElement<ExclusionDateRangeType>(_OperationExclusionHistoryTypeActionDate_QNAME, ExclusionDateRangeType.class, OperationExclusionHistoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "createDate", scope = OperationExclusionHistoryType.class)
    public JAXBElement<ExclusionDateRangeType> createOperationExclusionHistoryTypeCreateDate(ExclusionDateRangeType value) {
        return new JAXBElement<ExclusionDateRangeType>(_OperationExclusionHistoryTypeCreateDate_QNAME, ExclusionDateRangeType.class, OperationExclusionHistoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "deleteDate", scope = OperationExclusionHistoryType.class)
    public JAXBElement<ExclusionDateRangeType> createOperationExclusionHistoryTypeDeleteDate(ExclusionDateRangeType value) {
        return new JAXBElement<ExclusionDateRangeType>(_OperationExclusionHistoryTypeDeleteDate_QNAME, ExclusionDateRangeType.class, OperationExclusionHistoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "emailAddress", scope = POCType.class)
    public JAXBElement<String> createPOCTypeEmailAddress(String value) {
        return new JAXBElement<String>(_POCTypeEmailAddress_QNAME, String.class, POCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "POCId", scope = POCType.class)
    public JAXBElement<BigInteger> createPOCTypePOCId(BigInteger value) {
        return new JAXBElement<BigInteger>(_POCTypePOCId_QNAME, BigInteger.class, POCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "middleInitial", scope = POCType.class)
    public JAXBElement<String> createPOCTypeMiddleInitial(String value) {
        return new JAXBElement<String>(_POCTypeMiddleInitial_QNAME, String.class, POCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "firstName", scope = POCType.class)
    public JAXBElement<String> createPOCTypeFirstName(String value) {
        return new JAXBElement<String>(_IdentificationInformationTypeFirstName_QNAME, String.class, POCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "USPhoneExtension", scope = POCType.class)
    public JAXBElement<String> createPOCTypeUSPhoneExtension(String value) {
        return new JAXBElement<String>(_POCTypeUSPhoneExtension_QNAME, String.class, POCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "USPhone", scope = POCType.class)
    public JAXBElement<String> createPOCTypeUSPhone(String value) {
        return new JAXBElement<String>(_POCTypeUSPhone_QNAME, String.class, POCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "fax", scope = POCType.class)
    public JAXBElement<String> createPOCTypeFax(String value) {
        return new JAXBElement<String>(_POCTypeFax_QNAME, String.class, POCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "POCType", scope = POCType.class)
    public JAXBElement<String> createPOCTypePOCType(String value) {
        return new JAXBElement<String>(_POCTypePOCType_QNAME, String.class, POCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "address", scope = POCType.class)
    public JAXBElement<AddressType> createPOCTypeAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, POCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "notes", scope = POCType.class)
    public JAXBElement<String> createPOCTypeNotes(String value) {
        return new JAXBElement<String>(_POCTypeNotes_QNAME, String.class, POCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "lastName", scope = POCType.class)
    public JAXBElement<String> createPOCTypeLastName(String value) {
        return new JAXBElement<String>(_IdentificationInformationTypeLastName_QNAME, String.class, POCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "title", scope = POCType.class)
    public JAXBElement<String> createPOCTypeTitle(String value) {
        return new JAXBElement<String>(_POCTypeTitle_QNAME, String.class, POCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "nonUSPhone", scope = POCType.class)
    public JAXBElement<String> createPOCTypeNonUSPhone(String value) {
        return new JAXBElement<String>(_POCTypeNonUSPhone_QNAME, String.class, POCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNSNumber", scope = EntityIdentificationType.class)
    public JAXBElement<String> createEntityIdentificationTypeDUNSNumber(String value) {
        return new JAXBElement<String>(_EntityIdentificationTypeDUNSNumber_QNAME, String.class, EntityIdentificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "isDeleted", scope = DeleteExclusionResponseType.class)
    public JAXBElement<Boolean> createDeleteExclusionResponseTypeIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_DeleteExclusionResponseTypeIsDeleted_QNAME, Boolean.class, DeleteExclusionResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "US_PRNT_BKCY_CH_CONV", scope = RSUSPRNTBKCYCONVGRPType.class)
    public JAXBElement<String> createRSUSPRNTBKCYCONVGRPTypeUSPRNTBKCYCHCONV(String value) {
        return new JAXBElement<String>(_RSUSPRNTBKCYCONVGRPTypeUSPRNTBKCYCHCONV_QNAME, String.class, RSUSPRNTBKCYCONVGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "US_PRNT_BKCY_CONV_DT", scope = RSUSPRNTBKCYCONVGRPType.class)
    public JAXBElement<String> createRSUSPRNTBKCYCONVGRPTypeUSPRNTBKCYCONVDT(String value) {
        return new JAXBElement<String>(_RSUSPRNTBKCYCONVGRPTypeUSPRNTBKCYCONVDT_QNAME, String.class, RSUSPRNTBKCYCONVGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSBASizeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfSBASize", scope = SBASizeRequestType.class)
    public JAXBElement<ListOfSBASizeType> createSBASizeRequestTypeListOfSBASize(ListOfSBASizeType value) {
        return new JAXBElement<ListOfSBASizeType>(_ListOfSBASize_QNAME, ListOfSBASizeType.class, SBASizeRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ABARoutingNumber", scope = EFTInformationType.class)
    public JAXBElement<String> createEFTInformationTypeABARoutingNumber(String value) {
        return new JAXBElement<String>(_EFTInformationTypeABARoutingNumber_QNAME, String.class, EFTInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lockboxNumber", scope = EFTInformationType.class)
    public JAXBElement<String> createEFTInformationTypeLockboxNumber(String value) {
        return new JAXBElement<String>(_EFTInformationTypeLockboxNumber_QNAME, String.class, EFTInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "accountType", scope = EFTInformationType.class)
    public JAXBElement<String> createEFTInformationTypeAccountType(String value) {
        return new JAXBElement<String>(_EFTInformationTypeAccountType_QNAME, String.class, EFTInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EFTWaiver", scope = EFTInformationType.class)
    public JAXBElement<String> createEFTInformationTypeEFTWaiver(String value) {
        return new JAXBElement<String>(_EFTInformationTypeEFTWaiver_QNAME, String.class, EFTInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "financialInstitute", scope = EFTInformationType.class)
    public JAXBElement<String> createEFTInformationTypeFinancialInstitute(String value) {
        return new JAXBElement<String>(_EFTInformationTypeFinancialInstitute_QNAME, String.class, EFTInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "accountNumber", scope = EFTInformationType.class)
    public JAXBElement<String> createEFTInformationTypeAccountNumber(String value) {
        return new JAXBElement<String>(_EFTInformationTypeAccountNumber_QNAME, String.class, EFTInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SBAEntryDate", scope = SBACertificationType.class)
    public JAXBElement<String> createSBACertificationTypeSBAEntryDate(String value) {
        return new JAXBElement<String>(_SBACertificationTypeSBAEntryDate_QNAME, String.class, SBACertificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SBAExitDate", scope = SBACertificationType.class)
    public JAXBElement<String> createSBACertificationTypeSBAExitDate(String value) {
        return new JAXBElement<String>(_SBACertificationTypeSBAExitDate_QNAME, String.class, SBACertificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SBACertificationProgramType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SBACertificationProgram", scope = SBACertificationType.class)
    public JAXBElement<SBACertificationProgramType> createSBACertificationTypeSBACertificationProgram(SBACertificationProgramType value) {
        return new JAXBElement<SBACertificationProgramType>(_SBACertificationTypeSBACertificationProgram_QNAME, SBACertificationProgramType.class, SBACertificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "address", scope = MailingAddressTypes.class)
    public JAXBElement<AddressTypes> createMailingAddressTypesAddress(AddressTypes value) {
        return new JAXBElement<AddressTypes>(_MailingAddressTypesAddress_QNAME, AddressTypes.class, MailingAddressTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "country", scope = ExclusionAddressType.class)
    public JAXBElement<String> createExclusionAddressTypeCountry(String value) {
        return new JAXBElement<String>(_ExclusionAddressTypeCountry_QNAME, String.class, ExclusionAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "province", scope = ExclusionAddressType.class)
    public JAXBElement<String> createExclusionAddressTypeProvince(String value) {
        return new JAXBElement<String>(_ExclusionAddressTypeProvince_QNAME, String.class, ExclusionAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "city", scope = ExclusionAddressType.class)
    public JAXBElement<String> createExclusionAddressTypeCity(String value) {
        return new JAXBElement<String>(_AddressTypesCity_QNAME, String.class, ExclusionAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zipOrPostalcode", scope = ExclusionAddressType.class)
    public JAXBElement<String> createExclusionAddressTypeZipOrPostalcode(String value) {
        return new JAXBElement<String>(_ExclusionAddressTypeZipOrPostalcode_QNAME, String.class, ExclusionAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "street1", scope = ExclusionAddressType.class)
    public JAXBElement<String> createExclusionAddressTypeStreet1(String value) {
        return new JAXBElement<String>(_ExclusionAddressTypeStreet1_QNAME, String.class, ExclusionAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "street2", scope = ExclusionAddressType.class)
    public JAXBElement<String> createExclusionAddressTypeStreet2(String value) {
        return new JAXBElement<String>(_ExclusionAddressTypeStreet2_QNAME, String.class, ExclusionAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "state", scope = ExclusionAddressType.class)
    public JAXBElement<String> createExclusionAddressTypeState(String value) {
        return new JAXBElement<String>(_ExclusionAddressTypeState_QNAME, String.class, ExclusionAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = DisasterReliefAreaType.class)
    public JAXBElement<String> createDisasterReliefAreaTypeType(String value) {
        return new JAXBElement<String>(_DisasterReliefAreaTypeType_QNAME, String.class, DisasterReliefAreaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionAgencyUIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agencyUID", scope = ListOfExclusionAgencyUIDType.class)
    public JAXBElement<ExclusionAgencyUIDType> createListOfExclusionAgencyUIDTypeAgencyUID(ExclusionAgencyUIDType value) {
        return new JAXBElement<ExclusionAgencyUIDType>(_ListOfExclusionAgencyUIDTypeAgencyUID_QNAME, ExclusionAgencyUIDType.class, ListOfExclusionAgencyUIDType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_RTN_ASET", scope = RSEULPFINCALCAggType.class)
    public JAXBElement<Float> createRSEULPFINCALCAggTypeEULPRTNASET(Float value) {
        return new JAXBElement<Float>(_RSEULPFINCALCAggTypeEULPRTNASET_QNAME, Float.class, RSEULPFINCALCAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_NET_WRTH", scope = RSEULPFINCALCAggType.class)
    public JAXBElement<Float> createRSEULPFINCALCAggTypeEULPNETWRTH(Float value) {
        return new JAXBElement<Float>(_RSEULPFINCALCAggTypeEULPNETWRTH_QNAME, Float.class, RSEULPFINCALCAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_RTN_CAPL", scope = RSEULPFINCALCAggType.class)
    public JAXBElement<Float> createRSEULPFINCALCAggTypeEULPRTNCAPL(Float value) {
        return new JAXBElement<Float>(_RSEULPFINCALCAggTypeEULPRTNCAPL_QNAME, Float.class, RSEULPFINCALCAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_QK_RATO", scope = RSEULPFINCALCAggType.class)
    public JAXBElement<Float> createRSEULPFINCALCAggTypeEULPQKRATO(Float value) {
        return new JAXBElement<Float>(_RSEULPFINCALCAggTypeEULPQKRATO_QNAME, Float.class, RSEULPFINCALCAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_LQD_RATO", scope = RSEULPFINCALCAggType.class)
    public JAXBElement<Float> createRSEULPFINCALCAggTypeEULPLQDRATO(Float value) {
        return new JAXBElement<Float>(_RSEULPFINCALCAggTypeEULPLQDRATO_QNAME, Float.class, RSEULPFINCALCAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_WRKG_CAPL", scope = RSEULPFINCALCAggType.class)
    public JAXBElement<Float> createRSEULPFINCALCAggTypeEULPWRKGCAPL(Float value) {
        return new JAXBElement<Float>(_RSEULPFINCALCAggTypeEULPWRKGCAPL_QNAME, Float.class, RSEULPFINCALCAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_RATO_YR", scope = RSEULPFINCALCAggType.class)
    public JAXBElement<Short> createRSEULPFINCALCAggTypeEULPRATOYR(Short value) {
        return new JAXBElement<Short>(_RSEULPFINCALCAggTypeEULPRATOYR_QNAME, Short.class, RSEULPFINCALCAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_PFT_MRGN", scope = RSEULPFINCALCAggType.class)
    public JAXBElement<Float> createRSEULPFINCALCAggTypeEULPPFTMRGN(Float value) {
        return new JAXBElement<Float>(_RSEULPFINCALCAggTypeEULPPFTMRGN_QNAME, Float.class, RSEULPFINCALCAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "answerText", scope = FreeTextAnswerType.class)
    public JAXBElement<String> createFreeTextAnswerTypeAnswerText(String value) {
        return new JAXBElement<String>(_FreeTextAnswerTypeAnswerText_QNAME, String.class, FreeTextAnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExTransactionInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transactionInformation", scope = ExclusionHistoryResponseType.class)
    public JAXBElement<ExTransactionInfoType> createExclusionHistoryResponseTypeTransactionInformation(ExTransactionInfoType value) {
        return new JAXBElement<ExTransactionInfoType>(_ExclusionSearchCountResponseTypeTransactionInformation_QNAME, ExTransactionInfoType.class, ExclusionHistoryResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAFLDATTR2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_ATTR", scope = RSCUSTINPDATATYPE2 .FLDLST.class)
    public JAXBElement<GAFLDATTR2Type> createRSCUSTINPDATATYPE2FLDLSTFLDATTR(GAFLDATTR2Type value) {
        return new JAXBElement<GAFLDATTR2Type>(_RSCUSTINPDATATYPE2FLDLSTFLDATTR_QNAME, GAFLDATTR2Type.class, RSCUSTINPDATATYPE2 .FLDLST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "isDeleted", scope = DeleteAlternateAddressResponseType.class)
    public JAXBElement<Boolean> createDeleteAlternateAddressResponseTypeIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_DeleteExclusionResponseTypeIsDeleted_QNAME, Boolean.class, DeleteAlternateAddressResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "purpose", scope = RegistrationPurposeType.class)
    public JAXBElement<String> createRegistrationPurposeTypePurpose(String value) {
        return new JAXBElement<String>(_RegistrationPurposeTypePurpose_QNAME, String.class, RegistrationPurposeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "addressInfoName", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeAddressInfoName(String value) {
        return new JAXBElement<String>(_AddressTypeAddressInfoName_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "stateOrProvince", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeStateOrProvince(String value) {
        return new JAXBElement<String>(_AddressTypeStateOrProvince_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "addressSource", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeAddressSource(String value) {
        return new JAXBElement<String>(_AddressTypeAddressSource_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "phoneNumber", scope = AddressType.class)
    public JAXBElement<String> createAddressTypePhoneNumber(String value) {
        return new JAXBElement<String>(_AddressTypePhoneNumber_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "addressLine4", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeAddressLine4(String value) {
        return new JAXBElement<String>(_AddressTypeAddressLine4_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "addressLine2", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeAddressLine2(String value) {
        return new JAXBElement<String>(_AddressTypeAddressLine2_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "addressLine3", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeAddressLine3(String value) {
        return new JAXBElement<String>(_AddressTypeAddressLine3_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "phoneNumberExt", scope = AddressType.class)
    public JAXBElement<String> createAddressTypePhoneNumberExt(String value) {
        return new JAXBElement<String>(_AddressTypePhoneNumberExt_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "addressLine1", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeAddressLine1(String value) {
        return new JAXBElement<String>(_AddressTypeAddressLine1_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "congressionalDistrict", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeCongressionalDistrict(String value) {
        return new JAXBElement<String>(_AddressTypeCongressionalDistrict_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "ZIPCode", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeZIPCode(String value) {
        return new JAXBElement<String>(_AddressTypeZIPCode_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "city", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeCity(String value) {
        return new JAXBElement<String>(_AddressTypeCity_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "country", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeCountry(String value) {
        return new JAXBElement<String>(_AddressTypeCountry_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "addressId", scope = AddressType.class)
    public JAXBElement<BigInteger> createAddressTypeAddressId(BigInteger value) {
        return new JAXBElement<BigInteger>(_AddressTypeAddressId_QNAME, BigInteger.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "county", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeCounty(String value) {
        return new JAXBElement<String>(_AddressTypeCounty_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "VAL", scope = GAFLDATTRComplexType.FLDALWDVAL.class)
    public JAXBElement<String> createGAFLDATTRComplexTypeFLDALWDVALVAL(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDALWDVALVAL_QNAME, String.class, GAFLDATTRComplexType.FLDALWDVAL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_MAX_VAL", scope = GAFLDATTRComplexType.class)
    public JAXBElement<String> createGAFLDATTRComplexTypeFLDMAXVAL(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDMAXVAL_QNAME, String.class, GAFLDATTRComplexType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_WIDTH", scope = GAFLDATTRComplexType.class)
    public JAXBElement<String> createGAFLDATTRComplexTypeFLDWIDTH(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDWIDTH_QNAME, String.class, GAFLDATTRComplexType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_DESC", scope = GAFLDATTRComplexType.class)
    public JAXBElement<String> createGAFLDATTRComplexTypeFLDDESC(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDDESC_QNAME, String.class, GAFLDATTRComplexType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_REQD", scope = GAFLDATTRComplexType.class)
    public JAXBElement<String> createGAFLDATTRComplexTypeFLDREQD(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDREQD_QNAME, String.class, GAFLDATTRComplexType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAFLDATTRComplexType.FLDALWDVAL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_ALWD_VAL", scope = GAFLDATTRComplexType.class)
    public JAXBElement<GAFLDATTRComplexType.FLDALWDVAL> createGAFLDATTRComplexTypeFLDALWDVAL(GAFLDATTRComplexType.FLDALWDVAL value) {
        return new JAXBElement<GAFLDATTRComplexType.FLDALWDVAL>(_GAFLDATTRComplexTypeFLDALWDVAL_QNAME, GAFLDATTRComplexType.FLDALWDVAL.class, GAFLDATTRComplexType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_MIN_VAL", scope = GAFLDATTRComplexType.class)
    public JAXBElement<String> createGAFLDATTRComplexTypeFLDMINVAL(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDMINVAL_QNAME, String.class, GAFLDATTRComplexType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_VAL", scope = GAFLDATTRComplexType.class)
    public JAXBElement<String> createGAFLDATTRComplexTypeFLDVAL(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDVAL_QNAME, String.class, GAFLDATTRComplexType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_DISP_SEQ", scope = GAFLDATTRComplexType.class)
    public JAXBElement<String> createGAFLDATTRComplexTypeFLDDISPSEQ(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDDISPSEQ_QNAME, String.class, GAFLDATTRComplexType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_TYPE", scope = GAFLDATTRComplexType.class)
    public JAXBElement<String> createGAFLDATTRComplexTypeFLDTYPE(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDTYPE_QNAME, String.class, GAFLDATTRComplexType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_NME", scope = GAFLDATTRComplexType.class)
    public JAXBElement<String> createGAFLDATTRComplexTypeFLDNME(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDNME_QNAME, String.class, GAFLDATTRComplexType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_DEFU_VAL", scope = GAFLDATTRComplexType.class)
    public JAXBElement<String> createGAFLDATTRComplexTypeFLDDEFUVAL(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDDEFUVAL_QNAME, String.class, GAFLDATTRComplexType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "creditCardUsage", scope = FinancialInformationType.class)
    public JAXBElement<String> createFinancialInformationTypeCreditCardUsage(String value) {
        return new JAXBElement<String>(_FinancialInformationTypeCreditCardUsage_QNAME, String.class, FinancialInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "debtSubjectToOffset", scope = FinancialInformationType.class)
    public JAXBElement<String> createFinancialInformationTypeDebtSubjectToOffset(String value) {
        return new JAXBElement<String>(_FinancialInformationTypeDebtSubjectToOffset_QNAME, String.class, FinancialInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "message", scope = SBASizeResponseType.class)
    public JAXBElement<String> createSBASizeResponseTypeMessage(String value) {
        return new JAXBElement<String>(_SBASizeResponseTypeMessage_QNAME, String.class, SBASizeResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HtmlURL", scope = CertificationURLsType.class)
    public JAXBElement<String> createCertificationURLsTypeHtmlURL(String value) {
        return new JAXBElement<String>(_CertificationURLsTypeHtmlURL_QNAME, String.class, CertificationURLsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PDFURL", scope = CertificationURLsType.class)
    public JAXBElement<String> createCertificationURLsTypePDFURL(String value) {
        return new JAXBElement<String>(_FinancialAssistanceResponseURLsTypePDFURL_QNAME, String.class, CertificationURLsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "isAdded", scope = AddDescriptionResponseType.class)
    public JAXBElement<Boolean> createAddDescriptionResponseTypeIsAdded(Boolean value) {
        return new JAXBElement<Boolean>(_AddAlternateAddressResponseTypeIsAdded_QNAME, Boolean.class, AddDescriptionResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "infoCode", scope = InfoType.class)
    public JAXBElement<String> createInfoTypeInfoCode(String value) {
        return new JAXBElement<String>(_InfoTypeInfoCode_QNAME, String.class, InfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = ExecutiveDetailsType.class)
    public JAXBElement<String> createExecutiveDetailsTypeName(String value) {
        return new JAXBElement<String>(_ExecutiveDetailsTypeName_QNAME, String.class, ExecutiveDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "compensation", scope = ExecutiveDetailsType.class)
    public JAXBElement<BigDecimal> createExecutiveDetailsTypeCompensation(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ExecutiveDetailsTypeCompensation_QNAME, BigDecimal.class, ExecutiveDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "title", scope = ExecutiveDetailsType.class)
    public JAXBElement<String> createExecutiveDetailsTypeTitle(String value) {
        return new JAXBElement<String>(_ExecutiveDetailsTypeTitle_QNAME, String.class, ExecutiveDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "identificationInformation", scope = ExdescriptionType.class)
    public JAXBElement<IdentificationInformationType> createExdescriptionTypeIdentificationInformation(IdentificationInformationType value) {
        return new JAXBElement<IdentificationInformationType>(_AlternateAddressTypeIdentificationInformation_QNAME, IdentificationInformationType.class, ExdescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCommentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfComments", scope = ExdescriptionType.class)
    public JAXBElement<ListOfCommentType> createExdescriptionTypeListOfComments(ListOfCommentType value) {
        return new JAXBElement<ListOfCommentType>(_ListOfComments_QNAME, ListOfCommentType.class, ExdescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "transactionInformation", scope = ExdescriptionType.class)
    public JAXBElement<TransactionInformationType> createExdescriptionTypeTransactionInformation(TransactionInformationType value) {
        return new JAXBElement<TransactionInformationType>(_AlternateAddressTypeTransactionInformation_QNAME, TransactionInformationType.class, ExdescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfNAICSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "listOfNAICS", scope = GoodsAndServicesType.class)
    public JAXBElement<ListOfNAICSType> createGoodsAndServicesTypeListOfNAICS(ListOfNAICSType value) {
        return new JAXBElement<ListOfNAICSType>(_GoodsAndServicesTypeListOfNAICS_QNAME, ListOfNAICSType.class, GoodsAndServicesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfPSCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "listOfPSC", scope = GoodsAndServicesType.class)
    public JAXBElement<ListOfPSCType> createGoodsAndServicesTypeListOfPSC(ListOfPSCType value) {
        return new JAXBElement<ListOfPSCType>(_GoodsAndServicesTypeListOfPSC_QNAME, ListOfPSCType.class, GoodsAndServicesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lastUpdated", scope = DNBMonitoringType.class)
    public JAXBElement<String> createDNBMonitoringTypeLastUpdated(String value) {
        return new JAXBElement<String>(_DNBMonitoringTypeLastUpdated_QNAME, String.class, DNBMonitoringType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DnbaddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "address", scope = DNBMonitoringType.class)
    public JAXBElement<DnbaddressType> createDNBMonitoringTypeAddress(DnbaddressType value) {
        return new JAXBElement<DnbaddressType>(_MailingAddressTypesAddress_QNAME, DnbaddressType.class, DNBMonitoringType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "monitoringStatus", scope = DNBMonitoringType.class)
    public JAXBElement<String> createDNBMonitoringTypeMonitoringStatus(String value) {
        return new JAXBElement<String>(_DNBMonitoringTypeMonitoringStatus_QNAME, String.class, DNBMonitoringType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "legalBusinessName", scope = DNBMonitoringType.class)
    public JAXBElement<String> createDNBMonitoringTypeLegalBusinessName(String value) {
        return new JAXBElement<String>(_DNBMonitoringTypeLegalBusinessName_QNAME, String.class, DNBMonitoringType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DBAName", scope = DNBMonitoringType.class)
    public JAXBElement<String> createDNBMonitoringTypeDBAName(String value) {
        return new JAXBElement<String>(_DNBMonitoringTypeDBAName_QNAME, String.class, DNBMonitoringType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "outOfBusinessFlag", scope = DNBMonitoringType.class)
    public JAXBElement<Boolean> createDNBMonitoringTypeOutOfBusinessFlag(Boolean value) {
        return new JAXBElement<Boolean>(_DNBMonitoringTypeOutOfBusinessFlag_QNAME, Boolean.class, DNBMonitoringType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "entityIdentification", scope = EntityType.class)
    public JAXBElement<RegistrationInformationType> createEntityTypeEntityIdentification(RegistrationInformationType value) {
        return new JAXBElement<RegistrationInformationType>(_EntityTypeEntityIdentification_QNAME, RegistrationInformationType.class, EntityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointsOfContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pointsOfContact", scope = EntityType.class)
    public JAXBElement<PointsOfContactType> createEntityTypePointsOfContact(PointsOfContactType value) {
        return new JAXBElement<PointsOfContactType>(_EntityTypePointsOfContact_QNAME, PointsOfContactType.class, EntityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityCoreDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "coreData", scope = EntityType.class)
    public JAXBElement<EntityCoreDataType> createEntityTypeCoreData(EntityCoreDataType value) {
        return new JAXBElement<EntityCoreDataType>(_EntityTypeCoreData_QNAME, EntityCoreDataType.class, EntityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssertionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "assertions", scope = EntityType.class)
    public JAXBElement<AssertionsType> createEntityTypeAssertions(AssertionsType value) {
        return new JAXBElement<AssertionsType>(_EntityTypeAssertions_QNAME, AssertionsType.class, EntityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepsAndCertsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "repsAndCerts", scope = EntityType.class)
    public JAXBElement<RepsAndCertsType> createEntityTypeRepsAndCerts(RepsAndCertsType value) {
        return new JAXBElement<RepsAndCertsType>(_EntityTypeRepsAndCerts_QNAME, RepsAndCertsType.class, EntityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "NME", scope = RSKEYFLDS2TYPE.KEYFLD.class)
    public JAXBElement<String> createRSKEYFLDS2TYPEKEYFLDNME(String value) {
        return new JAXBElement<String>(_RSKEYFLDS2TYPEKEYFLDNME_QNAME, String.class, RSKEYFLDS2TYPE.KEYFLD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "VAL", scope = RSKEYFLDS2TYPE.KEYFLD.class)
    public JAXBElement<String> createRSKEYFLDS2TYPEKEYFLDVAL(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDALWDVALVAL_QNAME, String.class, RSKEYFLDS2TYPE.KEYFLD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "code", scope = PSCCodeType.class)
    public JAXBElement<String> createPSCCodeTypeCode(String value) {
        return new JAXBElement<String>(_PSCCodeTypeCode_QNAME, String.class, PSCCodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputMessagesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "outputMessages", scope = ResponseType.class)
    public JAXBElement<OutputMessagesType> createResponseTypeOutputMessages(OutputMessagesType value) {
        return new JAXBElement<OutputMessagesType>(_MoveFedNodeResponseOutputMessages_QNAME, OutputMessagesType.class, ResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "confirmationNumber", scope = ResponseType.class)
    public JAXBElement<BigInteger> createResponseTypeConfirmationNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResponseTypeConfirmationNumber_QNAME, BigInteger.class, ResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfParametersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfParameters", scope = ResponseType.class)
    public JAXBElement<ListOfParametersType> createResponseTypeListOfParameters(ListOfParametersType value) {
        return new JAXBElement<ListOfParametersType>(_ResponseTypeListOfParameters_QNAME, ListOfParametersType.class, ResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CAGECode", scope = EntitySearchCriteriaType.class)
    public JAXBElement<String> createEntitySearchCriteriaTypeCAGECode(String value) {
        return new JAXBElement<String>(_EntitySearchCriteriaTypeCAGECode_QNAME, String.class, EntitySearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "registrationStatus", scope = EntitySearchCriteriaType.class)
    public JAXBElement<String> createEntitySearchCriteriaTypeRegistrationStatus(String value) {
        return new JAXBElement<String>(_EntitySearchCriteriaTypeRegistrationStatus_QNAME, String.class, EntitySearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "endDate", scope = EntitySearchCriteriaType.class)
    public JAXBElement<String> createEntitySearchCriteriaTypeEndDate(String value) {
        return new JAXBElement<String>(_EntitySearchCriteriaTypeEndDate_QNAME, String.class, EntitySearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNSNumber", scope = EntitySearchCriteriaType.class)
    public JAXBElement<String> createEntitySearchCriteriaTypeDUNSNumber(String value) {
        return new JAXBElement<String>(_EntityIdentificationTypeDUNSNumber_QNAME, String.class, EntitySearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "taxpayerIdentificationNumber", scope = EntitySearchCriteriaType.class)
    public JAXBElement<String> createEntitySearchCriteriaTypeTaxpayerIdentificationNumber(String value) {
        return new JAXBElement<String>(_EntitySearchCriteriaTypeTaxpayerIdentificationNumber_QNAME, String.class, EntitySearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startDate", scope = EntitySearchCriteriaType.class)
    public JAXBElement<String> createEntitySearchCriteriaTypeStartDate(String value) {
        return new JAXBElement<String>(_EntitySearchCriteriaTypeStartDate_QNAME, String.class, EntitySearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DoDAAC", scope = EntitySearchCriteriaType.class)
    public JAXBElement<String> createEntitySearchCriteriaTypeDoDAAC(String value) {
        return new JAXBElement<String>(_EntitySearchCriteriaTypeDoDAAC_QNAME, String.class, EntitySearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSUPDFLDSTYPE.UPDFLD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "UPD_FLD", scope = RSUPDFLDSTYPE.class)
    public JAXBElement<RSUPDFLDSTYPE.UPDFLD> createRSUPDFLDSTYPEUPDFLD(RSUPDFLDSTYPE.UPDFLD value) {
        return new JAXBElement<RSUPDFLDSTYPE.UPDFLD>(_RSUPDFLDSTYPEUPDFLD_QNAME, RSUPDFLDSTYPE.UPDFLD.class, RSUPDFLDSTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "isUpdated", scope = UpdateDescriptionResponseType.class)
    public JAXBElement<Boolean> createUpdateDescriptionResponseTypeIsUpdated(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateAlternateAddressResponseTypeIsUpdated_QNAME, Boolean.class, UpdateDescriptionResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FARResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARResponses", scope = CertificationsType.class)
    public JAXBElement<FARResponseType> createCertificationsTypeFARResponses(FARResponseType value) {
        return new JAXBElement<FARResponseType>(_CertificationsTypeFARResponses_QNAME, FARResponseType.class, CertificationsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FARResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DFARResponses", scope = CertificationsType.class)
    public JAXBElement<FARResponseType> createCertificationsTypeDFARResponses(FARResponseType value) {
        return new JAXBElement<FARResponseType>(_CertificationsTypeDFARResponses_QNAME, FARResponseType.class, CertificationsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificationURLsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "certificationURLs", scope = CertificationsType.class)
    public JAXBElement<CertificationURLsType> createCertificationsTypeCertificationURLs(CertificationURLsType value) {
        return new JAXBElement<CertificationURLsType>(_CertificationsTypeCertificationURLs_QNAME, CertificationURLsType.class, CertificationsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfPOCsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "listOfPOCs", scope = PointsOfContactType.class)
    public JAXBElement<ListOfPOCsType> createPointsOfContactTypeListOfPOCs(ListOfPOCsType value) {
        return new JAXBElement<ListOfPOCsType>(_PointsOfContactTypeListOfPOCs_QNAME, ListOfPOCsType.class, PointsOfContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_TTL", scope = RSEULPPRINAggType.class)
    public JAXBElement<String> createRSEULPPRINAggTypeEULPTTL(String value) {
        return new JAXBElement<String>(_RSEULPPRINAggTypeEULPTTL_QNAME, String.class, RSEULPPRINAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_NME", scope = RSEULPPRINAggType.class)
    public JAXBElement<String> createRSEULPPRINAggTypeEULPNME(String value) {
        return new JAXBElement<String>(_RSEULPPRINAggTypeEULPNME_QNAME, String.class, RSEULPPRINAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_INIT", scope = RSEULPPRINAggType.class)
    public JAXBElement<String> createRSEULPPRINAggTypeEULPINIT(String value) {
        return new JAXBElement<String>(_RSEULPPRINAggTypeEULPINIT_QNAME, String.class, RSEULPPRINAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "NAICSExceptionFlag", scope = SBASizeType.class)
    public JAXBElement<String> createSBASizeTypeNAICSExceptionFlag(String value) {
        return new JAXBElement<String>(_SBASizeTypeNAICSExceptionFlag_QNAME, String.class, SBASizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "employeeSize", scope = SBASizeType.class)
    public JAXBElement<String> createSBASizeTypeEmployeeSize(String value) {
        return new JAXBElement<String>(_SBAFormallyDeterminedSizesTypeEmployeeSize_QNAME, String.class, SBASizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "NAICSYear", scope = SBASizeType.class)
    public JAXBElement<String> createSBASizeTypeNAICSYear(String value) {
        return new JAXBElement<String>(_SBASizeTypeNAICSYear_QNAME, String.class, SBASizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "NAICSDescription", scope = SBASizeType.class)
    public JAXBElement<String> createSBASizeTypeNAICSDescription(String value) {
        return new JAXBElement<String>(_SBASizeTypeNAICSDescription_QNAME, String.class, SBASizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "status", scope = SBASizeType.class)
    public JAXBElement<String> createSBASizeTypeStatus(String value) {
        return new JAXBElement<String>(_SBASizeTypeStatus_QNAME, String.class, SBASizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "activeFlag", scope = SBASizeType.class)
    public JAXBElement<String> createSBASizeTypeActiveFlag(String value) {
        return new JAXBElement<String>(_SBASizeTypeActiveFlag_QNAME, String.class, SBASizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "megawattHours", scope = SBASizeType.class)
    public JAXBElement<String> createSBASizeTypeMegawattHours(String value) {
        return new JAXBElement<String>(_SBAFormallyDeterminedSizesTypeMegawattHours_QNAME, String.class, SBASizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "NAICSTotalAsset", scope = SBASizeType.class)
    public JAXBElement<String> createSBASizeTypeNAICSTotalAsset(String value) {
        return new JAXBElement<String>(_SBASizeTypeNAICSTotalAsset_QNAME, String.class, SBASizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "revenueSize", scope = SBASizeType.class)
    public JAXBElement<String> createSBASizeTypeRevenueSize(String value) {
        return new JAXBElement<String>(_SBAFormallyDeterminedSizesTypeRevenueSize_QNAME, String.class, SBASizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "oilBarrel", scope = SBASizeType.class)
    public JAXBElement<String> createSBASizeTypeOilBarrel(String value) {
        return new JAXBElement<String>(_SBAFormallyDeterminedSizesTypeOilBarrel_QNAME, String.class, SBASizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "NAICSExceptionSeqNumber", scope = SBASizeType.class)
    public JAXBElement<String> createSBASizeTypeNAICSExceptionSeqNumber(String value) {
        return new JAXBElement<String>(_SBASizeTypeNAICSExceptionSeqNumber_QNAME, String.class, SBASizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "NAICSQualityCode", scope = SBASizeType.class)
    public JAXBElement<String> createSBASizeTypeNAICSQualityCode(String value) {
        return new JAXBElement<String>(_SBASizeTypeNAICSQualityCode_QNAME, String.class, SBASizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "NAICSExceptionMod", scope = SBASizeType.class)
    public JAXBElement<String> createSBASizeTypeNAICSExceptionMod(String value) {
        return new JAXBElement<String>(_SBASizeTypeNAICSExceptionMod_QNAME, String.class, SBASizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = ExclusionStateCountryType.class)
    public JAXBElement<String> createExclusionStateCountryTypeName(String value) {
        return new JAXBElement<String>(_ExecutiveDetailsTypeName_QNAME, String.class, ExclusionStateCountryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "abbreviation", scope = ExclusionStateCountryType.class)
    public JAXBElement<String> createExclusionStateCountryTypeAbbreviation(String value) {
        return new JAXBElement<String>(_ExclusionStateCountryTypeAbbreviation_QNAME, String.class, ExclusionStateCountryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "address", scope = MailingAddressType.class)
    public JAXBElement<AddressType> createMailingAddressTypeAddress(AddressType value) {
        return new JAXBElement<AddressType>(_MailingAddressTypesAddress_QNAME, AddressType.class, MailingAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = BondingLevelType.class)
    public JAXBElement<String> createBondingLevelTypeType(String value) {
        return new JAXBElement<String>(_DisasterReliefAreaTypeType_QNAME, String.class, BondingLevelType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value", scope = BondingLevelType.class)
    public JAXBElement<String> createBondingLevelTypeValue(String value) {
        return new JAXBElement<String>(_MapItemTypeValue_QNAME, String.class, BondingLevelType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSCUSTINPDATATYPE3 .FLDLST }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_LST", scope = RSCUSTINPDATATYPE3 .class)
    public JAXBElement<RSCUSTINPDATATYPE3 .FLDLST> createRSCUSTINPDATATYPE3FLDLST(RSCUSTINPDATATYPE3 .FLDLST value) {
        return new JAXBElement<RSCUSTINPDATATYPE3 .FLDLST>(_RSCUSTINPDATATYPE3FLDLST_QNAME, RSCUSTINPDATATYPE3 .FLDLST.class, RSCUSTINPDATATYPE3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "TITLE", scope = RSCUSTINPDATATYPE3 .class)
    public JAXBElement<String> createRSCUSTINPDATATYPE3TITLE(String value) {
        return new JAXBElement<String>(_RSCUSTINPDATATYPE3TITLE_QNAME, String.class, RSCUSTINPDATATYPE3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "firstName", scope = POCTypes.class)
    public JAXBElement<String> createPOCTypesFirstName(String value) {
        return new JAXBElement<String>(_POCTypesFirstName_QNAME, String.class, POCTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lastName", scope = POCTypes.class)
    public JAXBElement<String> createPOCTypesLastName(String value) {
        return new JAXBElement<String>(_POCTypesLastName_QNAME, String.class, POCTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "middleInitial", scope = POCTypes.class)
    public JAXBElement<String> createPOCTypesMiddleInitial(String value) {
        return new JAXBElement<String>(_POCTypesMiddleInitial_QNAME, String.class, POCTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nonUSPhone", scope = POCTypes.class)
    public JAXBElement<String> createPOCTypesNonUSPhone(String value) {
        return new JAXBElement<String>(_POCTypesNonUSPhone_QNAME, String.class, POCTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "title", scope = POCTypes.class)
    public JAXBElement<String> createPOCTypesTitle(String value) {
        return new JAXBElement<String>(_ExecutiveDetailsTypeTitle_QNAME, String.class, POCTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USPhone", scope = POCTypes.class)
    public JAXBElement<String> createPOCTypesUSPhone(String value) {
        return new JAXBElement<String>(_POCTypesUSPhone_QNAME, String.class, POCTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fax", scope = POCTypes.class)
    public JAXBElement<String> createPOCTypesFax(String value) {
        return new JAXBElement<String>(_POCTypesFax_QNAME, String.class, POCTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email", scope = POCTypes.class)
    public JAXBElement<String> createPOCTypesEmail(String value) {
        return new JAXBElement<String>(_POCTypesEmail_QNAME, String.class, POCTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USPhoneExtension", scope = POCTypes.class)
    public JAXBElement<String> createPOCTypesUSPhoneExtension(String value) {
        return new JAXBElement<String>(_POCTypesUSPhoneExtension_QNAME, String.class, POCTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "id", scope = BusinessObjectType.class)
    public JAXBElement<String> createBusinessObjectTypeId(String value) {
        return new JAXBElement<String>(_BusinessObjectTypeId_QNAME, String.class, BusinessObjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "warningCode", scope = WarningType.class)
    public JAXBElement<String> createWarningTypeWarningCode(String value) {
        return new JAXBElement<String>(_WarningTypeWarningCode_QNAME, String.class, WarningType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "totalAssets", scope = IndustrySpecificSizeMetricsType.class)
    public JAXBElement<BigDecimal> createIndustrySpecificSizeMetricsTypeTotalAssets(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IndustrySpecificSizeMetricsTypeTotalAssets_QNAME, BigDecimal.class, IndustrySpecificSizeMetricsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "barrelsCapacity", scope = IndustrySpecificSizeMetricsType.class)
    public JAXBElement<BigInteger> createIndustrySpecificSizeMetricsTypeBarrelsCapacity(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndustrySpecificSizeMetricsTypeBarrelsCapacity_QNAME, BigInteger.class, IndustrySpecificSizeMetricsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "megawattHours", scope = IndustrySpecificSizeMetricsType.class)
    public JAXBElement<BigDecimal> createIndustrySpecificSizeMetricsTypeMegawattHours(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IndustrySpecificSizeMetricsTypeMegawattHours_QNAME, BigDecimal.class, IndustrySpecificSizeMetricsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "code", scope = BusinessTypeType.class)
    public JAXBElement<String> createBusinessTypeTypeCode(String value) {
        return new JAXBElement<String>(_PSCCodeTypeCode_QNAME, String.class, BusinessTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_PAYD_HIST_DT", scope = RSEULPPAYDHISTAggType.class)
    public JAXBElement<String> createRSEULPPAYDHISTAggTypeEULPPAYDHISTDT(String value) {
        return new JAXBElement<String>(_RSEULPPAYDHISTAggTypeEULPPAYDHISTDT_QNAME, String.class, RSEULPPAYDHISTAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_PAYD_HIST_SCR", scope = RSEULPPAYDHISTAggType.class)
    public JAXBElement<String> createRSEULPPAYDHISTAggTypeEULPPAYDHISTSCR(String value) {
        return new JAXBElement<String>(_RSEULPPAYDHISTAggTypeEULPPAYDHISTSCR_QNAME, String.class, RSEULPPAYDHISTAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAFLDATTRComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_ATTR", scope = RSCUSTINPDATATYPE1 .FLDLST.class)
    public JAXBElement<GAFLDATTRComplexType> createRSCUSTINPDATATYPE1FLDLSTFLDATTR(GAFLDATTRComplexType value) {
        return new JAXBElement<GAFLDATTRComplexType>(_RSCUSTINPDATATYPE2FLDLSTFLDATTR_QNAME, GAFLDATTRComplexType.class, RSCUSTINPDATATYPE1 .FLDLST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "answerID", scope = AnswerType.class)
    public JAXBElement<String> createAnswerTypeAnswerID(String value) {
        return new JAXBElement<String>(_AnswerTypeAnswerID_QNAME, String.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAssistanceResponseURLsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "financialAssistanceResponseURLs", scope = FinancialAssistanceCertificationsType.class)
    public JAXBElement<FinancialAssistanceResponseURLsType> createFinancialAssistanceCertificationsTypeFinancialAssistanceResponseURLs(FinancialAssistanceResponseURLsType value) {
        return new JAXBElement<FinancialAssistanceResponseURLsType>(_FinancialAssistanceCertificationsTypeFinancialAssistanceResponseURLs_QNAME, FinancialAssistanceResponseURLsType.class, FinancialAssistanceCertificationsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "financialAssistanceResponse", scope = FinancialAssistanceCertificationsType.class)
    public JAXBElement<String> createFinancialAssistanceCertificationsTypeFinancialAssistanceResponse(String value) {
        return new JAXBElement<String>(_FinancialAssistanceCertificationsTypeFinancialAssistanceResponse_QNAME, String.class, FinancialAssistanceCertificationsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SBAFormallyDeterminedSizesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SBAFormallyDeterminedSizes", scope = SBAManualCertificationUpdateType.class)
    public JAXBElement<SBAFormallyDeterminedSizesType> createSBAManualCertificationUpdateTypeSBAFormallyDeterminedSizes(SBAFormallyDeterminedSizesType value) {
        return new JAXBElement<SBAFormallyDeterminedSizesType>(_SBAFormallyDeterminedSizes_QNAME, SBAFormallyDeterminedSizesType.class, SBAManualCertificationUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "question", scope = SimpleQuestionAnswerType.class)
    public JAXBElement<String> createSimpleQuestionAnswerTypeQuestion(String value) {
        return new JAXBElement<String>(_SimpleQuestionAnswerTypeQuestion_QNAME, String.class, SimpleQuestionAnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "answer", scope = SimpleQuestionAnswerType.class)
    public JAXBElement<String> createSimpleQuestionAnswerTypeAnswer(String value) {
        return new JAXBElement<String>(_SimpleQuestionAnswerTypeAnswer_QNAME, String.class, SimpleQuestionAnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "middle", scope = OperationExArchiveSearchType.class)
    public JAXBElement<String> createOperationExArchiveSearchTypeMiddle(String value) {
        return new JAXBElement<String>(_OperationExArchiveSearchTypeMiddle_QNAME, String.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "partialName", scope = OperationExArchiveSearchType.class)
    public JAXBElement<String> createOperationExArchiveSearchTypePartialName(String value) {
        return new JAXBElement<String>(_OperationExArchiveSearchTypePartialName_QNAME, String.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "last", scope = OperationExArchiveSearchType.class)
    public JAXBElement<String> createOperationExArchiveSearchTypeLast(String value) {
        return new JAXBElement<String>(_OperationExArchiveSearchTypeLast_QNAME, String.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "modifyDate", scope = OperationExArchiveSearchType.class)
    public JAXBElement<ExclusionDateRangeType> createOperationExArchiveSearchTypeModifyDate(ExclusionDateRangeType value) {
        return new JAXBElement<ExclusionDateRangeType>(_OperationExclusionHistoryTypeModifyDate_QNAME, ExclusionDateRangeType.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNSNumber", scope = OperationExArchiveSearchType.class)
    public JAXBElement<String> createOperationExArchiveSearchTypeDUNSNumber(String value) {
        return new JAXBElement<String>(_EntityIdentificationTypeDUNSNumber_QNAME, String.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "prefix", scope = OperationExArchiveSearchType.class)
    public JAXBElement<String> createOperationExArchiveSearchTypePrefix(String value) {
        return new JAXBElement<String>(_OperationExArchiveSearchTypePrefix_QNAME, String.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "exactName", scope = OperationExArchiveSearchType.class)
    public JAXBElement<String> createOperationExArchiveSearchTypeExactName(String value) {
        return new JAXBElement<String>(_OperationExArchiveSearchTypeExactName_QNAME, String.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "suffix", scope = OperationExArchiveSearchType.class)
    public JAXBElement<String> createOperationExArchiveSearchTypeSuffix(String value) {
        return new JAXBElement<String>(_OperationExArchiveSearchTypeSuffix_QNAME, String.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionAgencyUIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agencyUID", scope = OperationExArchiveSearchType.class)
    public JAXBElement<ExclusionAgencyUIDType> createOperationExArchiveSearchTypeAgencyUID(ExclusionAgencyUIDType value) {
        return new JAXBElement<ExclusionAgencyUIDType>(_ListOfExclusionAgencyUIDTypeAgencyUID_QNAME, ExclusionAgencyUIDType.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = OperationExArchiveSearchType.class)
    public JAXBElement<String> createOperationExArchiveSearchTypeName(String value) {
        return new JAXBElement<String>(_ExecutiveDetailsTypeName_QNAME, String.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "periodicity", scope = OperationExArchiveSearchType.class)
    public JAXBElement<String> createOperationExArchiveSearchTypePeriodicity(String value) {
        return new JAXBElement<String>(_OperationExclusionHistoryTypePeriodicity_QNAME, String.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "termDate", scope = OperationExArchiveSearchType.class)
    public JAXBElement<ExclusionDateRangeType> createOperationExArchiveSearchTypeTermDate(ExclusionDateRangeType value) {
        return new JAXBElement<ExclusionDateRangeType>(_OperationExclusionHistoryTypeTermDate_QNAME, ExclusionDateRangeType.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actionDate", scope = OperationExArchiveSearchType.class)
    public JAXBElement<ExclusionDateRangeType> createOperationExArchiveSearchTypeActionDate(ExclusionDateRangeType value) {
        return new JAXBElement<ExclusionDateRangeType>(_OperationExclusionHistoryTypeActionDate_QNAME, ExclusionDateRangeType.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "first", scope = OperationExArchiveSearchType.class)
    public JAXBElement<String> createOperationExArchiveSearchTypeFirst(String value) {
        return new JAXBElement<String>(_OperationExArchiveSearchTypeFirst_QNAME, String.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "createDate", scope = OperationExArchiveSearchType.class)
    public JAXBElement<ExclusionDateRangeType> createOperationExArchiveSearchTypeCreateDate(ExclusionDateRangeType value) {
        return new JAXBElement<ExclusionDateRangeType>(_OperationExclusionHistoryTypeCreateDate_QNAME, ExclusionDateRangeType.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "deleteDate", scope = OperationExArchiveSearchType.class)
    public JAXBElement<ExclusionDateRangeType> createOperationExArchiveSearchTypeDeleteDate(ExclusionDateRangeType value) {
        return new JAXBElement<ExclusionDateRangeType>(_OperationExclusionHistoryTypeDeleteDate_QNAME, ExclusionDateRangeType.class, OperationExArchiveSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_BLDG", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPBLDG(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPBLDG_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_OTH_FA", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPOTHFA(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPOTHFA_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_NET_WRTH", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPNETWRTH(Float value) {
        return new JAXBElement<Float>(_RSEULPFINCALCAggTypeEULPNETWRTH_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_LAND_BLDG", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPLANDBLDG(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPLANDBLDG_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_TOT_FINL_ASET", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPTOTFINLASET(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPTOTFINLASET_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_TRD_DBTR", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPTRDDBTR(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPTRDDBTR_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_LT_LIAB_OTH", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPLTLIABOTH(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPLTLIABOTH_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_TOT_NCUR_ASET", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPTOTNCURASET(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPTOTNCURASET_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_AR_OVR_1YR", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPAROVR1YR(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPAROVR1YR_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_OTH_LOAN", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPOTHLOAN(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPOTHLOAN_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_BANK_LOAN", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPBANKLOAN(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPBANKLOAN_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_PFT_LOS_FRWD", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPPFTLOSFRWD(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPPFTLOSFRWD_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_TOT_CURR_LIAB", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPTOTCURRLIAB(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPTOTCURRLIAB_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_TOT_TANG_ASET", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPTOTTANGASET(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPTOTTANGASET_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_INTA_ASET", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPINTAASET(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPINTAASET_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_LT_IVSM", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPLTIVSM(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPLTIVSM_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_BANK", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPBANK(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPBANK_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_TRD_CRR", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPTRDCRR(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPTRDCRR_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_GDWI", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPGDWI(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPGDWI_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_PFT", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPPFT(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPPFT_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_RESV", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPRESV(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPRESV_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_LT_LIAB", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPLTLIAB(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPLTLIAB_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_TOT_DBT", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPTOTDBT(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPTOTDBT_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_MTGE_LOAN", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPMTGELOAN(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPMTGELOAN_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_TOT_CA", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPTOTCA(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPTOTCA_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_LT_LIAB_DUE_1YR", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPLTLIABDUE1YR(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPLTLIABDUE1YR_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_ST_IVSM", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPSTIVSM(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPSTIVSM_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_FURN_VHCL", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPFURNVHCL(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPFURNVHCL_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_TOT_STK_EQTY", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPTOTSTKEQTY(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPTOTSTKEQTY_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_CSH_LQD_ASET", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPCSHLQDASET(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPCSHLQDASET_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_ISS_CAPL", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPISSCAPL(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPISSCAPL_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_TOT_ASET", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPTOTASET(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPTOTASET_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_LAND", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPLAND(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPLAND_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_FIXT_EQPT", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPFIXTEQPT(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPFIXTEQPT_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_RETD_EARN", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPRETDEARN(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPRETDEARN_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_AR_OTH", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPAROTH(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPAROTH_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_TOT_LIAB", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPTOTLIAB(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPTOTLIAB_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_TOT_NET_STK_WIP", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPTOTNETSTKWIP(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPTOTNETSTKWIP_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_SHR_PREM", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPSHRPREM(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPSHRPREM_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_STMT_DT", scope = RSEULPBSAggType.class)
    public JAXBElement<String> createRSEULPBSAggTypeEULPSTMTDT(String value) {
        return new JAXBElement<String>(_RSEULPBSAggTypeEULPSTMTDT_QNAME, String.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_CAPL", scope = RSEULPBSAggType.class)
    public JAXBElement<Float> createRSEULPBSAggTypeEULPCAPL(Float value) {
        return new JAXBElement<Float>(_RSEULPBSAggTypeEULPCAPL_QNAME, Float.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_INDV_CONS_IND", scope = RSEULPBSAggType.class)
    public JAXBElement<String> createRSEULPBSAggTypeEULPINDVCONSIND(String value) {
        return new JAXBElement<String>(_RSEULPBSAggTypeEULPINDVCONSIND_QNAME, String.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_CRCY_CD", scope = RSEULPBSAggType.class)
    public JAXBElement<String> createRSEULPBSAggTypeEULPCRCYCD(String value) {
        return new JAXBElement<String>(_RSEULPBSAggTypeEULPCRCYCD_QNAME, String.class, RSEULPBSAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "authorizationDate", scope = FinancialAccountType.class)
    public JAXBElement<String> createFinancialAccountTypeAuthorizationDate(String value) {
        return new JAXBElement<String>(_FinancialAccountTypeAuthorizationDate_QNAME, String.class, FinancialAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemittanceInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "remittanceInformation", scope = FinancialAccountType.class)
    public JAXBElement<RemittanceInformationType> createFinancialAccountTypeRemittanceInformation(RemittanceInformationType value) {
        return new JAXBElement<RemittanceInformationType>(_FinancialAccountTypeRemittanceInformation_QNAME, RemittanceInformationType.class, FinancialAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "merchantID2", scope = FinancialAccountType.class)
    public JAXBElement<String> createFinancialAccountTypeMerchantID2(String value) {
        return new JAXBElement<String>(_FinancialAccountTypeMerchantID2_QNAME, String.class, FinancialAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACHInformation", scope = FinancialAccountType.class)
    public JAXBElement<ACHInformationType> createFinancialAccountTypeACHInformation(ACHInformationType value) {
        return new JAXBElement<ACHInformationType>(_FinancialAccountTypeACHInformation_QNAME, ACHInformationType.class, FinancialAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "merchantID1", scope = FinancialAccountType.class)
    public JAXBElement<String> createFinancialAccountTypeMerchantID1(String value) {
        return new JAXBElement<String>(_FinancialAccountTypeMerchantID1_QNAME, String.class, FinancialAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "departmentCode", scope = FinancialAccountType.class)
    public JAXBElement<String> createFinancialAccountTypeDepartmentCode(String value) {
        return new JAXBElement<String>(_FinancialAccountTypeDepartmentCode_QNAME, String.class, FinancialAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agencyLocationCode", scope = FinancialAccountType.class)
    public JAXBElement<String> createFinancialAccountTypeAgencyLocationCode(String value) {
        return new JAXBElement<String>(_FinancialAccountTypeAgencyLocationCode_QNAME, String.class, FinancialAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "accountingStation", scope = FinancialAccountType.class)
    public JAXBElement<String> createFinancialAccountTypeAccountingStation(String value) {
        return new JAXBElement<String>(_FinancialAccountTypeAccountingStation_QNAME, String.class, FinancialAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "disbursingOfficeSymbol", scope = FinancialAccountType.class)
    public JAXBElement<String> createFinancialAccountTypeDisbursingOfficeSymbol(String value) {
        return new JAXBElement<String>(_FinancialAccountTypeDisbursingOfficeSymbol_QNAME, String.class, FinancialAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EFTInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EFTInformation", scope = FinancialAccountType.class)
    public JAXBElement<EFTInformationType> createFinancialAccountTypeEFTInformation(EFTInformationType value) {
        return new JAXBElement<EFTInformationType>(_FinancialAccountTypeEFTInformation_QNAME, EFTInformationType.class, FinancialAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "entityFilter", scope = ExclusionSearchCriteriaType.class)
    public JAXBElement<EntityFilterType> createExclusionSearchCriteriaTypeEntityFilter(EntityFilterType value) {
        return new JAXBElement<EntityFilterType>(_ExclusionSearchCriteriaTypeEntityFilter_QNAME, EntityFilterType.class, ExclusionSearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "exclusionFilter", scope = ExclusionSearchCriteriaType.class)
    public JAXBElement<ExclusionFilter> createExclusionSearchCriteriaTypeExclusionFilter(ExclusionFilter value) {
        return new JAXBElement<ExclusionFilter>(_ExclusionSearchCriteriaTypeExclusionFilter_QNAME, ExclusionFilter.class, ExclusionSearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "dateFilter", scope = ExclusionSearchCriteriaType.class)
    public JAXBElement<DateFilterType> createExclusionSearchCriteriaTypeDateFilter(DateFilterType value) {
        return new JAXBElement<DateFilterType>(_ExclusionSearchCriteriaTypeDateFilter_QNAME, DateFilterType.class, ExclusionSearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "USDS_PAYD_NORM", scope = USDSPAYDNORMQRTLGRPType.class)
    public JAXBElement<String> createUSDSPAYDNORMQRTLGRPTypeUSDSPAYDNORM(String value) {
        return new JAXBElement<String>(_USDSPAYDNORMQRTLGRPTypeUSDSPAYDNORM_QNAME, String.class, USDSPAYDNORMQRTLGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "USDS_PAYD_NORM_PRD", scope = USDSPAYDNORMQRTLGRPType.class)
    public JAXBElement<String> createUSDSPAYDNORMQRTLGRPTypeUSDSPAYDNORMPRD(String value) {
        return new JAXBElement<String>(_USDSPAYDNORMQRTLGRPTypeUSDSPAYDNORMPRD_QNAME, String.class, USDSPAYDNORMQRTLGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_DESC", scope = GAFLDATTR3Type.class)
    public JAXBElement<String> createGAFLDATTR3TypeFLDDESC(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDDESC_QNAME, String.class, GAFLDATTR3Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_VAL", scope = GAFLDATTR3Type.class)
    public JAXBElement<String> createGAFLDATTR3TypeFLDVAL(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDVAL_QNAME, String.class, GAFLDATTR3Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_NME", scope = GAFLDATTR3Type.class)
    public JAXBElement<String> createGAFLDATTR3TypeFLDNME(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDNME_QNAME, String.class, GAFLDATTR3Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "code", scope = SBABusinessTypeType.class)
    public JAXBElement<String> createSBABusinessTypeTypeCode(String value) {
        return new JAXBElement<String>(_PSCCodeTypeCode_QNAME, String.class, SBABusinessTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = SBABusinessTypeType.class)
    public JAXBElement<String> createSBABusinessTypeTypeName(String value) {
        return new JAXBElement<String>(_ExecutiveDetailsTypeName_QNAME, String.class, SBABusinessTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "expirationDate", scope = SBABusinessTypeType.class)
    public JAXBElement<String> createSBABusinessTypeTypeExpirationDate(String value) {
        return new JAXBElement<String>(_SBABusinessTypeTypeExpirationDate_QNAME, String.class, SBABusinessTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "USDS_PAYD_SCR", scope = USDSPAYDGRPType.class)
    public JAXBElement<String> createUSDSPAYDGRPTypeUSDSPAYDSCR(String value) {
        return new JAXBElement<String>(_USDSPAYDGRPTypeUSDSPAYDSCR_QNAME, String.class, USDSPAYDGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "USDS_PAYD_PRD", scope = USDSPAYDGRPType.class)
    public JAXBElement<String> createUSDSPAYDGRPTypeUSDSPAYDPRD(String value) {
        return new JAXBElement<String>(_USDSPAYDGRPTypeUSDSPAYDPRD_QNAME, String.class, USDSPAYDGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "updateDate", scope = ExclusionActionType.class)
    public JAXBElement<XMLGregorianCalendar> createExclusionActionTypeUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExclusionActionTypeUpdateDate_QNAME, XMLGregorianCalendar.class, ExclusionActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actionStatus", scope = ExclusionActionType.class)
    public JAXBElement<String> createExclusionActionTypeActionStatus(String value) {
        return new JAXBElement<String>(_ExclusionActionTypeActionStatus_QNAME, String.class, ExclusionActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agencyComponent", scope = ExclusionActionType.class)
    public JAXBElement<String> createExclusionActionTypeAgencyComponent(String value) {
        return new JAXBElement<String>(_ExclusionActionTypeAgencyComponent_QNAME, String.class, ExclusionActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "activeDate", scope = ExclusionActionType.class)
    public JAXBElement<XMLGregorianCalendar> createExclusionActionTypeActiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExclusionActionTypeActiveDate_QNAME, XMLGregorianCalendar.class, ExclusionActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "termType", scope = ExclusionActionType.class)
    public JAXBElement<String> createExclusionActionTypeTermType(String value) {
        return new JAXBElement<String>(_ExclusionActionTypeTermType_QNAME, String.class, ExclusionActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "termDate", scope = ExclusionActionType.class)
    public JAXBElement<XMLGregorianCalendar> createExclusionActionTypeTermDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OperationExclusionHistoryTypeTermDate_QNAME, XMLGregorianCalendar.class, ExclusionActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "createDate", scope = ExclusionActionType.class)
    public JAXBElement<XMLGregorianCalendar> createExclusionActionTypeCreateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OperationExclusionHistoryTypeCreateDate_QNAME, XMLGregorianCalendar.class, ExclusionActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "isDeleted", scope = DeleteDescriptionResponseType.class)
    public JAXBElement<Boolean> createDeleteDescriptionResponseTypeIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_DeleteExclusionResponseTypeIsDeleted_QNAME, Boolean.class, DeleteDescriptionResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stateOfIncorporation", scope = GeneralInformationType.class)
    public JAXBElement<String> createGeneralInformationTypeStateOfIncorporation(String value) {
        return new JAXBElement<String>(_GeneralInformationTypeStateOfIncorporation_QNAME, String.class, GeneralInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfBusinessTypesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "listOfBusinessTypes", scope = GeneralInformationType.class)
    public JAXBElement<ListOfBusinessTypesType> createGeneralInformationTypeListOfBusinessTypes(ListOfBusinessTypesType value) {
        return new JAXBElement<ListOfBusinessTypesType>(_GeneralInformationTypeListOfBusinessTypes_QNAME, ListOfBusinessTypesType.class, GeneralInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "countryOfIncorporation", scope = GeneralInformationType.class)
    public JAXBElement<String> createGeneralInformationTypeCountryOfIncorporation(String value) {
        return new JAXBElement<String>(_GeneralInformationTypeCountryOfIncorporation_QNAME, String.class, GeneralInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSBABusinessTypesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "listOfSBABusinessTypes", scope = GeneralInformationType.class)
    public JAXBElement<ListOfSBABusinessTypesType> createGeneralInformationTypeListOfSBABusinessTypes(ListOfSBABusinessTypesType value) {
        return new JAXBElement<ListOfSBABusinessTypesType>(_GeneralInformationTypeListOfSBABusinessTypes_QNAME, ListOfSBABusinessTypesType.class, GeneralInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfNAICSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "listOfNAICS", scope = NaicsAnswerType.class)
    public JAXBElement<ListOfNAICSType> createNaicsAnswerTypeListOfNAICS(ListOfNAICSType value) {
        return new JAXBElement<ListOfNAICSType>(_GoodsAndServicesTypeListOfNAICS_QNAME, ListOfNAICSType.class, NaicsAnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = ExclusionReferenceType.class)
    public JAXBElement<String> createExclusionReferenceTypeName(String value) {
        return new JAXBElement<String>(_ExecutiveDetailsTypeName_QNAME, String.class, ExclusionReferenceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = ExclusionReferenceType.class)
    public JAXBElement<String> createExclusionReferenceTypeType(String value) {
        return new JAXBElement<String>(_DisasterReliefAreaTypeType_QNAME, String.class, ExclusionReferenceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "taxpayerIdentificationType", scope = TINInformationType.class)
    public JAXBElement<String> createTINInformationTypeTaxpayerIdentificationType(String value) {
        return new JAXBElement<String>(_TINInformationTypeTaxpayerIdentificationType_QNAME, String.class, TINInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "taxpayerIdentificationNumber", scope = TINInformationType.class)
    public JAXBElement<String> createTINInformationTypeTaxpayerIdentificationNumber(String value) {
        return new JAXBElement<String>(_EntitySearchCriteriaTypeTaxpayerIdentificationNumber_QNAME, String.class, TINInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "exclusionAgencyCode", scope = ExclusionAgencyType.class)
    public JAXBElement<String> createExclusionAgencyTypeExclusionAgencyCode(String value) {
        return new JAXBElement<String>(_ExclusionAgencyTypeExclusionAgencyCode_QNAME, String.class, ExclusionAgencyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "exclusionAgency", scope = ExclusionAgencyType.class)
    public JAXBElement<String> createExclusionAgencyTypeExclusionAgency(String value) {
        return new JAXBElement<String>(_ExclusionAgencyTypeExclusionAgency_QNAME, String.class, ExclusionAgencyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "faxNumber", scope = ACHInformationType.class)
    public JAXBElement<String> createACHInformationTypeFaxNumber(String value) {
        return new JAXBElement<String>(_ACHInformationTypeFaxNumber_QNAME, String.class, ACHInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nonUSPhone", scope = ACHInformationType.class)
    public JAXBElement<String> createACHInformationTypeNonUSPhone(String value) {
        return new JAXBElement<String>(_POCTypesNonUSPhone_QNAME, String.class, ACHInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USPhone", scope = ACHInformationType.class)
    public JAXBElement<String> createACHInformationTypeUSPhone(String value) {
        return new JAXBElement<String>(_POCTypesUSPhone_QNAME, String.class, ACHInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email", scope = ACHInformationType.class)
    public JAXBElement<String> createACHInformationTypeEmail(String value) {
        return new JAXBElement<String>(_POCTypesEmail_QNAME, String.class, ACHInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "legacyCreateUser", scope = TransactionInformationType.class)
    public JAXBElement<BigInteger> createTransactionInformationTypeLegacyCreateUser(BigInteger value) {
        return new JAXBElement<BigInteger>(_TransactionInformationTypeLegacyCreateUser_QNAME, BigInteger.class, TransactionInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "updateDate", scope = TransactionInformationType.class)
    public JAXBElement<String> createTransactionInformationTypeUpdateDate(String value) {
        return new JAXBElement<String>(_TransactionInformationTypeUpdateDate_QNAME, String.class, TransactionInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "deleteFlag", scope = TransactionInformationType.class)
    public JAXBElement<String> createTransactionInformationTypeDeleteFlag(String value) {
        return new JAXBElement<String>(_TransactionInformationTypeDeleteFlag_QNAME, String.class, TransactionInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "legacyUpdateDate", scope = TransactionInformationType.class)
    public JAXBElement<String> createTransactionInformationTypeLegacyUpdateDate(String value) {
        return new JAXBElement<String>(_TransactionInformationTypeLegacyUpdateDate_QNAME, String.class, TransactionInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "createDate", scope = TransactionInformationType.class)
    public JAXBElement<String> createTransactionInformationTypeCreateDate(String value) {
        return new JAXBElement<String>(_TransactionInformationTypeCreateDate_QNAME, String.class, TransactionInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "deleteDate", scope = TransactionInformationType.class)
    public JAXBElement<String> createTransactionInformationTypeDeleteDate(String value) {
        return new JAXBElement<String>(_TransactionInformationTypeDeleteDate_QNAME, String.class, TransactionInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "legacyCreateDate", scope = TransactionInformationType.class)
    public JAXBElement<String> createTransactionInformationTypeLegacyCreateDate(String value) {
        return new JAXBElement<String>(_TransactionInformationTypeLegacyCreateDate_QNAME, String.class, TransactionInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "createUser", scope = TransactionInformationType.class)
    public JAXBElement<BigInteger> createTransactionInformationTypeCreateUser(BigInteger value) {
        return new JAXBElement<BigInteger>(_TransactionInformationTypeCreateUser_QNAME, BigInteger.class, TransactionInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "legacyUpdateUser", scope = TransactionInformationType.class)
    public JAXBElement<BigInteger> createTransactionInformationTypeLegacyUpdateUser(BigInteger value) {
        return new JAXBElement<BigInteger>(_TransactionInformationTypeLegacyUpdateUser_QNAME, BigInteger.class, TransactionInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "updateUser", scope = TransactionInformationType.class)
    public JAXBElement<BigInteger> createTransactionInformationTypeUpdateUser(BigInteger value) {
        return new JAXBElement<BigInteger>(_TransactionInformationTypeUpdateUser_QNAME, BigInteger.class, TransactionInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSCUSTINPDATATYPE1 .FLDLST }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_LST", scope = RSCUSTINPDATATYPE1 .class)
    public JAXBElement<RSCUSTINPDATATYPE1 .FLDLST> createRSCUSTINPDATATYPE1FLDLST(RSCUSTINPDATATYPE1 .FLDLST value) {
        return new JAXBElement<RSCUSTINPDATATYPE1 .FLDLST>(_RSCUSTINPDATATYPE3FLDLST_QNAME, RSCUSTINPDATATYPE1 .FLDLST.class, RSCUSTINPDATATYPE1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "TITLE", scope = RSCUSTINPDATATYPE1 .class)
    public JAXBElement<String> createRSCUSTINPDATATYPE1TITLE(String value) {
        return new JAXBElement<String>(_RSCUSTINPDATATYPE3TITLE_QNAME, String.class, RSCUSTINPDATATYPE1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "NME", scope = RSKEYFLDS3TYPE.KEYFLD.class)
    public JAXBElement<String> createRSKEYFLDS3TYPEKEYFLDNME(String value) {
        return new JAXBElement<String>(_RSKEYFLDS2TYPEKEYFLDNME_QNAME, String.class, RSKEYFLDS3TYPE.KEYFLD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "VAL", scope = RSKEYFLDS3TYPE.KEYFLD.class)
    public JAXBElement<String> createRSKEYFLDS3TYPEKEYFLDVAL(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDALWDVALVAL_QNAME, String.class, RSKEYFLDS3TYPE.KEYFLD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "UPD", scope = RSKEYFLDS3TYPE.KEYFLD.class)
    public JAXBElement<String> createRSKEYFLDS3TYPEKEYFLDUPD(String value) {
        return new JAXBElement<String>(_RSKEYFLDS3TYPEKEYFLDUPD_QNAME, String.class, RSKEYFLDS3TYPE.KEYFLD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSBAManualCertificationUpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "listOfSBAManualCertificationUpdate", scope = SBAManualCertificationUpdateRequestType.class)
    public JAXBElement<ListOfSBAManualCertificationUpdateType> createSBAManualCertificationUpdateRequestTypeListOfSBAManualCertificationUpdate(ListOfSBAManualCertificationUpdateType value) {
        return new JAXBElement<ListOfSBAManualCertificationUpdateType>(_ListOfSBAManualCertificationUpdate_QNAME, ListOfSBAManualCertificationUpdateType.class, SBAManualCertificationUpdateRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_NET_OPRG_INCM", scope = RSEULPPLAggType.class)
    public JAXBElement<Float> createRSEULPPLAggTypeEULPNETOPRGINCM(Float value) {
        return new JAXBElement<Float>(_RSEULPPLAggTypeEULPNETOPRGINCM_QNAME, Float.class, RSEULPPLAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_EMP_CST", scope = RSEULPPLAggType.class)
    public JAXBElement<Float> createRSEULPPLAggTypeEULPEMPCST(Float value) {
        return new JAXBElement<Float>(_RSEULPPLAggTypeEULPEMPCST_QNAME, Float.class, RSEULPPLAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_NET_PFT", scope = RSEULPPLAggType.class)
    public JAXBElement<Float> createRSEULPPLAggTypeEULPNETPFT(Float value) {
        return new JAXBElement<Float>(_RSEULPPLAggTypeEULPNETPFT_QNAME, Float.class, RSEULPPLAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_NET_TAX", scope = RSEULPPLAggType.class)
    public JAXBElement<Float> createRSEULPPLAggTypeEULPNETTAX(Float value) {
        return new JAXBElement<Float>(_RSEULPPLAggTypeEULPNETTAX_QNAME, Float.class, RSEULPPLAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_TOT_FINL_INCM", scope = RSEULPPLAggType.class)
    public JAXBElement<Float> createRSEULPPLAggTypeEULPTOTFINLINCM(Float value) {
        return new JAXBElement<Float>(_RSEULPPLAggTypeEULPTOTFINLINCM_QNAME, Float.class, RSEULPPLAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_NET_LOSS", scope = RSEULPPLAggType.class)
    public JAXBElement<Float> createRSEULPPLAggTypeEULPNETLOSS(Float value) {
        return new JAXBElement<Float>(_RSEULPPLAggTypeEULPNETLOSS_QNAME, Float.class, RSEULPPLAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_DPRE", scope = RSEULPPLAggType.class)
    public JAXBElement<Float> createRSEULPPLAggTypeEULPDPRE(Float value) {
        return new JAXBElement<Float>(_RSEULPPLAggTypeEULPDPRE_QNAME, Float.class, RSEULPPLAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_PFT_PST_TAX", scope = RSEULPPLAggType.class)
    public JAXBElement<Float> createRSEULPPLAggTypeEULPPFTPSTTAX(Float value) {
        return new JAXBElement<Float>(_RSEULPPLAggTypeEULPPFTPSTTAX_QNAME, Float.class, RSEULPPLAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_COGS", scope = RSEULPPLAggType.class)
    public JAXBElement<Float> createRSEULPPLAggTypeEULPCOGS(Float value) {
        return new JAXBElement<Float>(_RSEULPPLAggTypeEULPCOGS_QNAME, Float.class, RSEULPPLAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_NET_SLS", scope = RSEULPPLAggType.class)
    public JAXBElement<Float> createRSEULPPLAggTypeEULPNETSLS(Float value) {
        return new JAXBElement<Float>(_RSEULPPLAggTypeEULPNETSLS_QNAME, Float.class, RSEULPPLAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_GRS_PFT", scope = RSEULPPLAggType.class)
    public JAXBElement<Float> createRSEULPPLAggTypeEULPGRSPFT(Float value) {
        return new JAXBElement<Float>(_RSEULPPLAggTypeEULPGRSPFT_QNAME, Float.class, RSEULPPLAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_TOT_FINL_EXPE", scope = RSEULPPLAggType.class)
    public JAXBElement<Float> createRSEULPPLAggTypeEULPTOTFINLEXPE(Float value) {
        return new JAXBElement<Float>(_RSEULPPLAggTypeEULPTOTFINLEXPE_QNAME, Float.class, RSEULPPLAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_PFT_STMT_DT", scope = RSEULPPLAggType.class)
    public JAXBElement<String> createRSEULPPLAggTypeEULPPFTSTMTDT(String value) {
        return new JAXBElement<String>(_RSEULPPLAggTypeEULPPFTSTMTDT_QNAME, String.class, RSEULPPLAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_PFT_PRE_TAX", scope = RSEULPPLAggType.class)
    public JAXBElement<Float> createRSEULPPLAggTypeEULPPFTPRETAX(Float value) {
        return new JAXBElement<Float>(_RSEULPPLAggTypeEULPPFTPRETAX_QNAME, Float.class, RSEULPPLAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EULP_SLS", scope = RSEULPPLAggType.class)
    public JAXBElement<Float> createRSEULPPLAggTypeEULPSLS(Float value) {
        return new JAXBElement<Float>(_RSEULPPLAggTypeEULPSLS_QNAME, Float.class, RSEULPPLAggType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSizeMetricDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "listOfSizeMetricDetails", scope = SizeMetricsType.class)
    public JAXBElement<ListOfSizeMetricDetailsType> createSizeMetricsTypeListOfSizeMetricDetails(ListOfSizeMetricDetailsType value) {
        return new JAXBElement<ListOfSizeMetricDetailsType>(_SizeMetricsTypeListOfSizeMetricDetails_QNAME, ListOfSizeMetricDetailsType.class, SizeMetricsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificationURLsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "qualificationURLs", scope = QualificationsType.class)
    public JAXBElement<CertificationURLsType> createQualificationsTypeQualificationURLs(CertificationURLsType value) {
        return new JAXBElement<CertificationURLsType>(_QualificationsTypeQualificationURLs_QNAME, CertificationURLsType.class, QualificationsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FARResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "architectEngineerResponses", scope = QualificationsType.class)
    public JAXBElement<FARResponseType> createQualificationsTypeArchitectEngineerResponses(FARResponseType value) {
        return new JAXBElement<FARResponseType>(_QualificationsTypeArchitectEngineerResponses_QNAME, FARResponseType.class, QualificationsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "US_PRNT_BKCY_FILG_DT", scope = RSUSPRNTBKCYFILGGRPType.class)
    public JAXBElement<String> createRSUSPRNTBKCYFILGGRPTypeUSPRNTBKCYFILGDT(String value) {
        return new JAXBElement<String>(_RSUSPRNTBKCYFILGGRPTypeUSPRNTBKCYFILGDT_QNAME, String.class, RSUSPRNTBKCYFILGGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "US_PRNT_BKCY_FILG_CH_NBR", scope = RSUSPRNTBKCYFILGGRPType.class)
    public JAXBElement<String> createRSUSPRNTBKCYFILGGRPTypeUSPRNTBKCYFILGCHNBR(String value) {
        return new JAXBElement<String>(_RSUSPRNTBKCYFILGGRPTypeUSPRNTBKCYFILGCHNBR_QNAME, String.class, RSUSPRNTBKCYFILGGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "US_PRNT_BKCY_FILG_TYPE", scope = RSUSPRNTBKCYFILGGRPType.class)
    public JAXBElement<String> createRSUSPRNTBKCYFILGGRPTypeUSPRNTBKCYFILGTYPE(String value) {
        return new JAXBElement<String>(_RSUSPRNTBKCYFILGGRPTypeUSPRNTBKCYFILGTYPE_QNAME, String.class, RSUSPRNTBKCYFILGGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "message", scope = SBAManualCertificationUpdateResponseType.class)
    public JAXBElement<String> createSBAManualCertificationUpdateResponseTypeMessage(String value) {
        return new JAXBElement<String>(_SBASizeResponseTypeMessage_QNAME, String.class, SBAManualCertificationUpdateResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_VAL", scope = GAFLDATTR2Type.class)
    public JAXBElement<String> createGAFLDATTR2TypeFLDVAL(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDVAL_QNAME, String.class, GAFLDATTR2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_NME", scope = GAFLDATTR2Type.class)
    public JAXBElement<String> createGAFLDATTR2TypeFLDNME(String value) {
        return new JAXBElement<String>(_GAFLDATTRComplexTypeFLDNME_QNAME, String.class, GAFLDATTR2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfAnswerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "listOfAnswers", scope = ProvisionType.class)
    public JAXBElement<ListOfAnswerType> createProvisionTypeListOfAnswers(ListOfAnswerType value) {
        return new JAXBElement<ListOfAnswerType>(_ProvisionTypeListOfAnswers_QNAME, ListOfAnswerType.class, ProvisionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "id", scope = ProvisionType.class)
    public JAXBElement<String> createProvisionTypeId(String value) {
        return new JAXBElement<String>(_BusinessObjectTypeId_QNAME, String.class, ProvisionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionCommentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "description", scope = ListOfCommentType.class)
    public JAXBElement<ExclusionCommentType> createListOfCommentTypeDescription(ExclusionCommentType value) {
        return new JAXBElement<ExclusionCommentType>(_ListOfCommentTypeDescription_QNAME, ExclusionCommentType.class, ListOfCommentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YorNType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pointsOfContact", scope = RequestedData.class)
    public JAXBElement<YorNType> createRequestedDataPointsOfContact(YorNType value) {
        return new JAXBElement<YorNType>(_EntityTypePointsOfContact_QNAME, YorNType.class, RequestedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YorNType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "coreData", scope = RequestedData.class)
    public JAXBElement<YorNType> createRequestedDataCoreData(YorNType value) {
        return new JAXBElement<YorNType>(_EntityTypeCoreData_QNAME, YorNType.class, RequestedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YorNType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "assertions", scope = RequestedData.class)
    public JAXBElement<YorNType> createRequestedDataAssertions(YorNType value) {
        return new JAXBElement<YorNType>(_EntityTypeAssertions_QNAME, YorNType.class, RequestedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YorNType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "repsAndCerts", scope = RequestedData.class)
    public JAXBElement<YorNType> createRequestedDataRepsAndCerts(YorNType value) {
        return new JAXBElement<YorNType>(_EntityTypeRepsAndCerts_QNAME, YorNType.class, RequestedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExTransactionInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transactionInformation", scope = ExclusionSearchResponseType.class)
    public JAXBElement<ExTransactionInfoType> createExclusionSearchResponseTypeTransactionInformation(ExTransactionInfoType value) {
        return new JAXBElement<ExTransactionInfoType>(_ExclusionSearchCountResponseTypeTransactionInformation_QNAME, ExTransactionInfoType.class, ExclusionSearchResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transactionInformation", scope = GetEntities.class)
    public JAXBElement<TransactionInfoType> createGetEntitiesTransactionInformation(TransactionInfoType value) {
        return new JAXBElement<TransactionInfoType>(_ExclusionSearchCountResponseTypeTransactionInformation_QNAME, TransactionInfoType.class, GetEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfEntitiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "listOfEntities", scope = GetEntities.class)
    public JAXBElement<ListOfEntitiesType> createGetEntitiesListOfEntities(ListOfEntitiesType value) {
        return new JAXBElement<ListOfEntitiesType>(_GetEntitiesListOfEntities_QNAME, ListOfEntitiesType.class, GetEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "terminationDateRange", scope = DateFilterType.class)
    public JAXBElement<DateRangeType> createDateFilterTypeTerminationDateRange(DateRangeType value) {
        return new JAXBElement<DateRangeType>(_DateFilterTypeTerminationDateRange_QNAME, DateRangeType.class, DateFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "createDateRange", scope = DateFilterType.class)
    public JAXBElement<DateRangeType> createDateFilterTypeCreateDateRange(DateRangeType value) {
        return new JAXBElement<DateRangeType>(_DateFilterTypeCreateDateRange_QNAME, DateRangeType.class, DateFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "updateDateRange", scope = DateFilterType.class)
    public JAXBElement<DateRangeType> createDateFilterTypeUpdateDateRange(DateRangeType value) {
        return new JAXBElement<DateRangeType>(_DateFilterTypeUpdateDateRange_QNAME, DateRangeType.class, DateFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "actionDateRange", scope = DateFilterType.class)
    public JAXBElement<DateRangeType> createDateFilterTypeActionDateRange(DateRangeType value) {
        return new JAXBElement<DateRangeType>(_DateFilterTypeActionDateRange_QNAME, DateRangeType.class, DateFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "deleteDateRange", scope = DateFilterType.class)
    public JAXBElement<DateRangeType> createDateFilterTypeDeleteDateRange(DateRangeType value) {
        return new JAXBElement<DateRangeType>(_DateFilterTypeDeleteDateRange_QNAME, DateRangeType.class, DateFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "financialInformation", scope = EntityCoreDataType.class)
    public JAXBElement<FinancialInformationType> createEntityCoreDataTypeFinancialInformation(FinancialInformationType value) {
        return new JAXBElement<FinancialInformationType>(_EntityCoreDataTypeFinancialInformation_QNAME, FinancialInformationType.class, EntityCoreDataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "businessInformation", scope = EntityCoreDataType.class)
    public JAXBElement<BusinessInformationType> createEntityCoreDataTypeBusinessInformation(BusinessInformationType value) {
        return new JAXBElement<BusinessInformationType>(_EntityCoreDataTypeBusinessInformation_QNAME, BusinessInformationType.class, EntityCoreDataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "generalInformation", scope = EntityCoreDataType.class)
    public JAXBElement<GeneralInformationType> createEntityCoreDataTypeGeneralInformation(GeneralInformationType value) {
        return new JAXBElement<GeneralInformationType>(_EntityCoreDataTypeGeneralInformation_QNAME, GeneralInformationType.class, EntityCoreDataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "address", scope = RemittanceInformationType.class)
    public JAXBElement<AddressTypes> createRemittanceInformationTypeAddress(AddressTypes value) {
        return new JAXBElement<AddressTypes>(_MailingAddressTypesAddress_QNAME, AddressTypes.class, RemittanceInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transactionStatus", scope = TransactionInfoType.class)
    public JAXBElement<String> createTransactionInfoTypeTransactionStatus(String value) {
        return new JAXBElement<String>(_TransactionInfoTypeTransactionStatus_QNAME, String.class, TransactionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dataRetrievalTime", scope = TransactionInfoType.class)
    public JAXBElement<String> createTransactionInfoTypeDataRetrievalTime(String value) {
        return new JAXBElement<String>(_TransactionInfoTypeDataRetrievalTime_QNAME, String.class, TransactionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "numberOfRecordsReturned", scope = TransactionInfoType.class)
    public JAXBElement<String> createTransactionInfoTypeNumberOfRecordsReturned(String value) {
        return new JAXBElement<String>(_TransactionInfoTypeNumberOfRecordsReturned_QNAME, String.class, TransactionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transactionMessage", scope = TransactionInfoType.class)
    public JAXBElement<String> createTransactionInfoTypeTransactionMessage(String value) {
        return new JAXBElement<String>(_TransactionInfoTypeTransactionMessage_QNAME, String.class, TransactionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EXCL_BR_IND", scope = FAMTREERSType.class)
    public JAXBElement<String> createFAMTREERSTypeEXCLBRIND(String value) {
        return new JAXBElement<String>(_FAMTREERSTypeEXCLBRIND_QNAME, String.class, FAMTREERSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FAMTREEMBRType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FAM_TREE_MBR", scope = FAMTREERSType.class)
    public JAXBElement<FAMTREEMBRType> createFAMTREERSTypeFAMTREEMBR(FAMTREEMBRType value) {
        return new JAXBElement<FAMTREEMBRType>(_FAMTREEMBRTypeFAMTREEMBR_QNAME, FAMTREEMBRType.class, FAMTREERSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "BUS_REL_CD", scope = FAMTREERSType.class)
    public JAXBElement<BigInteger> createFAMTREERSTypeBUSRELCD(BigInteger value) {
        return new JAXBElement<BigInteger>(_FAMTREERSTypeBUSRELCD_QNAME, BigInteger.class, FAMTREERSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "DUNS_NBR", scope = FAMTREERSType.class)
    public JAXBElement<String> createFAMTREERSTypeDUNSNBR(String value) {
        return new JAXBElement<String>(_FAMTREEMBRTypeDUNSNBR_QNAME, String.class, FAMTREERSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "errorMessage", scope = ExclusionSearchResponseBaseType.class, defaultValue = "")
    public JAXBElement<String> createExclusionSearchResponseBaseTypeErrorMessage(String value) {
        return new JAXBElement<String>(_ExclusionSearchResponseBaseTypeErrorMessage_QNAME, String.class, ExclusionSearchResponseBaseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "exclusion", scope = CreateExclusionResponseType.class)
    public JAXBElement<ExclusionType> createCreateExclusionResponseTypeExclusion(ExclusionType value) {
        return new JAXBElement<ExclusionType>(_Exclusion_QNAME, ExclusionType.class, CreateExclusionResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSCUSTINPDATATYPE2 .FLDLST }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_LST", scope = RSCUSTINPDATATYPE2 .class)
    public JAXBElement<RSCUSTINPDATATYPE2 .FLDLST> createRSCUSTINPDATATYPE2FLDLST(RSCUSTINPDATATYPE2 .FLDLST value) {
        return new JAXBElement<RSCUSTINPDATATYPE2 .FLDLST>(_RSCUSTINPDATATYPE3FLDLST_QNAME, RSCUSTINPDATATYPE2 .FLDLST.class, RSCUSTINPDATATYPE2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "TITLE", scope = RSCUSTINPDATATYPE2 .class)
    public JAXBElement<String> createRSCUSTINPDATATYPE2TITLE(String value) {
        return new JAXBElement<String>(_RSCUSTINPDATATYPE3TITLE_QNAME, String.class, RSCUSTINPDATATYPE2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "endDate", scope = ExclusionDateRangeType.class)
    public JAXBElement<String> createExclusionDateRangeTypeEndDate(String value) {
        return new JAXBElement<String>(_EntitySearchCriteriaTypeEndDate_QNAME, String.class, ExclusionDateRangeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startDate", scope = ExclusionDateRangeType.class)
    public JAXBElement<String> createExclusionDateRangeTypeStartDate(String value) {
        return new JAXBElement<String>(_EntitySearchCriteriaTypeStartDate_QNAME, String.class, ExclusionDateRangeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "exception", scope = NAICSCodeType.class)
    public JAXBElement<String> createNAICSCodeTypeException(String value) {
        return new JAXBElement<String>(_NAICSCodeTypeException_QNAME, String.class, NAICSCodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "code", scope = NAICSCodeType.class)
    public JAXBElement<String> createNAICSCodeTypeCode(String value) {
        return new JAXBElement<String>(_PSCCodeTypeCode_QNAME, String.class, NAICSCodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SBASmallBusiness", scope = NAICSCodeType.class)
    public JAXBElement<String> createNAICSCodeTypeSBASmallBusiness(String value) {
        return new JAXBElement<String>(_NAICSCodeTypeSBASmallBusiness_QNAME, String.class, NAICSCodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "primary", scope = NAICSCodeType.class)
    public JAXBElement<String> createNAICSCodeTypePrimary(String value) {
        return new JAXBElement<String>(_NAICSCodeTypePrimary_QNAME, String.class, NAICSCodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "identificationInformation", scope = ExclusionType.class)
    public JAXBElement<IdentificationInformationType> createExclusionTypeIdentificationInformation(IdentificationInformationType value) {
        return new JAXBElement<IdentificationInformationType>(_AlternateAddressTypeIdentificationInformation_QNAME, IdentificationInformationType.class, ExclusionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionAgencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "exclusionAgency", scope = ExclusionType.class)
    public JAXBElement<ExclusionAgencyType> createExclusionTypeExclusionAgency(ExclusionAgencyType value) {
        return new JAXBElement<ExclusionAgencyType>(_ExclusionAgencyTypeExclusionAgency_QNAME, ExclusionAgencyType.class, ExclusionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCrossReferenceExclusionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "crossReferences", scope = ExclusionType.class)
    public JAXBElement<ListOfCrossReferenceExclusionsType> createExclusionTypeCrossReferences(ListOfCrossReferenceExclusionsType value) {
        return new JAXBElement<ListOfCrossReferenceExclusionsType>(_ExclusionTypeCrossReferences_QNAME, ListOfCrossReferenceExclusionsType.class, ExclusionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "transactionInformation", scope = ExclusionType.class)
    public JAXBElement<TransactionInformationType> createExclusionTypeTransactionInformation(TransactionInformationType value) {
        return new JAXBElement<TransactionInformationType>(_AlternateAddressTypeTransactionInformation_QNAME, TransactionInformationType.class, ExclusionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "exclusionDetails", scope = ExclusionType.class)
    public JAXBElement<ExclusionDetailsType> createExclusionTypeExclusionDetails(ExclusionDetailsType value) {
        return new JAXBElement<ExclusionDetailsType>(_ExclusionTypeExclusionDetails_QNAME, ExclusionDetailsType.class, ExclusionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSSTATUSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "STATUS", scope = SONRS.class)
    public JAXBElement<RSSTATUSType> createSONRSSTATUS(RSSTATUSType value) {
        return new JAXBElement<RSSTATUSType>(_SONRSSTATUS_QNAME, RSSTATUSType.class, SONRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "DTSERVER", scope = SONRS.class)
    public JAXBElement<String> createSONRSDTSERVER(String value) {
        return new JAXBElement<String>(_SONRSDTSERVER_QNAME, String.class, SONRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "LANGUAGE", scope = SONRS.class)
    public JAXBElement<String> createSONRSLANGUAGE(String value) {
        return new JAXBElement<String>(_SONRSLANGUAGE_QNAME, String.class, SONRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "registrationPurpose", scope = RegistrationInformationType.class)
    public JAXBElement<String> createRegistrationInformationTypeRegistrationPurpose(String value) {
        return new JAXBElement<String>(_RegistrationInformationTypeRegistrationPurpose_QNAME, String.class, RegistrationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CAGECode", scope = RegistrationInformationType.class)
    public JAXBElement<String> createRegistrationInformationTypeCAGECode(String value) {
        return new JAXBElement<String>(_EntitySearchCriteriaTypeCAGECode_QNAME, String.class, RegistrationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "registrationStatus", scope = RegistrationInformationType.class)
    public JAXBElement<String> createRegistrationInformationTypeRegistrationStatus(String value) {
        return new JAXBElement<String>(_EntitySearchCriteriaTypeRegistrationStatus_QNAME, String.class, RegistrationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NCAGECode", scope = RegistrationInformationType.class)
    public JAXBElement<String> createRegistrationInformationTypeNCAGECode(String value) {
        return new JAXBElement<String>(_RegistrationInformationTypeNCAGECode_QNAME, String.class, RegistrationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNS", scope = RegistrationInformationType.class)
    public JAXBElement<String> createRegistrationInformationTypeDUNS(String value) {
        return new JAXBElement<String>(_RegistrationInformationTypeDUNS_QNAME, String.class, RegistrationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lastUpdateDate", scope = RegistrationInformationType.class)
    public JAXBElement<String> createRegistrationInformationTypeLastUpdateDate(String value) {
        return new JAXBElement<String>(_RegistrationInformationTypeLastUpdateDate_QNAME, String.class, RegistrationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNSPlus4", scope = RegistrationInformationType.class)
    public JAXBElement<String> createRegistrationInformationTypeDUNSPlus4(String value) {
        return new JAXBElement<String>(_RegistrationInformationTypeDUNSPlus4_QNAME, String.class, RegistrationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DODAAC", scope = RegistrationInformationType.class)
    public JAXBElement<String> createRegistrationInformationTypeDODAAC(String value) {
        return new JAXBElement<String>(_RegistrationInformationTypeDODAAC_QNAME, String.class, RegistrationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "registrationDate", scope = RegistrationInformationType.class)
    public JAXBElement<String> createRegistrationInformationTypeRegistrationDate(String value) {
        return new JAXBElement<String>(_RegistrationInformationTypeRegistrationDate_QNAME, String.class, RegistrationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "noPublicDisplay", scope = RegistrationInformationType.class)
    public JAXBElement<String> createRegistrationInformationTypeNoPublicDisplay(String value) {
        return new JAXBElement<String>(_RegistrationInformationTypeNoPublicDisplay_QNAME, String.class, RegistrationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "exclusionStatus", scope = RegistrationInformationType.class)
    public JAXBElement<String> createRegistrationInformationTypeExclusionStatus(String value) {
        return new JAXBElement<String>(_RegistrationInformationTypeExclusionStatus_QNAME, String.class, RegistrationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "expirationDate", scope = RegistrationInformationType.class)
    public JAXBElement<String> createRegistrationInformationTypeExpirationDate(String value) {
        return new JAXBElement<String>(_SBABusinessTypeTypeExpirationDate_QNAME, String.class, RegistrationInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisasterReliefDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "disasterReliefData", scope = AssertionsType.class)
    public JAXBElement<DisasterReliefDataType> createAssertionsTypeDisasterReliefData(DisasterReliefDataType value) {
        return new JAXBElement<DisasterReliefDataType>(_AssertionsTypeDisasterReliefData_QNAME, DisasterReliefDataType.class, AssertionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsAndServicesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "goodsAndServices", scope = AssertionsType.class)
    public JAXBElement<GoodsAndServicesType> createAssertionsTypeGoodsAndServices(GoodsAndServicesType value) {
        return new JAXBElement<GoodsAndServicesType>(_AssertionsTypeGoodsAndServices_QNAME, GoodsAndServicesType.class, AssertionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "address1", scope = SearchCriteriaRequest.class)
    public JAXBElement<String> createSearchCriteriaRequestAddress1(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestAddress1_QNAME, String.class, SearchCriteriaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "officeId", scope = SearchCriteriaRequest.class)
    public JAXBElement<String> createSearchCriteriaRequestOfficeId(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestOfficeId_QNAME, String.class, SearchCriteriaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "address2", scope = SearchCriteriaRequest.class)
    public JAXBElement<String> createSearchCriteriaRequestAddress2(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestAddress2_QNAME, String.class, SearchCriteriaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "city", scope = SearchCriteriaRequest.class)
    public JAXBElement<String> createSearchCriteriaRequestCity(String value) {
        return new JAXBElement<String>(_AddressTypeCity_QNAME, String.class, SearchCriteriaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "parentOrgId", scope = SearchCriteriaRequest.class)
    public JAXBElement<String> createSearchCriteriaRequestParentOrgId(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestParentOrgId_QNAME, String.class, SearchCriteriaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "parentOrgCode", scope = SearchCriteriaRequest.class)
    public JAXBElement<String> createSearchCriteriaRequestParentOrgCode(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestParentOrgCode_QNAME, String.class, SearchCriteriaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "govOfficeId", scope = SearchCriteriaRequest.class)
    public JAXBElement<String> createSearchCriteriaRequestGovOfficeId(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestGovOfficeId_QNAME, String.class, SearchCriteriaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "officeName", scope = SearchCriteriaRequest.class)
    public JAXBElement<String> createSearchCriteriaRequestOfficeName(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestOfficeName_QNAME, String.class, SearchCriteriaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "zipCode", scope = SearchCriteriaRequest.class)
    public JAXBElement<String> createSearchCriteriaRequestZipCode(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestZipCode_QNAME, String.class, SearchCriteriaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "country", scope = SearchCriteriaRequest.class)
    public JAXBElement<String> createSearchCriteriaRequestCountry(String value) {
        return new JAXBElement<String>(_AddressTypeCountry_QNAME, String.class, SearchCriteriaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "state", scope = SearchCriteriaRequest.class)
    public JAXBElement<String> createSearchCriteriaRequestState(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestState_QNAME, String.class, SearchCriteriaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "officeCatId", scope = SearchCriteriaRequest.class)
    public JAXBElement<String> createSearchCriteriaRequestOfficeCatId(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestOfficeCatId_QNAME, String.class, SearchCriteriaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "proceedingType", scope = ProceedingsInformationType.class)
    public JAXBElement<String> createProceedingsInformationTypeProceedingType(String value) {
        return new JAXBElement<String>(_ProceedingsInformationTypeProceedingType_QNAME, String.class, ProceedingsInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "instrumentNumber", scope = ProceedingsInformationType.class)
    public JAXBElement<String> createProceedingsInformationTypeInstrumentNumber(String value) {
        return new JAXBElement<String>(_ProceedingsInformationTypeInstrumentNumber_QNAME, String.class, ProceedingsInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "proceedingState", scope = ProceedingsInformationType.class)
    public JAXBElement<String> createProceedingsInformationTypeProceedingState(String value) {
        return new JAXBElement<String>(_ProceedingsInformationTypeProceedingState_QNAME, String.class, ProceedingsInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "proceedingDate", scope = ProceedingsInformationType.class)
    public JAXBElement<String> createProceedingsInformationTypeProceedingDate(String value) {
        return new JAXBElement<String>(_ProceedingsInformationTypeProceedingDate_QNAME, String.class, ProceedingsInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "instrumentID", scope = ProceedingsInformationType.class)
    public JAXBElement<String> createProceedingsInformationTypeInstrumentID(String value) {
        return new JAXBElement<String>(_ProceedingsInformationTypeInstrumentID_QNAME, String.class, ProceedingsInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = ProceedingsInformationType.class)
    public JAXBElement<String> createProceedingsInformationTypeDescription(String value) {
        return new JAXBElement<String>(_ProceedingsInformationTypeDescription_QNAME, String.class, ProceedingsInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dispositionID", scope = ProceedingsInformationType.class)
    public JAXBElement<String> createProceedingsInformationTypeDispositionID(String value) {
        return new JAXBElement<String>(_ProceedingsInformationTypeDispositionID_QNAME, String.class, ProceedingsInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "organizationType", scope = BusinessInformationType.class)
    public JAXBElement<String> createBusinessInformationTypeOrganizationType(String value) {
        return new JAXBElement<String>(_BusinessInformationTypeOrganizationType_QNAME, String.class, BusinessInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fiscalYearEndCloseDate", scope = BusinessInformationType.class)
    public JAXBElement<String> createBusinessInformationTypeFiscalYearEndCloseDate(String value) {
        return new JAXBElement<String>(_BusinessInformationTypeFiscalYearEndCloseDate_QNAME, String.class, BusinessInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailingAddressTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mailingAddress", scope = BusinessInformationType.class)
    public JAXBElement<MailingAddressTypes> createBusinessInformationTypeMailingAddress(MailingAddressTypes value) {
        return new JAXBElement<MailingAddressTypes>(_BusinessInformationTypeMailingAddress_QNAME, MailingAddressTypes.class, BusinessInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agencyBusinessPurpose", scope = BusinessInformationType.class)
    public JAXBElement<String> createBusinessInformationTypeAgencyBusinessPurpose(String value) {
        return new JAXBElement<String>(_BusinessInformationTypeAgencyBusinessPurpose_QNAME, String.class, BusinessInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "companyDivisionName", scope = BusinessInformationType.class)
    public JAXBElement<String> createBusinessInformationTypeCompanyDivisionName(String value) {
        return new JAXBElement<String>(_BusinessInformationTypeCompanyDivisionName_QNAME, String.class, BusinessInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "companyDivisionNumber", scope = BusinessInformationType.class)
    public JAXBElement<String> createBusinessInformationTypeCompanyDivisionNumber(String value) {
        return new JAXBElement<String>(_BusinessInformationTypeCompanyDivisionNumber_QNAME, String.class, BusinessInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "businessStartDate", scope = BusinessInformationType.class)
    public JAXBElement<String> createBusinessInformationTypeBusinessStartDate(String value) {
        return new JAXBElement<String>(_BusinessInformationTypeBusinessStartDate_QNAME, String.class, BusinessInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "corporateURL", scope = BusinessInformationType.class)
    public JAXBElement<String> createBusinessInformationTypeCorporateURL(String value) {
        return new JAXBElement<String>(_BusinessInformationTypeCorporateURL_QNAME, String.class, BusinessInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "physicalAddress", scope = BusinessInformationType.class)
    public JAXBElement<AddressTypes> createBusinessInformationTypePhysicalAddress(AddressTypes value) {
        return new JAXBElement<AddressTypes>(_BusinessInformationTypePhysicalAddress_QNAME, AddressTypes.class, BusinessInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "correspondenceFlag", scope = BusinessInformationType.class)
    public JAXBElement<Boolean> createBusinessInformationTypeCorrespondenceFlag(Boolean value) {
        return new JAXBElement<Boolean>(_BusinessInformationTypeCorrespondenceFlag_QNAME, Boolean.class, BusinessInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "DUNS", scope = EntityFilterType.class)
    public JAXBElement<String> createEntityFilterTypeDUNS(String value) {
        return new JAXBElement<String>(_EntityFilterTypeDUNS_QNAME, String.class, EntityFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CAGEListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "CAGEList", scope = EntityFilterType.class)
    public JAXBElement<CAGEListType> createEntityFilterTypeCAGEList(CAGEListType value) {
        return new JAXBElement<CAGEListType>(_EntityFilterTypeCAGEList_QNAME, CAGEListType.class, EntityFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "Individual", scope = EntityFilterType.class)
    public JAXBElement<IndividualType> createEntityFilterTypeIndividual(IndividualType value) {
        return new JAXBElement<IndividualType>(_EntityFilterTypeIndividual_QNAME, IndividualType.class, EntityFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NPIListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "NPIList", scope = EntityFilterType.class)
    public JAXBElement<NPIListType> createEntityFilterTypeNPIList(NPIListType value) {
        return new JAXBElement<NPIListType>(_EntityFilterTypeNPIList_QNAME, NPIListType.class, EntityFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "CountryList", scope = EntityFilterType.class)
    public JAXBElement<CountryListType> createEntityFilterTypeCountryList(CountryListType value) {
        return new JAXBElement<CountryListType>(_EntityFilterTypeCountryList_QNAME, CountryListType.class, EntityFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "EntityName", scope = EntityFilterType.class)
    public JAXBElement<String> createEntityFilterTypeEntityName(String value) {
        return new JAXBElement<String>(_EntityFilterTypeEntityName_QNAME, String.class, EntityFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "TINSSN", scope = EntityFilterType.class)
    public JAXBElement<String> createEntityFilterTypeTINSSN(String value) {
        return new JAXBElement<String>(_EntityFilterTypeTINSSN_QNAME, String.class, EntityFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "StateList", scope = EntityFilterType.class)
    public JAXBElement<StateListType> createEntityFilterTypeStateList(StateListType value) {
        return new JAXBElement<StateListType>(_EntityFilterTypeStateList_QNAME, StateListType.class, EntityFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "ClassificationList", scope = EntityFilterType.class)
    public JAXBElement<ClassificationListType> createEntityFilterTypeClassificationList(ClassificationListType value) {
        return new JAXBElement<ClassificationListType>(_EntityFilterTypeClassificationList_QNAME, ClassificationListType.class, EntityFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "metropolitanStatisticalArea", scope = GeographicalAreaServedType.class)
    public JAXBElement<String> createGeographicalAreaServedTypeMetropolitanStatisticalArea(String value) {
        return new JAXBElement<String>(_GeographicalAreaServedTypeMetropolitanStatisticalArea_QNAME, String.class, GeographicalAreaServedType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "county", scope = GeographicalAreaServedType.class)
    public JAXBElement<String> createGeographicalAreaServedTypeCounty(String value) {
        return new JAXBElement<String>(_GeographicalAreaServedTypeCounty_QNAME, String.class, GeographicalAreaServedType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "state", scope = GeographicalAreaServedType.class)
    public JAXBElement<String> createGeographicalAreaServedTypeState(String value) {
        return new JAXBElement<String>(_ExclusionAddressTypeState_QNAME, String.class, GeographicalAreaServedType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "DEFU_INDN", scope = RSSCRGRPType.class)
    public JAXBElement<String> createRSSCRGRPTypeDEFUINDN(String value) {
        return new JAXBElement<String>(_RSSCRGRPTypeDEFUINDN_QNAME, String.class, RSSCRGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SCR_CLAS", scope = RSSCRGRPType.class)
    public JAXBElement<String> createRSSCRGRPTypeSCRCLAS(String value) {
        return new JAXBElement<String>(_RSSCRGRPTypeSCRCLAS_QNAME, String.class, RSSCRGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SCR", scope = RSSCRGRPType.class)
    public JAXBElement<String> createRSSCRGRPTypeSCR(String value) {
        return new JAXBElement<String>(_RSSCRGRPTypeSCR_QNAME, String.class, RSSCRGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SCR_OVRD_CD", scope = RSSCRGRPType.class)
    public JAXBElement<String> createRSSCRGRPTypeSCROVRDCD(String value) {
        return new JAXBElement<String>(_RSSCRGRPTypeSCROVRDCD_QNAME, String.class, RSSCRGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "INDS_DEFU_INDN", scope = RSSCRGRPType.class)
    public JAXBElement<String> createRSSCRGRPTypeINDSDEFUINDN(String value) {
        return new JAXBElement<String>(_RSSCRGRPTypeINDSDEFUINDN_QNAME, String.class, RSSCRGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SCR_CMTY_CD", scope = RSSCRGRPType.class)
    public JAXBElement<String> createRSSCRGRPTypeSCRCMTYCD(String value) {
        return new JAXBElement<String>(_RSSCRGRPTypeSCRCMTYCD_QNAME, String.class, RSSCRGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "INDS_NORM", scope = RSSCRGRPType.class)
    public JAXBElement<String> createRSSCRGRPTypeINDSNORM(String value) {
        return new JAXBElement<String>(_RSSCRGRPTypeINDSNORM_QNAME, String.class, RSSCRGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "ASMT_DT", scope = RSSCRGRPType.class)
    public JAXBElement<String> createRSSCRGRPTypeASMTDT(String value) {
        return new JAXBElement<String>(_RSSCRGRPTypeASMTDT_QNAME, String.class, RSSCRGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "NATL_PCTL", scope = RSSCRGRPType.class)
    public JAXBElement<String> createRSSCRGRPTypeNATLPCTL(String value) {
        return new JAXBElement<String>(_RSSCRGRPTypeNATLPCTL_QNAME, String.class, RSSCRGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "SCR_AGE", scope = RSSCRGRPType.class)
    public JAXBElement<String> createRSSCRGRPTypeSCRAGE(String value) {
        return new JAXBElement<String>(_RSSCRGRPTypeSCRAGE_QNAME, String.class, RSSCRGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "RAW_SCR", scope = RSSCRGRPType.class)
    public JAXBElement<Float> createRSSCRGRPTypeRAWSCR(Float value) {
        return new JAXBElement<Float>(_RSSCRGRPTypeRAWSCR_QNAME, Float.class, RSSCRGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "ALGM_ID", scope = RSSCRGRPType.class)
    public JAXBElement<String> createRSSCRGRPTypeALGMID(String value) {
        return new JAXBElement<String>(_RSSCRGRPTypeALGMID_QNAME, String.class, RSSCRGRPType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CAGECode", scope = CAGEInformationType.class)
    public JAXBElement<String> createCAGEInformationTypeCAGECode(String value) {
        return new JAXBElement<String>(_EntitySearchCriteriaTypeCAGECode_QNAME, String.class, CAGEInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NCAGECode", scope = CAGEInformationType.class)
    public JAXBElement<String> createCAGEInformationTypeNCAGECode(String value) {
        return new JAXBElement<String>(_RegistrationInformationTypeNCAGECode_QNAME, String.class, CAGEInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "address1", scope = SearchCriteria.class)
    public JAXBElement<String> createSearchCriteriaAddress1(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestAddress1_QNAME, String.class, SearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "officeId", scope = SearchCriteria.class)
    public JAXBElement<String> createSearchCriteriaOfficeId(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestOfficeId_QNAME, String.class, SearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "address2", scope = SearchCriteria.class)
    public JAXBElement<String> createSearchCriteriaAddress2(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestAddress2_QNAME, String.class, SearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "city", scope = SearchCriteria.class)
    public JAXBElement<String> createSearchCriteriaCity(String value) {
        return new JAXBElement<String>(_AddressTypeCity_QNAME, String.class, SearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "parentOrgId", scope = SearchCriteria.class)
    public JAXBElement<String> createSearchCriteriaParentOrgId(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestParentOrgId_QNAME, String.class, SearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "parentOrgCode", scope = SearchCriteria.class)
    public JAXBElement<String> createSearchCriteriaParentOrgCode(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestParentOrgCode_QNAME, String.class, SearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "govOfficeId", scope = SearchCriteria.class)
    public JAXBElement<String> createSearchCriteriaGovOfficeId(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestGovOfficeId_QNAME, String.class, SearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "officeName", scope = SearchCriteria.class)
    public JAXBElement<String> createSearchCriteriaOfficeName(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestOfficeName_QNAME, String.class, SearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "zipCode", scope = SearchCriteria.class)
    public JAXBElement<String> createSearchCriteriaZipCode(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestZipCode_QNAME, String.class, SearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "country", scope = SearchCriteria.class)
    public JAXBElement<String> createSearchCriteriaCountry(String value) {
        return new JAXBElement<String>(_AddressTypeCountry_QNAME, String.class, SearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "state", scope = SearchCriteria.class)
    public JAXBElement<String> createSearchCriteriaState(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestState_QNAME, String.class, SearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "officeCatId", scope = SearchCriteria.class)
    public JAXBElement<String> createSearchCriteriaOfficeCatId(String value) {
        return new JAXBElement<String>(_SearchCriteriaRequestOfficeCatId_QNAME, String.class, SearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "includeInactive", scope = OperationSearchType.class)
    public JAXBElement<String> createOperationSearchTypeIncludeInactive(String value) {
        return new JAXBElement<String>(_OperationSearchTypeIncludeInactive_QNAME, String.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "middle", scope = OperationSearchType.class)
    public JAXBElement<String> createOperationSearchTypeMiddle(String value) {
        return new JAXBElement<String>(_OperationExArchiveSearchTypeMiddle_QNAME, String.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "partialName", scope = OperationSearchType.class)
    public JAXBElement<String> createOperationSearchTypePartialName(String value) {
        return new JAXBElement<String>(_OperationExArchiveSearchTypePartialName_QNAME, String.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "last", scope = OperationSearchType.class)
    public JAXBElement<String> createOperationSearchTypeLast(String value) {
        return new JAXBElement<String>(_OperationExArchiveSearchTypeLast_QNAME, String.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "modifyDate", scope = OperationSearchType.class)
    public JAXBElement<ExclusionDateRangeType> createOperationSearchTypeModifyDate(ExclusionDateRangeType value) {
        return new JAXBElement<ExclusionDateRangeType>(_OperationExclusionHistoryTypeModifyDate_QNAME, ExclusionDateRangeType.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNSNumber", scope = OperationSearchType.class)
    public JAXBElement<String> createOperationSearchTypeDUNSNumber(String value) {
        return new JAXBElement<String>(_EntityIdentificationTypeDUNSNumber_QNAME, String.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "prefix", scope = OperationSearchType.class)
    public JAXBElement<String> createOperationSearchTypePrefix(String value) {
        return new JAXBElement<String>(_OperationExArchiveSearchTypePrefix_QNAME, String.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "exactName", scope = OperationSearchType.class)
    public JAXBElement<String> createOperationSearchTypeExactName(String value) {
        return new JAXBElement<String>(_OperationExArchiveSearchTypeExactName_QNAME, String.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "suffix", scope = OperationSearchType.class)
    public JAXBElement<String> createOperationSearchTypeSuffix(String value) {
        return new JAXBElement<String>(_OperationExArchiveSearchTypeSuffix_QNAME, String.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionAgencyUIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agencyUID", scope = OperationSearchType.class)
    public JAXBElement<ExclusionAgencyUIDType> createOperationSearchTypeAgencyUID(ExclusionAgencyUIDType value) {
        return new JAXBElement<ExclusionAgencyUIDType>(_ListOfExclusionAgencyUIDTypeAgencyUID_QNAME, ExclusionAgencyUIDType.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = OperationSearchType.class)
    public JAXBElement<String> createOperationSearchTypeName(String value) {
        return new JAXBElement<String>(_ExecutiveDetailsTypeName_QNAME, String.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "periodicity", scope = OperationSearchType.class)
    public JAXBElement<String> createOperationSearchTypePeriodicity(String value) {
        return new JAXBElement<String>(_OperationExclusionHistoryTypePeriodicity_QNAME, String.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "termDate", scope = OperationSearchType.class)
    public JAXBElement<ExclusionDateRangeType> createOperationSearchTypeTermDate(ExclusionDateRangeType value) {
        return new JAXBElement<ExclusionDateRangeType>(_OperationExclusionHistoryTypeTermDate_QNAME, ExclusionDateRangeType.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actionDate", scope = OperationSearchType.class)
    public JAXBElement<ExclusionDateRangeType> createOperationSearchTypeActionDate(ExclusionDateRangeType value) {
        return new JAXBElement<ExclusionDateRangeType>(_OperationExclusionHistoryTypeActionDate_QNAME, ExclusionDateRangeType.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "first", scope = OperationSearchType.class)
    public JAXBElement<String> createOperationSearchTypeFirst(String value) {
        return new JAXBElement<String>(_OperationExArchiveSearchTypeFirst_QNAME, String.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "createDate", scope = OperationSearchType.class)
    public JAXBElement<ExclusionDateRangeType> createOperationSearchTypeCreateDate(ExclusionDateRangeType value) {
        return new JAXBElement<ExclusionDateRangeType>(_OperationExclusionHistoryTypeCreateDate_QNAME, ExclusionDateRangeType.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "deleteDate", scope = OperationSearchType.class)
    public JAXBElement<ExclusionDateRangeType> createOperationSearchTypeDeleteDate(ExclusionDateRangeType value) {
        return new JAXBElement<ExclusionDateRangeType>(_OperationExclusionHistoryTypeDeleteDate_QNAME, ExclusionDateRangeType.class, OperationSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "exclusionProgram", scope = ExclusionDetailsType.class)
    public JAXBElement<String> createExclusionDetailsTypeExclusionProgram(String value) {
        return new JAXBElement<String>(_ExclusionDetailsTypeExclusionProgram_QNAME, String.class, ExclusionDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "indefiniteIndicatorFlag", scope = ExclusionDetailsType.class)
    public JAXBElement<String> createExclusionDetailsTypeIndefiniteIndicatorFlag(String value) {
        return new JAXBElement<String>(_ExclusionDetailsTypeIndefiniteIndicatorFlag_QNAME, String.class, ExclusionDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "additionalComments", scope = ExclusionDetailsType.class)
    public JAXBElement<String> createExclusionDetailsTypeAdditionalComments(String value) {
        return new JAXBElement<String>(_AdditionalComments_QNAME, String.class, ExclusionDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "terminationDate", scope = ExclusionDetailsType.class)
    public JAXBElement<String> createExclusionDetailsTypeTerminationDate(String value) {
        return new JAXBElement<String>(_ExclusionDetailsTypeTerminationDate_QNAME, String.class, ExclusionDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "exclusionStatus", scope = ExclusionDetailsType.class)
    public JAXBElement<String> createExclusionDetailsTypeExclusionStatus(String value) {
        return new JAXBElement<String>(_ExclusionDetailsTypeExclusionStatus_QNAME, String.class, ExclusionDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "exclusionType", scope = ExclusionDetailsType.class)
    public JAXBElement<String> createExclusionDetailsTypeExclusionType(String value) {
        return new JAXBElement<String>(_ExclusionDetailsTypeExclusionType_QNAME, String.class, ExclusionDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "activeDate", scope = ExclusionDetailsType.class)
    public JAXBElement<String> createExclusionDetailsTypeActiveDate(String value) {
        return new JAXBElement<String>(_ExclusionDetailsTypeActiveDate_QNAME, String.class, ExclusionDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "classificationType", scope = ExclusionDetailsType.class)
    public JAXBElement<String> createExclusionDetailsTypeClassificationType(String value) {
        return new JAXBElement<String>(_ExclusionDetailsTypeClassificationType_QNAME, String.class, ExclusionDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNSNumber", scope = DUNSType.class)
    public JAXBElement<String> createDUNSTypeDUNSNumber(String value) {
        return new JAXBElement<String>(_EntityIdentificationTypeDUNSNumber_QNAME, String.class, DUNSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "legalBusinessName", scope = DUNSType.class)
    public JAXBElement<String> createDUNSTypeLegalBusinessName(String value) {
        return new JAXBElement<String>(_DNBMonitoringTypeLegalBusinessName_QNAME, String.class, DUNSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "exactName", scope = OperationExSSNSearchType.class)
    public JAXBElement<String> createOperationExSSNSearchTypeExactName(String value) {
        return new JAXBElement<String>(_OperationExArchiveSearchTypeExactName_QNAME, String.class, OperationExSSNSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAFLDATTR3Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sam.gov", name = "FLD_ATTR", scope = RSCUSTINPDATATYPE3 .FLDLST.class)
    public JAXBElement<GAFLDATTR3Type> createRSCUSTINPDATATYPE3FLDLSTFLDATTR(GAFLDATTR3Type value) {
        return new JAXBElement<GAFLDATTR3Type>(_RSCUSTINPDATATYPE2FLDLSTFLDATTR_QNAME, GAFLDATTR3Type.class, RSCUSTINPDATATYPE3 .FLDLST.class, value);
    }

}

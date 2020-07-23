/**
 * 
 */
package com.challenge.swiftcode.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBElement;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.challenge.swiftcode.exception.BaseApplicationException;
import com.challenge.swiftcode.models.EntityObject;
import com.challenge.swiftcode.models.EntityObjectResponse;
import com.challenge.swiftcode.models.FarDFarAnswersData;
import com.challenge.swiftcode.repository.impl.EntityRepository;
import com.challenge.swiftcode.wsClient.AnswerType;
import com.challenge.swiftcode.wsClient.ApplicationException_Exception;
import com.challenge.swiftcode.wsClient.CertificationsType;
import com.challenge.swiftcode.wsClient.EntityManagementBean;
import com.challenge.swiftcode.wsClient.EntityManagementBeanService;
import com.challenge.swiftcode.wsClient.EntitySearchCriteriaType;
import com.challenge.swiftcode.wsClient.EntityType;
import com.challenge.swiftcode.wsClient.FARResponseType;
import com.challenge.swiftcode.wsClient.GetEntities;
import com.challenge.swiftcode.wsClient.ListOfAnswerType;
import com.challenge.swiftcode.wsClient.ListOfEntitiesType;
import com.challenge.swiftcode.wsClient.ListOfProvisionsType;
import com.challenge.swiftcode.wsClient.ObjectFactory;
import com.challenge.swiftcode.wsClient.ProvisionType;
import com.challenge.swiftcode.wsClient.RegistrationInformationType;
import com.challenge.swiftcode.wsClient.RepsAndCertsType;
import com.challenge.swiftcode.wsClient.RequestedData;
import com.challenge.swiftcode.wsClient.SystemException_Exception;
import com.challenge.swiftcode.wsClient.UserAuthenticationKeyType;
import com.challenge.swiftcode.wsClient.YorNType;

/**
 * @author Ruchir.Mehta
 *
 */
@Service
@Transactional
public class EntityService {

	private final static Logger log = LoggerFactory.getLogger(EntityService.class);

	@Autowired
	private EntityRepository entityRepository;



	@Transactional(readOnly=false)
	public EntityObject postEntityData(EntityObject entityObject) throws BaseApplicationException {
		return entityRepository.create(entityObject);
	}

	@Transactional(readOnly=false)
	public List<EntityObjectResponse> getEntityData(String duns) throws BaseApplicationException {
		
		return generateEntityObjResponse(entityRepository.findByDUNS(duns));
		
	}
	
	@Transactional(readOnly=false)
	public List<EntityObject> getEntityDataObj(String duns) throws BaseApplicationException {
		
		return entityRepository.findByDUNS(duns);
		
	}
	
	@Transactional(readOnly=false)
	public List<EntityObject> getEntityDataObj(String searchText, String type) {
		return  entityRepository.findBySearchText(searchText,type);
	}
	

	public List<EntityObjectResponse> getEntityData(String searchText, String type) {
		return  generateEntityObjResponse(entityRepository.findBySearchText(searchText,type));
	}
	

	public Map<String, List<String>> getDistinctFarDfar() {
		return getResponseForFarDfar(entityRepository.getDistinctFarDfar("DFAR"),
				entityRepository.getDistinctFarDfar("FAR"));
	}
	
	public Map<String, List<String>> getResponseForFarDfar( List<Object> distinctDfar ,  List<Object> distinctFar ) {
		Map<String,List<String>> dfar = new HashMap<String, List<String>>();
		
		List<String> arrayDfar = new ArrayList<String>();
		for (Object eachObject : distinctDfar) {
			arrayDfar.add((String) eachObject);
		}
		dfar.put("DFAR", arrayDfar);
		
		List<String> arrayFar = new ArrayList<String>();
		for (Object eachObject : distinctFar) {
			arrayFar.add((String) eachObject);
		}
		dfar.put("FAR", arrayFar);
		
		return dfar;
	}
	
	


	public void generateCSVResponse(HttpServletResponse httpServletResponse) throws IOException {

		String filename = "allEntityData.csv";
		CSVPrinter csvPrinter =null;
		try {
			httpServletResponse.setContentType("text/csv");
			httpServletResponse.setHeader(HttpHeaders.CONTENT_DISPOSITION,
					"attachment; filename=\"" + filename + "\"");
			csvPrinter = new CSVPrinter(httpServletResponse.getWriter(),
					CSVFormat.DEFAULT.withHeader("duns", "legal_business_name","FAR/DAR Provision(s)", "Answer ID", "Section"));
			List<EntityObject> allEntityObjectList = entityRepository.findAll();
			for (EntityObject entityObject : allEntityObjectList) {
				List<FarDFarAnswersData> farDfarList = entityObject.getFarDfarAnswerDataList();
				if(farDfarList!=null && farDfarList.size()>0) {
					for (FarDFarAnswersData farDFarAnswersData : farDfarList) {
						csvPrinter.printRecord(Arrays.asList(entityObject.getDuns(), entityObject.getLegal_business_name(),farDFarAnswersData.getFar_dfar_code(),farDFarAnswersData.getAnswer_id(),farDFarAnswersData.getAnswer_section()));
					}
				
				} else {
					csvPrinter.printRecord(Arrays.asList(entityObject.getDuns(), entityObject.getLegal_business_name(),"","",""));
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(csvPrinter != null)
				csvPrinter.close();
		}
		
	}
	
	public void generateCSVResponseBasedOnResultList(List<EntityObject> allEntityObjectList,HttpServletResponse httpServletResponse) throws IOException {

		String filename = "allEntityData.csv";
		CSVPrinter csvPrinter =null;
		try {
			httpServletResponse.setContentType("text/csv");
			httpServletResponse.setHeader(HttpHeaders.CONTENT_DISPOSITION,
					"attachment; filename=\"" + filename + "\"");
			csvPrinter = new CSVPrinter(httpServletResponse.getWriter(),
					CSVFormat.DEFAULT.withHeader("duns", "legal_business_name","FAR/DAR Provision(s)", "Answer ID", "Section"));
			//List<EntityObject> allEntityObjectList = entityRepository.findAll();
			for (EntityObject entityObject : allEntityObjectList) {
				List<FarDFarAnswersData> farDfarList = entityObject.getFarDfarAnswerDataList();
				if(farDfarList!=null && farDfarList.size()>0) {
					for (FarDFarAnswersData farDFarAnswersData : farDfarList) {
						csvPrinter.printRecord(Arrays.asList(entityObject.getDuns(), entityObject.getLegal_business_name(),farDFarAnswersData.getFar_dfar_code(),farDFarAnswersData.getAnswer_id(),farDFarAnswersData.getAnswer_section()));
					}
				
				} else {
					csvPrinter.printRecord(Arrays.asList(entityObject.getDuns(), entityObject.getLegal_business_name(),"","",""));
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(csvPrinter != null)
				csvPrinter.close();
		}
		
	}
	
	public void generateCSVResponse(String startDate, String endDate, HttpServletResponse httpServletResponse) throws IOException {

		String filename = "allEntityDataByDate.csv";
		CSVPrinter csvPrinter =null;
		List<EntityObject> allEntityObjectList = null;
		try {
			
			
			try {
				allEntityObjectList = extractEntitySoapObj( startDate,  endDate);
			} catch (ApplicationException_Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException_Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			httpServletResponse.setContentType("text/csv");
			httpServletResponse.setHeader(HttpHeaders.CONTENT_DISPOSITION,
					"attachment; filename=\"" + filename + "\"");
			csvPrinter = new CSVPrinter(httpServletResponse.getWriter(),
					CSVFormat.DEFAULT.withHeader("duns", "legal_business_name","FAR/DAR Provision(s)", "Answer ID", "Section"));
			//List<EntityObject> allEntityObjectList = entityRepository.findAll();
			for (EntityObject entityObject : allEntityObjectList) {
				List<FarDFarAnswersData> farDfarList = entityObject.getFarDfarAnswerDataList();
				if(farDfarList!=null && farDfarList.size()>0) {
					for (FarDFarAnswersData farDFarAnswersData : farDfarList) {
						csvPrinter.printRecord(Arrays.asList(entityObject.getDuns(), entityObject.getLegal_business_name(),farDFarAnswersData.getFar_dfar_code(),farDFarAnswersData.getAnswer_id(),farDFarAnswersData.getAnswer_section()));
					}
				
				} else {
					csvPrinter.printRecord(Arrays.asList(entityObject.getDuns(), entityObject.getLegal_business_name(),"","",""));
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(csvPrinter != null)
				csvPrinter.close();
		}
		
	}
	
	public List<EntityObject> extractEntitySoapObj(String startDate,String endDate) throws ApplicationException_Exception, SystemException_Exception {
		
		ObjectFactory objectFactory = new ObjectFactory();
		EntityManagementBeanService entityManagementBeanService = new EntityManagementBeanService();
		List<EntityObject> entityObjectList = new ArrayList<EntityObject>();
		
		EntityManagementBean eb = entityManagementBeanService.getEntityManagementBeanPort();
		UserAuthenticationKeyType uakt = new UserAuthenticationKeyType();
		uakt.setUserID("SAMBETAprod01");
		uakt.setPassword("Evs23Data@");
		
		EntitySearchCriteriaType esct = new EntitySearchCriteriaType();
		JAXBElement<String> jaxbElementStartDate = objectFactory.createEntitySearchCriteriaTypeStartDate(startDate);
		JAXBElement<String> jaxbElementEndDate = objectFactory.createEntitySearchCriteriaTypeEndDate(endDate);
		esct.setStartDate(jaxbElementStartDate);
		esct.setEndDate(jaxbElementEndDate);
		
		RequestedData rd = new RequestedData();
		JAXBElement<YorNType> jaxbElementCoreData = objectFactory.createRequestedDataCoreData(YorNType.Y);
		JAXBElement<YorNType> jaxbElementRepsAndCert = objectFactory.createRequestedDataRepsAndCerts(YorNType.Y);
		rd.setRepsAndCerts(jaxbElementRepsAndCert);
		rd.setCoreData(jaxbElementCoreData);
		
		
		GetEntities getEntities = eb.getEntities(uakt, esct, rd);
		JAXBElement<ListOfEntitiesType> ListOfEntities = getEntities.getListOfEntities();
		ListOfEntitiesType listOfEntitiesType = ListOfEntities.getValue();
		List<EntityType> listEntities = listOfEntitiesType.getEntity();
		
		
		for (EntityType entityType : listEntities) {
			List<FarDFarAnswersData> farDFarAnswersDataList = new ArrayList<FarDFarAnswersData>();
			EntityObject entityObj = new EntityObject();
			JAXBElement<RepsAndCertsType> jaxbElementRepsEndcerts =entityType.getRepsAndCerts();
			//EntityDUNSInformationType entityDUNSInformationType = entityType.getEntityCoreData().getDUNSInformation();
			JAXBElement<RegistrationInformationType> registrationInformationTypeJAXB = entityType.getEntityIdentification();
			RegistrationInformationType registrationInformationType = registrationInformationTypeJAXB.getValue();
			JAXBElement<String> dunsJAXB = registrationInformationType.getDUNS();
			String duns = dunsJAXB.getValue();
			entityObj.setDuns(duns);
			String legalBusinessName  = registrationInformationType.getLegalBusinessName();
			entityObj.setLegal_business_name(legalBusinessName);
			RepsAndCertsType repsAndCertsType = jaxbElementRepsEndcerts.getValue();
			JAXBElement<CertificationsType> certificationsTypeJAXB = repsAndCertsType.getCertifications();
			CertificationsType certType =  certificationsTypeJAXB.getValue();
			JAXBElement<FARResponseType> farResponseTypeJAXB = certType.getFARResponses();
			FARResponseType farResponseType = farResponseTypeJAXB.getValue();
			//ListOfProvisionsType lpt = farResponseType.getListOfProvisions()!=null?farResponseType.getListOfProvisions().getValue():null;
			if(farResponseType.getListOfProvisions()!=null) {
				ListOfProvisionsType lpt =  farResponseType.getListOfProvisions().getValue();
				List<ProvisionType> lptType = lpt.getProvision();
				for (ProvisionType provisionType : lptType) {
					ListOfAnswerType listOfAnswerType = provisionType.getListOfAnswers().getValue();
					List<AnswerType> answerTypeList = listOfAnswerType.getAnswer();
					
					for (AnswerType answerType : answerTypeList) {
						if(answerType.getAnswerID()!=null && answerType.getAnswerID().getValue() !=null &&  !answerType.getAnswerID().getValue().isEmpty()) {					
							FarDFarAnswersData farDfarAnswersData = new FarDFarAnswersData();
							farDfarAnswersData.setAnswer_id(answerType.getAnswerID()!=null?answerType.getAnswerID().getValue():null);
							farDfarAnswersData.setAnswer_section(answerType.getSection()!=null?answerType.getSection():null);
							farDfarAnswersData.setFar_dfar_code(provisionType.getId().getValue());
							farDfarAnswersData.setFar_dfar_type("FAR");
							farDFarAnswersDataList.add(farDfarAnswersData);
						}
					}
				}
			}
			
			FARResponseType dfarResponseType = certType.getDFARResponses().getValue();
			if(dfarResponseType.getListOfProvisions()!=null) {
				ListOfProvisionsType dlpt =  dfarResponseType.getListOfProvisions()!=null? dfarResponseType.getListOfProvisions().getValue():null;
				List<ProvisionType> dlptType = dlpt.getProvision();
				for (ProvisionType provisionType : dlptType) {
					ListOfAnswerType listOfAnswerType = provisionType.getListOfAnswers().getValue();
			
					List<AnswerType> answerTypeList = listOfAnswerType.getAnswer();
					
					for (AnswerType answerType : answerTypeList) {			
						if(answerType.getAnswerID()!=null && answerType.getAnswerID().getValue() !=null &&  !answerType.getAnswerID().getValue().isEmpty()) {					
							FarDFarAnswersData farDfarAnswersData = new FarDFarAnswersData();
							farDfarAnswersData.setAnswer_id(answerType.getAnswerID()!=null?answerType.getAnswerID().getValue():null);
							farDfarAnswersData.setAnswer_section(answerType.getSection()!=null?answerType.getSection():null);
							farDfarAnswersData.setFar_dfar_code(provisionType.getId().getValue());
							farDfarAnswersData.setFar_dfar_type("DFAR");
							//farDfarAnswersData.setEntityObject(entityObj);
							farDFarAnswersDataList.add(farDfarAnswersData);
						}
					}
				}
			}
			if(farDFarAnswersDataList!=null && farDFarAnswersDataList.size()>0) {
				entityObj.setFarDfarAnswerDataList(farDFarAnswersDataList);
			}
			entityObjectList.add(entityObj);
		}
		return entityObjectList;
	}
	
	public List<EntityObjectResponse> generateEntityObjResponse(List<EntityObject> entityObjectList) {
		List<EntityObjectResponse> entityObjResponse = new ArrayList<EntityObjectResponse>();
		for (EntityObject entityObject : entityObjectList) {
			
			if(entityObject.getFarDfarAnswerDataList()!=null && entityObject.getFarDfarAnswerDataList().size()>0) {
				for (FarDFarAnswersData farDFarAnswersData : entityObject.getFarDfarAnswerDataList()) {
					EntityObjectResponse ebr = new EntityObjectResponse();
					ebr.setDuns(entityObject.getDuns());
					ebr.setLegal_business_name(entityObject.getLegal_business_name());
					ebr.setAnswer_id(farDFarAnswersData.getAnswer_id());
					ebr.setAnswer_section(farDFarAnswersData.getAnswer_section());
					ebr.setFar_dfar_code(farDFarAnswersData.getFar_dfar_code());
					entityObjResponse.add(ebr);
				}
			}else {
				EntityObjectResponse ebr = new EntityObjectResponse();
				ebr.setDuns(entityObject.getDuns());
				ebr.setLegal_business_name(entityObject.getLegal_business_name());
				entityObjResponse.add(ebr);
			}
		}
		return entityObjResponse;
	}

	public boolean cleanDBdata() {
		return entityRepository.cleanDBdata();
	}

}

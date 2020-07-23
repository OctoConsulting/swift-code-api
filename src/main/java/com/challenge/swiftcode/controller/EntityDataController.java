package com.challenge.swiftcode.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.swiftcode.exception.BaseApplicationException;
import com.challenge.swiftcode.models.EntityObject;
import com.challenge.swiftcode.service.EntityService;
import com.challenge.swiftcode.wsClient.ApplicationException_Exception;
import com.challenge.swiftcode.wsClient.SystemException_Exception;

import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * 
 * @author RuchirMehta 
 *
 */
@RestController
@RequestMapping(value = SwiftCodeBaseController.BasePath + "/v1")
@Tag(name ="Entity Data", description = "Controller to Get Entity Data from SAM webservices")
public class EntityDataController {

	@Autowired 
	EntityService entityService;
	
	@RequestMapping(value = "/fetchRemoteData", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Object> getEntitData(
			) 
	    		throws BaseApplicationException {
		try {
			
			
//			String startDate = "2020-07-21-00:00:00";
//			String endDate = "2020-07-21-01:00:00";
			LocalDate start = LocalDate.parse("2020-07-21"),
			          end   = LocalDate.parse("2020-07-22");
			  LocalDate next = start.minusDays(1);
			  while ((next = next.plusDays(1)).isBefore(end.plusDays(1))) {
				  
				List<EntityObject> entityObjList = entityService.extractEntitySoapObj(next.toString()+"-00:00:00", next.toString()+"-23:59:59");
				for (EntityObject entityObject : entityObjList) {
					entityService.postEntityData(entityObject);
				}
			  }
				System.out.println("printing the return");
			return new ResponseEntity<Object>( HttpStatus.OK);
		} catch(ApplicationException_Exception ae) {
			ae.printStackTrace();
			return new ResponseEntity<Object>(ae, HttpStatus.OK);
		}catch(SystemException_Exception se) {
			se.printStackTrace();
			return new ResponseEntity<Object>(se, HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Object>(e, HttpStatus.OK);
		}
		
	}

	@RequestMapping(value = "/entity/getdata", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Object> getEntitDataRequest(@RequestParam String searchText , @RequestParam String type
			) 
	    		throws BaseApplicationException {
		try {
			switch (type.toLowerCase()) {
			case "duns":
				
				return new ResponseEntity<Object>(entityService.getEntityDataObj(searchText), HttpStatus.OK);
			case "fardfar":
				return new ResponseEntity<Object>(entityService.getEntityDataObj(searchText,type), HttpStatus.OK);
			default:
				return new ResponseEntity<Object>(entityService.getEntityDataObj(searchText,type), HttpStatus.OK);
			}
			
		
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Object>(e, HttpStatus.OK);
		}
		
	}
	
	@RequestMapping(value = "/entity/get", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Object> getEntitDataRequestObj(@RequestParam String searchText , @RequestParam String type
			) 
	    		throws BaseApplicationException {
		try {
			switch (type.toLowerCase()) {
			case "duns":
				
				return new ResponseEntity<Object>(entityService.getEntityData(searchText), HttpStatus.OK);
			case "fardfar":
				return new ResponseEntity<Object>(entityService.getEntityData(searchText,type), HttpStatus.OK);
			default:
				return new ResponseEntity<Object>(entityService.getEntityData(searchText,type), HttpStatus.OK);
			}
			
		
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Object>(e, HttpStatus.OK);
		}
		
	}
	
	
	@RequestMapping(value = "/entity/get/csvdownload", method = RequestMethod.GET)
	public void getEntitDataRequestDownload(@RequestParam String searchText , @RequestParam String type
			, HttpServletResponse httpServletResponse) 
	    		throws BaseApplicationException {
		try {
			switch (type.toLowerCase()) {
			case "duns":
				entityService.generateCSVResponseBasedOnResultList(entityService.getEntityDataObj(searchText), httpServletResponse);
			case "fardfar":
				entityService.generateCSVResponseBasedOnResultList(entityService.getEntityDataObj(searchText,type),httpServletResponse);
			default:
				entityService.generateCSVResponseBasedOnResultList(entityService.getEntityDataObj(searchText,type),httpServletResponse);
			}
			
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	  @GetMapping("/entity-csv")
	  public void downloadUsersCSV( HttpServletResponse httpServletResponse) throws IOException{
	    entityService.generateCSVResponse(httpServletResponse);
	  }
	  
	  

	  @GetMapping("fetch/fardfarlist")
	  public Map<String, List<String>> fetchFardFar( HttpServletResponse httpServletResponse) throws IOException{
	    return entityService.getDistinctFarDfar();
	  }
	  

	  @GetMapping("/entity-csv/date")
	  public void downloadUsersCSV( @RequestParam String date,  HttpServletResponse httpServletResponse) throws IOException{
		  
	    entityService.generateCSVResponse(date+"-00:00:00", date+"-23:59:59",httpServletResponse);
	  }
	  
	 

}

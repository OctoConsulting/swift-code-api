package com.challenge.swiftcode.models;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonInclude;

	public class EntityObjectResponse extends RepresentationModel<EntityObjectResponse> implements Serializable {

		private static final long serialVersionUID = 1L;
		
		private Long entity_id;

		private String duns;
		
		private String legal_business_name;

	    private List<FarDFarAnswersData> farDfarAnswerDataList;


		private Long far_dfar_answerid;

		private String far_dfar_code;
		
		private String far_dfar_type;
		

		private String answer_id;
		
		private String answer_description;
		

		private String answer_xml;
		
		private String question_comments;
		
		private String answer_section;
		/**
		 * @return the entity_id
		 */
		public Long getEntity_id() {
			return entity_id;
		}

		/**
		 * @param entity_id the entity_id to set
		 */
		public void setEntity_id(Long entity_id) {
			this.entity_id = entity_id;
		}

		/**
		 * @return the duns
		 */
		public String getDuns() {
			return duns;
		}

		/**
		 * @param duns the duns to set
		 */
		public void setDuns(String duns) {
			this.duns = duns;
		}

		/**
		 * @return the legal_business_name
		 */
		public String getLegal_business_name() {
			return legal_business_name;
		}

		/**
		 * @param legal_business_name the legal_business_name to set
		 */
		public void setLegal_business_name(String legal_business_name) {
			this.legal_business_name = legal_business_name;
		}

		/**
		 * @return the farDfarAnswerDataList
		 */
		public List<FarDFarAnswersData> getFarDfarAnswerDataList() {
			return farDfarAnswerDataList;
		}

		/**
		 * @param farDfarAnswerDataList the farDfarAnswerDataList to set
		 */
		public void setFarDfarAnswerDataList(List<FarDFarAnswersData> farDfarAnswerDataList) {
			this.farDfarAnswerDataList = farDfarAnswerDataList;
		}

		/**
		 * @return the far_dfar_answerid
		 */
		public Long getFar_dfar_answerid() {
			return far_dfar_answerid;
		}

		/**
		 * @param far_dfar_answerid the far_dfar_answerid to set
		 */
		public void setFar_dfar_answerid(Long far_dfar_answerid) {
			this.far_dfar_answerid = far_dfar_answerid;
		}

		/**
		 * @return the far_dfar_code
		 */
		public String getFar_dfar_code() {
			return far_dfar_code;
		}

		/**
		 * @param far_dfar_code the far_dfar_code to set
		 */
		public void setFar_dfar_code(String far_dfar_code) {
			this.far_dfar_code = far_dfar_code;
		}

		/**
		 * @return the far_dfar_type
		 */
		public String getFar_dfar_type() {
			return far_dfar_type;
		}

		/**
		 * @param far_dfar_type the far_dfar_type to set
		 */
		public void setFar_dfar_type(String far_dfar_type) {
			this.far_dfar_type = far_dfar_type;
		}

		/**
		 * @return the answer_id
		 */
		public String getAnswer_id() {
			return answer_id;
		}

		/**
		 * @param answer_id the answer_id to set
		 */
		public void setAnswer_id(String answer_id) {
			this.answer_id = answer_id;
		}

		/**
		 * @return the answer_description
		 */
		public String getAnswer_description() {
			return answer_description;
		}

		/**
		 * @param answer_description the answer_description to set
		 */
		public void setAnswer_description(String answer_description) {
			this.answer_description = answer_description;
		}

		/**
		 * @return the answer_xml
		 */
		public String getAnswer_xml() {
			return answer_xml;
		}

		/**
		 * @param answer_xml the answer_xml to set
		 */
		public void setAnswer_xml(String answer_xml) {
			this.answer_xml = answer_xml;
		}

		/**
		 * @return the question_comments
		 */
		public String getQuestion_comments() {
			return question_comments;
		}

		/**
		 * @param question_comments the question_comments to set
		 */
		public void setQuestion_comments(String question_comments) {
			this.question_comments = question_comments;
		}

		/**
		 * @return the answer_section
		 */
		public String getAnswer_section() {
			return answer_section;
		}

		/**
		 * @param answer_section the answer_section to set
		 */
		public void setAnswer_section(String answer_section) {
			this.answer_section = answer_section;
		}

		
	}



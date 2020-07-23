package com.challenge.swiftcode.models;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * pk_far_dfar_answerid integer NOT NULL DEFAULT nextval('swiftschema.entity_entity_id_seq'::regclass),
    far_dfar_code character varying(100) COLLATE pg_catalog."default",
    far_dfar_type character varying(100) COLLATE pg_catalog."default",
    answer_id character varying(100) COLLATE pg_catalog."default",
    answer_description character varying(500) COLLATE pg_catalog."default",
    answer_xml character varying(10000) COLLATE pg_catalog."default",
    pk_entity_id bigint,
    question_comments character varying(10000) COLLATE pg_catalog."default",
 * @author ruchirmehta
 *
 */
	@Entity
	@DynamicUpdate
	@DynamicInsert
	@Table(schema = "swiftschema", name = "far_dfar_answer_details")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public class FarDFarAnswersData extends RepresentationModel<FarDFarAnswersData> implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "far_dfar_id_seq")
		@SequenceGenerator(name = "far_dfar_id_seq", sequenceName = "far_dfar_id_seq", allocationSize = 1)
		@Column(name = "pk_far_dfar_answerid")
		private Long far_dfar_answerid;

		@Column(name = "far_dfar_code")
		private String far_dfar_code;
		
		@Column(name = "far_dfar_type")
		private String far_dfar_type;
		

		@Column(name = "answer_id")
		private String answer_id;
		
		@Column(name = "answer_description")
		private String answer_description;
		

		@Column(name = "answer_xml")
		private String answer_xml;
		
		@Column(name = "question_comments")
		private String question_comments;
		
		@Column(name = "answer_section")
		private String answer_section;
		
//		@Column(name = "pk_entity_id")
//		private Long pk_entity_id;
		
//		@JsonIgnore
//		@ManyToOne(fetch = FetchType.EAGER,optional = false)
//	    @JoinColumn(name = "pk_entity_id", nullable = false)
//	    private EntityObject entityObject;

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



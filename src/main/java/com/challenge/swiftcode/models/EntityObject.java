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

	@Entity
	@DynamicUpdate
	@DynamicInsert
	@Table(schema = "swiftschema", name = "entity")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public class EntityObject extends RepresentationModel<EntityObject> implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "entity_entity_id_seq")
		@SequenceGenerator(name = "entity_entity_id_seq", sequenceName = "entity_entity_id_seq", allocationSize = 1)
		@Column(name = "pk_entity_id")
		private Long entity_id;

		@Column(name = "duns")
		private String duns;
		
		@Column(name = "legal_business_name")
		private String legal_business_name;

		@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinColumn(name = "pk_entity_id", referencedColumnName = "pk_entity_id", nullable = false)
	    private List<FarDFarAnswersData> farDfarAnswerDataList;

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

	}




--create DataBase : swiftCode
--create User : swift_user - give all permissions
--CREATE SCHEMA swiftschema AUTHORIZATION swift_user;

CREATE SEQUENCE swiftschema.entity_entity_id_seq;

ALTER SEQUENCE swiftschema.entity_entity_id_seq
    OWNER TO swift_user;


CREATE SEQUENCE swiftschema.far_dfar_id_seq;

ALTER SEQUENCE swiftschema.far_dfar_id_seq
    OWNER TO swift_user;
-- Table: swiftschema.entity

-- DROP TABLE swiftschema.entity;

CREATE TABLE swiftschema.entity
(
    pk_entity_id integer NOT NULL DEFAULT nextval('swiftschema.entity_entity_id_seq'::regclass),
    duns character varying(20) COLLATE pg_catalog."default" NOT NULL,
    legal_business_name character varying(500) COLLATE pg_catalog."default",
    CONSTRAINT pk_entity_id PRIMARY KEY (pk_entity_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE swiftschema.entity
    OWNER to swift_user;-- Table: swiftschema.far_dfar_answer_details

-- DROP TABLE swiftschema.far_dfar_answer_details;

CREATE TABLE swiftschema.far_dfar_answer_details
(
    pk_far_dfar_answerid integer NOT NULL DEFAULT nextval('swiftschema.entity_entity_id_seq'::regclass),
    far_dfar_code character varying(100) COLLATE pg_catalog."default",
    far_dfar_type character varying(100) COLLATE pg_catalog."default",
    answer_id character varying(100) COLLATE pg_catalog."default",
    answer_description character varying(500) COLLATE pg_catalog."default",
    answer_xml character varying(10000) COLLATE pg_catalog."default",
    pk_entity_id bigint,
    question_comments character varying(10000) COLLATE pg_catalog."default",
    answer_section character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT fk_entity_id FOREIGN KEY (pk_entity_id)
        REFERENCES swiftschema.entity (pk_entity_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE swiftschema.far_dfar_answer_details
    OWNER to swift_user;

-- Index: fki_fk_entity_id

-- DROP INDEX swiftschema.fki_fk_entity_id;

CREATE INDEX fki_fk_entity_id
    ON swiftschema.far_dfar_answer_details USING btree
    (pk_entity_id)
    TABLESPACE pg_default;
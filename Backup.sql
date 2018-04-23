-- Generado por Oracle SQL Developer Data Modeler 18.1.0.082.1035
--   en:        2018-04-07 12:16:38 CLST
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



CREATE TABLE buildings (
    id          INTEGER NOT NULL,
    location    VARCHAR2(250),
    client_id   INTEGER NOT NULL
);

ALTER TABLE buildings ADD CONSTRAINT buildings_pk PRIMARY KEY ( client_id,
                                                                id );

CREATE TABLE client (
    id     INTEGER NOT NULL,
    name   VARCHAR2(250) NOT NULL
);

ALTER TABLE client ADD CONSTRAINT client_pk PRIMARY KEY ( id );

CREATE TABLE packservices (
    id      INTEGER NOT NULL,
    name    VARCHAR2(250) NOT NULL,
    price   INTEGER NOT NULL
);

ALTER TABLE packservices ADD CONSTRAINT packservices_pk PRIMARY KEY ( id );

CREATE TABLE packservices_services (
    id                INTEGER NOT NULL,
    packservices_id   INTEGER NOT NULL,
    services_id       INTEGER NOT NULL
);

ALTER TABLE packservices_services
    ADD CONSTRAINT packservices_services_pk PRIMARY KEY ( packservices_id,
                                                          services_id,
                                                          id );

CREATE TABLE packsservices_requestprice (
    id                INTEGER NOT NULL,
    packservices_id   INTEGER NOT NULL,
    requestprice_id   INTEGER NOT NULL
);

ALTER TABLE packsservices_requestprice
    ADD CONSTRAINT packsservices_requestprice_pk PRIMARY KEY ( packservices_id,
                                                               requestprice_id,
                                                               id );

CREATE TABLE requestprice (
    id                        INTEGER NOT NULL,
    status                    VARCHAR2(50) NOT NULL,
    record_problem            CLOB,
    details                   CLOB,
    created_at                DATE NOT NULL,
    updated_at                DATE NOT NULL,
    users_id                  INTEGER NOT NULL,
    users_id2                 INTEGER NOT NULL,
    requestviewtechnical_id   INTEGER
);

ALTER TABLE requestprice ADD CONSTRAINT requestprice_pk PRIMARY KEY ( id );

CREATE TABLE requestprice_attachments (
    id                INTEGER NOT NULL,
    file_name         VARCHAR2(250) NOT NULL,
    path              CLOB NOT NULL,
    "size"            INTEGER NOT NULL,
    format_file       VARCHAR2(50) NOT NULL,
    downloads         INTEGER NOT NULL,
    created_at        DATE NOT NULL,
    updated_at        DATE NOT NULL,
    requestprice_id   INTEGER NOT NULL
);

ALTER TABLE requestprice_attachments ADD CONSTRAINT requestprice_attachments_pk PRIMARY KEY ( id );

CREATE TABLE requestprice_services (
    id                INTEGER NOT NULL,
    requestprice_id   INTEGER NOT NULL,
    services_id       INTEGER NOT NULL
);

ALTER TABLE requestprice_services
    ADD CONSTRAINT requestprice_services_pk PRIMARY KEY ( requestprice_id,
                                                          services_id,
                                                          id );

CREATE TABLE requestviewtechnical (
    id                    INTEGER NOT NULL,
    view_at               DATE,
    users_id              INTEGER NOT NULL,
    users_id2             INTEGER,
    description_problem   CLOB,
    status                VARCHAR2(50)
);

ALTER TABLE requestviewtechnical ADD CONSTRAINT requestviewtechnical_pk PRIMARY KEY ( id );

CREATE TABLE roles_users (
    id     INTEGER NOT NULL,
    name   VARCHAR2(250) NOT NULL
);

ALTER TABLE roles_users ADD CONSTRAINT roles_users_pk PRIMARY KEY ( id );

CREATE TABLE services (
    id            INTEGER NOT NULL,
    name          VARCHAR2(250) NOT NULL,
    price         INTEGER NOT NULL,
    description   CLOB NOT NULL
);

ALTER TABLE services ADD CONSTRAINT services_pk PRIMARY KEY ( id );

CREATE TABLE users (
    id                       INTEGER NOT NULL,
    names                    VARCHAR2(250) NOT NULL,
    last_names               VARCHAR2(250) NOT NULL,
    rut                      VARCHAR2(20) NOT NULL,
    roles_users_id           INTEGER NOT NULL,
    client_id                INTEGER,
    users_personal_data_id   INTEGER NOT NULL,
    password                 VARCHAR2(250) NOT NULL
);

ALTER TABLE users ADD CONSTRAINT users_pk PRIMARY KEY ( id );

CREATE TABLE users_personal_data (
    id          INTEGER NOT NULL,
    location    VARCHAR2(250),
    phone       VARCHAR2(150),
    born_date   DATE,
    email       VARCHAR2(50)
);

ALTER TABLE users_personal_data ADD CONSTRAINT users_personal_data_pk PRIMARY KEY ( id );

ALTER TABLE buildings
    ADD CONSTRAINT buildings_client_fk FOREIGN KEY ( client_id )
        REFERENCES client ( id );

ALTER TABLE packservices_services
    ADD CONSTRAINT packservices_fk FOREIGN KEY ( packservices_id )
        REFERENCES packservices ( id );

ALTER TABLE requestprice_attachments
    ADD CONSTRAINT requestprice_attachments_fk FOREIGN KEY ( requestprice_id )
        REFERENCES requestprice ( id );

ALTER TABLE requestprice_services
    ADD CONSTRAINT requestprice_fk FOREIGN KEY ( requestprice_id )
        REFERENCES requestprice ( id );

ALTER TABLE packsservices_requestprice
    ADD CONSTRAINT requestprice_fkv1 FOREIGN KEY ( requestprice_id )
        REFERENCES requestprice ( id );

ALTER TABLE packsservices_requestprice
    ADD CONSTRAINT requestprice_fkv3 FOREIGN KEY ( packservices_id )
        REFERENCES packservices ( id );

ALTER TABLE requestprice
    ADD CONSTRAINT requestviewtechnical_fk FOREIGN KEY ( requestviewtechnical_id )
        REFERENCES requestviewtechnical ( id );

ALTER TABLE requestprice_services
    ADD CONSTRAINT services_fk FOREIGN KEY ( services_id )
        REFERENCES services ( id );

ALTER TABLE packservices_services
    ADD CONSTRAINT services_fkv2 FOREIGN KEY ( services_id )
        REFERENCES services ( id );

ALTER TABLE users
    ADD CONSTRAINT users_client_fk FOREIGN KEY ( client_id )
        REFERENCES client ( id );

ALTER TABLE requestprice
    ADD CONSTRAINT users_fk FOREIGN KEY ( users_id2 )
        REFERENCES users ( id );

ALTER TABLE requestprice
    ADD CONSTRAINT users_fkv2 FOREIGN KEY ( users_id )
        REFERENCES users ( id );

ALTER TABLE requestviewtechnical
    ADD CONSTRAINT users_fkv2v2 FOREIGN KEY ( users_id2 )
        REFERENCES users ( id );

ALTER TABLE requestviewtechnical
    ADD CONSTRAINT users_fkv3 FOREIGN KEY ( users_id )
        REFERENCES users ( id );

ALTER TABLE users
    ADD CONSTRAINT users_personal_data_fk FOREIGN KEY ( users_personal_data_id )
        REFERENCES users_personal_data ( id );

ALTER TABLE users
    ADD CONSTRAINT users_roles_fk FOREIGN KEY ( roles_users_id )
        REFERENCES roles_users ( id );



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                            13
-- CREATE INDEX                             0
-- ALTER TABLE                             29
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0	Cotizacion	1523114203326	Script	1	1.313	Cotizacion	1523115284774	Script	1	0.54
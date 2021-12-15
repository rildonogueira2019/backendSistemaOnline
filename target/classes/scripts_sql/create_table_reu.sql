--liquibase formatted sql
--changeset onlineReu:3

CREATE TABLE IF NOT EXISTS reu (
  id SERIAL UNIQUE, 
  nomeReu VARCHAR(200),
  PRIMARY KEY(id)
);
--rollback DROP TABLE
--rollback testTable
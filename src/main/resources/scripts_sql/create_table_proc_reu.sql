--liquibase formatted sql
--changeset onlineProcReu:2

CREATE TABLE IF NOT EXISTS procReu (
  id SERIAL UNIQUE, 
  idProcessos INT,
  idReu INT ,
  PRIMARY KEY(id),
  references processoControle (idProcesso)
);
--rollback DROP TABLE
--rollback testTable
--liquibase formatted sql
--changeset onlineProcesso:5
CREATE TABLE IF NOT EXISTS processoControle (
  id SERIAL UNIQUE, 
  idProcessos INT,
  PRIMARY KEY(idProcessos)
);


--changeset onlineReu:2
CREATE TABLE IF NOT EXISTS reuProcesso (
  id SERIAL UNIQUE, 
  nomeReu VARCHAR(200),
  PRIMARY KEY(id)
);

--changeset onlineProcReu: 2
CREATE TABLE IF NOT EXISTS procReu (
  id SERIAL UNIQUE, 
  idProcessos INT references processoControle (idProcessos),
  idReu INT references reuProcesso (id),
  PRIMARY KEY(id)
);


CREATE TABLE IF NOT EXISTS testes(
     id SERIAL UNIQUE,
     nome VARCHAR(200),
     PRIMARY KEY(id)
)

--changeset onlineLogin: 1
CREATE TABLE IF NOT EXISTS login(
     id SERIAL UNIQUE,
     username VARCHAR(200),
     password VARCHAR(200),
     PRIMARY KEY(id)
)

--rollback DROP TABLE
--rollback testTable
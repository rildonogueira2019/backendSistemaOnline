--liquibase formatted sql
--changeset onlineProcReu:2

ALTER TABLE IF NOT EXISTS procReu ADD CONSTRAINT FK_PROCESS FOREIGN KEY(idProcessos) REFERENCES processo (idProcessos);
ALTER TABLE procReu ADD CONSTRAINT FK_REU FOREIGN KEY(id) REFERENCES reu (id);
--rollback DROP TABLE
--rollback testTable
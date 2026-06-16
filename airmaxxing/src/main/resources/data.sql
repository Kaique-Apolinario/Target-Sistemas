INSERT INTO orgao_responsavel (nome) VALUES ('Corpo de Bombeiros');
INSERT INTO orgao_responsavel (nome) VALUES ('Defesa Civil');
INSERT INTO orgao_responsavel (nome) VALUES ('Secretaria de Meio Ambiente');

INSERT INTO categoria_fumaca (nome, risco_saude) VALUES ('Queima de Lixo Urbano', 'Alto (Gases tóxicos)');
INSERT INTO categoria_fumaca (nome, risco_saude) VALUES ('Incêndio Florestal/Mato', 'Médio (Material particulado)');
INSERT INTO categoria_fumaca (nome, risco_saude) VALUES ('Poluição Industrial', 'Alto (Químicos)');

INSERT INTO estimativa_duracao (intervalo_tempo) VALUES ('Há menos de 1 hora');
INSERT INTO estimativa_duracao (intervalo_tempo) VALUES ('De 1 a 3 horas');
INSERT INTO estimativa_duracao (intervalo_tempo) VALUES ('De 3 a 12 horas');
INSERT INTO estimativa_duracao (intervalo_tempo) VALUES ('12 horas para cima');
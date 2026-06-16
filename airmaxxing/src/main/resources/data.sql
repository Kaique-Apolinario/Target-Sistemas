INSERT INTO usuario (nome, email)
VALUES
('João Silva', 'joao@email.com'),
('Maria Souza', 'maria@email.com');

INSERT INTO endereco (
    logradouro,
    numero,
    bairro,
    cidade,
    cep
)
VALUES
('Rua das Flores', '123', 'Centro', 'São Vicente', '11310-000'),
('Rua dos Pinheiros', '45', 'Jardim Primavera', 'São Vicente', '11320-000');

INSERT INTO orgao_responsavel (
    nome,
    regiao
)
VALUES
('Secretaria Municipal do Meio Ambiente', 'Centro'),
('Fiscalização Ambiental Zona Norte', 'Zona Norte');

INSERT INTO denuncia (
    descricao,
    data_criacao,
    status,
    prioridade,
    usuario_id,
    endereco_id,
    orgao_responsavel_id
)
VALUES
(
    'Queima frequente de lixo em terreno baldio',
    CURRENT_TIMESTAMP,
    'PENDENTE',
    1,
    1,
    1,
    1
),
(
    'Fumaça intensa durante a noite',
    CURRENT_TIMESTAMP,
    'EM_ANALISE',
    2,
    2,
    2,
    2
);
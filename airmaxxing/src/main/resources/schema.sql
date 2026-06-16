DROP TABLE IF EXISTS denuncia;
DROP TABLE IF EXISTS endereco;
DROP TABLE IF EXISTS usuario;
DROP TABLE IF EXISTS orgao_responsavel;

CREATE TABLE usuario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE
);

CREATE TABLE endereco (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    logradouro VARCHAR(150) NOT NULL,
    numero VARCHAR(20) NOT NULL,
    bairro VARCHAR(100) NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    cep VARCHAR(10)
);

CREATE TABLE orgao_responsavel (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    regiao VARCHAR(100) NOT NULL
);

CREATE TABLE denuncia (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,

    descricao VARCHAR(500) NOT NULL,

    data_criacao TIMESTAMP NOT NULL,

    status VARCHAR(30) NOT NULL,

    prioridade INTEGER DEFAULT 1,

    usuario_id BIGINT NOT NULL,

    endereco_id BIGINT NOT NULL,

    orgao_responsavel_id BIGINT,

    CONSTRAINT fk_denuncia_usuario
        FOREIGN KEY (usuario_id)
        REFERENCES usuario(id),

    CONSTRAINT fk_denuncia_endereco
        FOREIGN KEY (endereco_id)
        REFERENCES endereco(id),

    CONSTRAINT fk_denuncia_orgao
        FOREIGN KEY (orgao_responsavel_id)
        REFERENCES orgao_responsavel(id)
);
DROP TABLE IF EXISTS denuncia;
DROP TABLE IF EXISTS estimativa_duracao;
DROP TABLE IF EXISTS categoria_fumaca;
DROP TABLE IF EXISTS orgao_responsavel;

CREATE TABLE orgao_responsavel (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(150) NOT NULL
);

CREATE TABLE categoria_fumaca (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    risco_saude VARCHAR(50) NOT NULL
);

CREATE TABLE estimativa_duracao (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    intervalo_tempo VARCHAR(100) NOT NULL
);

CREATE TABLE denuncia (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(500) NOT NULL,
    endereco_local VARCHAR(255) NOT NULL,
    data_criacao TIMESTAMP NOT NULL,
    status VARCHAR(30) NOT NULL,
    
    categoria_id BIGINT NOT NULL,
    duracao_id BIGINT NOT NULL,
    orgao_id BIGINT,

    CONSTRAINT fk_denuncia_categoria 
        FOREIGN KEY (categoria_id) REFERENCES categoria_fumaca(id),
        
    CONSTRAINT fk_denuncia_duracao 
        FOREIGN KEY (duracao_id) REFERENCES estimativa_duracao(id),
        
    CONSTRAINT fk_denuncia_orgao 
        FOREIGN KEY (orgao_id) REFERENCES orgao_responsavel(id)
);
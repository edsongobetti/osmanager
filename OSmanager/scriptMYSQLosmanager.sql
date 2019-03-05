-- CHESS SOFTWARE DEVELOPMENT
-- SCRIPT PARA CRIACAO DO BANCO DE DADOS OSMANAGER

-- Criando banco de dados
CREATE DATABASE db_osmanager;

-- Usando banco de dados OSmanager
USE db_osmanager;

-- Criar usuario padrao do banco de dados
CREATE USER 'chessadm'@'localhost' IDENTIFIED BY '$$adm99';

-- Dar permissão para usuário padrao do banco de dados
GRANT ALL PRIVILEGES ON *.* TO 'chessadm'@'localhost';

-- Atualizar privilegios do usuario mysql
FLUSH PRIVILEGES;

-- Criando tabela de usuarios do sistema
CREATE TABLE IF NOT EXISTS tb_usuarios(
	id_user INT PRIMARY KEY AUTO_INCREMENT,
	nome_user VARCHAR(120) NOT NULL,
	login_user VARCHAR(12) NOT NULL UNIQUE,
	senha_user VARCHAR(12) NOT NULL,
	nivel_user VARCHAR(13) NOT NULL,
	status_user CHAR NOT NULL
);

-- Criando usuario padrao do sistema
INSERT INTO tb_usuarios(
	nome_user, 
	login_user, 
	senha_user, 
	nivel_user,
	status_user) 
VALUES(
	"Administrador Chess",
	"chess",
	"chess333",
	"Administrador",
	'A'
);

-- Criando tabela de clientes
CREATE TABLE IF NOT EXISTS tb_clientes(
	id_cliente INT PRIMARY KEY AUTO_INCREMENT,
	nome_cliente VARCHAR(120) NOT NULL,
	cpf_cliente VARCHAR(18), 
	endereco_cliente VARCHAR(120),
	num_endereco_cliente INT(7),
	bairro_cliente 	VARCHAR(60),
	cidade_cliente VARCHAR(30),
	telefone_cliente VARCHAR(16),
	celular_cliente VARCHAR(16) NOT NULL,
	email_cliente VARCHAR(80),
	status_cliente CHAR(1) NOT NULL
);

-- Criando tabela de ordens de servico
CREATE TABLE IF NOT EXISTS tb_os(
	id_os INT PRIMARY KEY AUTO_INCREMENT,
	data_os TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	equipamento_os VARCHAR(60) NOT NULL,
	defeito_equipamento_os VARCHAR(120) NOT NULL,
	servico_os VARCHAR(120),
	tecnico_os VARCHAR(12),
	valor_os DECIMAL(10,2),
	id_cliente_os INT NOT NULL,
	FOREIGN KEY (id_cliente_os) REFERENCES tb_clientes(id_cliente)
);



























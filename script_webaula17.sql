-- Script comandos base veiculos
-- criação da tabela marca

create table marca(
	cd_marca integer,
	ds_marca varchar(30)
);

create table combustivel(
	cd_combustivel integer,
	ds_combustivel varchar(30)
);

create table localidade(
	cd_localidade integer,
	nm_localidade varchar(50)
);

create table modelo(
	cd_modelo integer,
	cd_marca integer,
	ds_modelo varchar(50)
);

create table proprietario(
	cd_proprietario integer,
	cd_localidade integer,
	nm_proprietario varchar(50),
	ds_logradouro varchar(50),
	ds_complemento varchar(50),
	ds_bairro varchar(50),
	nr_telefone varchar(15),
	ds_email varchar(50),
	sg_uf char(2)
);

create table veiculo(
	nr_placa  char(8),
	cd_proprietario integer,
	cd_modelo integer,
	nr_ano_fab integer,
	nr_ano_mod  integer,
	qt_km_rodado integer,
	qt_portas integer,
	ds_observacao varchar(100)
);

create table veiculo_combustivel(
	cd_combustivel integer,
	nr_placa char(7)
);

-- destruição das tabelas
DROP TABLE veiculo_combustivel;
DROP TABLE veiculo;
DROP TABLE proprietario;
DROP TABLE modelo;
DROP TABLE marca;
DROP TABLE localidade;
DROP TABLE combustivel;
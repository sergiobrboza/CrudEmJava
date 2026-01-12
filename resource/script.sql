create database agenda;

create table contatos(
id int not null AUTO_INCREMENT PRIMARY KEY,
nome varchar(40),
idade int,
dataCadastro date)
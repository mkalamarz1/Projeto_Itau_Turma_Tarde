create database projetoitau;
use projetoitau;

create table correntista(
ag int not null,
conta int not null,
nome varchar(50) not null,
email varchar(80) not null,
telefone char(11) not null,
saldo decimal(8,2) not null,
primary key (ag,conta));

describe correntista;
insert into correntista(ag,conta,nome,email,telefone,saldo) 
values
(5859, 158976, "márcia", "mkalamarz@gmail.com", "51993836567", 300.0),
(6698, 86495, "Jules", "jules@gmail.com", "51974023865", 500.0),
(5954, 122486, "Julia", "kalamarzju@gmail.com", "5183848579", 700.0),
(4865, 48659, "Adaline", "adaline@gmail.com", "13974023865", 200.0);

select * from correntista;

create table fluxo_caixa(
ag int not null,
conta int not null,
fluxo int not null,
entrada decimal(8,2) not null,
saida decimal(8,2) not null,
primary key(ag,conta,fluxo));

insert into fluxo_caixa(ag,conta,fluxo,entrada,saida)
values
(5859, 158976, 5, 60000, 0),
(4865, 48659, 1, 300, 100),
(5954, 122486, 2, 900, 200),
(6698, 86495, 3, 800, 300);

select * from fluxo_caixa;


drop table correntista;
drop table fluxo_caixa;

-- Relacionando as tabelas de correntista ao fluxo de caixa
select c.ag,c.conta,c.nome,f.entrada,f.saida
from correntista as c,
fluxo_caixa as f
where (c.ag=f.ag) and (c.conta=f.conta);


-- Relacionando as tabelas com inner join
select c.ag,c.conta,c.nome,f.entrada,f.saida
from correntista as c
inner join fluxo_caixa as f
on(c.ag=f.ag) and (c.conta=f.conta);

select * from innerjoin;
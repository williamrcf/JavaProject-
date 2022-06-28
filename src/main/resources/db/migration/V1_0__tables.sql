CREATE TABLE lotacao (
id UUID not null,
tipo text not null,
data_cadastro timestamp not null,
PRIMARY KEY (id)
);

CREATE TABLE servidor(
	matricula UUID not null,
	nome text not null,
	data_de_cadastro timestamp ,
	lotacao_id UUID not null,
    primary key (matricula),
	constraint fk_servidor_lotacao foreign key (lotacao_id) references lotacao(id)
);
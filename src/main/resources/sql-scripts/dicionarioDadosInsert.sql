INSERT INTO help (help_id, status, texto, titulo) VALUES 
	(1, 'A', 'Cadastro de Estados ', 'Cadastro Estados'),
	(2, 'A', 'Cadastro Cidades', 'Cadastro Cidades');
	
INSERT INTO pagina (pagina_id, pagina, status, help_id) VALUES 
	(1, 'Cadastro Estados', 0, 1),
	(2, 'Cadastro Cidades', 0, 2);
	
	
INSERT INTO entidade (entidade_id, descricao, nome) VALUES 
	(1, 'Cadastro Estado', 'CADESTADO'),
	(2, 'Cadastro Cidade', 'CADCIDADE');
	
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto) VALUES
	(1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 'Estado', 'estado',0),
	(2, 1, 0, 0, 0, 0, 1, 1, 1, 1, 'Sigla', 'sigla',0),
	(3, 2, 0, 0, 0, 0, 1, 1, 1, 1, 'Cidade', 'cidade',0);

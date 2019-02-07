delete from field where field_id > 0;
delete from tab where tab_id > 0;
delete from help where help_id > 0;
delete from pagina where pagina_id > 0;
delete from groupmenu where groupmenu_id > 0;
delete from menu where menu_id > 0;


INSERT INTO menu (menu_id, label, nivel, nome, status) VALUES ('1', 'Pagina Inicial', '0', 'Pagina Inicial', '0');
INSERT INTO menu (menu_id, label, nivel, nome, status) VALUES ('2', 'Advocacia', '1', 'Advocacia', '0');
INSERT INTO menu (menu_id, label, nivel, nome, status) VALUES ('3', 'Fiscal', '1', 'Fiscal', '0');
INSERT INTO menu (menu_id, label, nivel, nome, status) VALUES ('4', 'Vendas', '1', 'Vendas', '0');
INSERT INTO menu (menu_id, label, nivel, nome, status) VALUES ('5', 'Compras', '1', 'Compras', '0');
INSERT INTO menu (menu_id, label, nivel, nome, status) VALUES ('6', 'Financeiro', '1', 'Financeiro', '0');
INSERT INTO menu (menu_id, label, nivel, nome, status) VALUES ('7', 'Departamento Pessoal', '1', 'Departamento Pessoal', '0');
INSERT INTO menu (menu_id, label, nivel, nome, status) VALUES ('8', 'Clinica', '1', 'Clinica', '0');
INSERT INTO menu (menu_id, label, nivel, nome, status) VALUES ('9', 'Condominio', '1', 'Condominio', '0');
INSERT INTO menu (menu_id, label, nivel, nome, status) VALUES ('10', 'Cadastros', '1', 'Cadastros', '0');
INSERT INTO menu (menu_id, label, nivel, nome, status) VALUES ('11', 'Produto/Serviço', '1', 'Produto/Serviço', '0');
INSERT INTO menu (menu_id, label, nivel, nome, status) VALUES ('12', 'Configuração', '1', 'Configuração', '0');
INSERT INTO menu (menu_id, label, nivel, nome, status) VALUES ('13', 'Dicionario', '1', 'Dicionario', '0');
INSERT INTO menu (menu_id, label, nivel, nome, status) VALUES ('14', 'NF-e', '1', 'NF-e', '0');

INSERT INTO groupmenu (GROUPMENU_ID, MENU_ID, NOME, ORDER, ICONE) VALUES ('1', '1', 'Pagina Inicial', '5', 'fa-dashboard');
INSERT INTO groupmenu (GROUPMENU_ID, MENU_ID, NOME, ORDER, ICONE) VALUES ('2', '2', 'Advocacia', '5', 'fa-envelope-o');
INSERT INTO groupmenu (GROUPMENU_ID, MENU_ID, NOME, ORDER, ICONE) VALUES ('3', '3', 'Fiscal', '5', 'fa-magic');
INSERT INTO groupmenu (GROUPMENU_ID, MENU_ID, NOME, ORDER, ICONE) VALUES ('4', '4', 'Vendas', '5', 'fa fa-table');
INSERT INTO groupmenu (GROUPMENU_ID, MENU_ID, NOME, ORDER, ICONE) VALUES ('5', '5', 'Compras', '5', 'fa-spoon');
INSERT INTO groupmenu (GROUPMENU_ID, MENU_ID, NOME, ORDER, ICONE) VALUES ('6', '6', 'Financeiro', '5', 'fa-bank');
INSERT INTO groupmenu (GROUPMENU_ID, MENU_ID, NOME, ORDER, ICONE) VALUES ('7', '7', 'Departamento Pessoal', '5', 'fa-times');
INSERT INTO groupmenu (GROUPMENU_ID, MENU_ID, NOME, ORDER, ICONE) VALUES ('8', '8', 'Clinica', '5', 'fa-ticket');
INSERT INTO groupmenu (GROUPMENU_ID, MENU_ID, NOME, ORDER, ICONE) VALUES ('9', '9', 'Condominio', '5', 'fa-university');
INSERT INTO groupmenu (GROUPMENU_ID, MENU_ID, NOME, ORDER, ICONE) VALUES ('10', '10', 'Cadastros', '5', 'fa-wpforms');
INSERT INTO groupmenu (GROUPMENU_ID, MENU_ID, NOME, ORDER, ICONE) VALUES ('11', '11', 'Produto/Serviço', '5', 'fa-trunk');
INSERT INTO groupmenu (GROUPMENU_ID, MENU_ID, NOME, ORDER, ICONE) VALUES ('12', '12', 'Configuração', '5', 'fa-cogs');
INSERT INTO groupmenu (GROUPMENU_ID, MENU_ID, NOME, ORDER, ICONE) VALUES ('13', '13', 'Dicionario', '5', 'fa-code');
INSERT INTO groupmenu (GROUPMENU_ID, MENU_ID, NOME, ORDER, ICONE) VALUES ('14', '14', 'NF-e', '5', 'fa-road');



INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('1', '82', '1', '1', 'Dashboard', '0', '1');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('1', '1', 'Dashboard', 'Dashboard');

INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('2', '82', '0', '1', 'Advogado', '0', '2');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('2', '1', 'Advogado ', 'TITULO Advogado');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('1', 'Advogado', 'advogado', '0', '2');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('1', '1', '0', '0', '0', '0', '1', '60', '1', '0', 'Cod Advogado', 'Cod Advogado', '0', '0');

INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('3', '82', '0', '1', 'Orgão', '0', '3');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('3', '1', 'TEXTO Orgão ', 'TITULO Orgão');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('2', 'Orgão', 'orgão', '0', '3');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('2', '1', '0', '0', '0', '0', '2', '60', '1', '0', 'Cod Orgão', 'Cod Orgão', '0', '0');

INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('4', '82', '0', '1', 'Especialidade', '0', '4');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('4', '1', 'TEXTO Especialidade ', 'TITULO Especialidade');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('3', 'Cod Especialidade', 'id', '0', '4');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('3', '1', '0', '0', '0', '0', '3', '60', '1', '0', 'Cod Esp.', 'Cod Esp.', '0', '0');

INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('5', '82', '0', '1', 'Grupo Trabalho', '0', '5');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('5', '1', 'TEXTO Grupo Trabalho ', 'TITULO Grupo Trabalho');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('4', 'Grupo Trabalho', 'GrupoTrabalho', '0', '5');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('4', '1', '0', '0', '0', '0', '4', '60', '1', '0', 'Cod Grp.', 'Cod Grp.', '0', '0');

INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('6', '82', '0', '1', 'Processo', '0', '6');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('6', '1', 'TEXTO Processo ', 'TITULO Processo');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('5', 'Processo', 'Processo', '0', '5');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('5', '1', '0', '0', '0', '0', '5', '60', '1', '0', 'Cod Processo', 'Cod Processo', '0', '0');

INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('7', '82', '0', '1', 'Status Processo', '0', '7');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('7', '1', 'TEXTO Status Processo ', 'TITULO Status Processo');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('6', 'Status Processo', 'Status Processo', '0', '5');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('6', '1', '0', '0', '0', '0', '6', '60', '1', '0', 'Cod Staus Proc', 'Cod Staus Proc', '0', '0');

INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('8', '82', '0', '1', 'Agenda', '0', '8');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('8', '1', 'TEXTO Agenda ', 'TITULO Agenda');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('7', 'Cod Menu', 'id', '0', '5');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('7', '1', '0', '0', '0', '0', '7', '60', '1', '0', 'Cod Agenda', 'Cod Agenda', '0', '0');
-- Dicionario


INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('9', '82', '0', '1', 'Entidade', '0', '9');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('9', '1', 'TEXTO Entidade ', 'TITULO Entidade');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('8', 'Cod Menu', 'id', '0', '5');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('10', '1', '0', '0', '0', '0', '9', '60', '1', '0', 'Cod Entidade', 'codEntidade', '0', '0');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('11', '1', '0', '0', '0', '0', '9', '60', '1', '0', 'Nome', 'nome', '0', '1');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('12', '1', '0', '0', '0', '0', '9', '60', '1', '0', 'Descrição', 'descricao', '0', '2');

INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('10', '82', '0', '1', 'Menu', '0', '10');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('10', '1', 'TEXTO Menu ', 'TITULO Menu');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('11', 'Cod Menu', 'id', '0', '10');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('12', 'Geral', 'geral', '0', '10');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id,pagina_aux) VALUES ('9', 'Sub Menu', 'subMenu', '0', 10, 11);
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('13', '1', '0', '0', '0', '0', '10', '60', '1', '0', 'Cód Menu', 'id', '0', '0');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('14', '1', '0', '0', '0', '0', '10', '60', '1', '0', 'Nome', 'nome', '0', '1');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('15', '1', '0', '0', '0', '0', '10', '60', '1', '0', 'Label', 'label', '0', '2');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('16', '1', '0', '0', '0', '0', '10', '60', '1', '0', 'Status', 'status', '0', '3');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('17', '1', '0', '0', '0', '0', '10', '60', '1', '0', 'Nivel', 'nivel', '0', '4');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('18', '1', '0', '0', '0', '0', '10', '60', '1', '0', 'Incone', 'icon', '0', '5');


INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('11', '82', '0', '1', 'Sub Menu', '0', '11');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('11', '1', 'TEXTO Sub-Menu ', 'TITULO Sub-Menu');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('13', 'Sub Menu', 'id', '0', '11');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id ,pagina_aux) VALUES ('14', 'Pagina', 'id', '1', '11',12);
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('19', '1', '0', '0', '0', '0', '10', '60', '1', '0', 'Cód Sub-Menu', 'id', '0', '0');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('20', '1', '0', '0', '0', '0', '10', '60', '1', '0', 'Nome', 'nome', '0', '1');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('21', '1', '0', '0', '0', '0', '10', '60', '1', '0', 'Order', 'order', '0', '2');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('22', '1', '0', '0', '0', '0', '10', '60', '1', '0', 'Incone', 'icone', '0', '3');


INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('12', '82', '0', '1', 'Pagina', '0', '12');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('12', '1', 'TEXTO Pagina ', 'TITULO Pagina');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('15', 'Entidade', 'entidade', '0', '11');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id ,pagina_aux) VALUES ('16', 'Ajuda', 'ajuda', '1', '11',13);
INSERT INTO tab (tab_id, label, nome, orders, pagina_id ,pagina_aux) VALUES ('17', 'Tab', 'tab', '2', '11',14);
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('23', '1', '0', '0', '0', '0', '11', '60', '1', '0', 'Cod Pagina', 'codPagina', '0', '0');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('24', '1', '0', '0', '0', '0', '11', '60', '1', '0', 'Sub Menu', 'groupMenuId', '0', '1');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('25', '1', '0', '0', '0', '0', '11', '60', '1', '0', 'Pagina', 'pagina', '0', '2');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('26', '1', '0', '0', '0', '0', '11', '60', '1', '0', 'Cod Tabela', 'codTabela', '0', '3');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('27', '1', '0', '0', '0', '0', '11', '60', '1', '0', 'Dinamica', 'existe', '0', '4');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('28', '1', '0', '0', '0', '0', '11', '60', '1', '0', 'Nome Pag Fisica', 'paginaFisica', '0', '5');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('29', '1', '0', '0', '0', '0', '11', '60', '1', '0', 'Status', 'status', '0', '6');

INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('13', '82', '0', '1', 'Ajuda', '0', '13');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('13', '1', 'TEXTO Ajuda ', 'TITULO Ajuda');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('18', 'Ajuda', 'id', '0', '13');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id,pagina_aux) VALUES ('19', 'Anexos', 'id', '0', '13',14);
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('30', '1', '0', '0', '0', '0', '13', '60', '1', '0', 'Cód Ajuda', 'id', '0', '0');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('31', '1', '0', '0', '0', '0', '13', '60', '1', '0', 'Titulo', 'id', '0', '0');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('32', '1', '0', '0', '0', '0', '13', '60', '1', '0', 'Texto', 'id', '0', '0');

INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('13', '82', '0', '1', 'Anexos', '0', '13');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('13', '1', 'TEXTO Anexos ', 'TITULO Anexos');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('18', 'Anexos', 'id', '0', '13');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('30', '1', '0', '0', '0', '0', '13', '60', '1', '0', 'Cód Ajuda', 'id', '0', '0');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('31', '1', '0', '0', '0', '0', '13', '60', '1', '0', 'Titulo', 'id', '0', '0');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('32', '1', '0', '0', '0', '0', '13', '60', '1', '0', 'Texto', 'id', '0', '0');


INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('13', '82', '0', '1', 'Anexos', '0', '13');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('13', '1', 'TEXTO Anexos ', 'TITULO Anexos');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('19', 'Anexos', 'id', '0', '13');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('30', '1', '0', '0', '0', '0', '13', '60', '1', '0', 'Cód Ajuda', 'id', '0', '0');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('31', '1', '0', '0', '0', '0', '13', '60', '1', '0', 'Titulo', 'id', '0', '0');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('32', '1', '0', '0', '0', '0', '13', '60', '1', '0', 'Texto', 'id', '0', '0');


INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('14', '82', '0', '1', 'Campos', '0', '14');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('14', '1', 'TEXTO Campos ', 'TITULO Campos');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('20', 'Campos', 'id', '0', '13');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('21', 'Dominio', 'id', '0', '13',14);
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('30', '1', '0', '0', '0', '0', '13', '60', '1', '0', 'Cód Ajuda', 'id', '0', '0');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('31', '1', '0', '0', '0', '0', '13', '60', '1', '0', 'Titulo', 'id', '0', '0');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('32', '1', '0', '0', '0', '0', '13', '60', '1', '0', 'Texto', 'id', '0', '0');


INSERT INTO pagina (pagina_id, entidade_id, existe_pag, groupmenu_id, pagina, status, help_id) VALUES ('14', '82', '0', '1', 'Dominio', '0', '14');
INSERT INTO help (help_id, status, texto, titulo) VALUES ('14', '1', 'TEXTO Dominio ', 'TITULO Dominio');
INSERT INTO tab (tab_id, label, nome, orders, pagina_id) VALUES ('20', 'Dominio', 'id', '0', '13');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('30', '1', '0', '0', '0', '0', '13', '60', '1', '0', 'Cód Ajuda', 'id', '0', '0');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('31', '1', '0', '0', '0', '0', '13', '60', '1', '0', 'Titulo', 'id', '0', '0');
INSERT INTO field (field_id, entidade_id, forenkey, model, primarykey, requerid, tab_id, tamanho, tipo, xml, label, nome, oculto, orders) VALUES ('32', '1', '0', '0', '0', '0', '13', '60', '1', '0', 'Texto', 'id', '0', '0');

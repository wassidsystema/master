package com.nouhoun.springboot.jwt.integration.data;

import com.nouhoun.springboot.jwt.integration.controller.CrudRequest;
import com.nouhoun.springboot.jwt.integration.domain.TreeValor;

public abstract class DicionarioHelper{
	
	private static String retTipo(String valor,String tipo) {
		if("string".equals(tipo)) {
			return  "'"+valor+"'";
		} else {
			return "" +valor;
		}
	}

	public static String insert(CrudRequest req) {
		StringBuffer sql1 = new StringBuffer("INSERT INTO (");
		StringBuffer sql2 = new StringBuffer(" ");
		StringBuffer sql3 = new StringBuffer(" ");
		sql1.append(req.getTabela());
		
		for (int i = 0; i < req.getCampos().size(); i++) {
			TreeValor campo = req.getCampos().get(i);
			sql2.append(campo.getChave());
			sql3.append(retTipo(campo.getValor(),campo.getTipo()));
			if(i != req.getCampos().size()) {
				sql2.append(", ");
				sql3.append(", ");
			}
			
		}	
		sql1.append(sql2);
		sql1.append(") VALUES (");
		sql1.append(sql3);
		sql1.append(")");
	//	String sql = "INSERT INTO "+req.getTabela()+" (menu_id,label, nivel, nome, status) VALUES (1000,'Pagina Inicial', '0', 'Pagina Inicial', '0')";

		return sql1.toString();
	}
	
	public static String update() {
		String sql = "INSERT INTO MENU (menu_id, label, nivel, nome, status) VALUES ('1', 'Pagina Inicial', '0', 'Pagina Inicial', '0')";
		return sql;
	}
	
	public static  String delete() {
		String sql = "INSERT INTO MENU (menu_id, label, nivel, nome, status) VALUES ('1', 'Pagina Inicial', '0', 'Pagina Inicial', '0')";
		return sql;
	}
	
	public static String fetchPage() {
		String sql = "SELECT * FROM MENU where menu_id = 1";
		return sql;
	}
}

package com.nouhoun.springboot.jwt.integration.data;

public abstract class DicionarioHelper{

	public static String insert() {
		String sql = "INSERT INTO MENU (menu_id,label, nivel, nome, status) VALUES (1000,'Pagina Inicial', '0', 'Pagina Inicial', '0')";

		return sql;
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

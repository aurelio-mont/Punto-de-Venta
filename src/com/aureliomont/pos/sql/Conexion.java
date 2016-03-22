package com.aureliomont.pos.sql;

import com.aureliomont.pos.modelos.Usuario;

public class Conexion {
	private Usuario miUsuario = new Usuario(1,"admin","123","montalvo","echeverria","aurelio",1);
	
	public Usuario validarUsuario(String usuario, String password) {
		// TODO Auto-generated method stub
		
		return miUsuario;
	}

}

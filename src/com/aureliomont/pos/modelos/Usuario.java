package com.aureliomont.pos.modelos;

public class Usuario {
	private int 	idUsuario;
	private String 	pasword;
	private String 	userName;
	private String 	aPaterno;
	private String 	amaterno;
	private String 	nombre;
	private int 	tipoUsuario;
	
	public Usuario() {
		this.idUsuario = 0;
		this.pasword = null;
		this.userName = null;
		this.aPaterno = null;
		this.amaterno = null;
		this.nombre = null;
		this.tipoUsuario = 0;
	}
	
	
	public Usuario(int idUsuario, String pasword, String userName, String aPaterno, String amaterno, String nombre,
			int tipoUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.pasword = pasword;
		this.userName = userName;
		this.aPaterno = aPaterno;
		this.amaterno = amaterno;
		this.nombre = nombre;
		this.tipoUsuario = tipoUsuario;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getaPaterno() {
		return aPaterno;
	}
	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}
	public String getAmaterno() {
		return amaterno;
	}
	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}


	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", pasword=" + pasword + ", userName=" + userName + ", aPaterno="
				+ aPaterno + ", amaterno=" + amaterno + ", nombre=" + nombre + ", tipoUsuario=" + tipoUsuario + "]";
	}
	
	
}

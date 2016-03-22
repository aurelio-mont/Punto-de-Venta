package com.aureliomont.pos;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import com.aureliomont.pos.vistas.FormLogin;

public class Principal {
	public static void main(String[] args) {
		
		establecerTema();
		mostrarVentanaLogin();
	}
	
	private static void mostrarVentanaLogin() {
		FormLogin frame = new FormLogin();
		frame.setVisible(true);
	}
	
	private static void establecerTema() {
		// TODO Auto-generated method stub
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
	}
}

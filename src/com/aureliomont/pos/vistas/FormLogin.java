package com.aureliomont.pos.vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.aureliomont.pos.modelos.Usuario;
import com.aureliomont.pos.sql.*;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textStatus;
	private JTextField textUsuario;
	private JPasswordField passwordUsuario;
	private Conexion miConexion = new Conexion();
	private Usuario miUsuario;


	public FormLogin() {
		setResizable(false);
		setTitle("Login - Sistema Pnto de Venta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 258);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(FormLogin.class.getResource("/com/aureliomont/pos/imagenes/login.png")));
		contentPane.add(lblImagen, BorderLayout.WEST);
		
		JLabel lblIngresoAlSistema = new JLabel("Ingreso al Sistema");
		lblIngresoAlSistema.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresoAlSistema.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblIngresoAlSistema, BorderLayout.NORTH);
		
		textStatus = new JTextField();
		textStatus.setEnabled(false);
		textStatus.setFont(new Font("SansSerif", Font.BOLD, 12));
		textStatus.setBackground(SystemColor.activeCaption);
		textStatus.setEditable(false);
		contentPane.add(textStatus, BorderLayout.SOUTH);
		textStatus.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[][grow]", "[][][][][][]"));
		
		JLabel lblUsuario = new JLabel("Usuario: *");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblUsuario, "cell 0 0 2 1");
		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(textUsuario, "cell 0 1 2 1,growx");
		textUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a: *");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblContrasea, "cell 0 2 2 1");
		
		passwordUsuario = new JPasswordField();
		passwordUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(passwordUsuario, "cell 0 3 2 1,growx");
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(btnCancelar, "cell 0 5,alignx left,aligny center");
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String usuario = textUsuario.getText();
				String password = passwordUsuario.getText();
				if (usuario.length() == 0 || password.length() == 0) {
					textStatus.setEnabled(true);
					textStatus.setText("Intrroduce los datos *");
					textStatus.setEnabled(false);
					textUsuario.setText("");
					textUsuario.requestFocus();
					passwordUsuario.setText("");
				} else {
					miUsuario = miConexion.validarUsuario(usuario, password);
					if (miUsuario.getIdUsuario() == 0) {
						textStatus.setEnabled(true);
						textStatus.setText("Error en los datoss * || El usuario no existe");
						textStatus.setEnabled(false);
					} else {
						textStatus.setEnabled(true);
						textStatus.setText("Ingresando al Sistema");
						textStatus.setEnabled(false);
					}
				}
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(btnAceptar, "cell 1 5,alignx right,aligny center");
	}

}

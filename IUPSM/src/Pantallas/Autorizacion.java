package Pantallas;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class Autorizacion {
	private static JTextField txtCedula;
	private static JPasswordField passwordField;
	
	public static boolean FULL = false;

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		JFrame a = new JFrame("Pantalla de autorización de acceso");
		a.setIconImage(Toolkit.getDefaultToolkit().getImage(Autorizacion.class.getResource("/Imagenes/FLAG-2.png")));
		a.getContentPane().setBackground(new Color(46, 139, 87));
		a.setResizable(false);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setSize(247, 471);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		a.setLocation(dim.width/2-a.getSize().width/2, dim.height/2-a.getSize().height/2);
		a.getContentPane().setLayout(null);
		
		JLabel lblCdula = new JLabel("C\u00E9dula");
		lblCdula.setBounds(49, 252, 139, 17);
		lblCdula.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		lblCdula.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdula.setForeground(new Color(255, 250, 250));
		lblCdula.setBackground(new Color(255, 250, 250));
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(49, 323, 139, 17);
		lblContrasea.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasea.setForeground(new Color(255, 250, 250));
		lblContrasea.setBackground(new Color(255, 250, 250));
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtCedula.getText().trim().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Necesita introducir su cedula", "Cedula obligatoria", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(passwordField.getText().trim().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Necesita introducir su contraseña", "Contraseña obligatoria", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtCedula.getText().trim().equals("IUPSM") && passwordField.getText().trim().equalsIgnoreCase("2018")){
					a.dispose();
					Autorizacion.FULL = true;
					Principal.main(args);
					return;
				}
				
				Interaccion BD = new Interaccion();
				
				BD.Acceso(txtCedula.getText(), passwordField.getPassword());
				
			}
		});
		btnNewButton.setBounds(51, 392, 70, 29);
		btnNewButton.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(255, 250, 250));
		btnNewButton.setForeground(new Color(46, 139, 87));
		
		JButton btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.setBounds(127, 392, 61, 29);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtCedula.setText("");
				passwordField.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		btnNewButton_1.setBackground(new Color(255, 250, 250));
		btnNewButton_1.setForeground(new Color(46, 139, 87));
		
		txtCedula = new JTextField();
		txtCedula.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtCedula.setHorizontalAlignment(SwingConstants.CENTER);
		txtCedula.setForeground(new Color(255, 255, 255));
		txtCedula.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtCedula.setBackground(new Color(46, 139, 87));
		txtCedula.setOpaque(true);
		txtCedula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.requestFocus();
			}
		});
		txtCedula.setBounds(49, 281, 139, 28);
		txtCedula.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		passwordField.setBackground(new Color(46, 139, 87));
		passwordField.setOpaque(true);
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtCedula.getText().trim().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Necesita introducir su cedula", "Cedula obligatoria", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(passwordField.getText().trim().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Necesita introducir su contraseña", "Contraseña obligatoria", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtCedula.getText().trim().equals("IUPSM") && passwordField.getText().trim().equalsIgnoreCase("2018")){
					a.dispose();
					Autorizacion.FULL = true;
					Principal.main(args);
					return;
					
				}
				
				Interaccion BD = new Interaccion();
				BD.Acceso(txtCedula.getText(), passwordField.getPassword());
				a.dispose();
			}
		});
		passwordField.setBounds(49, 351, 139, 29);
		a.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(6, 6, 225, 239);
		lblNewLabel.setIcon(new ImageIcon(Autorizacion.class.getResource("/Imagenes/bandera.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		a.getContentPane().add(lblNewLabel);
		a.getContentPane().add(lblCdula);
		a.getContentPane().add(lblContrasea);
		a.getContentPane().add(passwordField);
		a.getContentPane().add(btnNewButton);
		a.getContentPane().add(btnNewButton_1);
		a.getContentPane().add(txtCedula);
		
		a.setVisible(true);

	}
}

class Interaccion{
	public String Usuario = "root";
	public String Contraseña = "";
	public Connection conn = null;
	
	
	
	public void Conectar(String BD){
		
		   
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");
		      //STEP 3: Open a connection
		      
		      conn = DriverManager.getConnection("jdbc:mysql://localhost/" + BD, Usuario, Contraseña);
		      
		   }
		   catch(Exception e){
			   System.err.println(e);
		   }
	}
	
	public void Desconectar(){
		try {
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
	}


	
	
public Interaccion(){
		
		

				 
				
		Conectar("IUPSM");
		
		 try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");
		      
		      String createDB = "CREATE DATABASE IF NOT EXISTS IUPSM";
				PreparedStatement preparedStatement = null;
				
				
		      //STEP 3: Open a connection
		      
		      conn = DriverManager.getConnection("jdbc:mysql://localhost", Usuario, Contraseña);
		      preparedStatement = conn.prepareStatement(createDB);
		      preparedStatement.executeUpdate();
		      
		      Conectar("IUPSM");
		      
		      String sqlCreate = "CREATE TABLE IF NOT EXISTS Articulos" 
				         + "  (Fecha TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,"
				         + "   Codigo int NOT NULL AUTO_INCREMENT,"
				         + "   Nombre          VARCHAR(72) NOT NULL UNIQUE,"
				         + "   Tipo          VARCHAR(72) NOT NULL,"
				         + "   Color          VARCHAR(72) NOT NULL,"
				         + "   Existente          INT NOT NULL,"
				         + "   Dañada          INT NOT NULL,"
				         + "   Donada          INT NOT NULL,"
				         + " PRIMARY KEY ( Codigo ))";
		      
		      Statement stmt = conn.createStatement();
				stmt.execute(sqlCreate);

		      
		      Desconectar();
		   }
		   catch(Exception e){
			   System.err.println(e);
		   }
	      
	}

public void Acceso(String usuario, char[] contraseña){
	 try{
	      //STEP 2: Register JDBC driver
		  ResultSet rs = null;
	      Conectar("IUPSM");
	     
	     
	      String query = "SELECT Cedula, contraseña FROM Usuarios WHERE Cedula = ?";
		  PreparedStatement pstmt = conn.prepareStatement(query); // create a statement
		  pstmt.setString(1, usuario.toLowerCase()); // set input parameter
		  rs = pstmt.executeQuery();
		  String User = "", Pass = "", conversion = "";
		  while (rs.next()) {
		        User = rs.getString(1);
		        Pass = rs.getString(2);
		  }
		  for(int i = 0; i < contraseña.length; i++){
			  conversion += contraseña[i];
		  }
		  if(User.equalsIgnoreCase("")){
			  JOptionPane.showMessageDialog(null, "Número de cedula invalido", "ERROR", JOptionPane.ERROR_MESSAGE);
			  return;
		  }
		  if(User.equalsIgnoreCase(usuario) && !Pass.equals(conversion)){
			  JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
			  return;
		  }
		 
		  Autorizacion.FULL = false;
		  Principal.main(null);
	      Desconectar();
	      
		  
	   }
	   catch(Exception e){
		   System.err.println(e);
		   return;
	   }
	 finally{
		 Desconectar();
	 }
    
}




}

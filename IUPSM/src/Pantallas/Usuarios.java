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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

import org.apache.commons.lang3.text.WordUtils;



import javax.swing.JPanel;

public class Usuarios {
	private static JTextField txtACedula;
	private static JTextField txtMCedula;
	private static JTextField txtECedula;
	private static JTextField txtANombre;
	private static JTextField txtAContraseña;
	private static JTextField txtMNombre;
	private static JTextField txtMContraseña;
	private static JTextField txtBuscarCedula;

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		JFrame a = new JFrame("Pantalla de autorización de acceso");
		a.setIconImage(Toolkit.getDefaultToolkit().getImage(Usuarios.class.getResource("/Imagenes/FLAG-2.png")));
		a.setTitle("Menu Principal");
		a.getContentPane().setBackground(new Color(46, 139, 87));
		a.setResizable(false);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setSize(820, 600);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		a.setLocation(dim.width/2-a.getSize().width/2, dim.height/2-a.getSize().height/2);
		a.getContentPane().setLayout(null);
		a.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Usuarios.class.getResource("/Imagenes/LOGO.gif")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 143, 132);
		a.getContentPane().add(lblNewLabel);
		
		JLabel lblTitulo = new JLabel("<html>Inventario de Mobiliario en el Batall\u00F3n del<br /> Ingeniero Ferroviario Coronel Casimiro Isava Oliver</html>");
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setFont(new Font("Consolas", Font.BOLD, 24));
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBounds(199, 21, 589, 103);
		a.getContentPane().add(lblTitulo);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		panel.setBackground(new Color(46, 139, 87));
		panel.setBounds(26, 150, 762, 113);
		a.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Agregar usuario");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Consolas", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(6, 6, 130, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("C\u00E9dula");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Consolas", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(21, 53, 75, 16);
		panel.add(lblNewLabel_2);
		
		txtACedula = new JTextField();
		txtACedula.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtACedula.setBackground(new Color(46, 139, 87));
		txtACedula.setHorizontalAlignment(SwingConstants.CENTER);
		txtACedula.setForeground(new Color(255, 255, 255));
		txtACedula.setFont(new Font("Consolas", Font.BOLD, 12));
		txtACedula.setBounds(31, 67, 96, 28);
		panel.add(txtACedula);
		txtACedula.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Consolas", Font.BOLD, 12));
		lblNombre.setBounds(305, 51, 75, 16);
		panel.add(lblNombre);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Consolas", Font.BOLD, 12));
		lblContrasea.setBounds(553, 51, 75, 16);
		panel.add(lblContrasea);
		
		txtANombre = new JTextField();
		txtANombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtANombre.setForeground(Color.WHITE);
		txtANombre.setFont(new Font("Consolas", Font.BOLD, 12));
		txtANombre.setColumns(10);
		txtANombre.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtANombre.setBackground(new Color(46, 139, 87));
		txtANombre.setBounds(315, 64, 150, 28);
		panel.add(txtANombre);
		
		txtAContraseña = new JTextField();
		txtAContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		txtAContraseña.setForeground(Color.WHITE);
		txtAContraseña.setFont(new Font("Consolas", Font.BOLD, 12));
		txtAContraseña.setColumns(10);
		txtAContraseña.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtAContraseña.setBackground(new Color(46, 139, 87));
		txtAContraseña.setBounds(553, 67, 96, 28);
		panel.add(txtAContraseña);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtACedula.getText().trim().equals("")){
					JOptionPane.showMessageDialog(null, "Debe introducir un número de cedula!", "Nombre obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(!txtACedula.getText().matches("[0-9]+")){
					JOptionPane.showMessageDialog(null, "El campo cédula solo acepta números!", "Nombre obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(Integer.parseInt(txtACedula.getText()) <= 0){
					JOptionPane.showMessageDialog(null, "El campo cédula solo acepta numeros mayores a 0!", "Nombre obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtANombre.getText().trim().equals("")){
					JOptionPane.showMessageDialog(null, "Debe introducir un nombre!", "Nombre obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtAContraseña.getText().trim().equals("")){
					JOptionPane.showMessageDialog(null, "Debe introducir una contraseña!", "Nombre obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				Interaccion BD = new Interaccion();
				try {
					
					
					BD.Conectar("IUPSM");
					 String sqlCreate = "CREATE TABLE IF NOT EXISTS Usuarios" 
					         + "  (ID int NOT NULL AUTO_INCREMENT,"
					         + "   Cedula int NOT NULL UNIQUE,"
					         + "   Nombre VARCHAR(72) NOT NULL,"
					         + "   Contraseña          VARCHAR(72) NOT NULL,"
					         + " PRIMARY KEY ( ID ))";

							 
							 String resultado = "";
					Statement stmt = BD.conn.createStatement();
					stmt.execute(sqlCreate);
					 String selectSQL = "SELECT Cedula FROM Usuarios WHERE Cedula = ?";
					  PreparedStatement preparedStatement = BD.conn.prepareStatement(selectSQL);
					  preparedStatement.setInt(1, Integer.parseInt(txtACedula.getText()));
					  ResultSet rs = preparedStatement.executeQuery();
					  while (rs.next()) {
					  	resultado = rs.getString("Cedula");
					  }
					  if(!resultado.toString().trim().equalsIgnoreCase("")){
						  JOptionPane.showMessageDialog(null, "Esta cedula ya se encuentra dentro del sistema", "Error en el sistema", JOptionPane.ERROR_MESSAGE);
						  return;
					  }
					  
					  String insertTableSQL = "INSERT INTO Usuarios"
								+ "(Cedula, Nombre, Contraseña) VALUES"
								+ "(?, ?, ?)";
					preparedStatement = BD.conn.prepareStatement(insertTableSQL);
					preparedStatement.setInt(1, Integer.parseInt(txtACedula.getText()));
					preparedStatement.setString(2, WordUtils.capitalizeFully(txtANombre.getText()));
					preparedStatement.setString(3, txtAContraseña.getText());
											
					preparedStatement .executeUpdate();
					  
					  
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				finally{
					BD.Desconectar();
				}
				 
		
		BD.Desconectar();
		txtACedula.setText("");
		txtANombre.setText("");
		txtAContraseña.setText("");
		
		
		JOptionPane.showMessageDialog(null, "Usuario agregado", "Usuario Agregado", JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setFont(new Font("Consolas", Font.BOLD, 13));
		btnAgregar.setBackground(new Color(46, 139, 87));
		btnAgregar.setBounds(661, 6, 95, 28);
		panel.add(btnAgregar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		panel_1.setBackground(new Color(46, 139, 87));
		panel_1.setBounds(26, 275, 762, 113);
		a.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblModificarUsuario = new JLabel("Modificar usuario");
		lblModificarUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificarUsuario.setForeground(Color.WHITE);
		lblModificarUsuario.setFont(new Font("Consolas", Font.BOLD, 12));
		lblModificarUsuario.setBounds(6, 6, 141, 16);
		panel_1.add(lblModificarUsuario);
		
		JLabel label = new JLabel("C\u00E9dula");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Consolas", Font.BOLD, 12));
		label.setBounds(17, 54, 75, 16);
		panel_1.add(label);
		
		txtMCedula = new JTextField();
		txtMCedula.setHorizontalAlignment(SwingConstants.CENTER);
		txtMCedula.setForeground(Color.WHITE);
		txtMCedula.setFont(new Font("Consolas", Font.BOLD, 12));
		txtMCedula.setColumns(10);
		txtMCedula.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtMCedula.setBackground(new Color(46, 139, 87));
		txtMCedula.setBounds(27, 67, 96, 28);
		panel_1.add(txtMCedula);
		
		JLabel label_2 = new JLabel("Nombre");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Consolas", Font.BOLD, 12));
		label_2.setBounds(307, 54, 75, 16);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Contrase\u00F1a");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Consolas", Font.BOLD, 12));
		label_3.setBounds(555, 54, 75, 16);
		panel_1.add(label_3);
		
		txtMNombre = new JTextField();
		txtMNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtMNombre.setForeground(Color.WHITE);
		txtMNombre.setFont(new Font("Consolas", Font.BOLD, 12));
		txtMNombre.setColumns(10);
		txtMNombre.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtMNombre.setBackground(new Color(46, 139, 87));
		txtMNombre.setBounds(317, 67, 152, 28);
		panel_1.add(txtMNombre);
		
		txtMContraseña = new JTextField();
		txtMContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		txtMContraseña.setForeground(Color.WHITE);
		txtMContraseña.setFont(new Font("Consolas", Font.BOLD, 12));
		txtMContraseña.setColumns(10);
		txtMContraseña.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtMContraseña.setBackground(new Color(46, 139, 87));
		txtMContraseña.setBounds(565, 67, 96, 28);
		panel_1.add(txtMContraseña);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtMCedula.getText().trim().equals("")){
					JOptionPane.showMessageDialog(null, "Debe introducir un número de cedula!", "Nombre obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(!txtMCedula.getText().matches("[0-9]+")){
					JOptionPane.showMessageDialog(null, "El campo cédula solo acepta números!", "Nombre obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(Integer.parseInt(txtMCedula.getText()) <= 0){
					JOptionPane.showMessageDialog(null, "El campo cédula solo acepta numeros mayores a 0!", "Nombre obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtMNombre.getText().trim().equals("")){
					JOptionPane.showMessageDialog(null, "Debe introducir un nombre!", "Nombre obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtMContraseña.getText().trim().equals("")){
					JOptionPane.showMessageDialog(null, "Debe introducir una contraseña!", "Nombre obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				
				Interaccion BD = new Interaccion();
				
				BD.Conectar("IUPSM");
				
				// Proceso
			
				
				try{
					
					String resultado = "";
					Statement stmt = BD.conn.createStatement();
					
					 String selectSQL = "SELECT Cedula FROM Usuarios WHERE Cedula = ?";
					  PreparedStatement preparedStatement = BD.conn.prepareStatement(selectSQL);
					  preparedStatement.setInt(1, Integer.parseInt(txtMCedula.getText()));
					  ResultSet rs = preparedStatement.executeQuery();
					  while (rs.next()) {
					  	resultado = rs.getString("Cedula");
					  }
					  if(!resultado.toString().trim().equalsIgnoreCase("") && !txtBuscarCedula.getText().matches(txtMCedula.getText())){
						  JOptionPane.showMessageDialog(null, "Esta cedula ya se encuentra dentro del sistema", "Error en el sistema", JOptionPane.ERROR_MESSAGE);
						  return;
					  }
					
					 String insertTableSQL = "UPDATE Usuarios SET Cedula = ?, Nombre = ?, Contraseña = ? WHERE Cedula = ?";
						preparedStatement = BD.conn.prepareStatement(insertTableSQL);
						preparedStatement.setInt(1, Integer.parseInt(txtMCedula.getText()));
						preparedStatement.setString(2, WordUtils.capitalizeFully(txtMNombre.getText()));
						preparedStatement.setString(3, txtMContraseña.getText());
						preparedStatement.setInt(4, Integer.parseInt(txtBuscarCedula.getText()));
					
							
						preparedStatement .executeUpdate();
						BD.Desconectar();
				}
				catch(Exception yo){
					System.err.println(yo);
				}
				finally{
					BD.Desconectar();
				}
				
				txtMNombre.setText("");
				txtBuscarCedula.setText("");
				txtMContraseña.setText("");
				txtMCedula.setText("");
				
			
				JOptionPane.showMessageDialog(null, "Usuario actualizado", "Usuario actualizado", JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setFont(new Font("Consolas", Font.BOLD, 13));
		btnModificar.setBackground(new Color(46, 139, 87));
		btnModificar.setBounds(661, 6, 95, 28);
		panel_1.add(btnModificar);
		
		JLabel lblBuscarCdula = new JLabel("Buscar c\u00E9dula");
		lblBuscarCdula.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscarCdula.setForeground(Color.WHITE);
		lblBuscarCdula.setFont(new Font("Consolas", Font.BOLD, 12));
		lblBuscarCdula.setBounds(234, 12, 125, 30);
		panel_1.add(lblBuscarCdula);
		
		txtBuscarCedula = new JTextField();
		txtBuscarCedula.setHorizontalAlignment(SwingConstants.CENTER);
		txtBuscarCedula.setForeground(Color.WHITE);
		txtBuscarCedula.setFont(new Font("Consolas", Font.BOLD, 12));
		txtBuscarCedula.setColumns(10);
		txtBuscarCedula.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtBuscarCedula.setBackground(new Color(46, 139, 87));
		txtBuscarCedula.setBounds(361, 6, 96, 28);
		panel_1.add(txtBuscarCedula);
		
		txtBuscarCedula.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
				  
			    if(txtBuscarCedula.getText().matches("[0-9]+")){
			    	Interaccion db = new Interaccion();
			    	db.Conectar("IUPSM");
			    	try{
						  String selectSQL = "";
						  PreparedStatement preparedStatement = null;
						  
								 selectSQL = "SELECT Cedula, Nombre, Contraseña FROM Usuarios WHERE Cedula = ?";
								 preparedStatement = db.conn.prepareStatement(selectSQL);
								  preparedStatement.setInt(1, Integer.parseInt(txtBuscarCedula.getText()));
							  
						  
						  ResultSet rs = preparedStatement.executeQuery();
						  while (rs.next()) {
						  	int Cedula = rs.getInt("Cedula");
						  	String Nombre = rs.getString("Nombre");
						  	String Contraseña = rs.getString("Contraseña");
						  	
						  	txtMCedula.setText(Integer.toString(Cedula));
						  	txtMNombre.setText(Nombre);
						  	txtMContraseña.setText(Contraseña);
						  }
						 
			    	db.Desconectar();
			    }
			    	catch(Exception ae){
			    		ae.printStackTrace();
			    	}
			    }
			    
			  }
			  public void removeUpdate(DocumentEvent e) {
				  if(txtBuscarCedula.getText().matches("[0-9]+")){
					  if(txtBuscarCedula.getText().matches("[0-9]+")){
					    	Interaccion db = new Interaccion();
					    	db.Conectar("IUPSM");
					    	try{
								  String selectSQL = "";
								  PreparedStatement preparedStatement = null;
								  
										 selectSQL = "SELECT Cedula, Nombre, Contraseña FROM Usuarios WHERE Cedula = ?";
										 preparedStatement = db.conn.prepareStatement(selectSQL);
										  preparedStatement.setInt(1, Integer.parseInt(txtBuscarCedula.getText()));
									  
								  
								  ResultSet rs = preparedStatement.executeQuery();
								  while (rs.next()) {
								  	int Cedula = rs.getInt("Cedula");
								  	String Nombre = rs.getString("Nombre");
								  	String Contraseña = rs.getString("Contraseña");
								  	
								  	txtMCedula.setText(Integer.toString(Cedula));
								  	txtMNombre.setText(Nombre);
								  	txtMContraseña.setText(Contraseña);
								  }
								 
					    	db.Desconectar();
					    }
					    	catch(Exception ae){
					    		ae.printStackTrace();
					    	}	
					  }
				  }
			  }
			  public void insertUpdate(DocumentEvent e) {
				  if(txtBuscarCedula.getText().matches("[0-9]+")){
					  if(txtBuscarCedula.getText().matches("[0-9]+")){
					    	Interaccion db = new Interaccion();
					    	db.Conectar("IUPSM");
					    	try{
								  String selectSQL = "";
								  PreparedStatement preparedStatement = null;
								  
										 selectSQL = "SELECT Cedula, Nombre, Contraseña FROM Usuarios WHERE Cedula = ?";
										 preparedStatement = db.conn.prepareStatement(selectSQL);
										  preparedStatement.setInt(1, Integer.parseInt(txtBuscarCedula.getText()));
									  
								  
								  ResultSet rs = preparedStatement.executeQuery();
								  while (rs.next()) {
								  	int Cedula = rs.getInt("Cedula");
								  	String Nombre = rs.getString("Nombre");
								  	String Contraseña = rs.getString("Contraseña");
								  	
								  	txtMCedula.setText(Integer.toString(Cedula));
								  	txtMNombre.setText(Nombre);
								  	txtMContraseña.setText(Contraseña);
								  }
								 
					    	db.Desconectar();
					    }
					    	catch(Exception ae){
					    		ae.printStackTrace();
					    	}
					  }
			  }
			  }

			 
			  
			});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		panel_2.setBackground(new Color(46, 139, 87));
		panel_2.setBounds(26, 400, 762, 113);
		a.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblEliminarUsuario = new JLabel("Eliminar usuario");
		lblEliminarUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarUsuario.setForeground(Color.WHITE);
		lblEliminarUsuario.setFont(new Font("Consolas", Font.BOLD, 12));
		lblEliminarUsuario.setBounds(6, 6, 142, 16);
		panel_2.add(lblEliminarUsuario);
		
		JLabel label_1 = new JLabel("C\u00E9dula");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Consolas", Font.BOLD, 12));
		label_1.setBounds(16, 34, 75, 16);
		panel_2.add(label_1);
		
		txtECedula = new JTextField();
		txtECedula.setHorizontalAlignment(SwingConstants.CENTER);
		txtECedula.setForeground(Color.WHITE);
		txtECedula.setFont(new Font("Consolas", Font.BOLD, 12));
		txtECedula.setColumns(10);
		txtECedula.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtECedula.setBackground(new Color(46, 139, 87));
		txtECedula.setBounds(26, 50, 96, 28);
		panel_2.add(txtECedula);
		
		JButton btnEliminarUsuario = new JButton("Eliminar usuario");
		btnEliminarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtECedula.getText().trim().equals("")){
					JOptionPane.showMessageDialog(null, "Debe introducir un número de cedula!", "Nombre obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(!txtECedula.getText().matches("[0-9]+")){
					JOptionPane.showMessageDialog(null, "El campo cédula solo acepta números!", "Nombre obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(Integer.parseInt(txtECedula.getText()) <= 0){
					JOptionPane.showMessageDialog(null, "El campo cédula solo acepta numeros mayores a 0!", "Nombre obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
Interaccion BD = new Interaccion();
				
				BD.Conectar("IUPSM");
				
				// Proceso
			
				
				try{
					
					String resultado = "";
					Statement stmt = BD.conn.createStatement();
					
					 String selectSQL = "SELECT Cedula FROM Usuarios WHERE Cedula = ?";
					  PreparedStatement preparedStatement = BD.conn.prepareStatement(selectSQL);
					  preparedStatement.setInt(1, Integer.parseInt(txtECedula.getText()));
					  ResultSet rs = preparedStatement.executeQuery();
					  while (rs.next()) {
					  	resultado = rs.getString("Cedula");
					  }
					  if(resultado.toString().trim().equalsIgnoreCase("")){
						  JOptionPane.showMessageDialog(null, "Esta cedula no existe dentro del sistema", "Error en el sistema", JOptionPane.ERROR_MESSAGE);
						  return;
					  }
					
					 String insertTableSQL = "DELETE FROM Usuarios WHERE Cedula = ?";
						preparedStatement = BD.conn.prepareStatement(insertTableSQL);
						preparedStatement.setInt(1, Integer.parseInt(txtECedula.getText()));
											
							
						preparedStatement .executeUpdate();
						BD.Desconectar();
				}
				catch(Exception yo){
					System.err.println(yo);
				}
				finally{
					BD.Desconectar();
				}
				
				txtECedula.setText("");
						
			
				JOptionPane.showMessageDialog(null, "Usuario eliminado", "Usuario eliminado", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnEliminarUsuario.setForeground(Color.WHITE);
		btnEliminarUsuario.setFont(new Font("Consolas", Font.BOLD, 13));
		btnEliminarUsuario.setBackground(new Color(46, 139, 87));
		btnEliminarUsuario.setBounds(178, 47, 168, 28);
		panel_2.add(btnEliminarUsuario);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.dispose();
				Principal.main(args);
			}
		});
		btnRegresar.setFont(new Font("Consolas", Font.BOLD, 13));
		btnRegresar.setForeground(new Color(255, 255, 255));
		btnRegresar.setBackground(new Color(46, 139, 87));
		btnRegresar.setBounds(628, 527, 101, 28);
		a.getContentPane().add(btnRegresar);
		
		a.setVisible(true);

	}
}

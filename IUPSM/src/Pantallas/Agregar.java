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
import java.awt.TextField;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class Agregar {
	private static JTextField txtNombre;
	private static JTextField txtColor;
	private static JTextField txtCDañada;
	private static JTextField txtTipo;
	private static JTextField txtCExistente;
	private static JTextField txtCDonada;

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		JFrame a = new JFrame("Pantalla de autorización de acceso");
		a.setIconImage(Toolkit.getDefaultToolkit().getImage(Agregar.class.getResource("/Imagenes/FLAG-2.png")));
		a.setTitle("Agregar articulo");
		a.getContentPane().setBackground(new Color(46, 139, 87));
		a.setResizable(false);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setSize(820, 600);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		a.setLocation(dim.width/2-a.getSize().width/2, dim.height/2-a.getSize().height/2);
		a.getContentPane().setLayout(null);
		a.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Inicio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.dispose();
			    Principal.main(args);
			}
		});
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setIcon(new ImageIcon(Agregar.class.getResource("/Imagenes/HOME.png")));
		btnNewButton.setFont(new Font("Consolas", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 100, 0));
		btnNewButton.setOpaque(true);
		btnNewButton.setBounds(0, 146, 198, 93);
		a.getContentPane().add(btnNewButton);
		
		JButton btnConsulta = new JButton("Consulta");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.dispose();
				Consulta.main(args);
			}
		});
		btnConsulta.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnConsulta.setHorizontalTextPosition(SwingConstants.CENTER);
		btnConsulta.setIcon(new ImageIcon(Agregar.class.getResource("/Imagenes/SEARCH.png")));
		btnConsulta.setOpaque(true);
		btnConsulta.setForeground(Color.WHITE);
		btnConsulta.setFont(new Font("Consolas", Font.BOLD, 15));
		btnConsulta.setBorder(null);
		btnConsulta.setBackground(new Color(0, 100, 0));
		btnConsulta.setBounds(199, 146, 198, 93);
		a.getContentPane().add(btnConsulta);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.dispose();
				Registro.main(args);
			}
		});
		btnRegistro.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRegistro.setIcon(new ImageIcon(Agregar.class.getResource("/Imagenes/REGISTER.png")));
		btnRegistro.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRegistro.setOpaque(true);
		btnRegistro.setForeground(new Color(0, 0, 0));
		btnRegistro.setFont(new Font("Consolas", Font.BOLD, 15));
		btnRegistro.setBorder(null);
		btnRegistro.setBackground(new Color(50, 205, 50));
		btnRegistro.setBounds(397, 146, 198, 93);
		a.getContentPane().add(btnRegistro);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.dispose();
				Autorizacion.main(args);
			}
		});
		btnSalir.setIcon(new ImageIcon(Agregar.class.getResource("/Imagenes/EXIT.png")));
		btnSalir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSalir.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnSalir.setOpaque(true);
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setFont(new Font("Consolas", Font.BOLD, 15));
		btnSalir.setBorder(null);
		btnSalir.setBackground(new Color(0, 100, 0));
		btnSalir.setBounds(596, 146, 198, 93);
		a.getContentPane().add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Agregar.class.getResource("/Imagenes/LOGO.gif")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 143, 132);
		a.getContentPane().add(lblNewLabel);
		
		JLabel lblTitulo = new JLabel("<html>Inventario de Mobiliario en el Batall\u00F3n del<br /> Ingeniero Ferroviario Coronel Casimiro Isava Oliver</html>");
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setFont(new Font("Consolas", Font.BOLD, 24));
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBounds(199, 21, 589, 103);
		a.getContentPane().add(lblTitulo);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblNewLabel_1.setBounds(49, 263, 55, 16);
		a.getContentPane().add(lblNewLabel_1);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblTipo.setBounds(49, 353, 55, 16);
		a.getContentPane().add(lblTipo);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setForeground(Color.WHITE);
		lblColor.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblColor.setBounds(315, 263, 55, 16);
		a.getContentPane().add(lblColor);
		
		JLabel lblCantidadExistente = new JLabel("Cantidad existente");
		lblCantidadExistente.setForeground(Color.WHITE);
		lblCantidadExistente.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblCantidadExistente.setBounds(315, 353, 100, 16);
		a.getContentPane().add(lblCantidadExistente);
		
		JLabel lblCantidadDonada = new JLabel("Cantidad da\u00F1ada");
		lblCantidadDonada.setForeground(Color.WHITE);
		lblCantidadDonada.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblCantidadDonada.setBounds(555, 263, 85, 16);
		a.getContentPane().add(lblCantidadDonada);
		
		JLabel lblCantidadDonada_1 = new JLabel("Cantidad donada");
		lblCantidadDonada_1.setForeground(Color.WHITE);
		lblCantidadDonada_1.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblCantidadDonada_1.setBounds(555, 353, 85, 16);
		a.getContentPane().add(lblCantidadDonada_1);
		
		txtNombre = new JTextField();
		txtNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtColor.requestFocus();
			}
		});
		txtNombre.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtNombre.setForeground(new Color(255, 255, 255));
		txtNombre.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtNombre.setBackground(new Color(46, 139, 87));
		txtNombre.setOpaque(true);
		txtNombre.setBounds(49, 279, 85, 28);
		a.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtColor = new JTextField();
		txtColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTipo.requestFocus();
			}
		});
		txtColor.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtColor.setOpaque(true);
		txtColor.setForeground(Color.WHITE);
		txtColor.setColumns(10);
		txtColor.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtColor.setBackground(new Color(46, 139, 87));
		txtColor.setBounds(312, 278, 85, 28);
		a.getContentPane().add(txtColor);
		
		txtCDañada = new JTextField();
		txtCDañada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtCDonada.requestFocus();
			}
		});
		txtCDañada.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtCDañada.setOpaque(true);
		txtCDañada.setForeground(Color.WHITE);
		txtCDañada.setColumns(10);
		txtCDañada.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtCDañada.setBackground(new Color(46, 139, 87));
		txtCDañada.setBounds(555, 278, 85, 28);
		a.getContentPane().add(txtCDañada);
		
		txtTipo = new JTextField();
		txtTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtCExistente.requestFocus();
			}
		});
		txtTipo.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtTipo.setOpaque(true);
		txtTipo.setForeground(Color.WHITE);
		txtTipo.setColumns(10);
		txtTipo.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtTipo.setBackground(new Color(46, 139, 87));
		txtTipo.setBounds(49, 374, 85, 28);
		a.getContentPane().add(txtTipo);
		
		txtCExistente = new JTextField();
		txtCExistente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtCDañada.requestFocus();
			}
		});
		txtCExistente.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtCExistente.setOpaque(true);
		txtCExistente.setForeground(Color.WHITE);
		txtCExistente.setColumns(10);
		txtCExistente.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtCExistente.setBackground(new Color(46, 139, 87));
		txtCExistente.setBounds(315, 373, 85, 28);
		a.getContentPane().add(txtCExistente);
		
		txtCDonada = new JTextField();
		txtCDonada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtNombre.getText().trim().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Necesita introducir un nombre", "Nombre obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtTipo.getText().trim().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Necesita introducir un tipo", "Tipo obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtColor.getText().trim().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Necesita introducir un color", "Color obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtCExistente.getText().trim().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Necesita introducir una cantidad existente", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(!txtCExistente.getText().matches("\\d+")){
					JOptionPane.showMessageDialog(null, "El campo cantidad existente solo acepta números", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(!txtCExistente.getText().trim().equalsIgnoreCase("")){
					if(Integer.parseInt(txtCExistente.getText()) <= 0){
						JOptionPane.showMessageDialog(null, "Solo números mayores a 0", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				if(!txtCDañada.getText().trim().equalsIgnoreCase("")){
					if(!txtCDañada.getText().matches("\\d+")){
						JOptionPane.showMessageDialog(null, "El campo cantidad dañada solo acepta números", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if(Integer.parseInt(txtCDañada.getText()) <= 0){
						JOptionPane.showMessageDialog(null, "Solo números mayores a 0", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				if(!txtCDonada.getText().trim().equalsIgnoreCase("")){
					if(!txtCDonada.getText().matches("\\d+")){
						JOptionPane.showMessageDialog(null, "El campo cantidad donada solo acepta números", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if(Integer.parseInt(txtCDonada.getText()) <= 0){
						JOptionPane.showMessageDialog(null, "Solo números mayores a 0", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				
				
				// Proceso
				Interaccion BD = new Interaccion();
						try {
							
							
							BD.Conectar("IUPSM");
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

									 
									 String resultado = "";
							Statement stmt = BD.conn.createStatement();
							stmt.execute(sqlCreate);
							 String selectSQL = "SELECT Nombre FROM Articulos WHERE Nombre = ?";
							  PreparedStatement preparedStatement = BD.conn.prepareStatement(selectSQL);
							  preparedStatement.setString(1, txtNombre.getText().toUpperCase());
							  ResultSet rs = preparedStatement.executeQuery();
							  while (rs.next()) {
							  	resultado = rs.getString("Nombre");
							  }
							  if(!resultado.toString().trim().equalsIgnoreCase("")){
								  JOptionPane.showMessageDialog(null, "Este artículo ya existe dentro del sistema", "Error en el sistema", JOptionPane.ERROR_MESSAGE);
								  return;
							  }
							  
							  String insertTableSQL = "INSERT INTO Articulos"
										+ "(Nombre, Tipo, Color, Existente, Dañada, Donada) VALUES"
										+ "(?, ?, ?, ?, ?, ?)";
							preparedStatement = BD.conn.prepareStatement(insertTableSQL);
							preparedStatement.setString(1, txtNombre.getText().toUpperCase());
							preparedStatement.setString(2, txtTipo.getText().toUpperCase());
							preparedStatement.setString(3, txtColor.getText().toUpperCase());
							preparedStatement.setInt(4, Integer.parseInt(txtCExistente.getText()));
							if(txtCDañada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(5, 0);
							if(!txtCDañada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(5, Integer.parseInt(txtCDañada.getText()));
							if(txtCDonada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(6, 0);
							if(!txtCDonada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(6, Integer.parseInt(txtCDonada.getText()));
							
								
							preparedStatement .executeUpdate();
							  
							  
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						finally{
							BD.Desconectar();
						}
						 
				
				BD.Desconectar();
				txtNombre.setText("");
				txtTipo.setText("");
				txtColor.setText("");
				txtCExistente.setText("");
				txtCDonada.setText("");
				txtCDañada.setText("");
				
				JOptionPane.showMessageDialog(null, "Producto agregado", "Producto Agregado", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		txtCDonada.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtCDonada.setOpaque(true);
		txtCDonada.setForeground(Color.WHITE);
		txtCDonada.setColumns(10);
		txtCDonada.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtCDonada.setBackground(new Color(46, 139, 87));
		txtCDonada.setBounds(555, 373, 85, 28);
		a.getContentPane().add(txtCDonada);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtNombre.getText().trim().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Necesita introducir un nombre", "Nombre obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtTipo.getText().trim().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Necesita introducir un tipo", "Tipo obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtColor.getText().trim().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Necesita introducir un color", "Color obligatorio", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtCExistente.getText().trim().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Necesita introducir una cantidad existente", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(!txtCExistente.getText().matches("\\d+")){
					JOptionPane.showMessageDialog(null, "El campo cantidad existente solo acepta números", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(!txtCExistente.getText().trim().equalsIgnoreCase("")){
					if(Integer.parseInt(txtCExistente.getText()) <= 0){
						JOptionPane.showMessageDialog(null, "Solo números mayores a 0", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				if(!txtCDañada.getText().trim().equalsIgnoreCase("")){
					if(!txtCDañada.getText().matches("\\d+")){
						JOptionPane.showMessageDialog(null, "El campo cantidad dañada solo acepta números", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if(Integer.parseInt(txtCDañada.getText()) <= 0){
						JOptionPane.showMessageDialog(null, "Solo números mayores a 0", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				if(!txtCDonada.getText().trim().equalsIgnoreCase("")){
					if(!txtCDonada.getText().matches("\\d+")){
						JOptionPane.showMessageDialog(null, "El campo cantidad donada solo acepta números", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if(Integer.parseInt(txtCDonada.getText()) <= 0){
						JOptionPane.showMessageDialog(null, "Solo números mayores a 0", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				
				
				// Proceso
				Interaccion BD = new Interaccion();
						try {
							
							
							BD.Conectar("IUPSM");
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

									 
									 String resultado = "";
							Statement stmt = BD.conn.createStatement();
							stmt.execute(sqlCreate);
							 String selectSQL = "SELECT Nombre FROM Articulos WHERE Nombre = ?";
							  PreparedStatement preparedStatement = BD.conn.prepareStatement(selectSQL);
							  preparedStatement.setString(1, txtNombre.getText().toUpperCase());
							  ResultSet rs = preparedStatement.executeQuery();
							  while (rs.next()) {
							  	resultado = rs.getString("Nombre");
							  }
							  if(!resultado.toString().trim().equalsIgnoreCase("")){
								  JOptionPane.showMessageDialog(null, "Este artículo ya existe dentro del sistema", "Error en el sistema", JOptionPane.ERROR_MESSAGE);
								  return;
							  }
							  
							  String insertTableSQL = "INSERT INTO Articulos"
										+ "(Nombre, Tipo, Color, Existente, Dañada, Donada) VALUES"
										+ "(?, ?, ?, ?, ?, ?)";
							preparedStatement = BD.conn.prepareStatement(insertTableSQL);
							preparedStatement.setString(1, txtNombre.getText().toUpperCase());
							preparedStatement.setString(2, txtTipo.getText().toUpperCase());
							preparedStatement.setString(3, txtColor.getText().toUpperCase());
							preparedStatement.setInt(4, Integer.parseInt(txtCExistente.getText()));
							if(txtCDañada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(5, 0);
							if(!txtCDañada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(5, Integer.parseInt(txtCDañada.getText()));
							if(txtCDonada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(6, 0);
							if(!txtCDonada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(6, Integer.parseInt(txtCDonada.getText()));
							
								
							preparedStatement .executeUpdate();
							  
							  
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						finally{
							BD.Desconectar();
						}
						 
				
				BD.Desconectar();
				
				txtNombre.setText("");
				txtTipo.setText("");
				txtColor.setText("");
				txtCExistente.setText("");
				txtCDonada.setText("");
				txtCDañada.setText("");
			
				JOptionPane.showMessageDialog(null, "Producto agregado", "Producto Agregado", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnAgregar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnAgregar.setBackground(new Color(255, 255, 255));
		btnAgregar.setForeground(new Color(34, 139, 34));
		btnAgregar.setBounds(305, 516, 90, 28);
		a.getContentPane().add(btnAgregar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNombre.setText("");
				txtTipo.setText("");
				txtColor.setText("");
				txtCExistente.setText("");
				txtCDonada.setText("");
				txtCDañada.setText("");
			}
		});
		btnBorrar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnBorrar.setBackground(new Color(255, 255, 255));
		btnBorrar.setForeground(new Color(34, 139, 34));
		btnBorrar.setBounds(401, 516, 90, 28);
		a.getContentPane().add(btnBorrar);
		
		
		
		a.setVisible(true);
		
		txtNombre.requestFocus();

	}
}

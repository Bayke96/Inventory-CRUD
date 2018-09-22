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

import org.apache.commons.lang3.text.WordUtils;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;

public class Modificar {
	private static JTextField txtNombre;
	private static JTextField txtTipo;
	private static JTextField txtColor;
	private static JTextField txtCExistente;
	private static JTextField txtCDañada;
	private static JTextField txtCDonada;

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		JFrame a = new JFrame("Pantalla de autorización de acceso");
		a.setIconImage(Toolkit.getDefaultToolkit().getImage(Modificar.class.getResource("/Imagenes/FLAG-2.png")));
		a.setTitle("Modificar articulo");
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
		btnNewButton.setIcon(new ImageIcon(Modificar.class.getResource("/Imagenes/HOME.png")));
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
		btnConsulta.setIcon(new ImageIcon(Modificar.class.getResource("/Imagenes/SEARCH.png")));
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
		btnRegistro.setIcon(new ImageIcon(Modificar.class.getResource("/Imagenes/REGISTER.png")));
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
		btnSalir.setIcon(new ImageIcon(Modificar.class.getResource("/Imagenes/EXIT.png")));
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
		lblNewLabel.setIcon(new ImageIcon(Modificar.class.getResource("/Imagenes/LOGO.gif")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 143, 132);
		a.getContentPane().add(lblNewLabel);
		
		JLabel lblTitulo = new JLabel("<html>Inventario de Mobiliario en el Batall\u00F3n del<br /> Ingeniero Ferroviario Coronel Casimiro Isava Oliver</html>");
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setFont(new Font("Consolas", Font.BOLD, 24));
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBounds(199, 21, 589, 103);
		a.getContentPane().add(lblTitulo);
		
		JLabel label = new JLabel("Nombre");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		label.setBounds(52, 334, 55, 16);
		a.getContentPane().add(label);
		
		txtNombre = new JTextField();
		txtNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtColor.requestFocus();
			}
		});
		txtNombre.setOpaque(true);
		txtNombre.setForeground(Color.WHITE);
		txtNombre.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtNombre.setColumns(10);
		txtNombre.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtNombre.setBackground(new Color(46, 139, 87));
		txtNombre.setBounds(52, 350, 85, 28);
		a.getContentPane().add(txtNombre);
		
		JLabel label_1 = new JLabel("Tipo");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		label_1.setBounds(52, 424, 55, 16);
		a.getContentPane().add(label_1);
		
		txtTipo = new JTextField();
		txtTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCExistente.requestFocus();
			}
		});
		txtTipo.setOpaque(true);
		txtTipo.setForeground(Color.WHITE);
		txtTipo.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtTipo.setColumns(10);
		txtTipo.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtTipo.setBackground(new Color(46, 139, 87));
		txtTipo.setBounds(52, 445, 85, 28);
		a.getContentPane().add(txtTipo);
		
		JLabel label_2 = new JLabel("Color");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		label_2.setBounds(318, 334, 55, 16);
		a.getContentPane().add(label_2);
		
		txtColor = new JTextField();
		txtColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTipo.requestFocus();
			}
		});
		txtColor.setOpaque(true);
		txtColor.setForeground(Color.WHITE);
		txtColor.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtColor.setColumns(10);
		txtColor.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtColor.setBackground(new Color(46, 139, 87));
		txtColor.setBounds(315, 349, 85, 28);
		a.getContentPane().add(txtColor);
		
		JLabel label_3 = new JLabel("Cantidad existente");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		label_3.setBounds(318, 424, 100, 16);
		a.getContentPane().add(label_3);
		
		txtCExistente = new JTextField();
		txtCExistente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCDañada.requestFocus();
			}
		});
		txtCExistente.setOpaque(true);
		txtCExistente.setForeground(Color.WHITE);
		txtCExistente.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtCExistente.setColumns(10);
		txtCExistente.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtCExistente.setBackground(new Color(46, 139, 87));
		txtCExistente.setBounds(318, 444, 85, 28);
		a.getContentPane().add(txtCExistente);
		
		JLabel label_4 = new JLabel("Cantidad da\u00F1ada");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		label_4.setBounds(558, 334, 85, 16);
		a.getContentPane().add(label_4);
		
		txtCDañada = new JTextField();
		txtCDañada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCDonada.requestFocus();
			}
		});
		txtCDañada.setOpaque(true);
		txtCDañada.setForeground(Color.WHITE);
		txtCDañada.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtCDañada.setColumns(10);
		txtCDañada.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtCDañada.setBackground(new Color(46, 139, 87));
		txtCDañada.setBounds(558, 349, 85, 28);
		a.getContentPane().add(txtCDañada);
		
		JLabel label_5 = new JLabel("Cantidad donada");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		label_5.setBounds(558, 424, 85, 16);
		a.getContentPane().add(label_5);
		
		JComboBox comboBox = new JComboBox();
		
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
					if(Integer.parseInt(txtCDañada.getText()) < 0){
						JOptionPane.showMessageDialog(null, "Solo números mayores a 0", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				if(!txtCDonada.getText().trim().equalsIgnoreCase("")){
					if(!txtCDonada.getText().matches("\\d+")){
						JOptionPane.showMessageDialog(null, "El campo cantidad donada solo acepta números", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if(Integer.parseInt(txtCDonada.getText()) < 0){
						JOptionPane.showMessageDialog(null, "Solo números mayores a 0", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				
				
				Interaccion BD = new Interaccion();
				
				BD.Conectar("IUPSM");
				
				// Proceso
				
				try{
					 String insertTableSQL = "UPDATE Articulos SET Nombre = ?, Tipo = ?, Color = ?, Existente = ?, Dañada = ?, Donada = ? WHERE Nombre = ?";
						PreparedStatement preparedStatement = BD.conn.prepareStatement(insertTableSQL);
						preparedStatement.setString(1, txtNombre.getText().toUpperCase());
						preparedStatement.setString(2, txtTipo.getText().toUpperCase());
						preparedStatement.setString(3, txtColor.getText().toUpperCase());
						preparedStatement.setInt(4, Integer.parseInt(txtCExistente.getText()));
						if(txtCDañada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(5, 0);
						if(!txtCDañada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(5, Integer.parseInt(txtCDañada.getText()));
						if(txtCDonada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(6, 0);
						if(!txtCDonada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(6, Integer.parseInt(txtCDonada.getText()));
						preparedStatement.setString(7, comboBox.getSelectedItem().toString().toUpperCase());
							
						preparedStatement .executeUpdate();
						BD.Desconectar();
				}
				catch(Exception yo){
					System.err.println(yo);
				}
				finally{
					BD.Desconectar();
				}
				
				txtNombre.setText("");
				txtTipo.setText("");
				txtColor.setText("");
				txtCExistente.setText("");
				txtCDonada.setText("");
				txtCDañada.setText("");
			
				JOptionPane.showMessageDialog(null, "Producto actualizado", "Producto actualizado", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		txtCDonada.setOpaque(true);
		txtCDonada.setForeground(Color.WHITE);
		txtCDonada.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtCDonada.setColumns(10);
		txtCDonada.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtCDonada.setBackground(new Color(46, 139, 87));
		txtCDonada.setBounds(558, 444, 85, 28);
		a.getContentPane().add(txtCDonada);
		
	
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
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
					if(Integer.parseInt(txtCDañada.getText()) < 0){
						JOptionPane.showMessageDialog(null, "Solo números mayores a 0", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				if(!txtCDonada.getText().trim().equalsIgnoreCase("")){
					if(!txtCDonada.getText().matches("\\d+")){
						JOptionPane.showMessageDialog(null, "El campo cantidad donada solo acepta números", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if(Integer.parseInt(txtCDonada.getText()) < 0){
						JOptionPane.showMessageDialog(null, "Solo números mayores a 0", "Cantidad obligatoria", JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				
				
				Interaccion BD = new Interaccion();
				
				BD.Conectar("IUPSM");
				
				// Proceso
				
				try{
					 String insertTableSQL = "UPDATE Articulos SET Nombre = ?, Tipo = ?, Color = ?, Existente = ?, Dañada = ?, Donada = ? WHERE Nombre = ?";
						PreparedStatement preparedStatement = BD.conn.prepareStatement(insertTableSQL);
						preparedStatement.setString(1, txtNombre.getText().toUpperCase());
						preparedStatement.setString(2, txtTipo.getText().toUpperCase());
						preparedStatement.setString(3, txtColor.getText().toUpperCase());
						preparedStatement.setInt(4, Integer.parseInt(txtCExistente.getText()));
						if(txtCDañada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(5, 0);
						if(!txtCDañada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(5, Integer.parseInt(txtCDañada.getText()));
						if(txtCDonada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(6, 0);
						if(!txtCDonada.getText().trim().equalsIgnoreCase("")) preparedStatement.setInt(6, Integer.parseInt(txtCDonada.getText()));
						preparedStatement.setString(7, comboBox.getSelectedItem().toString().toUpperCase());
							
						preparedStatement .executeUpdate();
						BD.Desconectar();
				}
				catch(Exception yo){
					System.err.println(yo);
				}
				finally{
					BD.Desconectar();
				}
				
				txtNombre.setText("");
				txtTipo.setText("");
				txtColor.setText("");
				txtCExistente.setText("");
				txtCDonada.setText("");
				txtCDañada.setText("");
			
				JOptionPane.showMessageDialog(null, "Producto actualizado", "Producto actualizado", JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		btnActualizar.setForeground(new Color(34, 139, 34));
		btnActualizar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnActualizar.setBackground(new Color(255, 255, 255));
		btnActualizar.setBounds(291, 513, 90, 28);
		a.getContentPane().add(btnActualizar);
		
		
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setForeground(Color.WHITE);
		lblProducto.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblProducto.setBounds(342, 251, 55, 16);
		a.getContentPane().add(lblProducto);
		
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Elegir"}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interaccion BD = new Interaccion();
				
				try{
					BD.Conectar("IUPSM");
					String Nombre = "", Tipo = "", Color = "";
					int CExistente = 0, CDañada = 0, CDonada = 0;
					 String selectSQL = "SELECT Nombre, Tipo, Color, Existente, Dañada, Donada FROM Articulos WHERE Nombre = ?";
					  PreparedStatement preparedStatement = BD.conn.prepareStatement(selectSQL);
					  preparedStatement.setString(1, comboBox.getSelectedItem().toString().toUpperCase());
					  ResultSet rs = preparedStatement.executeQuery();
					  while (rs.next()) {
					  	Nombre = rs.getString("Nombre");
					  	Tipo = rs.getString("Tipo");
					  	Color = rs.getString("Color");
					  	CExistente = rs.getInt("Existente");
					  	CDañada = rs.getInt("Dañada");
					  	CDonada = rs.getInt("Donada");
					  }
					 
					  txtNombre.setText(WordUtils.capitalizeFully(Nombre.toLowerCase()));
					  txtTipo.setText(WordUtils.capitalizeFully(Tipo.toLowerCase()));
					  txtColor.setText(WordUtils.capitalizeFully(Color.toLowerCase()));
					  txtCExistente.setText(Integer.toString(CExistente));
					  txtCDañada.setText(Integer.toString(CDañada));
					  txtCDonada.setText(Integer.toString(CDonada));
				}
				catch(Exception e2){
					System.err.println(e2);
				}
				finally{
					BD.Desconectar();
				}
			}
		});
		comboBox.setBorder(null);
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setBackground(new Color(60, 179, 113));
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		comboBox.setBounds(284, 271, 164, 26);
		a.getContentPane().add(comboBox);
		
		
		Interaccion BD = new Interaccion();
		try {
			
			
			BD.Conectar("IUPSM");
		

					 
				
		
			 String selectSQL = "SELECT Nombre FROM Articulos";
			  PreparedStatement preparedStatement = BD.conn.prepareStatement(selectSQL);
			  ResultSet rs = preparedStatement.executeQuery(selectSQL);
			  while (rs.next()) {
			  	comboBox.addItem(WordUtils.capitalizeFully(rs.getString("Nombre").toLowerCase()));
			  }
			 
			  
			 
			  
			  
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally{
			BD.Desconectar();
		}
		 

BD.Desconectar();


JButton btnBorrar = new JButton("Borrar");
btnBorrar.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		txtNombre.setText("");
		txtTipo.setText("");
		txtColor.setText("");
		txtCExistente.setText("");
		txtCDonada.setText("");
		txtCDañada.setText("");
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Elegir"}));
		
		
		Interaccion BD = new Interaccion();
		try {
			
			
			BD.Conectar("IUPSM");
		

					 
				
		
			 String selectSQL = "SELECT Nombre FROM Articulos";
			  PreparedStatement preparedStatement = BD.conn.prepareStatement(selectSQL);
			  ResultSet rs = preparedStatement.executeQuery(selectSQL);
			  while (rs.next()) {
			  	comboBox.addItem(WordUtils.capitalizeFully(rs.getString("Nombre").toLowerCase()));
			  }
			 
			  
			 
			  
			  
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally{
			BD.Desconectar();
		}
	}
});
btnBorrar.setForeground(new Color(34, 139, 34));
btnBorrar.setFont(new Font("SansSerif", Font.BOLD, 12));
btnBorrar.setBackground(new Color(255, 255, 255));
btnBorrar.setBounds(387, 513, 90, 28);
a.getContentPane().add(btnBorrar);
		
		
		a.setVisible(true);

	}
}

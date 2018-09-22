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

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import org.apache.commons.lang3.text.WordUtils;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Eliminar {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		JFrame a = new JFrame("Pantalla de autorización de acceso");
		a.setIconImage(Toolkit.getDefaultToolkit().getImage(Eliminar.class.getResource("/Imagenes/FLAG-2.png")));
		a.setTitle("Eliminar articulo");
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
		btnNewButton.setIcon(new ImageIcon(Eliminar.class.getResource("/Imagenes/HOME.png")));
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
		btnConsulta.setIcon(new ImageIcon(Eliminar.class.getResource("/Imagenes/SEARCH.png")));
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
		btnRegistro.setIcon(new ImageIcon(Eliminar.class.getResource("/Imagenes/REGISTER.png")));
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
		btnSalir.setIcon(new ImageIcon(Eliminar.class.getResource("/Imagenes/EXIT.png")));
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
		lblNewLabel.setIcon(new ImageIcon(Eliminar.class.getResource("/Imagenes/LOGO.gif")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 143, 132);
		a.getContentPane().add(lblNewLabel);
		
		JLabel lblTitulo = new JLabel("<html>Inventario de Mobiliario en el Batall\u00F3n del<br /> Ingeniero Ferroviario Coronel Casimiro Isava Oliver</html>");
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setFont(new Font("Consolas", Font.BOLD, 24));
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBounds(199, 21, 589, 103);
		a.getContentPane().add(lblTitulo);
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setForeground(Color.WHITE);
		lblProducto.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblProducto.setBounds(346, 276, 55, 16);
		a.getContentPane().add(lblProducto);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Elegir"}));
		comboBox.setForeground(Color.WHITE);
		comboBox.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		comboBox.setBorder(null);
		comboBox.setBackground(new Color(60, 179, 113));
		comboBox.setBounds(288, 296, 164, 26);
		a.getContentPane().add(comboBox);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblNombre.setBounds(56, 359, 55, 16);
		a.getContentPane().add(lblNombre);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setForeground(Color.WHITE);
		lblColor.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblColor.setBounds(322, 359, 55, 16);
		a.getContentPane().add(lblColor);
		
		JLabel lblCantidadDañada = new JLabel("Cantidad da\u00F1ada");
		lblCantidadDañada.setForeground(Color.WHITE);
		lblCantidadDañada.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblCantidadDañada.setBounds(562, 359, 85, 16);
		a.getContentPane().add(lblCantidadDañada);
		
		JLabel lblCantidadDonada = new JLabel("Cantidad donada");
		lblCantidadDonada.setForeground(Color.WHITE);
		lblCantidadDonada.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblCantidadDonada.setBounds(562, 449, 85, 16);
		a.getContentPane().add(lblCantidadDonada);
		
		JLabel lblCantidadExistente = new JLabel("Cantidad existente");
		lblCantidadExistente.setForeground(Color.WHITE);
		lblCantidadExistente.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblCantidadExistente.setBounds(322, 449, 100, 16);
		a.getContentPane().add(lblCantidadExistente);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblTipo.setBounds(56, 449, 55, 16);
		a.getContentPane().add(lblTipo);
		
		
		
		
		JLabel txtNombre = new JLabel("");
		txtNombre.setForeground(Color.WHITE);
		txtNombre.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		txtNombre.setBounds(67, 377, 131, 16);
		a.getContentPane().add(txtNombre);
		
		JLabel txtColor = new JLabel("");
		txtColor.setForeground(Color.WHITE);
		txtColor.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		txtColor.setBounds(332, 377, 131, 16);
		a.getContentPane().add(txtColor);
		
		JLabel txtCDañada = new JLabel("");
		txtCDañada.setForeground(Color.WHITE);
		txtCDañada.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		txtCDañada.setBounds(572, 377, 131, 16);
		a.getContentPane().add(txtCDañada);
		
		JLabel txtTipo = new JLabel("");
		txtTipo.setForeground(Color.WHITE);
		txtTipo.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		txtTipo.setBounds(67, 467, 131, 16);
		a.getContentPane().add(txtTipo);
		
		JLabel txtCExistente = new JLabel("");
		txtCExistente.setForeground(Color.WHITE);
		txtCExistente.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		txtCExistente.setBounds(332, 467, 131, 16);
		a.getContentPane().add(txtCExistente);
		
		JLabel txtCDonada = new JLabel("");
		txtCDonada.setForeground(Color.WHITE);
		txtCDonada.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		txtCDonada.setBounds(572, 467, 131, 16);
		a.getContentPane().add(txtCDonada);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().toString().equalsIgnoreCase("Elegir")){
					JOptionPane.showMessageDialog(null, "No ha seleccionado un articulo", "Error de selección", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				
				Interaccion BD = new Interaccion();
				BD.Conectar("IUPSM");
				try{
					 String insertTableSQL = "DELETE FROM Articulos where Nombre = ?";
						PreparedStatement preparedStatement = BD.conn.prepareStatement(insertTableSQL);
						preparedStatement.setString(1, comboBox.getSelectedItem().toString().toUpperCase());
						preparedStatement .executeUpdate();
				}
				catch(Exception ae){
					ae.printStackTrace();
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
			
				JOptionPane.showMessageDialog(null, "Producto eliminado", "Producto actualizado", JOptionPane.INFORMATION_MESSAGE);
				
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Elegir"}));
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
		
		btnEliminar.setForeground(new Color(34, 139, 34));
		btnEliminar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnEliminar.setBackground(new Color(255, 255, 255));
		btnEliminar.setBounds(301, 522, 164, 28);
		a.getContentPane().add(btnEliminar);
		
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

		
		
		a.setVisible(true);

	}
}

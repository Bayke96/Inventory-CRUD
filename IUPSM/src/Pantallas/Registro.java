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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class Registro {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		JFrame a = new JFrame("Pantalla de autorización de acceso");
		a.setIconImage(Toolkit.getDefaultToolkit().getImage(Registro.class.getResource("/Imagenes/FLAG-2.png")));
		a.setTitle("Menu Principal");
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
		btnNewButton.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/HOME.png")));
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
		btnConsulta.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/SEARCH.png")));
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
		btnRegistro.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/REGISTER.png")));
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
		btnSalir.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/EXIT.png")));
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
		lblNewLabel.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/LOGO.gif")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 143, 132);
		a.getContentPane().add(lblNewLabel);
		
		JLabel lblTitulo = new JLabel("<html>Inventario de Mobiliario en el Batall\u00F3n del<br /> Ingeniero Ferroviario Coronel Casimiro Isava Oliver</html>");
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setFont(new Font("Consolas", Font.BOLD, 24));
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBounds(199, 21, 589, 103);
		a.getContentPane().add(lblTitulo);
		
		JButton btnAgregar = new JButton(" Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.dispose();
				Agregar.main(args);
			}
		});
		btnAgregar.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/PRODUCT1.png")));
		btnAgregar.setFont(new Font("Consolas", Font.BOLD, 18));
		btnAgregar.setBackground(new Color(255, 255, 0));
		btnAgregar.setForeground(new Color(0, 0, 0));
		btnAgregar.setBounds(20, 252, 750, 93);
		a.getContentPane().add(btnAgregar);
		
		JButton btnModificar = new JButton(" Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.dispose();
				Modificar.main(args);
			}
		});
		btnModificar.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/PRODUCT2.png")));
		btnModificar.setFont(new Font("Consolas", Font.BOLD, 18));
		btnModificar.setBackground(new Color(0, 0, 205));
		btnModificar.setForeground(new Color(255, 255, 255));
		btnModificar.setBounds(20, 357, 750, 93);
		a.getContentPane().add(btnModificar);
		
		JButton btnEliminar = new JButton(" Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.dispose();
				Eliminar.main(args);
			}
		});
		btnEliminar.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/INVENTORY3.png")));
		btnEliminar.setFont(new Font("Consolas", Font.BOLD, 18));
		btnEliminar.setBackground(new Color(178, 34, 34));
		btnEliminar.setForeground(new Color(255, 255, 255));
		btnEliminar.setBounds(20, 462, 750, 93);
		a.getContentPane().add(btnEliminar);
		
		a.setVisible(true);

	}
}

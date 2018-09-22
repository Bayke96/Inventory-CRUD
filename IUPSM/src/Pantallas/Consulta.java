package Pantallas;

import javax.swing.JFrame;
import javax.print.PrintService;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.html.WebColors;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.prism.impl.Disposer.Record;
import com.toedter.calendar.JDateChooser;

import javafx.scene.control.Cell;
import net.sf.jasperreports.engine.export.tabulator.Table;

import javax.swing.JTable;
import javax.swing.JTable.PrintMode;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.apache.commons.lang3.text.WordUtils;


public class Consulta {
	private static JTextField txtArticulo;
	private static JTextField txtTipo;
	private static JTextField txtColor;
	private static JTable table;
	
	
	

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		JFrame a = new JFrame("Pantalla de autorización de acceso");
		a.setIconImage(Toolkit.getDefaultToolkit().getImage(Consulta.class.getResource("/Imagenes/FLAG-2.png")));
		a.setTitle("Menu de consultas");
		a.getContentPane().setBackground(new Color(46, 139, 87));
		a.setResizable(false);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setSize(820, 624);
		
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
		btnNewButton.setIcon(new ImageIcon(Consulta.class.getResource("/Imagenes/HOME.png")));
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
		btnConsulta.setIcon(new ImageIcon(Consulta.class.getResource("/Imagenes/SEARCH.png")));
		btnConsulta.setOpaque(true);
		btnConsulta.setForeground(new Color(0, 0, 0));
		btnConsulta.setFont(new Font("Consolas", Font.BOLD, 15));
		btnConsulta.setBorder(null);
		btnConsulta.setBackground(new Color(50, 205, 50));
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
		btnRegistro.setIcon(new ImageIcon(Consulta.class.getResource("/Imagenes/REGISTER.png")));
		btnRegistro.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRegistro.setOpaque(true);
		btnRegistro.setForeground(Color.WHITE);
		btnRegistro.setFont(new Font("Consolas", Font.BOLD, 15));
		btnRegistro.setBorder(null);
		btnRegistro.setBackground(new Color(0, 100, 0));
		btnRegistro.setBounds(397, 146, 198, 93);
		a.getContentPane().add(btnRegistro);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.dispose();
				Autorizacion.main(args);
			}
		});
		btnSalir.setIcon(new ImageIcon(Consulta.class.getResource("/Imagenes/EXIT.png")));
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
		lblNewLabel.setIcon(new ImageIcon(Consulta.class.getResource("/Imagenes/LOGO.gif")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 143, 132);
		a.getContentPane().add(lblNewLabel);
		
		JLabel lblTitulo = new JLabel("<html>Inventario de Mobiliario en el Batall\u00F3n del<br /> Ingeniero Ferroviario Coronel Casimiro Isava Oliver</html>");
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setFont(new Font("Consolas", Font.BOLD, 24));
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBounds(199, 21, 589, 103);
		a.getContentPane().add(lblTitulo);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setFont(new Font("Consolas", Font.BOLD, 12));
		lblFecha.setForeground(new Color(255, 255, 255));
		lblFecha.setBounds(60, 289, 79, 16);
		a.getContentPane().add(lblFecha);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Consolas", Font.BOLD, 12));
		lblTipo.setForeground(new Color(255, 255, 255));
		lblTipo.setBounds(334, 289, 79, 16);
		a.getContentPane().add(lblTipo);
		
		JLabel lblArticulo = new JLabel("Art\u00EDculo");
		lblArticulo.setFont(new Font("Consolas", Font.BOLD, 12));
		lblArticulo.setForeground(new Color(255, 255, 255));
		lblArticulo.setBounds(60, 347, 79, 16);
		a.getContentPane().add(lblArticulo);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setFont(new Font("Consolas", Font.BOLD, 12));
		lblColor.setForeground(new Color(255, 255, 255));
		lblColor.setBounds(334, 347, 79, 16);
		a.getContentPane().add(lblColor);
		
		txtArticulo = new JTextField();
		txtArticulo.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtArticulo.setHorizontalAlignment(SwingConstants.CENTER);
		txtArticulo.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtArticulo.setBackground(new Color(46, 139, 87));
		txtArticulo.setOpaque(true);
		txtArticulo.setForeground(new Color(255, 255, 255));
		txtArticulo.setBounds(131, 339, 122, 28);
		a.getContentPane().add(txtArticulo);
		txtArticulo.setColumns(10);
		
		txtTipo = new JTextField();
		txtTipo.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtTipo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTipo.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtTipo.setBackground(new Color(46, 139, 87));
		txtTipo.setOpaque(true);
		txtTipo.setForeground(new Color(255, 255, 255));
		txtTipo.setBounds(380, 281, 122, 28);
		a.getContentPane().add(txtTipo);
		txtTipo.setColumns(10);
		
		txtColor = new JTextField();
		txtColor.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtColor.setHorizontalAlignment(SwingConstants.CENTER);
		txtColor.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtColor.setBackground(new Color(46, 139, 87));
		txtColor.setOpaque(true);
		txtColor.setForeground(new Color(255, 255, 255));
		txtColor.setBounds(380, 339, 122, 28);
		a.getContentPane().add(txtColor);
		txtColor.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(131, 281, 132, 28);
		dateChooser.setMaxSelectableDate(new Date());
		a.getContentPane().add(dateChooser);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtArticulo.getText().trim().equalsIgnoreCase("") && txtTipo.getText().trim().equalsIgnoreCase("") && txtColor.getText().trim().equalsIgnoreCase("")
						&& ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Debe seleccionar un parametro para buscar", "Error de busqueda", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				
				Interaccion BD = new Interaccion();
				
				try{
					BD.Conectar("IUPSM");
					int contador = 1;
					String selectSQL = "";
					ResultSet rs = null;
					PreparedStatement preparedStatement = null;
					 DefaultTableModel model = (DefaultTableModel) table.getModel();
					 
					 
					 
					
					 if(!txtTipo.getText().trim().equalsIgnoreCase("")){
						 selectSQL = "SELECT Fecha, Codigo, Nombre, Tipo, Color, Existente, Dañada, Donada FROM Articulos WHERE Tipo = ?";
						 preparedStatement = BD.conn.prepareStatement(selectSQL);
						  preparedStatement.setString(1, txtTipo.getText().toUpperCase());
						
					 }
					
					 
					 if(!txtColor.getText().trim().equalsIgnoreCase("")){
						 selectSQL = "SELECT Fecha, Codigo, Nombre, Tipo, Color, Existente, Dañada, Donada FROM Articulos WHERE Color = ?";
						 preparedStatement = BD.conn.prepareStatement(selectSQL);
						  preparedStatement.setString(1, txtColor.getText().toUpperCase());
						 
					 }
					 if(!txtArticulo.getText().trim().equalsIgnoreCase("")){
						 selectSQL = "SELECT Fecha, Codigo, Nombre, Tipo, Color, Existente, Dañada, Donada FROM Articulos WHERE Nombre = ?";
						 preparedStatement = BD.conn.prepareStatement(selectSQL);
						  preparedStatement.setString(1, txtArticulo.getText().toUpperCase());
						 
					 }
					 if(!((JTextField)dateChooser.getDateEditor().getUiComponent()).getText().equalsIgnoreCase("")){
						 selectSQL = "SELECT Fecha, Codigo, Nombre, Tipo, Color, Existente, Dañada, Donada FROM Articulos WHERE Fecha LIKE ?";
						 preparedStatement = BD.conn.prepareStatement(selectSQL);
						  preparedStatement.setString(1, "%" + ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText() + "%");
						 
					 }
					 if(!txtTipo.getText().trim().equalsIgnoreCase("") && !txtColor.getText().trim().equalsIgnoreCase("")){
						 selectSQL = "SELECT Fecha, Codigo, Nombre, Tipo, Color, Existente, Dañada, Donada FROM Articulos WHERE Tipo = ? AND Color = ?";
						 preparedStatement = BD.conn.prepareStatement(selectSQL);
						  preparedStatement.setString(1, txtTipo.getText().toUpperCase());
						  preparedStatement.setString(2, txtColor.getText().toUpperCase());
						
					 }
					 if(!txtTipo.getText().trim().equalsIgnoreCase("") && !txtArticulo.getText().trim().equalsIgnoreCase("")){
						 selectSQL = "SELECT Fecha, Codigo, Nombre, Tipo, Color, Existente, Dañada, Donada FROM Articulos WHERE Tipo = ? AND Nombre = ?";
						 preparedStatement = BD.conn.prepareStatement(selectSQL);
						  preparedStatement.setString(1, txtTipo.getText().toUpperCase());
						  preparedStatement.setString(2, txtArticulo.getText().toUpperCase());
						
					 }
					 if(!txtTipo.getText().trim().equalsIgnoreCase("") && !((JTextField)dateChooser.getDateEditor().getUiComponent()).getText().equalsIgnoreCase("")){
						 selectSQL = "SELECT Fecha, Codigo, Nombre, Tipo, Color, Existente, Dañada, Donada FROM Articulos WHERE Tipo = ? AND FECHA LIKE ?";
						 preparedStatement = BD.conn.prepareStatement(selectSQL);
						  preparedStatement.setString(1, txtTipo.getText().toUpperCase());
						  preparedStatement.setString(2, "%" + ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText() + "%");
						 
					 }
					 
					 if(!txtTipo.getText().trim().equalsIgnoreCase("") && !txtColor.getText().trim().equalsIgnoreCase("") && !txtArticulo.getText().trim().equalsIgnoreCase("")){
						 selectSQL = "SELECT Fecha, Codigo, Nombre, Tipo, Color, Existente, Dañada, Donada FROM Articulos WHERE Tipo = ? AND Color = ? AND Nombre = ?";
						preparedStatement = BD.conn.prepareStatement(selectSQL);
						  preparedStatement.setString(1, txtTipo.getText().toUpperCase());
						  preparedStatement.setString(2, txtColor.getText().toUpperCase());
						  preparedStatement.setString(3, txtArticulo.getText().toUpperCase());
						
					 }
					 if(!((JTextField)dateChooser.getDateEditor().getUiComponent()).getText().equalsIgnoreCase("") && !txtColor.getText().trim().equalsIgnoreCase("") && !txtArticulo.getText().trim().equalsIgnoreCase("")){
						 selectSQL = "SELECT Fecha, Codigo, Nombre, Tipo, Color, Existente, Dañada, Donada FROM Articulos WHERE Tipo = ? AND Color = ? AND FECHA LIKE ?";
						preparedStatement = BD.conn.prepareStatement(selectSQL);
						  preparedStatement.setString(1, txtTipo.getText().toUpperCase());
						  preparedStatement.setString(2, txtColor.getText().toUpperCase());
						  preparedStatement.setString(3, "%" + ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText() + "%");
						
					 }
					 if(!((JTextField)dateChooser.getDateEditor().getUiComponent()).getText().equalsIgnoreCase("") && !txtTipo.getText().trim().equalsIgnoreCase("") && !txtArticulo.getText().trim().equalsIgnoreCase("")){
						 selectSQL = "SELECT Fecha, Codigo, Nombre, Tipo, Color, Existente, Dañada, Donada FROM Articulos WHERE Tipo = ? AND Nombre = ? AND FECHA LIKE ?";
						preparedStatement = BD.conn.prepareStatement(selectSQL);
						  preparedStatement.setString(1, txtTipo.getText().toUpperCase());
						  preparedStatement.setString(2, txtArticulo.getText().toUpperCase());
						  preparedStatement.setString(3, "%" + ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText() + "%");
						
					 }
					
					 
					 
					 // busqueda final
					 
					 if(!txtTipo.getText().trim().equalsIgnoreCase("") && !txtColor.getText().trim().equalsIgnoreCase("") && !txtArticulo.getText().trim().equalsIgnoreCase("")
							 && !((JTextField)dateChooser.getDateEditor().getUiComponent()).getText().equalsIgnoreCase("")){
						 selectSQL = "SELECT Fecha, Codigo, Nombre, Tipo, Color, Existente, Dañada, Donada FROM Articulos WHERE Tipo = ? AND Color = ? AND Nombre = ?"
						 		+ "AND FECHA LIKE ?";
						preparedStatement = BD.conn.prepareStatement(selectSQL);
						  preparedStatement.setString(1, txtTipo.getText().toUpperCase());
						  preparedStatement.setString(2, txtColor.getText().toUpperCase());
						  preparedStatement.setString(3, txtArticulo.getText().toUpperCase());
						  preparedStatement.setString(4, "%" + ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText() + "%");
						
					 }
					 
					
					 for(int i = model.getRowCount() - 1; i >= 0; i--){
						 model.removeRow(i);
					 }
					 
					 rs = preparedStatement.executeQuery();
					  while (rs.next()) {
						  String Fecha = rs.getString("Fecha");
						  int Codigo = rs.getInt("Codigo");
						  String Nombre = WordUtils.capitalizeFully(rs.getString("Nombre").toLowerCase());
						  String Tipo = WordUtils.capitalizeFully(rs.getString("Tipo").toLowerCase());
						  String Color = WordUtils.capitalizeFully(rs.getString("Color").toLowerCase());
						  int Existente = rs.getInt("Existente");
						  int Dañada = rs.getInt("Dañada");
						  int Donada = rs.getInt("Donada");
						  model.addRow(new Object[]{contador, Fecha, Codigo, Nombre, Tipo, Color, Existente, Dañada, Donada});
						  contador++;
					  }
					 
					  DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
					  
					  centerRenderer = new DefaultTableCellRenderer();
					  centerRenderer.setHorizontalAlignment( JLabel.CENTER );
					  
					  table.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
					  table.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
					  table.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
					  table.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
					  table.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
					  table.getColumnModel().getColumn(6).setCellRenderer( centerRenderer );
					  table.getColumnModel().getColumn(7).setCellRenderer( centerRenderer );
					  table.getColumnModel().getColumn(8).setCellRenderer( centerRenderer );
					  table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
					
				}
				catch(Exception e2){
					System.err.println(e2);
				}
				finally{
					BD.Desconectar();
				}
				
			}
		});
		btnBuscar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnBuscar.setBackground(new Color(34, 139, 34));
		btnBuscar.setForeground(new Color(255, 255, 255));
		btnBuscar.setBounds(597, 311, 90, 28);
		a.getContentPane().add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(true);
		scrollPane.setBackground(new Color(60, 179, 113));
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(6, 396, 782, 170);
		a.getContentPane().add(scrollPane);
		
		scrollPane.setViewportBorder(null);
        scrollPane.getViewport().setBackground(new Color(46, 139, 87));
		
		table = new JTable();
		table.setShowHorizontalLines(true);
		table.setFont(new Font("SansSerif", Font.BOLD, 12));
		table.setForeground(Color.WHITE);
		table.setOpaque(false);
		table.setGridColor(new Color(255, 255, 255));
		table.setFocusable(false);
		table.setBorder(null);
		table.setBackground(new Color(46, 139, 87));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"<html><b>N\u00B0</b></html>", "<html><b>Fecha</b></html>", "<html><b>C\u00F3digo</b></html>", "<html><b>Art\u00EDculo</b></html>", "<html><b>Tipo</b></html>", "<html><b>Color</b></html>", "<html><b>C. Existente</b></html>", "<html><b>C. Da\u00F1ada</b></html>", "<html><b>C. Donada</b></html>"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(35);
		table.getColumnModel().getColumn(0).setMaxWidth(35);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(60);
		table.getColumnModel().getColumn(2).setMaxWidth(60);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(6).setResizable(false);
		table.getColumnModel().getColumn(6).setPreferredWidth(77);
		table.getColumnModel().getColumn(6).setMaxWidth(100);
		table.getColumnModel().getColumn(7).setResizable(false);
		table.getColumnModel().getColumn(7).setPreferredWidth(69);
		table.getColumnModel().getColumn(7).setMaxWidth(69);
		table.getColumnModel().getColumn(8).setResizable(false);
		table.getColumnModel().getColumn(8).setPreferredWidth(69);
		table.getColumnModel().getColumn(8).setMaxWidth(69);
		scrollPane.setViewportView(table);
		
		((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer())
	    .setHorizontalAlignment(JLabel.CENTER);
		
		table.setRowSelectionAllowed(false);
		
		JButton btnReporte = new JButton("<html>Generar<br /><center>reporte</center></html>");
		btnReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				  Document document = new Document();
				    // step 2
				    try {
						PdfWriter.getInstance(document, new FileOutputStream("C://reporte.pdf"));
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (DocumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    // step 3
				    document.open();
				    // step 4
				    
				    LocalDateTime ldt = LocalDateTime.now();
				    
				    Paragraph parrafo1 = new Paragraph("República Bolivariana De Venezuela\n\n");
				    Paragraph parrafo2 = new Paragraph("Batallón del Ingeniero Ferroviario");
				    Paragraph parrafo3 = new Paragraph("Coronel Casimiro Isava Oliver\n\n");
				    
				    Paragraph paragraph = new Paragraph("Inventario - " + DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a", Locale.ENGLISH).format(ldt) + "\n\n");
				    paragraph.setAlignment(1);
				    parrafo1.setAlignment(1);
				    parrafo2.setAlignment(1);
				    parrafo3.setAlignment(1);
				    
				    try {
				    	document.add(parrafo1);
				    	document.add(parrafo2);
				    	document.add(parrafo3);
						document.add(paragraph);
					} catch (DocumentException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				    

				PdfPTable tabla = new PdfPTable(9);
				
				com.itextpdf.text.Font f1 = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 8);
				f1.setColor(BaseColor.WHITE);
				
				com.itextpdf.text.Font f2 = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 8);
				f2.setColor(BaseColor.BLACK);
				
				PdfPCell cell = new PdfPCell(new Phrase("N° Item", f1));
				cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				
				BaseColor myColor = WebColors.getRGBColor("#228B22");
				BaseColor blanco = WebColors.getRGBColor("#FFFFFF");
				cell.setBorder(Rectangle.BOTTOM);
				cell.setBackgroundColor(myColor);
				
				tabla.addCell(cell);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell = new PdfPCell(new Phrase("Fecha Ingreso", f1));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				myColor = WebColors.getRGBColor("#228B22");
				cell.setBorder(Rectangle.BOTTOM);
				cell.setBackgroundColor(myColor);
				
				tabla.addCell(cell);
				cell = new PdfPCell(new Phrase("Código", f1));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				myColor = WebColors.getRGBColor("#228B22");
				cell.setBorder(Rectangle.BOTTOM);
				cell.setBackgroundColor(myColor);
				
				tabla.addCell(cell);
				cell = new PdfPCell(new Phrase("Artículo", f1));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				myColor = WebColors.getRGBColor("#228B22");
				cell.setBorder(Rectangle.BOTTOM);
				cell.setBackgroundColor(myColor);
				
				tabla.addCell(cell);
				cell = new PdfPCell(new Phrase("Tipo", f1));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				myColor = WebColors.getRGBColor("#228B22");
				cell.setBorder(Rectangle.BOTTOM);
				cell.setBackgroundColor(myColor);
				
				tabla.addCell(cell);
				cell = new PdfPCell(new Phrase("Color", f1));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				myColor = WebColors.getRGBColor("#228B22");
				cell.setBorder(Rectangle.BOTTOM);
				cell.setBackgroundColor(myColor);
				
				tabla.addCell(cell);
				cell = new PdfPCell(new Phrase("Existentes", f1));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				myColor = WebColors.getRGBColor("#228B22");
				cell.setBorder(Rectangle.BOTTOM);
				cell.setBackgroundColor(myColor);
				
				tabla.addCell(cell);
				cell = new PdfPCell(new Phrase("Dañadas", f1));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				myColor = WebColors.getRGBColor("#228B22");
				cell.setBorder(Rectangle.BOTTOM);
				cell.setBackgroundColor(myColor);
				
				tabla.addCell(cell);
				cell = new PdfPCell(new Phrase("Donadas", f1));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				myColor = WebColors.getRGBColor("#228B22");
				cell.setBorder(Rectangle.BOTTOM);
				cell.setBackgroundColor(myColor);
				
				tabla.addCell(cell);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				
				
				
				
				
				
				
				   for(int aw=0;aw<table.getRowCount() ; aw++){
					   cell = new PdfPCell(new Phrase(table.getValueAt(aw, 0).toString(), f2));
					   cell.setBorder(Rectangle.BOTTOM);
					   cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					   tabla.addCell(cell);
					   cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					   cell = new PdfPCell(new Phrase(table.getValueAt(aw, 1).toString(), f2));
					   cell.setBorder(Rectangle.BOTTOM);
					   cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					   tabla.addCell(cell);
					   cell = new PdfPCell(new Phrase(table.getValueAt(aw, 2).toString(), f2));
					   cell.setBorder(Rectangle.BOTTOM);
					   cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					   tabla.addCell(cell);
					   cell = new PdfPCell(new Phrase(table.getValueAt(aw, 3).toString(), f2));
					   cell.setBorder(Rectangle.BOTTOM);
					   cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					   tabla.addCell(cell);
					   cell = new PdfPCell(new Phrase(table.getValueAt(aw, 4).toString(), f2));
					   cell.setBorder(Rectangle.BOTTOM);
					   cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					   tabla.addCell(cell);
					   cell = new PdfPCell(new Phrase(table.getValueAt(aw, 5).toString(), f2));
					   cell.setBorder(Rectangle.BOTTOM);
					   cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					   tabla.addCell(cell);
					   cell = new PdfPCell(new Phrase(table.getValueAt(aw, 6).toString(), f2));
					   cell.setBorder(Rectangle.BOTTOM);
					   cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					   tabla.addCell(cell);
					   cell = new PdfPCell(new Phrase(table.getValueAt(aw, 7).toString(), f2));
					   cell.setBorder(Rectangle.BOTTOM);
					   cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					   tabla.addCell(cell);
					   cell = new PdfPCell(new Phrase(table.getValueAt(aw, 8).toString(), f2));
					   cell.setBorder(Rectangle.BOTTOM);
					   cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					   tabla.addCell(cell);
				    }

				   cell.setVerticalAlignment(Element.ALIGN_MIDDLE);

				    // Step 5
				    try {
						document.add(tabla);
						Desktop.getDesktop().open(new File("C://reporte.pdf"));
					} catch (DocumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				    // step 6
				    document.close();
				

				
			}
		});
		btnReporte.setForeground(Color.WHITE);
		btnReporte.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnReporte.setBackground(new Color(34, 139, 34));
		btnReporte.setBounds(704, 251, 90, 54);
		a.getContentPane().add(btnReporte);
		
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		headerRenderer.setBackground(new Color(46, 139, 87));
		headerRenderer.setForeground(Color.WHITE);
		headerRenderer.setHorizontalAlignment(JLabel.CENTER);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		
		 centerRenderer.setHorizontalAlignment( JLabel.CENTER );

		for (int i = 0; i < table.getModel().getColumnCount(); i++) {
		        table.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
		      
		}
		
		Interaccion BD = new Interaccion();
		
		try {
			
			
			BD.Conectar("IUPSM");
		

					 
				
		
			 String selectSQL = "SELECT Fecha, Codigo, Nombre, Tipo, Color, Existente, Dañada, Donada FROM Articulos";
			  PreparedStatement preparedStatement = BD.conn.prepareStatement(selectSQL);
			  ResultSet rs = preparedStatement.executeQuery(selectSQL);
			  DefaultTableModel model = (DefaultTableModel) table.getModel();
			  int contador = 1;
			  while (rs.next()) {
				  
				  String Fecha = rs.getString("Fecha");
				  int Codigo = rs.getInt("Codigo");
				  String Nombre = WordUtils.capitalizeFully(rs.getString("Nombre").toLowerCase());
				  String Tipo = WordUtils.capitalizeFully(rs.getString("Tipo").toLowerCase());
				  String Color = WordUtils.capitalizeFully(rs.getString("Color").toLowerCase());
				  int Existente = rs.getInt("Existente");
				  int Dañada = rs.getInt("Dañada");
				  int Donada = rs.getInt("Donada");
				  model.addRow(new Object[]{contador, Fecha, Codigo, Nombre, Tipo, Color, Existente, Dañada, Donada});
				  contador++;
			  }
			 
			  
			 
			  centerRenderer = new DefaultTableCellRenderer();
			  centerRenderer.setHorizontalAlignment( JLabel.CENTER );
			  
			  table.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
			  table.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
			  table.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
			  table.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
			  table.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
			  table.getColumnModel().getColumn(6).setCellRenderer( centerRenderer );
			  table.getColumnModel().getColumn(7).setCellRenderer( centerRenderer );
			  table.getColumnModel().getColumn(8).setCellRenderer( centerRenderer );
			  table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
			  
			  
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally{
			BD.Desconectar();
		}
		
		a.setVisible(true);

	}
}

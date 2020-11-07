package UI;
import java.awt.event.*;
import java.util.HashMap;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import means.ControladorTXT;
import objects.Articulo;
import objects.Audio;
import objects.Ordenador;
import objects.Smartphone;
import objects.Television;

public class VentanaPrincipalV2 extends JFrame {
	
	private VentanaPrincipalV2 VentanaPrincipalV2;
	
	private JLabel infolbl;
	private Image fondo;
	private JTextField CuadrosJtext;
	private JComboBox comboCategoria;
	private JButton botonCrear; 
	private JList listaArticulos;
	private JButton botonEliminar;
	private JButton botonAplicar;
	private JButton botonInfo;
	private DefaultListModel modeloLista;
	private JSpinner spinCantidad;
	
	private JCheckBox checkBox;
	private HashMap<Articulo, Integer> stock;
	public VentanaPrincipalV2() {
		
		Container cp = this.getContentPane();
		cp.setLayout(new BorderLayout());
		
		//menu
		JMenuBar barraArchivo = new JMenuBar();
		JMenu menuArchivo = new JMenu("Archivo");
		JMenuItem importar = new JMenuItem("Importar");
		JMenuItem exportar = new JMenuItem("Exportar");
		menuArchivo.add(importar);
		menuArchivo.add(exportar);
		barraArchivo.add(menuArchivo);
		this.setJMenuBar(barraArchivo);
		
		//paneles
		
		JPanel izquierda = new JPanel(new BorderLayout());
		JPanel izquierdaArriba = new JPanel(new GridLayout(13,2));
		JPanel izquierdaAbajo = new JPanel(); 
		JPanel infoAbajo = new JPanel(new GridLayout(1,1)); 
		izquierda.add(izquierdaArriba, BorderLayout.NORTH);
		izquierda.add(izquierdaAbajo, BorderLayout.SOUTH);
		JPanel derecha = new JPanel(new BorderLayout());
		
		
		//combobox
		CuadrosJtext = new JTextField(50);
		comboCategoria = new JComboBox();
		comboCategoria.addItem("Television");
		comboCategoria.addItem("Smarthphone");
		comboCategoria.addItem("Audio");
		comboCategoria.addItem("Ordenador");
		
 //Botones
		botonCrear = new JButton("Crear");
		botonEliminar = new JButton("Eliminar");
		botonAplicar = new JButton("Aplicar");
		botonInfo = new JButton("Info");
	
		checkBox = new JCheckBox();
		checkBox.setText("Si/No");
		      	
//izquierda arriba
		//izquierdaArriba.add(new JLabel("   Id: "));
		//JTextField txtId = new JTextField();
		//izquierdaArriba.add(txtId);
		
		izquierdaArriba.add(new JLabel("   Nombre: "));
		JTextField txtNombre = new JTextField();
		izquierdaArriba.add(txtNombre);
		
		izquierdaArriba.add(new JLabel("   Descripcion: "));
		JTextField txtDescripcion = new JTextField();
		izquierdaArriba.add(txtDescripcion);
		
		izquierdaArriba.add(new JLabel("   Categoria: "));
		izquierdaArriba.add(comboCategoria);
		
		izquierdaArriba.add(new JLabel("   Precio: "));
		JTextField txtPrecio = new JTextField();
		izquierdaArriba.add(txtPrecio);
		
		izquierdaArriba.add(new JLabel("   Cantidad: "));
		JSpinner spinCantidad = new JSpinner();
		izquierdaArriba.add(spinCantidad);
		
		izquierdaArriba.add(new JLabel(" "));
		izquierdaArriba.add(botonAplicar); 
		
		izquierdaArriba.add(new JLabel(" "));
		izquierdaArriba.add(new JLabel(" "));
		JLabel lblEditable1 = new JLabel("   editable ");
		izquierdaArriba.add(lblEditable1); 
		JTextField txtEditable1 = new JTextField();
		izquierdaArriba.add(txtEditable1);
		
		JLabel lblEditable2 = new JLabel("   editable ");
		izquierdaArriba.add(lblEditable2); 
		JTextField txtEditable2 = new JTextField();
		izquierdaArriba.add(txtEditable2);
		
		JLabel lblEditable3 = new JLabel("   editable ");
		izquierdaArriba.add(lblEditable3); 
		izquierdaArriba.add(checkBox); 
		
		lblEditable1.setVisible(false);
		lblEditable2.setVisible(false);
		lblEditable3.setVisible(false);
		txtEditable1.setVisible(false);
		txtEditable2.setVisible(false);
		checkBox.setVisible(false);
		
		
		//izquierda abajo
		infolbl =new JLabel(" Informacion ");
		izquierdaAbajo.add(infolbl);
		
		
		
		modeloLista = new DefaultListModel();
		listaArticulos = new JList(modeloLista);
        JScrollPane scrollLista = new JScrollPane(listaArticulos);
		scrollLista.setPreferredSize(new Dimension(400, 300));
		
		derecha.add(scrollLista, BorderLayout.CENTER);
		
		JPanel panelBoton = new JPanel(new FlowLayout());
		panelBoton.add(botonCrear);
		JSpinner spinCantidad2 = new JSpinner();
		panelBoton.add(spinCantidad2);
		panelBoton.add(botonEliminar);
		panelBoton.add(new JLabel("                                          "));
		panelBoton.add(botonInfo);
		
//infoAbajo
	
		cp.add(infoAbajo, BorderLayout.SOUTH);
		JTextField infor = new JTextField();
		infoAbajo.add(infor);
		infor.setPreferredSize(new Dimension(100, 50));

//	panelBoton.add(botonEliminar);
		
		derecha.add(panelBoton, BorderLayout.SOUTH);
		cp.add(izquierda, BorderLayout.WEST);
		cp.add(derecha, BorderLayout.EAST);
		
		
//colores
		barraArchivo.setBackground(Color.white);
		importar.setBackground(Color.green);
		exportar.setBackground(Color.red);
		infolbl.setFont(new Font("Arial",Font.BOLD,20));
		botonInfo.setBackground(Color.BLACK);
		botonInfo.setForeground(Color.WHITE);
		
//Escuchadores
		botonAplicar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		importar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ControladorTXT controladorTxt = new ControladorTXT();
				stock = controladorTxt.importarStock();
				
				modeloLista = new DefaultListModel<>();
				for (Articulo articulo: stock.keySet()) {
					modeloLista.addElement(articulo.getNombre());
				}
				
				listaArticulos.setModel(modeloLista);
				
				JOptionPane.showMessageDialog(null, "Articulos IMPORTADOS con exito");
			}
		});
		
		exportar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ControladorTXT controladorTxt = new ControladorTXT();
				controladorTxt.exportarStock(stock);
				
				JOptionPane.showMessageDialog(null, "Articulos EXPORTADOS con exito");
			}
		});
	

		
		botonCrear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//int id = Integer.parseInt(txtId.getText());
				String nombre = txtNombre.getText();
				String descripcion = txtDescripcion.getText();
				String categoria = comboCategoria.getSelectedItem().toString();
				double precio = Double.parseDouble(txtPrecio.getText());
				
				String e1 = txtEditable1.getText();
				int e2 = Integer.parseInt(txtEditable2.getText());
				boolean e3;
				
				if (checkBox.isSelected()) {
					e3 = true;
				}else {
					e3 = false;
				}
				
				
				
				Articulo a = null;
				
				if (categoria.equals("Smartphone")) {
					a = new Smartphone (nombre, descripcion, categoria, precio, e1, e2, e3);
				}else if (categoria.equals("Audio")) {
					a = new Audio(nombre, descripcion, categoria, precio, e1, e2, e3);
				}else if (categoria.equals("Ordenador")) {
					a = new Ordenador(nombre, descripcion, categoria, precio, e1, e2, e3);
				}else if (categoria.equals("Television")) {
					a = new Television(nombre, descripcion, categoria, precio, e1, e2, e3);
				}else {
					System.out.println("ERROR");
				}
				
				int cant = (Integer)spinCantidad2.getValue();
				
				stock.put(a, cant); 
				
				for (Articulo articulo: stock.keySet()) {
					modeloLista.addElement(articulo.getNombre());
				}
				
				listaArticulos.setModel(modeloLista);
				scrollLista.setViewportView(listaArticulos);
				
				JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
				
				//txtId.setText("");
				txtNombre.setText("");
				txtDescripcion.setText("");
				txtPrecio.setText("");
				comboCategoria.setSelectedItem(1);
				
			}
		});
		
		
		
		botonAplicar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String categoria = comboCategoria.getSelectedItem().toString();
				
				if (categoria.equals("Television")) {
					lblEditable1.setText("   Tipo: ");
					lblEditable2.setText("   Pulgadas: ");
					lblEditable3.setText("   Wifi: ");
				}
				
				if (categoria.equals("Smarthphone")) {
					lblEditable1.setText("   SO: ");
					lblEditable2.setText("   Pulgadas: ");
					lblEditable3.setText("   NFC: ");
					
				}
				
				if (categoria.equals("Audio")) {
					lblEditable1.setText("   Entrada: ");
					lblEditable2.setText("   Potencia: ");
					lblEditable3.setText("   Bluetooth: ");
				}
				
				if (categoria.equals("Ordenador")) {
					lblEditable1.setText("   RAM: ");
					lblEditable2.setText("   Pulgadas: ");
					lblEditable3.setText("   Portatil: ");
				}
				
				lblEditable1.setVisible(true);
				lblEditable2.setVisible(true);
				lblEditable3.setVisible(true);
				txtEditable1.setVisible(true);
				txtEditable2.setVisible(true);
				checkBox.setVisible(true);
				
			}
		});
		
		 botonEliminar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					int cantEliminar = (Integer)spinCantidad2.getValue();
					
					String articulo = (String) listaArticulos.getSelectedValue();
					for (Articulo a : stock.keySet()) {
						if (a.getNombre().equals(articulo)) {
							int cant = stock.get(a);
							stock.put(a, cant - cantEliminar);
							
							infor.setText(a.toString() + "                 "
									+ "CANTIDAD en STOCK:  " + stock.get(a));
						}
					}
		
					
				}
			});
		 
		 
		 
		 botonInfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Articulo articuloSeleccionado = null;
				int cantidad = 0;
				
				String articulo = (String) listaArticulos.getSelectedValue();
				for (Articulo a : stock.keySet()) {
					if (a.getNombre().equals(articulo)) {
						articuloSeleccionado = a;
						cantidad = stock.get(a);
						
					}
				}
				
				infor.setText(articuloSeleccionado.toString() + "                 "
						+ "CANTIDAD en STOCK:  " + cantidad);
			}
		});
			
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("TechShop");
		pack();
		setVisible(true);
	
	} 
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaPrincipalV2();
			}
		});
	}
}

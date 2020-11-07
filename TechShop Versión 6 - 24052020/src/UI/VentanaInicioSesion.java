package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class VentanaInicioSesion extends JFrame {

	private JTextField CuadrosJtext;
	private JButton botonIniciarSesion; 
    private JLabel id;
    private JLabel contra;
    private JPasswordField contraPts;
	private JProgressBar barra;

	 
public VentanaInicioSesion() {
		 
	
		Container cp = this.getContentPane();
		cp.setLayout(new BorderLayout());
	
	
		//paneles
		
		JPanel arriba = new JPanel(new FlowLayout());
		JPanel medio = new JPanel(new GridLayout(4,2));
		JPanel abajo = new JPanel(new FlowLayout());

		
		//Botones
		botonIniciarSesion = new JButton("Iniciar sesion");
		
//arriba colocar en el panel
	    //imagen
		JLabel foto1 =new JLabel(new ImageIcon("1.jpg"));
		foto1.setBounds(10, 60, 300, 300);
		arriba.add(foto1);
		
		
		//medio colocar en panel
		
		contraPts = new JPasswordField();
		id =new JLabel("     ID: ");
		contra =new JLabel("     CONTRASEÑA: ");
		barra = new JProgressBar();

		medio.add(id);
		medio.add(new JTextField());
		medio.add(contra);
		medio.add(contraPts);
		medio.add(new JLabel(" "));
		medio.add(botonIniciarSesion);
		medio.add(barra);	
		medio.add(barra);
		medio.add(new JLabel(" "));
		

				
//abajo colocar en el panel
	    //imagen
		 
		JLabel foto2 =new JLabel(new ImageIcon("1.jpg"));
		foto2.setBounds(10, 60, 300, 300);
		abajo.add(foto2);

		
		cp.add(arriba, BorderLayout.NORTH);
		cp.add(medio, BorderLayout.CENTER);
		cp.add(abajo,BorderLayout.SOUTH);
		
		//colores
		
		medio.setBackground(Color.BLACK);
		id.setForeground(Color.WHITE);
		contra.setForeground(Color.WHITE);
		
	
//escuchadores
		//Escuchadores
		botonIniciarSesion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//hilo
				  Thread tiempo ;
				    tiempo = new Thread() {
					int seg;
					public void run() {
							
						try {
							for(seg=1;seg<100;seg++) {
								barra.setValue(seg);
								Thread.sleep(30);
							}
							VentanaPrincipalV2 vp = new VentanaPrincipalV2();
							vp.setVisible(true);
							setVisible(false);
							
							
						} catch (Exception e2) {
						
						}
					}
			};
				tiempo.start();
				;
				
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
			new VentanaInicioSesion();
		}
	});
	}
	
	
}




package means;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

import objects.*;

public class ControladorTXT {
	
	public HashMap<Articulo, Integer> importarStock () {
		
		HashMap<Articulo, Integer> stock = new HashMap<>();
		
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    
	    //String desktopPath = System.getProperty("user.home") + "/Desktop" + "/datos.txt";
		//String ruta = desktopPath.replace("\\", "/");
	    
	    String ruta = "data/articulos.txt";
	
	      try {
	         archivo = new File (ruta);
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         
	         String linea = br.readLine();
	         while(linea!=null) {
	        	 
	        	 String[] palabras = linea.split(",");
	        	 String nombre = palabras[0];
	        	 String descripcion = palabras[1];
	        	 String categoria = palabras[2];
	        	 double precio = Double.parseDouble(palabras[3]);
	        	 int cantidad = Integer.parseInt(palabras[4]);
	        	 String editable1 = palabras[5];
	        	 int editable2 = Integer.parseInt(palabras[6]);
	        	 boolean editable3;
	        	 
	        	 if (palabras[7].equals("S")) {
	        		 editable3 = true;
	        	 }else {
	        		 editable3 = false;
	        	 }
	        	 
	        	 Articulo art;
	        	
	        	 if (categoria.equals("Smartphone")) {
	        		 art = new Smartphone(nombre, descripcion, categoria, precio, editable1, editable2, editable3);
	        	 }else if (categoria.equals("Television")) {
	        		 art = new Television(nombre, descripcion, categoria, precio, editable1, editable2, editable3);
	        	 }else if (categoria.equals("Ordenador")) {
	        		 art = new Ordenador(nombre, descripcion, categoria, precio, editable1, editable2, editable3);
	        	 }else{
	        		 art = new Audio(nombre, descripcion, categoria, precio, editable1, editable2, editable3);
	        	 }
	        	
	        	 
				stock.put(art, cantidad);
	        	 
	        	 linea = br.readLine();
	        	 
	         }
	         
	      }catch(Exception e){
	         e.printStackTrace();
	         
	      }finally{
	    	  
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
			
		return stock;
			
	}
	
	public void exportarStock (HashMap<Articulo, Integer> stock) {
		
		FileWriter fichero = null;
		try {

			fichero = new FileWriter("data/articulos.txt");

			// Escribimos linea a linea en el fichero
			for (Articulo articulo : stock.keySet()) {
				String nombre = articulo.getNombre();
				String descripcion = articulo.getDescripcion();
				String categoria = articulo.getCategoria();
				double precio = articulo.getPrecio();
				String e1 = null;
				int e2 = 0;
				boolean e3 = false;
				
				if (categoria.equals("Smartphone")) {
					Smartphone s = (Smartphone) articulo;
					e1 = s.getSistemaOperativo();
					e2 = s.getPulgadas();
					e3 = s.isNfc();
				}else if (categoria.equals("Ordenador")) {
					Ordenador o = (Ordenador) articulo;
					e1 = o.getRam();
					e2 = o.getPulgadas();
					e3 = o.isPortatil();
				}else if (categoria.equals("Audio")) {
					Audio a = (Audio)articulo;
					e1 = a.getSub();
					e2 = a.getPotencia();
					e3 = a.isBluetooth();
					
				}else if (categoria.equals("Television")) {
					Television t = (Television) articulo;
					e1 = t.getTipo();
					e2 = t.getPulgadas();
					e3 = t.isWifi();
				}else {
					System.out.println("ERROR en " + articulo.getNombre());
				}
				
				
				int cant = stock.get(articulo);
				
				fichero.write( nombre + "," + descripcion + "," + categoria + "," + precio+ "," + cant + "," + e1+ "," + e2 +","+ e3 +"\n");
			}

			fichero.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}
}

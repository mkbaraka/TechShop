package objects;
import java.util.ArrayList;
import java.util.HashMap;

public class Pedido {
	private HashMap<Articulo, Integer> articulos;
	private Empleado empleado;
	private int fecha;
	
	public Pedido(HashMap<Articulo, Integer> articulos, Empleado empleado, int fecha) {
		super();
		this.articulos = articulos;
		this.empleado = empleado;
		this.fecha = fecha;
	}

	public HashMap<Articulo, Integer> getArticulos() {
		return articulos;
	}

	public void setArticulos(HashMap<Articulo, Integer> articulos) {
		this.articulos = articulos;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Pedido [articulos=" + articulos + ", empleado=" + empleado + ", fecha=" + fecha + "]";
	}
	
	//CALCULAR IMPORTE TOTAL DEL PEDIDO
	public double importeTotal () {
		
		double total = 0.0;
		
		for (Articulo articulo: articulos.keySet()) {
			double precio = articulo.getPrecio();
			
			for (int i = 0; i < articulos.get(articulo); i++) {
				total = total + precio;
			}
		}
		
		return total;
	}
	
	//AÑADIR ARTICULO A LA CESTA
	public void anyadirProducto (Articulo articulo, int cant) {
		
		if (articulos.containsKey(articulo)) {
			articulos.replace(articulo, articulos.get(articulo) + cant);
		}else {
			articulos.put(articulo, cant);
		}
		
	}
	
	//ELIMINAR ARTICULO DE LA CESTA
	public void eliminarProducto (Articulo articulo, int cant) {
		
		articulos.replace(articulo, articulos.get(articulo) - cant);
	}
	
	
	
	
}

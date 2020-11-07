package objects;
import java.util.ArrayList;

public class Tienda {

	private String nombre;
	private String localizacion;
	private int telefono;
	private ArrayList<Empleado>plantilla;
	
	
	public Tienda(String nombre, String localizacion, int telefono, ArrayList<Empleado> plantilla) {
		super();
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.telefono = telefono;
		this.plantilla = plantilla;
	}
	
	public Tienda() {
		super();
		this.nombre = "";
		this.localizacion = "";
		this.telefono = 0;
		this.plantilla = null;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalizacion() {
		return localizacion;
	}


	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public ArrayList<Empleado> getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(ArrayList<Empleado> plantilla) {
		this.plantilla = plantilla;
	}

	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", localizacion=" + localizacion + ", telefono=" + telefono + ", plantilla="
				+ plantilla + "]";
	}
	
	
}
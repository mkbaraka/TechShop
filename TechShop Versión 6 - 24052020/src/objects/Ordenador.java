package objects;
	
public class Ordenador extends Articulo {
	private String ram;
	private int pulgadas;
	private boolean portatil;
	
	public Ordenador(String nombre, String descripcion, String categoria, double precio, String ram, int pulgadas,
			boolean portatil) {
		super(nombre, descripcion, categoria, precio);
		this.ram = ram;
		this.pulgadas = pulgadas;
		this.portatil = portatil;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public boolean isPortatil() {
		return portatil;
	}

	public void setPortatil(boolean portatil) {
		this.portatil = portatil;
	}

	@Override
	public String toString() {
		return "Ordenador [ram=" + ram + ", pulgadas=" + pulgadas + ", portatil=" + portatil + "]";
	}
	  
}

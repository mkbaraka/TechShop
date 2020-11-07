package objects;
	
public class Television extends  Articulo {
	private String tipo;
	private int pulgadas;
	private boolean wifi;
	
	public Television(String nombre, String descripcion, String categoria, double precio, String tipo, int pulgadas,
			boolean wifi) {
		super(nombre, descripcion, categoria, precio);
		this.tipo = tipo;
		this.pulgadas = pulgadas;
		this.wifi = wifi;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	@Override
	public String toString() {
		return "Television [tipo=" + tipo + ", pulgadas=" + pulgadas + ", wifi=" + wifi + "]";
	}
	
	

	

	

	
	
	
}

package objects;
	
public class Audio extends Articulo { 
	private String entrada;
	private int potencia;
    private boolean bluetooth;
    
	public Audio(String nombre, String descripcion, String categoria, double precio, String sub, int potencia,
			boolean bluetooth) {
		super(nombre, descripcion, categoria, precio);
		this.entrada = sub;
		this.potencia = potencia;
		this.bluetooth = bluetooth;
	}

	public String getSub() {
		return entrada;
	}

	public void setSub(String sub) {
		this.entrada = sub;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	@Override
	public String toString() {
		return "Audio [sub=" + entrada + ", potencia=" + potencia + ", bluetooth=" + bluetooth + "]";
	}

	    
	
}


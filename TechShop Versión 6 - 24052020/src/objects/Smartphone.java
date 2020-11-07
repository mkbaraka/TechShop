package objects;
	
public class Smartphone extends Articulo{
	private String sistemaOperativo;
	private int pulgadas;
	private boolean nfc;

	public Smartphone(String nombre, String descripcion, String categoria, double precio, String sistemaOperativo,
			int pulgadas, boolean nfc) {
		super(nombre, descripcion, categoria, precio);
		this.sistemaOperativo = sistemaOperativo;
		this.pulgadas = pulgadas;
		this.nfc = nfc;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public boolean isNfc() {
		return nfc;
	}

	public void setNfc(boolean nfc) {
		this.nfc = nfc;
	}

	@Override
	public String toString() {
		return "Smartphone [sistemaOperativo=" + sistemaOperativo + ", pulgadas=" + pulgadas + ", nfc=" + nfc + "]";
	}
       
	
}

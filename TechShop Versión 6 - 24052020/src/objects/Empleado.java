package objects;

public class Empleado extends Persona {
	
	private int idEmpleado;	
	private int experiencia;	
	private String residencia ;	
	private Curriculum curriculum;
	
	public Empleado(String nombre, String apellido, String dni, int fechaNcto, int idEmpleado, int experiencia,
			String residencia, Curriculum curriculum) {
		super(nombre, apellido, dni, fechaNcto);
		this.idEmpleado = idEmpleado;
		this.experiencia = experiencia;
		this.residencia = residencia;
		this.curriculum = curriculum;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public String getResidencia() {
		return residencia;
	}
	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}
	public Curriculum getCurriculum() {
		return curriculum;
	}
	public void setCurriculum(Curriculum curriculum) {
		this.curriculum = curriculum;
	}
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", experiencia=" + experiencia + ", residencia=" + residencia
				+ ", curriculum=" + curriculum + "]";
	}
	
}

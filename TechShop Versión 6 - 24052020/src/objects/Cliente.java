package objects;
import  java.util.*;
	public class Cliente extends Persona  implements Vip {
	
		private int id ;	
		private String residencia;
		
		public Cliente(String nombre, String apellido, String dni, int fechaNcto, int id, String residencia) {
			super(nombre, apellido, dni, fechaNcto);
			this.id = id;
			this.residencia = residencia;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getResidencia() {
			return residencia;
		}

		public void setResidencia(String residencia) {
			this.residencia = residencia;
		}

		@Override
		public String toString() {
			return "Cliente [id=" + id + ", residencia=" + residencia + "]";
		}

		@Override
		public Cliente Vipear() {
			// TODO Auto-generated method stub
			return null;
		}		
		
		
	}

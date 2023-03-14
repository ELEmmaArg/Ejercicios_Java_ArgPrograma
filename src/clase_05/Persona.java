package clase_05;

public class Persona {
	private String nombre;
	private String apellido;
	private boolean descuento;
	
	
	public Persona(String nombre, String apellido, boolean descuento){
		this.nombre = nombre;
		this.apellido = apellido;
		this.descuento = descuento;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isDescuento() {
		return descuento;
	}
	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

}

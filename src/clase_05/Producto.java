package clase_05;

public class Producto {
	
	private String nombre;
	private double precio;
	private String descripcion;
	


public Producto(String nombre, double precio, String descripcion){
	this.setNombre(nombre);
	this.setPrecio(precio);
	this.setDescripcion(descripcion);
}



public double getPrecio() {
	return precio;
}



public void setPrecio(double precio) {
	this.precio = precio;
}



public String getDescripcion() {
	return descripcion;
}



public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}



public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}
}
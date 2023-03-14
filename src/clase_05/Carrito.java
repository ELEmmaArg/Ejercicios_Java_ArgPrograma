package clase_05;

public class Carrito {
	private Persona persona;
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private Producto producto4;
	
	public Carrito(Persona persona, Producto producto1, Producto producto2, Producto producto3, Producto producto4){
		this.persona = persona;
		this.producto1 = producto1;
		this.producto2 = producto2;
		this.producto3 = producto3;
		this.producto4 = producto4;
				
	}
	
	public double precioFinal() {
		if (getPersona().isDescuento()) {
		return 0.85*(getProducto1().getPrecio() + getProducto2().getPrecio() + getProducto3().getPrecio());
	}else{
		return (getProducto1().getPrecio() + getProducto2().getPrecio() + getProducto3().getPrecio());
		}
	}
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Producto getProducto1() {
		return producto1;
	}
	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}
	public Producto getProducto2() {
		return producto2;
	}
	public void setProducto2(Producto producto2) {
		this.producto2 = producto2;
	}
	public Producto getProducto3() {
		return producto3;
	}
	public void setProducto3(Producto producto3) {
		this.producto3 = producto3;
	}

	public Producto getProducto4() {
		return producto4;
	}

	public void setProducto4(Producto producto4) {
		this.producto4 = producto4;
	}
}

package clase_05;
import clase_05.Producto;
import clase_05.Producto;
import clase_05.Carrito;
import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean band = false;
		 
		
		//Producto
		Producto producto1 = new Producto("carne", 750.0,"Tapa");
		Producto producto2 = new Producto("leche", 550.0, "Ilolay");
		Producto producto3 = new Producto("arroz", 350.0, "Magistral");
		Producto producto4 = new Producto("jabon", 800.0, "Ala");


		
		//Persona
		System.out.println("¿ Posee la tarjeta ?");
		boolean descuento = scanner.nextBoolean();
		Persona yo = new Persona("Franco", "Cardoso", descuento);
		
		//Carrito
		Carrito carrito = new Carrito(yo, producto1, producto2, producto3,producto4);
		System.out.print( carrito.precioFinal() );
		
	}

}

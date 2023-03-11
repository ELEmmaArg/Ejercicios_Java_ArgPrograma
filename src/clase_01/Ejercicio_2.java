package clase_01;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		long ingrMensuales;
		boolean clase4 = false;
		int cantVehiculos;
		int cantInmuebles;
		int cantVehiculosLujo;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Interfaz para saber si pertenece a la cuarta division de ingresos: ");
		
		System.out.println("Ingrese la cantidad de ingresos:");
		ingrMensuales = scanner.nextLong();
		
		System.out.println("Tiene vehiculos menores a 5 años desde la compra, ingrese la cantidad:");
		cantVehiculos = scanner.nextInt();
		
		System.out.println("Ingrese la cantidad de inmubebles:");
		cantInmuebles = scanner.nextInt();
		
		System.out.println("Ingrese la cantidad de Vehiculos de lujo");
		cantVehiculosLujo = scanner.nextInt();
		
		if(ingrMensuales >= 489083) {
			if(cantVehiculos >= 3){
				if(cantInmuebles >= 3) {
					if(cantVehiculosLujo >= 1 ) {
						clase4 = true;
					}
				}
			}
		}
		
		if (clase4) {
			System.out.println("Perteneces a la clase 4");
		}else {
			System.out.println("No perteneces a la clase 4");
		}
	}
}
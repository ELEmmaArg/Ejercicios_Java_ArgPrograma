package clase_03;
import java.util.Scanner;

public class Ejercicio_1_a {
	
	public static void main(String[] args) {
		int cantlet = 0;
		//Punto a
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese una oracion: ");
		String oracion = scanner.nextLine();
		oracion = oracion.toLowerCase();
		
		System.out.println("Ingrese una palabra en minusculas: ");
		char palabra = scanner.next().charAt(0);
		
		for(int i=0;i<oracion.length();i++) {
			if (palabra == oracion.charAt(i) ) {
				cantlet ++;
			}
		}
		System.out.println("La cantidad de veces que aparece la palabra puesta por teclado son de: " + cantlet );

	}
	
}

//Intente hacer las consignas de los trabajos como indica el enunciado, sin hacer uso de otro metodo que no sea el length
//Pero no lo logre, le paso el trabajo antes de la clase del martes, y con la explicacion de dicho dia
//cambio el codigo en caso de no ser aprobado el trabajo
//Desde ya perdon jajaj	

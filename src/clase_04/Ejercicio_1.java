package clase_04;
import java.util.Scanner;

public class Ejercicio_1 {
	
	public static void main(String[] args) {
		int cantlet = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese una oracion: ");
		String oracion = scanner.nextLine();
		oracion = oracion.toLowerCase();
		
		System.out.println("Ingrese una palabra: ");
		char palabra = scanner.next().charAt(0);
		
		for(int i=0;i<oracion.length();i++) {
			if (palabra == oracion.charAt(i) ) {
				cantlet ++;
			}
		}
		System.out.println("La cantidad de veces que aparece la palabra puesta por teclado son de: " + cantlet );

	}
	
}

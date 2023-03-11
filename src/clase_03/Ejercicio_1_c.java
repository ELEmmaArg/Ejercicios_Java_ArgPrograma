package clase_03;
import java.util.Scanner;

public class Ejercicio_1_c {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int cant,numX,mayX = 0;
		
		
		System.out.println("Ingrese la cantidad de numeros para el vector");
		cant = scanner.nextInt();
		
		int numeros[] = new int[cant];
		
		for(int i = 0; i < numeros.length; i++ ) {
			System.out.println("Ingrese un numero para el vector");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.println("Ingrese un numero para ser comparados con los del vector");
		numX = scanner.nextInt();
			
		for (int i = 0; i<numeros.length; i++) {
			if (numeros[i] > numX ) {
				mayX = mayX + numeros[i]; 
			}
		}
		
		System.out.println("El numero resultante de sumar todos los numeros del vector mayores que el pedido es de: " + mayX);
}		
}
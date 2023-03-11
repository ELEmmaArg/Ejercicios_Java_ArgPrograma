package clase_03;
import java.util.Scanner;

public class Ejercicio_1_b {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de numeros a ordenar");
		int cant = scanner.nextInt(); 
		
		int numeros[] = new int[cant];
		
		for(int i = 0; i < numeros.length; i++ ) {
			System.out.println("Ingrese un numero");
			numeros[i] = scanner.nextInt();
		}
		
		//Creciente
		
		System.out.println("Elija si desea que se ordene de manera \"creciento\" o \"decreciente\" ");
		String decision = scanner.next();
		decision = decision.toLowerCase();
		
		for(int j = 0; j < numeros.length; j++){
			for(int k = j+1; k < numeros.length; k++) {
				if (numeros[k]<numeros[j] && decision.equals("creciente")) {
					int nuevo = numeros[j];
					int nuevoMayor = numeros[k];
					numeros[j] = nuevoMayor;
					numeros[k] = nuevo;
		
		//Decreciente	
				}
				if (numeros[k]>numeros[j] && decision.equals("decreciente")) {
					int nuevo = numeros[j];
					int nuevoMenor = numeros[k];
					numeros[j] = nuevoMenor;
					numeros[k] = nuevo;
			}
		}
		}
		
		for(int l = 0; l < numeros.length; l++) {
			System.out.print(numeros[l]+"--");
		}
	

}
}
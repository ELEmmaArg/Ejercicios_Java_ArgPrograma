package clase_04;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 		
		
		System.out.println("Ingrese una oracion: ");
		String oracion = scanner.nextLine();
		
		System.out.println("Ingrese la cantidad del adelanto: ");
		int adelanto = scanner.nextInt();
		
		byte valor[] = oracion.getBytes();
		
		for(int i=0; i < oracion.length();i++) {
			valor[i] = (byte) (valor[i] + adelanto);
		
			oracion = new String(valor);
		}
		System.out.println("La nueva oracion es:\n" + oracion );
		
	}

}
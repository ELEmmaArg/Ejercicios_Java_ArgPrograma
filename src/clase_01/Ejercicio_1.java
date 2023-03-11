package clase_01;
import java.util.Scanner;

public class Ejercicio_1 {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			boolean band1 = true;
			boolean band2 = true;
			int primer_num,segundo_num;
			int cont1,cont2;
			String par_impar;
			
			//Ingresar valores
			System.out.println("Ingrese un valor: ");
			primer_num = scanner.nextInt();
			
			System.out.println("Ingrese otro valor: ");
			segundo_num = scanner.nextInt();
			
			//Mensaje
			System.out.println("Contador de numeros: ");
			
			//Contador
			cont1 = primer_num; 
			while (band1) {
				
				System.out.println(cont1++);	
				
				if (cont1 > segundo_num) {
					band1 = false;
				}
			}
			System.out.println("//////////////////////////////////////");
			//Pares
			cont2 = primer_num;
			
			System.out.println("Escriba si quiere saber los valores pares o impares");
			par_impar = scanner.next();
			
			while (band2){
				
				
				if (cont2 % 2 == 0 && par_impar.equals("par") ) {
					System.out.println("Un numero par es:" + cont2 );
				}	
				
				if (cont2 % 2 != 0 && par_impar.equals("impar")){
					System.out.println("Un numero impar es:" + cont2 );
				}
				
				cont2++;	
				
				//Controlador
				if (!(par_impar.equals("par")) && !(par_impar.equals("impar"))){
					System.out.println("Esta opcion no es valida");
					cont2 = primer_num;
					System.out.println("Escriba si quiere saber los valores pares o impares");
					par_impar = scanner.next();
					
				}
				
				
				if (cont2 > segundo_num) {
				band2 = false;
				}
			}
				//No entendi el punto d ni usar el for perdón
				
		}
	}


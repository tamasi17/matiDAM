package ejercicios_Mats;

import java.util.Scanner;

	public class Factoriales {

		public static void main(String[] args) {
			// devuelve el factorial del numero que entra por teclado
			// n! es la multiplicacion de todos los numeros que hay entre 1 y n
			
			// salen números muy grandes: 100! es 9.33*10^157. En Eclipse saldrá 9.33...E157
			
			
			Scanner scanner = new Scanner(System.in);

			double acumulador=1; 
			int factorial=0;
		
			do {
				
				System.out.println("Introduce un número positivo: ");
				factorial = scanner.nextInt();
				
			} while (factorial<0);
			
			
			System.out.println("Calculamos el factorial de " + factorial);

		
			while (factorial>1){
				
				acumulador *= factorial;
				factorial--;
			}
			
			System.out.println("El factorial es: " + acumulador);
			
			scanner.close();

		}

	}

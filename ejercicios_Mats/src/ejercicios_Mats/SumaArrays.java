package ejercicios_Mats;

import java.util.Random;

import java.util.Scanner;

public class SumaArrays {

	public static void main(String[] args) {


//		Suma dos arrays del mismo tamaño en otro array llamado suma.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame un tamaño");
		int tamaño = scanner.nextInt();
		
		int[] a = new int[tamaño];
		int[] b = new int[tamaño];
		int[] suma = new int[tamaño];
		
		
		MetodosArray.introRandom(a);  // introducimos valores aleatorios	
		MetodosArray.introRandom(b);
		
		System.out.println("Primer array:");
		MetodosArray.muestraValores(a);
		System.out.println("\nSegundo array:");	
		MetodosArray.muestraValores(b);
		
		for (int i=0; i<suma.length ; i++) {         // sumamos cada posicion
			suma[i] = a[i] + b[i];
		}
		
		
		
		System.out.println("\n\nSuma de ambos:");

		MetodosArray.muestraValores(suma);
		
		
	}

}

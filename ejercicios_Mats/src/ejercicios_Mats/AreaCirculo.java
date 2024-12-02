package ejercicios_Mats;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		// area y perimetro de un circulo
		// area = pi * r^2 
		// perimetro = 2 * pi * r
		
		
		Scanner scanner = new Scanner(System.in);
		
		double pi = 3.141592653; 
		
		System.out.println("Cual es el radio del circulo?");
		
		double radio = scanner.nextDouble();
		
		double area = pi * (radio*radio);
		
		System.out.println("El area de este circulo es: " + area + " cm cuadrados.");
		
		double perimetro = 2 * pi * radio;
		
		System.out.println("El perimetro de este circulo es: " + perimetro + " cm.");
		
		
		scanner.close();

	}

}
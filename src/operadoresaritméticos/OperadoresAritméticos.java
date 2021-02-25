package operadoresaritméticos;

import java.util.Scanner;

public class OperadoresAritméticos {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		final int mensual = 1000;
		int cantcarros;
		float valorCarro = 0;
		float total;
		
		
	
		System.out.println("Ingresa la cantidad de carros en el mes");
		cantcarros = entrada.nextInt();
		
	
		
		System.out.println("Ingresa el valor del carro");
		valorCarro=entrada.nextInt();

	
		total = mensual + (cantcarros * 150) + (cantcarros * valorCarro * 5/100);
		
		
		System.out.println("El total es: " + total);
		
	}
	}

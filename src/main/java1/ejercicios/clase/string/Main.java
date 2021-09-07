package ejercicios.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 contains
		Scanner in = new Scanner(System.in);

		String frase = "Programación de algoritmos módulo II";
		System.out.println("Ingrese una palabra: ");
		String palabra = in.next();

		boolean resultado = frase.contains(palabra);
		System.out.println("contiene la palabra " + resultado);

		// 2 equals
		System.out.println("***********************************************");
		String cadena1 = "fernando";
		System.out.println("Ingrese la segunda cadena a comparar:");
		String cadena2 = in.next();
		boolean resultado2 = cadena1.equals(cadena2);
		System.out.println("Las cadenas son iguales: " + resultado2);

		// 3 y 4 Upper Lower
		System.out.println("***********************************************");
		String nombre = "juanito";
		String nombreEnMayuscula = nombre.toUpperCase();
		System.out.println(nombreEnMayuscula);

		String nombre2 = "JOSE";
		String nombreEnMinuscula = nombre2.toLowerCase();
		System.out.println(nombreEnMinuscula);

	}

}

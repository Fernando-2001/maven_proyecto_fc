package prueba;

import java.util.Scanner;

public class MainPrueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String claveIngresada;
		do {
		System.out.println("Ingrese clave");
		Scanner in = new Scanner(System.in);
		 
		claveIngresada = in.next();
		 
		if (claveIngresada.equals("85AB")) {
			
			System.out.println("BANCO PRODUBANCO");
			System.out.println("1. Realizar transferencia");
			System.out.println("2. Consultar transacciones");
			System.out.println("3. SALIR");
		}else {
			System.out.println("La clave no es correcta");
		}
		}while (claveIngresada != "-1");
		System.out.println("Gracias por preferirnos");
	}

}

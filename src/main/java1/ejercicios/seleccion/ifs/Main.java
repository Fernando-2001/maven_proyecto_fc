package ejercicios.seleccion.ifs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Escoja Opcion: ");
			System.out.println("1. Realizar transferencia");
			System.out.println("2. Consultar pagos");
			System.out.println("3. Salir");
			opcion = in.nextInt();

			if (opcion == 1) {
				System.out.println("Ingrese número de cuenta");
			} else if (opcion == 2) {
				System.out.println("No existen pagos");
			}

		} while (opcion != 3);
		System.out.println("Gracias por preferirnos");
	}

}

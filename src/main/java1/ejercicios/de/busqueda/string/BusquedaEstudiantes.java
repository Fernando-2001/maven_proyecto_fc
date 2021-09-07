package ejercicios.de.busqueda.string;

import java.util.Scanner;

public class BusquedaEstudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		String e[] = new String[5];
		int op = 0;
		do {
			System.out.println("******************************************");
			System.out.println("1. Ingresar Estudiamte");
			System.out.println("2. Buscar Estudiante");
			System.out.println("3. Salir");
			System.out.println("******************************************");
			System.out.println("Elija una opcion: ");
			op = in.nextInt();

			if (op == 1) {
				System.out.println("Ingrese el numero de cedula del estudiante 1: ");
				String nCedula0 = in.next();
				System.out.println("Ingrese el numero de cedula del estudiante 2: ");
				String nCedula1 = in.next();
				System.out.println("Ingrese el numero de cedula del estudiante 3: ");
				String nCedula2 = in.next();
				System.out.println("Ingrese el numero de cedula del estudiante 4: ");
				String nCedula3 = in.next();
				System.out.println("Ingrese el numero de cedula del estudiante 5: ");
				String nCedula4 = in.next();
				e[0] = nCedula0;
				e[1] = nCedula1;
				e[2] = nCedula2;
				e[3] = nCedula3;
				e[4] = nCedula4;
			}
			if (op == 2) {
				System.out.println("Ingrese el numero de cedula del estudiante a buscar: ");
				String cedula = in.next();
				boolean resultado = e[0].equals(cedula);
				if (resultado == true) {
					System.out.println("El estudiante esta en el vector: " + resultado);
				}
				resultado = e[1].equals(cedula);
				if (resultado == true) {
					System.out.println("El estudiante esta en el vector: " + resultado);
				}
				resultado = e[2].equals(cedula);
				if (resultado == true) {
					System.out.println("El estudiante esta en el vector: " + resultado);
				}
				resultado = e[3].equals(cedula);
				if (resultado == true) {
					System.out.println("El estudiante esta en el vector: " + resultado);
				}
				resultado = e[4].equals(cedula);
				if (resultado == true) {
					System.out.println("El estudiante esta en el vector: " + resultado);
				}

			}
		} while (op != 3);
		System.out.println("Gracias por preferirnos");
	}

}

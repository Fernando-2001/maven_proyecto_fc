package ejercicios.de.busqueda.string;

import java.util.Scanner;

public class EstudiantesBusqueda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		Estudiante e[] = new Estudiante[5];
		int op = 0;
		do {
			System.out.println("******************************************");
			System.out.println("1. Ingresar Estudiamte");
			System.out.println("2. Buscar Estudiante");
			System.out.println("3. Salir");
			System.out.println("******************************************");
			System.out.println("Elija una opcion: ");
			op = in.nextInt();

			Estudiante jose = new Estudiante();
			jose.setNombre("Jose");

			Estudiante maria = new Estudiante();
			maria.setNombre("Maria");

			Estudiante juan = new Estudiante();
			juan.setNombre("Juan");

			Estudiante elena = new Estudiante();
			elena.setNombre("Elena");

			Estudiante pedro = new Estudiante();
			pedro.setNombre("Pedro");

			if (op == 1) {
				int posicionGuardar = 0;
				posicionGuardar++;
				System.out.println("Ingrese la cedula del estudiante: " + posicionGuardar);
				String cedula = in.next();

				jose.setnCedula(cedula);
				e[0] = jose;

				e[1] = maria;

				e[2] = juan;

				e[3] = elena;

				e[4] = pedro;

			} else if (op == 2) {
				System.out.println("Ingrese el numero de cedula del estudiante que desea buscar");
				String numero = in.next();
				for (int i = 0; i > 5; i++) {
					Estudiante estudiante = e[i];
					String Cedula = estudiante.getnCedula();
					boolean resultado = numero.equals(Cedula);
					System.out.println("El estudiante esta en el vector: " + resultado);
				}

			}
		} while (op != 3);
		System.out.println("Gracias por preferirnos");
	}

}

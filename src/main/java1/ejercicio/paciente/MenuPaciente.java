package ejercicio.paciente;

import java.util.Arrays;

import java.util.Scanner;

public class MenuPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int op;
		do {
			System.out.println("------------------------------------------------");
			System.out.println("1. Registrar paciente");
			System.out.println("2. Imprimir reporte");
			System.out.println("3. Salir");
			System.out.println("------------------------------------------------");
			System.out.print("Elija una opcion: ");

			Paciente p1 = new Paciente();
			Paciente p2 = new Paciente();
			Paciente p3 = new Paciente();

			Paciente p[] = new Paciente[3];

			op = in.nextInt();
			if (op == 1) {
				System.out.println("Ingrese los datos del paciente 1");
				System.out.print("Ingrese el nombre: ");
				String nombre = in.next();
				p1.setNombre(nombre);
				System.out.print("Ingrese el apellido: ");
				String apellido = in.next();
				p1.setApellido(apellido);
				System.out.print("Ingrese la edad: ");
				int edad = in.nextInt();
				p1.setEdad(edad);
				System.out.print("Ingrese el sintoma: ");
				String sintoma = in.next();
				p1.setSintoma(sintoma);

				System.out.println("Ingrese los datos del paciente 2");
				System.out.print("Ingrese el nombre: ");
				String nombre2 = in.next();
				p2.setNombre(nombre2);
				System.out.print("Ingrese el apellido: ");
				String apellido2 = in.next();
				p2.setApellido(apellido2);
				System.out.print("Ingrese la edad: ");
				int edad2 = in.nextInt();
				p2.setEdad(edad2);
				System.out.print("Ingrese el sintoma: ");
				String sintoma2 = in.next();
				p2.setSintoma(sintoma2);

				System.out.println("Ingrese los datos del paciente 3");
				System.out.print("Ingrese el nombre: ");
				String nombre3 = in.next();
				p3.setNombre(nombre3);
				System.out.print("Ingrese el apellido: ");
				String apellido3 = in.next();
				p3.setApellido(apellido3);
				System.out.print("Ingrese la edad: ");
				int edad3 = in.nextInt();
				p3.setEdad(edad3);
				System.out.print("Ingrese el sintoma: ");
				String sintoma3 = in.next();
				p3.setSintoma(sintoma3);

				p[0] = p1;
				p[1] = p2;
				p[2] = p3;

			}

			if (op == 2) {
				System.out.println(Arrays.toString(p));
				// System.out.println("Paciente: "+p1.getNombre()+" -Apellido:
				// "+p1.getApellido()+" -Edad: "+p1.getEdad()+" -Síntoma: "+p1.getSintoma());
			}
		} while (op != 3);
		System.out.println("Fin del programa");
	}

}

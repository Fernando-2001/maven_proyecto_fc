package proyecto.finall.biblioteca;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String opcion;
		do {
			System.out.println("**********Menú Principal**********");
			System.out.println("1. Estudiante");
			System.out.println("2. Bibliotecario");
			System.out.println("3. Salir");
			System.out.print("Digite la opcion correspondiente: ");
			opcion = in.next();
			
			
			LibroBiblioteca libro1 = new LibroBiblioteca();
			libro1.setCodigoL("LIB-1");
			libro1.setNombreL("Las polillas y la luz");
			libro1.setAutorL("Manuel Molinero");
			libro1.setAnioL("2021");
			
			LibroBiblioteca libro2 = new LibroBiblioteca();
			libro2.setCodigoL("LIB-2");
			libro2.setNombreL("El silencio de un artista");
			libro2.setAutorL("F. Javier Laso");
			libro2.setAnioL("2021");
			
			LibroBiblioteca libro3 = new LibroBiblioteca();
			libro3.setCodigoL("LIB-3");
			libro3.setNombreL("UUn intelectual en su memoria");
			libro3.setAutorL("Cesar de la Lama");
			libro3.setAnioL("2021");
			
			LibroBiblioteca libro4 = new LibroBiblioteca();
			libro4.setCodigoL("LIB-4");
			libro4.setNombreL("Divina comedia");
			libro4.setAutorL("Dante Alighieri");
			libro4.setAnioL("1321");
			
			LibroBiblioteca libro5 = new LibroBiblioteca();
			libro5.setCodigoL("LIB-5");
			libro5.setNombreL("Don Quijote de la Mancha");
			libro5.setAutorL("Miguel de Cervantes");
			libro5.setAnioL("1615");
			
			LibroBiblioteca libro6 = new LibroBiblioteca();
			libro6.setCodigoL("LIB-6");
			libro6.setNombreL("Crimen y castigo");
			libro6.setAutorL("Fiódor Dostoievski");
			libro6.setAnioL("1866");
			
			LibroBiblioteca libro7 = new LibroBiblioteca();
			libro7.setCodigoL("LIB-7");
			libro7.setNombreL("Cien años de soledad");
			libro7.setAutorL("Gabriel García Márquez");
			libro7.setAnioL("1985");
		
			LibroBiblioteca libro8 = new LibroBiblioteca();
			libro8.setCodigoL("LIB-8");
			libro8.setNombreL("Ilíada");
			libro8.setAutorL("Homero");
			libro8.setAnioL("750 a.C.");
			
			LibroBiblioteca libro9 = new LibroBiblioteca();
			libro9.setCodigoL("LIB-9");
			libro9.setNombreL("Odisea");
			libro9.setAutorL("Homero");
			libro9.setAnioL("750 a.C.");
			
			LibroBiblioteca libro10 = new LibroBiblioteca();
			libro10.setCodigoL("LIB-10");
			libro10.setNombreL("Pedro Paramo");
			libro10.setAutorL("Juan Rulfo");
			libro10.setAnioL("1955");
			
			LibroBiblioteca listaLibros[] = new LibroBiblioteca[1000];
			listaLibros[0]=libro1;
			listaLibros[1]=libro2;
			listaLibros[2]=libro3;
			listaLibros[3]=libro4;
			listaLibros[4]=libro5;
			listaLibros[5]=libro6;
			listaLibros[6]=libro7;
			listaLibros[7]=libro8;
			listaLibros[8]=libro9;
			listaLibros[9]=libro10;
		
			
		switch (opcion) {
		case "1":
			String op1;
			do {
			System.out.println();	
			System.out.println("*****Menú Estudiante*****");
			System.out.println("a. Consultar libros");
			System.out.println("b. Reservar libro");
			System.out.println("c. Salir al menú principal");
			System.out.print("Digite una opcion: ");
			
			op1 = in.next();
			switch (op1) {
			case "a":
				System.out.println("Ingrese el nombre del libro: ");
				String nombreLibro = in.next();
				System.out.println("Ingrese el nombre del autor del libro: ");
				String nombreAutor = in.next();
				boolean r = listaLibros.equals(nombreLibro);
				boolean r2 = listaLibros.equals(nombreAutor);
				if (listaLibros.equals(nombreLibro) || listaLibros.equals(nombreAutor)) {
					System.out.println(Arrays.toString(listaLibros));
				}else {
					System.out.println("Libro no encontrado");
				}
				break;
			case "b":
				System.out.println("Ingrese el código del libro a reservar: ");
				String codigoLibro = in.next();
				System.out.println("Ingrese su número de cedula: ");
				String NumeroCedula = in.next();
				boolean r3 = listaLibros.equals(codigoLibro);
				break;
			case "c":
				System.out.println("Regresando al menú principal");
				System.out.println();
				break;
			default:
				System.out.println("No ha elegido ninguna opción");
				System.out.println();
				break;	
			}	
			}while (!op1.equals("c"));
		break;
		case "2":
			String op2;
			do {
		    System.out.println();	
			System.out.println("*****Menú Bibliotecario*****");
			System.out.println("a. Ingrsar un libro");
			System.out.println("b. Prestar un libro");
			System.out.println("c. Aplazar fecha de entrega");
			System.out.println("d. Salir al menú principal");
			System.out.print("Digite una opcion: ");
			op2 = in.next();
			switch (op2) {
			case "a":
				
				break;
			case "b":
				
				break;
			case "c":
				
				break;
			case "d":
				System.out.println("Regresando al menú principal");
				System.out.println();
				break;
			default:
				System.out.println("No ha elegido ninguna opción");
				System.out.println();
				break;	
			}
			}while(!op2.equals("d"));
		break;
		case "3":
			System.out.println("El sistema se esta cerrando...");
			System.out.println();
		break;	
		default:
			System.out.println("No ha elegido ninguna opción");
			System.out.println();
		break;	
		}
		}while (!opcion.equals("3"));
		System.out.println("Gracias por preferirnos");
	}

}

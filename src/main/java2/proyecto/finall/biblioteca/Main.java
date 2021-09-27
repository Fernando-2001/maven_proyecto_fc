package proyecto.finall.biblioteca;

import java.time.LocalDate;
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
			libro1.setEstadoL("Disponible");
			
			LibroBiblioteca libro2 = new LibroBiblioteca();
			libro2.setCodigoL("LIB-2");
			libro2.setNombreL("El silencio de un artista");
			libro2.setAutorL("F. Javier Laso");
			libro2.setAnioL("2021");
			libro2.setEstadoL("Prestado");
			
			LibroBiblioteca libro3 = new LibroBiblioteca();
			libro3.setCodigoL("LIB-3");
			libro3.setNombreL("Un intelectual en su memoria");
			libro3.setAutorL("Cesar de la Lama");
			libro3.setAnioL("2021");
			libro3.setEstadoL("Disponible");
			
			LibroBiblioteca libro4 = new LibroBiblioteca();
			libro4.setCodigoL("LIB-4");
			libro4.setNombreL("Divina comedia");
			libro4.setAutorL("Dante Alighieri");
			libro4.setAnioL("1321");
			libro4.setEstadoL("Reservado");
			
			LibroBiblioteca libro5 = new LibroBiblioteca();
			libro5.setCodigoL("LIB-5");
			libro5.setNombreL("Don Quijote de la Mancha");
			libro5.setAutorL("Miguel de Cervantes");
			libro5.setAnioL("1615");
			libro5.setEstadoL("Prestado");
			
			LibroBiblioteca libro6 = new LibroBiblioteca();
			libro6.setCodigoL("LIB-6");
			libro6.setNombreL("Crimen y castigo");
			libro6.setAutorL("Fiódor Dostoievski");
			libro6.setAnioL("1866");
			libro6.setEstadoL("Disponible");
			
			LibroBiblioteca libro7 = new LibroBiblioteca();
			libro7.setCodigoL("LIB-7");
			libro7.setNombreL("Cien años de soledad");
			libro7.setAutorL("Gabriel García Márquez");
			libro7.setAnioL("1985");
			libro7.setEstadoL("Prestado");
			
			LibroBiblioteca libro8 = new LibroBiblioteca();
			libro8.setCodigoL("LIB-8");
			libro8.setNombreL("Ilíada");
			libro8.setAutorL("Homero");
			libro8.setAnioL("750 a.C.");
			libro8.setEstadoL("Reservado");
			
			LibroBiblioteca libro9 = new LibroBiblioteca();
			libro9.setCodigoL("LIB-9");
			libro9.setNombreL("Odisea");
			libro9.setAutorL("Homero");
			libro9.setAnioL("750 a.C.");
			libro9.setEstadoL("Reservado");
			
			LibroBiblioteca libro10 = new LibroBiblioteca();
			libro10.setCodigoL("LIB-10");
			libro10.setNombreL("Pedro Paramo");
			libro10.setAutorL("Juan Rulfo");
			libro10.setAnioL("1955");
			libro10.setEstadoL("Disponible");
			
			LibroBiblioteca listaLibros[] = new LibroBiblioteca[100];
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
				
				for (int i = 0; i<listaLibros.length;i++) {
					LibroBiblioteca libro = listaLibros[i];
					
					boolean busca = libro.getNombreL().contains(nombreLibro);
					
					boolean busca2 = libro.getAutorL().contains(nombreAutor);
					
					if (busca == true) {
						System.out.println(listaLibros[i]);
					}
						if (busca2 == true ) {
						System.out.println(listaLibros[i]);
					}
				}
				break;
			case "b":
				System.out.println("Ingrese el código del libro a reservar: ");
				String codigoLibro = in.next();
				System.out.println("Ingrese su número de cedula: ");
				String numeroCedula = in.next();
				
				LocalDate diaHoy = LocalDate.now();
			    LocalDate diaFin = diaHoy.plusDays(5);
				
				for (int i = 0; i<listaLibros.length; i++) {
					LibroBiblioteca libro = listaLibros[i];
					libro.setRecervadoPor(numeroCedula);
					boolean busca = libro.getCodigoL().contentEquals(codigoLibro);
					
				if(busca == true) {
					if (libro.getEstadoL().equals("Disponible")) {
					    libro.setEstadoL("Reservado");
					    libro.setFechaEntrega(""+diaFin);
					    System.out.println(listaLibros[i]);
					    System.out.println("El libro ha sido correctamente reservado debe retirar el dia "
					    +diaFin+" de la biblioteca");
					}else {
						System.out.println("Libro reservado o prestado");
					}
					}
				}
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
			System.out.println("a. Ingresar un libro");
			System.out.println("b. Prestar un libro");
			System.out.println("c. Aplazar fecha de entrega");
			System.out.println("d. Salir al menú principal");
			System.out.print("Digite una opcion: ");
			op2 = in.next();
			switch (op2) {
			case "a":
				System.out.println("Ingrese el codigo del libro: ");
				String codigoLibro = in.next();
				System.out.println("Ingrese el nombre del libro: ");
				String nombre = in.next();
				System.out.println("Ingrese el nombre del autor: ");
				String autor = in.next();
				System.out.println("Ingrese el año de publicación: ");
				String anioPublicacion = in.next();
				System.out.println("Ingrese la editorial: ");
				String editorial = in.next();
				System.out.println("Ingrese la cantidad de paginas: ");
				int paginas = in.nextInt();
				System.out.println("Ingrese el precio: ");
				String precio = in.next();
				
					LibroBiblioteca libro11 = new LibroBiblioteca();
					
					libro11.setCodigoL(codigoLibro);
					libro11.setNombreL(nombre);
					libro11.setAutorL(autor);
					libro11.setAnioL(anioPublicacion);
					
					listaLibros [10] = libro11;
					
				System.out.println("que tipo de libro es:");
				System.out.println("1. libro de trabajo");
				System.out.println("2. libro de lectura");
				int op = in.nextInt();
				if (op==1) {
					System.out.println("Código de autorización: ");
					String codigoAutorizacion = in.next();
					System.out.println(listaLibros[10]);
					System.out.println("Libro guardado");
				}else if(op==2) {
					System.out.println("tiempo aproximado de lectura: ");
					String tiempoAproximado = in.next();
					System.out.println(listaLibros[10]);
					System.out.println("Libro guardado");
				}else {
					System.out.println("opcion invalida vuelva a intentarlo");
				}
				break;
			case "b": 
				System.out.println("Ingrese el codigo de un libro: ");
				String codi = in.next();
				
				LocalDate diaHoy = LocalDate.now();
			    LocalDate diaFin = diaHoy.plusDays(5);
				
				for (int i = 0; i<listaLibros.length; i++) {
					LibroBiblioteca lib = listaLibros[i];
					
					boolean busca = lib.getCodigoL().contentEquals(codi);
					
				if(busca == true) {
					if (lib.getEstadoL().equals("Reservado")) {
						 lib.setFechaEntrega(""+diaFin);
						    System.out.println(listaLibros[i]+"reservado por: "+lib.getRecervadoPor());
					}
				}else {
					System.out.println("Codigo incorrecto");
				}
				
				}
				
				break;
			case "c":
				System.out.println("Ingrese el codigo del un libro: ");
				String cod = in.next();
				System.out.println("Ingrese el numero de cedula: ");
				String nc = in.next();
				
				LocalDate diaHoy1 = LocalDate.now();
			    LocalDate diaFin1 = diaHoy1.plusDays(5);
				
				for (int i = 0; i<listaLibros.length; i++) {
					LibroBiblioteca lib = listaLibros[i];
					
					boolean busca = lib.getCodigoL().contentEquals(cod);
					
				if(busca == true) {
					if (lib.getEstadoL().equals("Prestado")) {
						 lib.setFechaEntrega(""+diaFin1);
						 lib.setRecervadoPor(nc);
						    System.out.println(listaLibros[i]+"reservado por: "+lib.getRecervadoPor());
						    System.out.println("lesecicone una opcion: ");
						    System.out.println("1. Aplazar");
						    System.out.println("2. No aplazar");
						    int o = in.nextInt();
						    if(o==1) {
						    	System.out.println("ingrese el tiempo de plazo: ");
						    	int tiempoPlazo = in.nextInt();
						    	 LocalDate diaPlazo = diaFin1.plusDays(tiempoPlazo);
						    	 lib.setFechaEntrega(""+diaPlazo);
						    	 System.out.println(listaLibros[i]+"reservado por: "+lib.getRecervadoPor());
						    }else if (o==2) {
						    	System.out.println(listaLibros[i]+"reservado por: "+lib.getRecervadoPor());
						    }
					}
				}			
				}
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

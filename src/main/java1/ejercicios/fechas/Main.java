package ejercicios.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();//deprecada y ya no se deberia usar
		
		LocalDate diaHoy = LocalDate.now();
		LocalDate diaFin = diaHoy.plusDays(15);
		
		CursoVacacional curso1 = new CursoVacacional();
		curso1.setNombre("Volley principiantes");
		curso1.setFechaInicio(diaHoy);
		curso1.setFechaFin(diaFin);
		
		System.out.println("Nombre: "+curso1.getNombre());
		System.out.println("F I: "+curso1.getFechaInicio());
		System.out.println("F F: "+curso1.getFechaFin());
		
		LocalDate diaHoy2 = LocalDate.now();
		LocalDate diaQueInicio = diaHoy2.plusDays(2);
		LocalDate diaQueFinaliza = diaQueInicio.plusDays(20);
		
		CursoVacacional curso2 = new CursoVacacional();
		curso2.setNombre("Natación principiantes");
		curso2.setFechaInicio(diaQueInicio);
		curso2.setFechaFin(diaQueFinaliza);
		
		System.out.println("Nombre: "+curso2.getNombre());
		System.out.println("F I: "+curso2.getFechaInicio());
		System.out.println("F F: "+curso2.getFechaFin());
		
		//Fechas específicas
		
		LocalDate fechaEspecifica = LocalDate.of(2020,2,15);
		System.out.println(fechaEspecifica);
		
		//Ejercicios
		LocalDate fechaEspeciInicioT1= LocalDate.of(2022, 2, 15);
		LocalDate fechaEspeciFin = LocalDate.of(2022, 7, 10);
		
		CursoVacacional curso3 = new CursoVacacional();
		curso3.setNombre("Karate");
		curso3.setFechaInicio(fechaEspeciInicioT1);
		curso3.setFechaFin(fechaEspeciFin);
		
		LocalDate fechaVista = curso3.getFechaFin();
		LocalDate fechaVistaNueva = fechaVista.plusDays(3);
		
		curso3.setFechaFin(fechaVistaNueva);
		
		System.out.println("Nombre: "+curso3.getNombre());
		System.out.println("F I: "+curso3.getFechaInicio());
		System.out.println("F F: "+curso3.getFechaFin());
		System.out.println("F F Formateada: "+curso3.getFechaFin().format(DateTimeFormatter.ofPattern("MM_dd-yyyy")));
		
		System.out.println("Que dia es hoy: ");
		LocalDate diaHoy3 = LocalDate.now();
		System.out.println(diaHoy3.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
		System.out.println(diaHoy3.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		}

}

package ejercicios.nonaccess.finall;

public final class EstudianteCiencias extends Estudiante {
	
	private String velocidadInternet;
	
	public final String horarioEntrada = "08:00";
	public String ciudadNacimiento= "Quito";
	
	public EstudianteCiencias() {
		// No se pede reasignar un valor a un atributo final
		horarioEntrada = "08:30";
		ciudadNacimiento= "Guayaquil";
	}
}

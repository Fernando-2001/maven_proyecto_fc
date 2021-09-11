package ejercicios.nonaccess.finall;

public class EstudiantesMedicina extends Estudiante {
	
	private String codigoMSP;
	
	protected final void realizarPracticas() {
	System.out.println("Realice 50 horas de practica");
	}
	
	protected void realizarPasantias() {
		System.out.println("Realice 100 horas de pasantias");	
	}
}

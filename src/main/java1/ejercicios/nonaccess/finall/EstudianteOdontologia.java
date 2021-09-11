package ejercicios.nonaccess.finall;

public class EstudianteOdontologia extends EstudiantesMedicina {
	
	
	// no se puede sobreescribir un metodo final del padre
	public void realizarPracticas() {
	System.out.println("Realice 100 horas de practica");
	}
	protected void realizarPasantias() {
		System.out.println("Realice 100 horas de pasantias");	
	}
}

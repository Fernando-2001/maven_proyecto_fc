package ejercicios.nonaccess.deber;

public class Contador extends Trabajador {
	
	public final String horaDeEntrada = "8:00";
	
	public Contador() {
		//no se puede modificar un atributo final
		horaDeEntrada = "8:15";
	}
	
	
}

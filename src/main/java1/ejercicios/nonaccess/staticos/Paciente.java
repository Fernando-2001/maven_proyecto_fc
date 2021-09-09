package ejercicios.nonaccess.staticos;

public class Paciente {
	private String nombre;
	private int edad;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	private static String nacionalidad;
	private static int edadLimite = 65;

	public void registrar(String nombre) {
		System.out.println("Se registra el paciente: " + nombre);
	}

	private static void consultarNacionalidad() {
		System.out.println();
	}

	public static void consultarNacionalidadStatica() {
		System.out.println("la nacionalidad de: " + nacionalidad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static String getNacionalidad() {
		return nacionalidad;
	}

	public static void setNacionalidad(String nacionalidad) {
		Paciente.nacionalidad = nacionalidad;
	}

	public static int getEdadLimite() {
		return edadLimite;
	}

	public static void setEdadLimite(int edadLimite) {
		Paciente.edadLimite = edadLimite;
	}

}

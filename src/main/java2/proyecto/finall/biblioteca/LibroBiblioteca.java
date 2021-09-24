package proyecto.finall.biblioteca;

public class LibroBiblioteca {

	
	private String codigoL;
	public String nombreL;
	public  String autorL;
	public String anioL;
	public String estadoL;
	public String fechaEntrega;
	
	
	public String getCodigoL() {
		return codigoL;
	}
	public void setCodigoL(String codigoL) {
		this.codigoL = codigoL;
	}
	public String getNombreL() {
		return nombreL;
	}
	public void setNombreL(String nombreL) {
		this.nombreL = nombreL;
	}
	public String getAutorL() {
		return autorL;
	}
	public void setAutorL(String autorL) {
		this.autorL = autorL;
	}
	public String getAnioL() {
		return anioL;
	}
	public void setAnioL(String anioL) {
		this.anioL = anioL;
	}
	public String getEstadoL() {
		return estadoL;
	}
	public void setEstadoL(String estadoL) {
		this.estadoL = estadoL;
	}
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	@Override
	public String toString() {
		return "\nLibro: [codigo=" + codigoL + ", nombre=" + nombreL + ", autor=" + autorL + ", año="
				+ anioL + ", estado=" + estadoL + ", fechaEntrega=" + fechaEntrega + "]";
	}
	
}

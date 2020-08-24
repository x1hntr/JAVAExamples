
public class DocenteOcacional extends Docente{
	private String fechaInicio;
	private String fechaFin;
	
	public DocenteOcacional(String cedula, String nombre, String apellido, String ciudad, double sueldo, String cargo, int numHoras, String titulo, String fechaInicio, String fechaFin) {
		super(cedula, nombre, apellido, ciudad, sueldo, cargo, numHoras, titulo);
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
	
}

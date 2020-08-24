
public class Alumno extends Persona{
protected int numCreditos;
protected String carrera;
	public Alumno(String cedula, String nombre, String apellido, String ciudad, int numCreditos, String carrera) {
		super(cedula, nombre, apellido, ciudad);
		this.numCreditos = numCreditos;
		this.carrera = carrera;
	}
	
	@Override
	public void trabajar() {
		super.trabajar();
		System.out.println("y estudio");
	}
	
	@Override
	public String toString() {
		return "Alumno [ciudad=" + ciudad + "]";
	}

	public int getNumCreditos() {
		return numCreditos;
	}
	public void setNumCreditos(int numCreditos) {
		this.numCreditos = numCreditos;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
	
}


public class Tesista extends Alumno{
private String nomTesis;
	public Tesista(String cedula, String nombre, String apellido, String ciudad, int numCreditos, String carrera, String nomTesis) {
		super(cedula, nombre, apellido, ciudad, numCreditos, carrera);
		this.nomTesis=nomTesis;
	}
	@Override
	public void trabajar() {
		super.trabajar();
		System.out.println("y redacto tesis");
	}
	
	
	@Override
	public String toString() {
		return "Tesista [ciudad=" + ciudad + "]";
	}
	
	public String getNomTesis() {
		return nomTesis;
	}
	public void setNomTesis(String nomTesis) {
		this.nomTesis = nomTesis;
	}
	
	
	
}

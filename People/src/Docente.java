
public class Docente extends Persona{
	protected double sueldo;
	protected String cargo;
	protected int numHoras;
	protected String titulo;
	
	public Docente (String cedula, String nombre, String apellido, String ciudad, double sueldo, String cargo, int numHoras, String titulo) {
		super(cedula, nombre, apellido, ciudad);
		this.sueldo=sueldo;
		this.cargo=cargo;
		this.numHoras=numHoras;
		this.titulo=titulo;		
	}

	//metodos de la clase
	@Override 
	public void trabajar() {
		super.trabajar();
		System.out.println("y ensenia");
	}
	
	@Override
	public String toString() {
		return "Docente [ciudad=" + ciudad + "]";
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

}

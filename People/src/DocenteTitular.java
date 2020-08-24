
public class DocenteTitular extends Docente{
	private String gestion;
	private Constante.tipo tipo;
	
	public DocenteTitular(String cedula, String nombre, String apellido, String ciudad, double sueldo, String cargo, int numHoras, String titulo, String gestion, Constante.tipo tipo) {
		super(cedula, nombre, apellido, ciudad, sueldo, cargo, numHoras, titulo);
		this.gestion=gestion;
		this.tipo=tipo;
	}
	
	//metodos de la clase
	
	@Override 
	public void trabajar() {
		super.trabajar();
		System.out.println("y ensenia y no importa soy malo");
	}
	
	
	@Override
	public String toString() {
		return "DocenteTitular [ciudad=" + ciudad + "]";
	}

	public String getGestion() {
		return gestion;
	}

	public void setGestion(String gestion) {
		this.gestion = gestion;
	}

	public Constante.tipo getTipo() {
		return tipo;
	}

	public void setTipo(Constante.tipo tipo) {
		this.tipo = tipo;
	}
	
	
	

}

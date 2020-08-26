
public class Persona {
	protected final String cedula;
	protected final String nombre;
	protected final String apellido;
	protected String ciudad;
	
	public Persona (String cedula, String nombre, String apellido, String ciudad) {
		this.cedula=cedula;
		this.nombre=nombre;
		this.apellido=apellido;
		this.ciudad=ciudad;
	}
	
	public void trabajar() {
		System.out.println("Soy una persona que trabaja:");
	}
	public final void respirar() {
		System.out.println("Todos respiramos igual");
	}
	
	
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCedula() {
		return cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}


}

public class Vaca {
	private Tipo tipo;
	private int edad;
	private String nombre;
	private static int numeroVacas = 0;
	//Constructores
	public Vaca() {
		numeroVacas = numeroVacas + 1;
		this.tipo = new Tipo();
		this.edad = 1;
		this.nombre = "Filomena";
		System.out.println("Se ha creado la vaca numero: " + this.numeroVacas);
	}
	public Vaca(Tipo vTipo, int vEdad, String vNombre) {
		numeroVacas = numeroVacas + 1; 
		this.tipo = vTipo;
		this.edad = vEdad;
		this.nombre = vNombre;
		System.out.println("Se ha creado la vaca numero: " + this.numeroVacas);
	}
	public Vaca(int vEdad, String vNombre) {
		numeroVacas = numeroVacas + 1;
		this.tipo = new Tipo();
		this.edad = vEdad;
		this.nombre = vNombre;
		System.out.println("Se ha creado la vaca numero: " + this.numeroVacas);
	}
	//Metodos GET and SET
	public Tipo getTipo() {
		return tipo;
	}
	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//Metodos del objeto
	public void muuu() {
		System.out.println("Mi nombre es: " + this.nombre + " y mi edad es: " + this.edad );
	}
	public void compararEdad(Vaca vVaca) {
		if (vVaca.edad > this.edad) {
			System.out.println("La vaca: " + vVaca.nombre + " es más vieja que la vaca: " + this.nombre);
		}else {
			System.out.println("La vaca: " + this.nombre + " es más vieja que la vaca: " + vVaca.nombre);
		}
	}
	@Override
	public String toString() {
		return "Vaca [tipo=" + tipo + ", edad=" + edad + ", nombre=" + nombre + "]";
	}
	
}

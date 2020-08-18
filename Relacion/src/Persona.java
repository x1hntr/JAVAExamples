
public class Persona {
	private static int num=0;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private int anio;
	private int mes;
	private Constante.sexo sexo;
	private final String id; 
	private Constante.estado estadoCivil;
	private int numHijos;
	private Persona conyugue;
	private Persona hijo;

	//CONSTRUCTOR
	public Persona(String nombre, String primerApellido, String segundoApellido, Constante.sexo sexo, Constante.estado estadoCivil, int anio, int mes) {
		this.nombre=nombre;
		this.primerApellido=primerApellido;
		this.segundoApellido=segundoApellido;
		this.sexo=sexo;
		this.estadoCivil=estadoCivil;
		this.conyugue=conyugue;
		this.hijo=hijo;
		num++;
		this.id = "ID"+num;
		this.numHijos=0;
	}



	public Persona(String nombre, String primerApellido, String segundoApellido, Constante.sexo sexo, Constante.estado estadoCivil, int numHijos, int anio, int mes) {
		this.nombre=nombre;
		this.primerApellido=primerApellido;
		this.segundoApellido=segundoApellido;
		this.sexo=sexo;
		this.estadoCivil=estadoCivil;
		this.conyugue=conyugue;
		this.hijo=hijo;
		num++;
		this.id = "ID"+num;
		this.numHijos=numHijos;
	}

	//METODOS
	public void casarPersona(Persona v) {
		this.setConyugue(v);
		v.setConyugue(this);
		this.estadoCivil=Constante.estado.Casado;
		v.estadoCivil=Constante.estado.Casado;
	}
	public void darHijo(Persona v) {
		this.setHijo(v);
		v.setConyugue(this);
	}
	
	public String imprimir() {
		return this.getNombre() +" "+ this.getPrimerApellido();
	}
	
	//GETS AND SETS

	public static int getNum() {
		return num;
	}

	public Constante.estado getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(Constante.estado estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public static void setNum(int num) {
		Persona.num = num;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Constante.sexo getSexo() {
		return sexo;
	}

	public void setSexo(Constante.sexo sexo) {
		this.sexo = sexo;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	public String getId() {
		return id;
	}
	
	public Persona getConyugue() {
		return conyugue;
	}

	public void setConyugue(Persona conyugue) {
		this.conyugue = conyugue;
	}
	
	
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}


	public Persona getHijo() {
		return hijo;
	}

	public void setHijo(Persona hijo) {
		this.hijo = hijo;
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", sexo=" + sexo + ", id=" + id + ", estadoCivil=" + estadoCivil + ", numHijos="
				+ numHijos + "]";
	}
}

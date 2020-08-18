import java.util.ArrayList;

public class ListaPersona {
	private ArrayList<Persona> listaP;
	
	public ListaPersona() {
		listaP = new ArrayList<Persona>();
	}
	
	public void agregarPersona(Persona p) {
		listaP.add(p);
	}
	
	public int numHijos(Persona p) {
			return p.getNumHijos();
	}
	public void hijosDetalle(Persona p) {
		System.out.println(p.getHijo().imprimir());
	}
	public boolean casadoOno(Persona p) {
		if(p.getEstadoCivil().equals(Constante.estado.Casado)) {
			return true; 
		}else {
			return false;
		}
	}
	
	public Persona conyugue(Persona p) {
		return p.getConyugue();
	}
	
}

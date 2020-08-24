import java.util.ArrayList;

public class ListaPersona {
	private ArrayList<Persona> listaP;
	
	public ListaPersona() {
		listaP = new ArrayList<Persona>();
	}
	
	public void agregarPersona(Persona p) {
		listaP.add(p);
	}
	
	public Persona buscarPersona(String cedula) {
		for (Persona p: listaP) {
			if (p.getCedula().equals(cedula)) {
				return p;
			}
		}
		return null;
	}
	
	public void eliminarPersona(String cedula) {
		for (Persona p: listaP) {
			if (p.getCedula().equals(cedula)) {
				listaP.remove(p);
			}
		}
	
	}

	@Override
	public String toString() {
		return "ListaPersona [listaP=" + listaP + "]";
	}
	
	
	}
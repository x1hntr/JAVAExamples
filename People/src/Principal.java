
public class Principal {

	public static void main(String[] args) {
		ListaPersona registro = new ListaPersona();
		
		Persona persona1 = new Persona("172524", "Daniel", "Villavicencio", "Quito");
		registro.agregarPersona(persona1);
		
		DocenteTitular docente1 = new DocenteTitular("172523", "Andres", "Villavicencio", "Quito", 250.83, "Profesor", 10, "PHd", "Encargado", Constante.tipo.Auxiliar);
		registro.agregarPersona(docente1);
		
		DocenteOcacional docente2 = new DocenteOcacional("171235", "Juan", "Quinonez", "Quito", 238, "Profesor", 10, "PHd", "2012/12/12", "2013/12/12");
		registro.agregarPersona(docente2);
		
		Alumno alumno1 = new Alumno("172524", "Daniel", "Villavicencio", "Quito", 28, "Electronica");
		registro.agregarPersona(alumno1);
		
		Tesista tesista1 = new Tesista("172524", "Daniel", "Villavicencio", "Quito", 28, "Electronica", "Dise'o de Redes");	
		registro.agregarPersona(tesista1);
		
	}
}

public class Principal {

	public static void main(String[] args) {
		ListaPersona registro = new ListaPersona();
		
		//7. CREAR DOS PERSONAS 
		Persona ID1 = new Persona("Andres", "Santafe", "Perez", Constante.sexo.Masculino, Constante.estado.Soltero, 1944, 2);
		registro.agregarPersona(ID1);
		Persona ID2 = new Persona("Adriana", "Villa", "Perez", Constante.sexo.Femenino, Constante.estado.Soltero, 1, 1993, 1);
		registro.agregarPersona(ID2);
		
		//8. CASAR DOS PERSONAS
		ID1.casarPersona(ID2);
		
		//9. CREAR UNA PERSONA SOLTERA
		Persona ID3 = new Persona("Juan", "Gonzalez", "Perez", Constante.sexo.Masculino, Constante.estado.Soltero, 2013, 1);
		registro.agregarPersona(ID3);
		ID2.darHijo(ID3);
		
		//10. CREAR UNA PERSONA SOLTERA
		Persona ID4 = new Persona("Daniel", "Villa", "Heredia", Constante.sexo.Masculino, Constante.estado.Soltero, 2, 1994, 2);
		registro.agregarPersona(ID4);
		
		
		
		System.out.println(ID4.imprimir() +" tiene; "+ registro.numHijos(ID4) + " hijos");
		System.out.println(ID2.imprimir() +" Se encuentra casado: "+ registro.casadoOno(ID2));
		System.out.println(ID1.imprimir() + " Se encuentra casado: "+ registro.conyugue(ID1).imprimir());
		
		registro.hijosDetalle(ID2);
	}
	

}

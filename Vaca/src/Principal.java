
public class Principal {
	public static void main (String[] args) {
		Tipo t1 = new Tipo(1, "Lechera");
		Tipo t2 = new Tipo(2, "Semental");
		Tipo t3 = new Tipo(3, "Ternera");
		
		//Las tres vacas 
		Vaca v1 = new Vaca();
		Vaca v2 = new Vaca(2, "Valentina");
		Vaca v3 = new Vaca(t1, 5, "Panchita");
		
		//Cambiar edad vaca filomena 
		v1.setEdad(4);

		//Imprimir el Id y Tipo de Panchita
		System.out.println("El Id de Panchita es: " + v3.getTipo().id + " y la clase es: " + v3.getTipo().clase);
		
		//Hacer que las vacas mujan
		v1.muuu();
		v2.muuu();
		v3.muuu();
		
		//Comparar edad de panchita y valentina
		v3.compararEdad(v2);
	}

}


public class main {

	public static void main(String[] args) {
		
		// En partes no sales los 0, por la biblioteca que uso para que solo tenga 2 decimales. 
		// En el resultado creo que no hace falta. 
		
		Raices raices = new Raices(5,9 ,2);
		
		System.out.println(raices.getDiscriminante());
		
		raices.calcuar();
		
		raices.obtenerRaices();


	}

}


public class main {

	public static void main(String[] args) {

		Libro libro1 = new Libro();

		libro1.setISBN("9788445000663");
		libro1.setTitulo("El Señor de los Anillos 1");
		libro1.setAutor("J.R.R. TOLKIEN");
		libro1.setNumeroDePaginas(576);


		Libro libro2 = new Libro();

		libro2.setISBN("9788426424242");
		libro2.setTitulo("AUTOBIOGRAFIA");
		libro2.setAutor("CHARLES CHAPLIN");
		libro2.setNumeroDePaginas(720);
		
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		if (libro1.getNumeroDePaginas() > libro2.getNumeroDePaginas()) {
			System.out.println("El libro con mas paginas es " + libro1.getTitulo());
			
		} else if (libro1.getNumeroDePaginas() < libro2.getNumeroDePaginas()) {
			System.out.println("El libro con mas paginas es " + libro2.getTitulo());
			
		} else {
			System.out.println("Tienen la misma cantidad de paginas.");
		}


	}

}

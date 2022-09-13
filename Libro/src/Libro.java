
public class Libro {
	
	// He decidido poner ISBN en string ya que asi es mas manipulable
	private String ISBN;
	private String Titulo;
	private String Autor;
	private int NumeroDePaginas;
	
	
	// getters y setters
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getNumeroDePaginas() {
		return NumeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		NumeroDePaginas = numeroDePaginas;
	}
	@Override
	public String toString() {
		return "El libro " + Titulo + " con ISBN " + ISBN + " creado por el autor " + Autor + " tiene " + NumeroDePaginas + " paginas.";
	}
	
	
	
	
	

}

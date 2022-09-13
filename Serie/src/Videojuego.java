
public class Videojuego implements Entregable {
	
	private String titulo = "";
	private int horasEstimadas = 10;
	private boolean entregado = false;
	private String genero = "";
	private String companiia = "";
	
	
	public Videojuego() {

	}


	public Videojuego(String titulo, int horasEstimadas) {
	
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}


	public Videojuego(String titulo, int horasEstimadas, String genero, String companiia) {

		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.companiia = companiia;
	}


	
	// getters y setters
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getHorasEstimadas() {
		return horasEstimadas;
	}


	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCompaniia() {
		return companiia;
	}


	public void setCompaniia(String companiia) {
		this.companiia = companiia;
	}


	
	public String toString() {
		return "Titulo: " + titulo + "\nHoras Estimadas: " + horasEstimadas + "\nEntregado: " + entregado + "\nGenero: " + genero + "\nCompañia: " + companiia;
	}


	// metodos de la interfaz Entregable
	public void entregar() {
		this.entregado = true;
	}



	public void devolver() {
		this.entregado = false;
	}



	public boolean isEntregado() {
		return entregado;
	}


	public int compareTo(Object a) {
		
		Videojuego obj = (Videojuego)a;
		
		int num = 0;
		
		if (this.horasEstimadas > obj.horasEstimadas) {
			num = 0;
			
		} else {
			num = 1;
		}
		
		
		return num;
		
	}
	
	
	
	
	
}

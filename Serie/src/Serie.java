
public class Serie implements Entregable {
	
	private String titulo = "";
	private int numeroDeTemporadas = 3;
	private boolean entregado = false;
	private String genero = "";
	private String creador = "";
	
	
	
	public Serie() {

	}


	public Serie(String titulo, String creador) {
	
		this.titulo = titulo;
		this.creador = creador;
	}


	public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {

		this.titulo = titulo;
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.genero = genero;
		this.creador = creador;
	}


	
	// getters y setters
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}


	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}


	public String toString() {
		return "Titulo: " + titulo + "\nNumero De Temporadas: " + numeroDeTemporadas + "\nEntregado: " + entregado + "\nGenero: " + genero + "\nCreador: " + creador;
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
		
		Serie obj = (Serie)a;
		
		int num = 0;
		
		if (numeroDeTemporadas > obj.numeroDeTemporadas) {
			num = 0;
			
		} else {
			num = 1;
		}
		
		
		return num;

	}
	
	
	
}

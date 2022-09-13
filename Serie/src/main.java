
public class main {

	public static void main(String[] args) {
		
		// Creacion de objetos
		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];

		series[0] = new Serie("Señor de los anillos", 3, "Aventura", "J. R. R. Tolkien");
		series[1] = new Serie("Jurassic World", 5, "Ciencia ficción", "Universal Pictures");
		series[2] = new Serie("Sandman", 1, "Horror", "Allan Heinberg");
		series[3] = new Serie("Star Wars", 3, "Aventura", "Disney");
		series[4] = new Serie("Vinland Saga", 4, "Ficción histórica", "Wit Studio");


		videojuegos[0] = new Videojuego("bo2", 59, "Shooter", "Activision");
		videojuegos[1] = new Videojuego("ark", 900, "Shooter", "supervivencia");
		videojuegos[2] = new Videojuego("League of Legends", 2, "rol de acción", "Riot Games");
		videojuegos[3] = new Videojuego("Escape from Tarkov", 3000, "disparos en primera persona", "Battlestate Games");
		videojuegos[4] = new Videojuego("dark souls 3", 6, "accion", "FromSoftware");

		// entregamos 1 de cada con la funcion entregar
		videojuegos[0].entregar();
		series[0].entregar();


		// Comprobamos cuantos entregados hay
		int contadorEntregados = 0;

		for (int i = 0; i < videojuegos.length; i++) {
			if (series[i].isEntregado()) {
				contadorEntregados++;
			}
			if (videojuegos[i].isEntregado()) {
				contadorEntregados++;
			}
		}
		
		// Imprimimos por pantalla el numero
		System.out.println("Hay " + contadorEntregados + " entregados.");
		System.out.println();
		
		
		// Los devolvemos
		videojuegos[0].devolver();
		series[0].devolver();
		
		
		// Comprovamos cual es la serie con mas temporadas y el videojuego con mas horas
		int videojuegoConMasHoras = 0;
		int serieConMastemporadas = 0;
		
		Serie serieMastemporadas = series[0];
		Videojuego juegoMasHoras = videojuegos[0];
		
		
		for (int i = 0; i < videojuegos.length - 1; i++) {
			if (juegoMasHoras.compareTo(videojuegos[i + 1]) == 1) {
				juegoMasHoras = videojuegos[i + 1];
			}

			if (serieMastemporadas.compareTo(series[i + 1]) == 1) {
				serieMastemporadas = series[i + 1];
			}
		}
		
		System.out.println(juegoMasHoras);
		System.out.println("---------------------------------------------");
		System.out.println(serieMastemporadas);

	}

}

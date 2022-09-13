
public class Electrodomestico {
	static final double precioBasePorDefecto = 100;
	static final String colorPorDefecto = "Blanco";
	static final char consumoEnergeticoPorDefecto = 'F';
	static final int pesoPorDefecto = 5;

	private double precioBase = precioBasePorDefecto;
	private String color = colorPorDefecto;
	private char consumoEnergetico = consumoEnergeticoPorDefecto;
	private int peso = pesoPorDefecto;


	// Controladores
	public Electrodomestico() {

	}


	public Electrodomestico(double precioBase, int peso) {

		this.precioBase = precioBase;
		this.peso = peso;
	}


	public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {

		// Calculamos el precio final 
		this.precioBase = precioBase;

		// Comprobamos que el color este entre los que tenemos
		if (comprobarColor(color)) {
			this.color = color;
		}
		
		// Comprobamos que la letra no este fuera de rango
		if (comprobarConsumoEnergetico(consumoEnergetico)) {
			this.consumoEnergetico = consumoEnergetico;
		}

		this.peso = peso;
	}
	
	
	// getters
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}




	@Override
	public String toString() {
		return "Precio Base: " + precioBase + "€ \nColor: " + color + "\nConsumo Energetico: " + consumoEnergetico + "\nPeso: " + peso + "kg";
	}




	private static boolean comprobarColor(String color) {

		String[] ArrayColores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};

		for (int i = 0; i < ArrayColores.length; i++) {

			// Comprobamos que este el color insertado
			if (color.equalsIgnoreCase(ArrayColores[i])) {
				return true;
			}
		}


		return false;
	}


	private static boolean comprobarConsumoEnergetico(char letra) {

		char[] ArrayLetrasMayusucals = {'A', 'B', 'C', 'D', 'E', 'F'};
		char[] ArrayLetrasMinuscilas = {'a', 'b', 'c', 'd', 'e', 'f'};

		for (int i = 0; i < ArrayLetrasMayusucals.length; i++) {

			// Comprobamos que este el color insertado
			if (letra == ArrayLetrasMayusucals[i] || letra == ArrayLetrasMinuscilas[i]) {
				return true;
			}
		}


		return false;
	}


	/**
	 * Dependiendo de la letra insertada aumenta el precio final
	 * @param letra char
	 * @return <ul>
	 * 			<li> A: 100
	 * 			<li> B: 80
	 * 			<li> C: 60
	 * 			<li> D: 50
	 * 			<li> E: 30
	 * 			<li> F: 10
	 * 		  </ul>
	 */
	public double precioFinal() {

		double precioASubir = 0;



		// Dependiendo de la letra sumara una cosa o otra.

		switch (consumoEnergetico) {
		case 'A':
		case 'a':
			precioASubir += 100;
			break;
		case 'B':
		case 'b':
			precioASubir += 80;
			break;
		case 'C':
		case 'c':
			precioASubir += 60;
			break;
		case 'D':
		case 'd':
			precioASubir += 50;
			break;
		case 'E':
		case 'e':
			precioASubir += 30;
			break;
		case 'F':
		case 'f':
			precioASubir += 10;
			break;

		}


		// Ahora comprobamos el peso

		// Si es mayor de 0 y menor de 19
		if (peso > 0 && peso <= 19) {
			precioASubir += 10;

			// Si es mayor de 20 y menor de 49
		} else if (peso <= 49) {
			precioASubir += 50;

			// Si es mayor de 50 y menor de 79
		} else if (peso <= 79) {
			precioASubir += 80;

			// Si es mayor de 80
		} else if (peso >= 80) {
			precioASubir += 100;

		}


		return precioASubir + precioBase;
	}

}

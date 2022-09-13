
public class main {

	public static void main(String[] args) {

//		Electrodomestico nevera = new Electrodomestico(100, "Rojo", 'A', 80);
//
//		System.out.println(nevera);
//
//		System.out.println("-------------------------------------");
//
//		Lavadora lavadora = new Lavadora(100, "Blanco", 'F', 80, 10);
//
//		System.out.println(lavadora);
//		System.out.println("Precio final de lavadora: " + lavadora.precioFinal() + "€");
//
//		System.out.println("-------------------------------------");
//
//		Television television = new Television(100, "Blanco", 'F', 80, 20, true);
//
//		System.out.println(television);
//		System.out.println("Precio final de lavadora: " + television.precioFinal() + "€");
		
		
		Electrodomestico[] electrodomestico = new Electrodomestico[10];
		
		
		electrodomestico[0] = new Electrodomestico(100, "Blanco", 'A', 15);
		electrodomestico[1] = new Lavadora(200, "Negro", 'B', 20, 20);
		electrodomestico[2] = new Lavadora(300, "Rojo", 'C', 30, 25);
		electrodomestico[3] = new Lavadora(400, "Azul", 'D', 40, 30);
		electrodomestico[4] = new Lavadora(500, "Gris", 'E', 50, 35);
		electrodomestico[5] = new Television(100, "Blanco", 'F', 60, 12, false);
		electrodomestico[6] = new Television(200, "Negro", 'A', 70, 33.1, true);
		electrodomestico[7] = new Television(300, "Rojo", 'B', 80, 11.7, false);
		electrodomestico[8] = new Television(400, "Azul", 'C', 90, 5.8, true);
		electrodomestico[9] = new Television(150, "Gris", 'D', 100, 20, false);
		
		
		double precioFinalLavadoras = 0;
		double precioFinalTelevision = 0;
		double precioFinalElectrodomestico = 0;
		
		for (int i = 0; i < electrodomestico.length; i++) {
			
			// si es television
			if (electrodomestico[i] instanceof Television) {
				precioFinalTelevision += electrodomestico[i].precioFinal();
				
			// si es lavadora
			} else if (electrodomestico[i] instanceof Lavadora) {
				precioFinalLavadoras += electrodomestico[i].precioFinal();
				
			// si es electrodomestico
			} else {
				precioFinalElectrodomestico += electrodomestico[i].precioFinal();
			}
			
		}
		System.out.println(electrodomestico[1].precioFinal());
		
		System.out.println("El precio total de Television es " + precioFinalTelevision);
		System.out.println("El precio total de Lavadora es " + precioFinalLavadoras);
		System.out.println("El precio total de Electrodomestico es " + precioFinalElectrodomestico);
		System.out.println("Precio total: " + (precioFinalTelevision + precioFinalLavadoras + precioFinalElectrodomestico));
		

		
	}

}


public class Lavadora extends Electrodomestico{
	
	static final int cargaPorDefecto = 5;

	private int carga = cargaPorDefecto;
	
	
	// Constructores
	public Lavadora() {

	}

	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);

		
		this.carga = carga;
	}
	
	
	// getter
	public int getCarga() {
		return carga;
	}

	
	
	
	@Override
	public String toString() {
		return super.toString() + "\nCarga: " + carga + "kg";
	}


	
	public double precioFinal() {
		
		double precioFinal = super.precioFinal();
		
		
		if(carga > 30) {
			precioFinal += 50;
		}
		
		return precioFinal;
		
		
	}
	
	
}

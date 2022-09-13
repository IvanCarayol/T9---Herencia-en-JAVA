
public class Television extends Electrodomestico{

	private double resolucion = 20;
	private boolean sintonizadorTDT = false;



	public Television() {

	}


	public Television(double precioBase, int peso) {
		super(precioBase, peso);

	}


	public Television(double precioBase, String color, char consumoEnergetico, int peso, double resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);

		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;

	}



	// getters
	public double getResolucion() {
		return resolucion;
	}


	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}


	@Override
	public String toString() {
		return super.toString() + "\nResolucion: " + resolucion + "\"" + "\nSintonizador TDT: " + sintonizadorTDT;
	}



	public double precioFinal() {

		double precioFinal = super.precioFinal();


		if(resolucion > 40) {
			precioFinal += precioFinal * 30 / 100;
		}
		
		if (sintonizadorTDT) {
			precioFinal += 50;
		}

		return precioFinal;


	}


}

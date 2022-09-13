import java.text.DecimalFormat;

public class Raices {

	private double a;
	private double b;
	private double c;
	
	
	// Constructor
	public Raices(double a, double b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

	
	
	public double getDiscriminante() {
		return (Math.pow(b, 2))-4*a*c;
	}

	public boolean tieneRaices() {

		double discriminante = getDiscriminante();

		if (discriminante >= 0) {
			return true;
		}

		return false;
	}


	public boolean tieneRaiz() {

		double discriminante = getDiscriminante();

		if (discriminante == 0) {
			return true;
		}

		return false;
	}


	public void calcuar() {

		double discriminante = getDiscriminante();

		if (discriminante > 0) {
			System.out.println("La ecuacion tiene dos soluciones.");

		} else if (discriminante == 0) {
			System.out.println("La ecuacion tiene una solucion.");
		} else {
			System.out.println("La ecuacion no tiene soluciones.");
		}


	}


	public void obtenerRaices() {

		double discriminante = getDiscriminante();

		System.out.println("FASE INICIAL");
		System.out.println();
		System.out.println("(-" + b + "±√((" + b + "^2)-(4*" + a + "*" + c + ")))/(2*" + a + ")");
		System.out.println("(-" + b + "±√" + discriminante + ")/(2*" + a + ")");
		System.out.println();
		System.out.println("PRIMERA SOLUCION");
		
		// cortar a 2 decimales
		 DecimalFormat df = new DecimalFormat("#.00");
		
		double num = Math.sqrt(discriminante);
		
		String numAEnseniar = df.format(num);

		System.out.println("(-" + b + "+" + numAEnseniar + ")/(2*" + a + ")");

		num = -b + num;
		
		numAEnseniar = df.format(num);

		double num2 = 2 * a;

		System.out.println(numAEnseniar + "/" + num2);

		double resultado = num / num2;

		System.out.println(resultado);

		System.out.println();
		System.out.println("SEGUNDA SOLUCION");

		System.out.println("(-" + b + "-" + numAEnseniar + ")/(2*" + a + ")");


		num = -b - num;

		numAEnseniar = df.format(num);
		
		System.out.println(numAEnseniar + "/" + num2);

		resultado = num / num2;

		System.out.println(resultado);


	}

	public void obtenerRaiz() {

		double discriminante = getDiscriminante();

		
		System.out.println("(-" + b + "±√((" + b + "^2)-(4*" + a + "*" + c + ")))/(2*" + a + ")");
		System.out.println("(-" + b + "±√" + discriminante + ")/(2*" + a + ")");

		double num = Math.sqrt(discriminante);

		double num2 = 2 * a;

		System.out.println("(-" + b + "+" + num + ")/" + num2);

		num = -b + num;

		System.out.println(num + "/" + num2);

		double resultado = num / num2;

		System.out.println(resultado);


	}


}

/*
* Calc Price of meal
*
* @author Luigi Arrieta
*/
public class ExerciseRestaurant {

	// Function Calc Price
	public static double calcPrice(double precio){
		double iva = precio * 19 / 100; // Ival del 19%
		double precioFinal = precio + iva;
		return precioFinal;
		//System.out.printf("Debes Pagar %.0f:\n", precioFinal);
	}

	// Function Main
	public static void main(String[] args){
		// Call function
		System.out.println("Debes pagar: " + calcPrice(23500));
		System.out.println("Debes pagar: " + calcPrice(4500));
		System.out.println("Debes pagar: " + calcPrice(12300));
		System.out.println("Debes pagar: " + calcPrice(500));
	}
}
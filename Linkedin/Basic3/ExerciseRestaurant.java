/*
* Calc Price of meal
*
* @author Luigi Arrieta
*/
public class ExerciseRestaurant {

	// Function Calc Price
	public static void calcPrice(double precio){
		double iva = precio * 19 / 100; // Ival del 19%
		double precioFinal = precio + iva;
		System.out.printf("Debes Pagar %.0f:\n", precioFinal);
	}

	// Function Main
	public static void main(String[] args){
		// Call function
		calcPrice(23500);
		calcPrice(4500);
		calcPrice(12300);
		calcPrice(500);
	}
}
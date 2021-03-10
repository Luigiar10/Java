/*
* Calc Salary
*
* @author Luigi Arrieta
*/
public class ExerciseSalary {

	public static void calcSalary() {
		int hoursWorked = 192;
		double hourPriceWork = 5500;
		double salary = hourPriceWork * hoursWorked;
		double pension = salary * 8 / 100; // pension del 8%
		double salud = salary * 10 / 100; // salud del 10%
		double salaryFinal = salary - pension - salud;
		System.out.printf("Tu sueldo del mes es: %.0f\n", salary);
		System.out.printf("Aporte a pension: %.0f\n", pension);
		System.out.printf("Aporte a salud: %.0f\n", salud);
		System.out.printf("Tu sueldo final es: %.0f\n", salaryFinal);
	}

	public static void main(String[] args) {
		// Call function
		calcSalary();
	}
}
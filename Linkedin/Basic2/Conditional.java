/*
* // Conditional
*
* @author Luigi Arrieta
*/
import java.util.Scanner;

public class Conditional {
	public static void main(String[] args){
		int num = 50;
		System.out.println("Introduzca un numero:");
		Scanner numInput = new Scanner(System.in);
		int numUser = numInput.nextInt();
		if(numUser < num){
			System.out.printf("El numero es menor que %d\n", num);
		} else {
			System.out.printf("El numero es mayor que %d\n", num);
		}
	}
}
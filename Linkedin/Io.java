import java.util.Scanner;

public class Io {
	public static void main(String[] args){
		System.out.println("What's your name?"); // Question
		Scanner input = new Scanner(System.in); // Scanner we use for catch the input of the user
		String name = input.nextLine(); // we save that inout in a variable
		System.out.println("Your name is: " + name); // We display this input
	}
}
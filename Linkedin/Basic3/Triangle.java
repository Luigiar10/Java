public class Triangle {
	int num1;
	int num2;

	// Constructors
	// public Triangle(){
	// 	// void
	// }

	public Triangle(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}

	public static void Calc(){
		int result = (this.num1 * this.num2) / 2;
		System.out.println(result);
	}
}
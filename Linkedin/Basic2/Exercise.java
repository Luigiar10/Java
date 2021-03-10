public class Exercise {
	public static void main(String[] args) {
		int num = 5;
		// for(int i = 0; i < num; i++){
		// 	if(i == 0){
		// 		System.out.println("*");
		// 	} else if (i == 1) {
		// 		System.out.println("**");	
		// 	} else if (i == 2) {
		// 		System.out.println("***");	
		// 	} else if (i == 3) {
		// 		System.out.println("****");	
		// 	} else if (i == 4) {
		// 		System.out.println("*****");	
		// 	}
		// }

		for(int numFilas = 0; numFilas < num; numFilas++){
			for(int numAsteriscos = 0; numAsteriscos <= numFilas; numAsteriscos++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
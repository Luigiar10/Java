public class Usuarios{
	public static void main(String[] args) {
		Persona user1 = new Persona("Luigi", "Arrieta", 20);
		System.out.printf("Name: %s %s Age %d\n", user1.name, user1.lastName, user1.age);

		Persona user2 = new Persona("Andres", "Moreno", 19);
		System.out.printf("Name: %s %s Age %d\n", user2.name, user2.lastName, user2.age);
	}
}
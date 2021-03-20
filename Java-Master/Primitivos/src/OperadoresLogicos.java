import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        String userName = "luigiar10";
        String password = "123456";

        System.out.println("Ingrese su Nombre de Usuario");
        Scanner scanU = new Scanner(System.in);
        String scanUser = scanU.next();

        System.out.println("Ingrese su Contraseña");
        Scanner scanP = new Scanner(System.in);
        String scanPassword = scanP.next();

        if (scanUser.equals(userName) && scanPassword.equals(password)){
            System.out.printf("%s Bienvenido al sistema", userName);
        } else {
            System.out.println("Ha ocurrido un problema, verifique usuario y contraseña");
        }
    }
}

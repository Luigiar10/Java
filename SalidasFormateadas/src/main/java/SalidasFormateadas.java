/*
 * Salidas Formateadas
 *
 * @author Luigi Arrieta
 */
public class SalidasFormateadas {

    public static void main(String[] args) {
        System.out.printf("El numero %d no tiene decimales\n", 28);
        System.out.printf("El numero %.3f tiene decimales, ademas solo le sale con tres ceros\n", 28.7);
        System.out.printf("Mi nombre es %s", "Luigi\n");

        System.out.println(" Artículo Precio/caja Nº cajas");
        System.out.println("-----------------------------------------");
        System.out.printf("%-10s %8.2f %6d\n", "manzanas", 4.5, 10);
        System.out.printf("%-10s %8.2f %6d\n", "peras", 2.75, 120);
        System.out.printf("%-10s %8.2f %6d\n", "aguacates", 10.0, 6);
    }
}

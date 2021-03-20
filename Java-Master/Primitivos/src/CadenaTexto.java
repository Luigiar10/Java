public class CadenaTexto {
    public static void main(String[] args) {
        String nombre = "Luigi";
        String apellido = "Arrieta";
        String nombreCompleto = nombre + apellido;
        System.out.println("nombreCompleto = " + nombreCompleto);
        String nombreCompletoConcat = nombre.concat(apellido);
        System.out.println("nombreCompletoConcat = " + nombreCompletoConcat);
    }
}

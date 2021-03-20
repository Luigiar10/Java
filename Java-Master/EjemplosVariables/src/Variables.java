public class Variables {
    public static void main(String[] args){
        String nombre = "Luigi";
        System.out.println("Nombre: " + nombre);
        int edad = 20;
        System.out.println("Edad: " + edad);
        float sueldo = 2500000;
        System.out.println("Sueldo: " + sueldo);
        boolean trabajo = true;
        System.out.println("Trabajo: " + trabajo);
        char inicialNombre = 'L';
        System.out.println("Letra Inicial Nombre: " + inicialNombre);
        /** Desde la version 10 se puede usar la palabra var, esto sirve para asignar el tipo
         * de dato dependiendo del valor */
        var edad2 = 19;
        System.out.println("edad2: " + edad2);
    }
}

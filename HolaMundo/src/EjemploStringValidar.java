public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = "Programación Java";
        }

        boolean esVacio = curso.length() == 0; // Java 5 en adelante    valida si la cadena está vacía o no (no es lo mismo que nulo)
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty(); // Java 6 en adelante valida si la cadena está vacía o no (no es lo mismo que nulo)
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank(); // Java 11 en adelante valida espacios en blanco y cadenas vacías
        System.out.println("esBlanco = " + esBlanco);

        if (!esVacio) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

        String texto = null;
        System.out.println(texto + "!");
        String texto2 = " ";
        System.out.println(texto2 + "!");
        System.out.println(texto2.isBlank());
    }
}

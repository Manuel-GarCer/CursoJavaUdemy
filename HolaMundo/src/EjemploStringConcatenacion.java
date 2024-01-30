public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Juan Carlos";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 20;
        System.out.println(detalle + " " + (numeroA + numeroB)); //importante usar los paréntesis para que se realice la suma antes de la concatenación
        System.out.println(numeroA + numeroB + " " + detalle); //en este caso no es necesario usar los paréntesis porque la suma se realiza antes de la concatenación de izquierda a derecha
        String detalle2 = curso.concat(" con el instructor ").concat(profesor);
        System.out.println(detalle2);


    }
}

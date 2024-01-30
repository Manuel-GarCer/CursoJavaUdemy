public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Juan Carlos";

        String resultado = curso.concat(profesor); // Se guarda el resultado
        curso.concat(profesor); // No se guarda el resultado
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado); // false

        String resultado2 = curso.transform(c -> {
          return c + " con " + profesor;
        });

        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        String resultado3 = resultado.replace("a", "A"); //para que haya variación se debe guardar en una variable, sino no se guarda por ser inmutable

        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);


    }
}

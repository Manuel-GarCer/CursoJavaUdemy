import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String variable = 7 == 5 ? "Si es igual" : "No es igual";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota de matemáticas entre 2.0 y 7.0:");
        matematicas = sc.nextDouble(); // para leer un valor de tipo double en la consola

        System.out.println("Ingrese la nota de ciencias entre 2.0 y 7.0:");
        ciencias = sc.nextDouble();

        System.out.println("Ingrese la nota de historia entre 2.0 y 7.0:");
        historia = sc.nextDouble();


        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);



        estado = promedio >= 5.49 ? "Aprobado" : "Reprobado";
        System.out.println("estado = " + estado);

    /*    if (promedio >= 5.49) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
*/

    }
}

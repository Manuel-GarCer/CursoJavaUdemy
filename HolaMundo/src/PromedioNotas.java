import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumaMayores5 = 0, sumaMenores4 = 0, sumaTotal = 0;
        int contadorMayores5 = 0, contadorMenores4 = 0, contadorNotas1 = 0;

        for (int i = 0; i < 20; i++) {
            double nota;
            do {
                System.out.println("Ingrese la nota final del alumno " + (i + 1) + " (entre 1 y 7):");
                nota = scanner.nextDouble();
            } while (nota < 1 || nota > 7);

            if (nota > 5) {
                sumaMayores5 += nota;
                contadorMayores5++;
            } else if (nota < 4) {
                sumaMenores4 += nota;
                contadorMenores4++;
            }

            if (nota == 1) {
                contadorNotas1++;
            }

            sumaTotal += nota;
        }

        double promedioMayores5 = contadorMayores5 > 0 ? sumaMayores5 / contadorMayores5 : 0;
        double promedioMenores4 = contadorMenores4 > 0 ? sumaMenores4 / contadorMenores4 : 0;
        double promedioTotal = sumaTotal / 20;

        System.out.println("Promedio de notas mayores a 5: " + promedioMayores5);
        System.out.println("Promedio de notas menores a 4: " + promedioMenores4);
        System.out.println("Cantidad de notas 1: " + contadorNotas1);
        System.out.println("Promedio total: " + promedioTotal);

        scanner.close();
    }

}
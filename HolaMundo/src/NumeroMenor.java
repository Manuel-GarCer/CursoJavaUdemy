import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        do {
            System.out.println("Ingrese la cantidad de números a comparar (mínimo 10):");
            cantidad = scanner.nextInt();
        } while (cantidad < 10);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
        }

        System.out.println("El número menor es: " + min);
        if (min < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }
    }
}
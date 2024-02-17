import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();

        int resultado = 0;
        for (int i = 0; i < Math.abs(num2); i++) {
            resultado += num1;
        }

        if (num2 < 0) {
            resultado = -resultado;
        }

        System.out.println("El resultado de la multiplicación es: " + resultado);

        scanner.close();
    }
}
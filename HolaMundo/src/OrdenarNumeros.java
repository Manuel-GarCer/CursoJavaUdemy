import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();

        int mayor = num1 > num2 ? num1 : num2;
        int menor = num1 > num2 ? num2 : num1;

        System.out.println("Los números ordenados de mayor a menor son: " + mayor + ", " + menor);
    }
}
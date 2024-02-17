import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num3 = sc.nextInt();

        System.out.println("Ingrese el cuarto número: ");
        int num4 = sc.nextInt();

        max = (num1 > num2)? num1: num2;
        max = (max > num3)? max: num3;
        max = (max > num4)? max: num4;

        System.out.println("El número 1 es: " + num1);
        System.out.println("El número 2 es: " + num2);
        System.out.println("El número 3 es: " + num3);
        System.out.println("El número 4 es: " + num4);

        System.out.println("El número mayor es: " + max);

    }
}

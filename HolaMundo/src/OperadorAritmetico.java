import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + i + j); // Concatenación
        System.out.println("i + j = " + (i + j)); // Suma
        System.out.println("i - j = " + (i - j)); // Resta
        System.out.println("i * j = " + (i * j)); // Multiplicación

        int div = i / j;
        float div2 = (float) i / j; // Casting de i a float para que el resultado sea float
        System.out.println("i / j = " + div); // División
        System.out.println("i / j = " + div2); // División

        System.out.println("i % j = " + (i % j)); // Módulo

        int resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if (numero % 2 == 0) {
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }


    }
}

public class OperadoresIncrementables {
    public static void main(String[] args) {

        // Operador de incremento
        int i = 1;
        int j = ++i; // i = i + 1
        System.out.println("i = " + i + ", j = " + j); // i = 2, j = 2

        // Post-incremento
        i = 2;
        j = i++;
        System.out.println("i = " + i + ", j = " + j); // i = 3, j = 2

        // Pre decremento
        i = 3;
        j = --i;
        System.out.println("i = " + i + ", j = " + j); // i = 2, j = 2

        // Post decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i + ", j = " + j); // i = 3, j = 4

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);



    }
}

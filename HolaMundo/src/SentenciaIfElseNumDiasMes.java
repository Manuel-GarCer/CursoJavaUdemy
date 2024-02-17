import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del mes de 1 - 12: ");
        int mes = sc.nextInt();

        int numDias = 0;
        System.out.println("Introduce el año: (YYYY)");
        int anio = sc.nextInt();

        if (mes < 1 || mes > 12) {
            numDias = -1;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numDias = 30;
        } else if (mes == 2) {
            if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0))) {
                numDias = 29;
            } else {
                numDias = 28;
            }
        }

        if (numDias == -1) {
            System.out.println("Mes no válido");
        } else {
            System.out.println("El mes " + mes + " tiene " + numDias + " días.");
        }
    }
}

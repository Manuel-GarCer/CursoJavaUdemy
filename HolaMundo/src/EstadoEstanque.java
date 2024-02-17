import java.util.Scanner;

public class EstadoEstanque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la capacidad actual del estanque:");
        double capacidadActual = scanner.nextDouble();

        if (capacidadActual == 70) {
            System.out.println("Estanque lleno");
        } else if (capacidadActual >= 60) {
            System.out.println("Estanque casi lleno");
        } else if (capacidadActual >= 40) {
            System.out.println("Estanque 3/4");
        } else if (capacidadActual >= 35) {
            System.out.println("Medio Estanque");
        } else if (capacidadActual >= 20) {
            System.out.println("Suficiente");
        } else if (capacidadActual >= 1) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Estanque vacío");
        }
    }
}
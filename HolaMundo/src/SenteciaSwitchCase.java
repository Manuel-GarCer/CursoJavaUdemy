import java.util.Scanner;

public class SenteciaSwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero de mes: ");
        int mes  = s.nextInt();
        String nombreMes = null;

        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Mes no valido";
        }

        System.out.println("nombreMes = " + nombreMes);


        byte num = 3;
        switch (num){
            case 0:
                System.out.println("El numero es 0");
                break;
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            case 3:
                System.out.println("El numero es 3");
                break;
            default:
                System.out.println("El numero no es 0, 1, 2 o 3");
        }

        String nombre = "Juan";
        switch (nombre){
            case "Juan":
                System.out.println("El nombre es Juan");
                break;
            case "Pedro":
                System.out.println("El nombre es Pedro");
                break;
            case "Maria":
                System.out.println("El nombre es Maria");
                break;
            default:
                System.out.println("El nombre no es Juan, Pedro o Maria");
        }
    }
}

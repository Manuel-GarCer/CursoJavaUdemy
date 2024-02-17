import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha (yyyy-MM-dd): ");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("Fecha parseada: " + fecha);
            System.out.println("Fecha parseada: " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if(fecha.after(fecha2)){
                System.out.println("La fecha1 ingresada es después a la fecha2");
            } else if(fecha.before(fecha2)){
                System.out.println("La fecha1 ingresada es anterior a la fecha2");
            } else if(fecha.equals(fecha2)){
                System.out.println("La fecha ingresada es igual a la fecha actual");
            }
            if(fecha.compareTo(fecha2) > 0){
                System.out.println("La fecha1 ingresada es después a la fecha2");
            } else if(fecha.compareTo(fecha2) < 0){
                System.out.println("La fecha1 ingresada es anterior a la fecha2");
            } else if(fecha.compareTo(fecha2) == 0){
                System.out.println("La fecha ingresada es igual a la fecha actual");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}

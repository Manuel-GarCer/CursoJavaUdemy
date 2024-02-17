import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalculaEdad {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese su fecha de nacimiento (yyyy-MM-dd): ");
        try {
            Date fechaNacimiento = format.parse(s.next());

            Calendar fechaNacimientoCal = Calendar.getInstance();
            fechaNacimientoCal.setTime(fechaNacimiento);

            Calendar fechaActual = Calendar.getInstance();

            int edad = fechaActual.get(Calendar.YEAR) - fechaNacimientoCal.get(Calendar.YEAR);

            if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimientoCal.get(Calendar.DAY_OF_YEAR)) {
                edad--;
            }

            System.out.println("Su edad es: " + edad + " años");

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        s.close();
    }
}
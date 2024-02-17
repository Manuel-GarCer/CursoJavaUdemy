import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance(); // Obtiene una instancia de Calendar

        //calendario.set(2019, 11, 25, 19, 20,10); // Establece el año, mes y día

        calendario.set(Calendar.YEAR, 2019); // Establece el año
        calendario.set(Calendar.MONTH, Calendar.JULY); // Establece el mes
        calendario.set(Calendar.DAY_OF_MONTH, 25); // Establece el día

        // calendario.set(Calendar.HOUR_OF_DAY, 21); // Establece la hora
        calendario.set(Calendar.HOUR, 7); // Establece la hora
        calendario.set(Calendar.AM_PM, Calendar.PM); // Establece AM o PM
        calendario.set(Calendar.MINUTE, 20); // Establece los minutos
        calendario.set(Calendar.SECOND, 10); // Establece los segundos
        calendario.set(Calendar.MILLISECOND, 125); // Establece los milisegundos

        Date fecha = calendario.getTime(); // Obtiene la fecha
        System.out.println("Fecha sin formato: " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:SSS a");
        String fechaFormateada = formato.format(fecha);
        System.out.println("Fecha formateada: " + fechaFormateada);

    }
}

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

/*
        String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "manolo";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "christian";
        passwords[2] = "12345";
*/
        String[] usernames = {"manolo", "admin", "christian"};
        String[] passwords = {"123", "12345", "123456"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su username: ");
        String u = sc.next();

        System.out.println("Ingrese su password: ");
        String p = sc.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;
/*            if (usernames[i].equals(u) && passwords[i].equals(p)) {
                esAutenticado = true;
                break;
            }*/
        }
/*
        if ( (usermane.equals(u) && password.equals(p))  ||
                (usermane2.equals(u) && password2.equals(p))){
            esAutenticado = true;
        } else {
            System.out.println("Username o password incorrectos");
        }
*/
        //System.out.println("esAutenticado = " + esAutenticado);

        String mensaje = esAutenticado ? "Bienvenido " + u + " al sistema" : "Username o password incorrectos, no tiene acceso al sistema";
        System.out.println("mensaje = " + mensaje);
      /*  if (esAutenticado) {
            System.out.println("Bienvenido " + u + " al sistema");
        } else {
            System.out.println("Username o password incorrectos");
            System.out.println("No tiene acceso al sistema");
        }*/
    }
}

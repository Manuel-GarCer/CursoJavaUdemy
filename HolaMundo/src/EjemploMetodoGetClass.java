import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto ="Hola que tal";
        Class strClass = texto.getClass();
        System.out.println("El tipo de la variable texto es: " + strClass.getName());
        System.out.println("El tipo de la variable texto es: " + strClass.getSimpleName());
        System.out.println("El tipo de la variable texto es: " + strClass.getPackageName());
        System.out.println("El tipo de la variable texto es: " + strClass);

        for(Method metodo : strClass.getMethods()){
            System.out.println(metodo.getName());
        }
        Integer numero = 34;
        Class intClass = numero.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass = " + intClass);
        System.out.println("El tipo de la variable numero es: " + intClass.getName());
        System.out.println("El tipo de la variable numero es: " + intClass.getSimpleName());
        System.out.println("El tipo de la variable numero es: " + intClass.getPackageName());
        System.out.println("El tipo de la variable numero es: " + intClass.getSuperclass());
        System.out.println("El tipo de la variable numero es: " + intClass.getSuperclass().getSuperclass());

        for(Method metodo : objClass.getMethods()){
            System.out.println(metodo.getName());
        }

    }
}

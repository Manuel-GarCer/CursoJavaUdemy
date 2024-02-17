public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Manuel";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Manuel\") = " + nombre.equals("Manuel"));
        System.out.println("nombre.equals(\"manuel\") = " + nombre.equals("manuel"));
        System.out.println("nombre.equalsIgnoreCase(\"manuel\") = " + nombre.equalsIgnoreCase("manuel"));
        System.out.println("nombre.compareTo(\"Manuel\") = " + nombre.compareTo("Manuel")); //retorna 0 si son iguales
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron")); //retorna un número negativo si es menor
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));//
        System.out.println("nombre.substring(1, 3) = " + nombre.substring(1, 3));
        System.out.println("nombre.substring(1, 2) = " + nombre.substring(1, 2));
        System.out.println("nombre.substring(1, 1) = " + nombre.substring(1, 1));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length() - 1)); //última letra de la cadena

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace('a', 'A') = " + trabalenguas.replace('a', 'A'));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); //retorna la primera ocurrencia
        System.out.println("trabalenguas.indexOf('A') = " + trabalenguas.indexOf('A'));
        System.out.println("trabalenguas.indexOf('n') = " + trabalenguas.indexOf('n'));
        System.out.println("trabalenguas.indexOf('x') = " + trabalenguas.indexOf('x'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // regresa la última ocurrencia
        System.out.println("trabalenguas.lastIndexOf('A') = " + trabalenguas.lastIndexOf('A'));
        System.out.println("trabalenguas.lastIndexOf('n') = " + trabalenguas.lastIndexOf('n'));
        System.out.println("trabalenguas.lastIndexOf('x') = " + trabalenguas.lastIndexOf('x'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t")); // regresa true si contiene la cadena
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"Traba\") = " + trabalenguas.startsWith("Traba")); // regresa true si empieza con la cadena
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as")); // regresa true si termina con la cadena
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("  trabalenguas = " + trabalenguas);
        System.out.println("  trabalenguas.trim() = " + trabalenguas.trim());//elimina los espacios al inicio y al final

    }
}

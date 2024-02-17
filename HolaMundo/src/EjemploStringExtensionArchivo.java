public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.jpeg";
        int i = archivo.lastIndexOf("."); //obtiene la última ocurrencia del punto

        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4)); // obtiene la extensión del archivo
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1)); // obtiene la extensión del archivo
        System.out.println("archivo.endsWith(\".jpeg\") = " + archivo.endsWith(".jpeg")); // verifica si termina con la extensión
        System.out.println("archivo.endsWith(\".txt\") = " + archivo.endsWith(".txt"));
        System.out.println("archivo.startsWith(\"alguna\") = " + archivo.startsWith("alguna")); // verifica si empieza con la cadena
        System.out.println("archivo.startsWith(\"Alguna\") = " + archivo.startsWith("Alguna"));
        System.out.println("archivo.startsWith(\"imagen\") = " + archivo.startsWith("imagen"));
        System.out.println("archivo.startsWith(\"alguna_imagen\") = " + archivo.startsWith("alguna_imagen"));
        System.out.println("archivo.startsWith(\"alguna_imagen.\") = " + archivo.startsWith("alguna_imagen."));
        System.out.println("archivo.startsWith(\"alguna_imagen.\") = " + archivo.startsWith("alguna_imagen."));
        System.out.println("archivo.indexOf(\".\") = " + archivo.indexOf(".")); //obtiene la primera ocurrencia del punto
        System.out.println("archivo.lastIndexOf(\".\") = " + archivo.lastIndexOf("."));// obtiene la última ocurrencia del punto
        System.out.println("archivo.indexOf(\".\") = " + archivo.indexOf("."));
        System.out.println("archivo.substring(0, archivo.indexOf(\".\")) = " + archivo.substring(0, archivo.indexOf("."))); //obtiene el nombre del archivo
        System.out.println("archivo.substring(archivo.indexOf(\".\")) = " + archivo.substring(archivo.indexOf("."))); //obtiene la extensión del archivo y el punto
        System.out.println("archivo.substring(archivo.indexOf(\".\")+1) = " + archivo.substring(archivo.indexOf(".")+1)); // obtiene la extensión del archivo

    }
}

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); // convierte el string en un arreglo de caracteres

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length; // largo del arreglo de caracteres que se obtiene del string
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++) {
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        }
        System.out.println();
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a")); // convierte el string en un arreglo de strings separados por el caracter que se le pasa
        String[] arreglo2 = trabalenguas.split("a");
        int largo2 = arreglo2.length;
        for (int i = 0; i < largo2; i++) {
            System.out.println("arreglo2[" + i + "] = " + arreglo2[i]);
        }
        System.out.println();
        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\."); // Se debe escapar el punto
        largo = archivoArr.length;
        for (int i = 0; i < largo; i++) {
            System.out.println("archivoArr[" + i + "] = " + archivoArr[i]);
        }
        System.out.println();
        System.out.println("extension = " + archivoArr[largo - 1]);
       
    }
}

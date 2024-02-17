public class SentenciasBuclesEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            //bucle2:
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    continue bucle1;
                }
                System.out.println("[i = " + i + ", j = " + j + "]");
            }
        }

        System.out.println("\n=========================================\n");
        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            //bucle2:
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    break etiqueta;
                }
                System.out.println("[i = " + i + ", j = " + j + "]");
            }
        }
    }
}

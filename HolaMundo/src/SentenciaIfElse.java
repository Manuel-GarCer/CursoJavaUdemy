public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.8f;

        if(promedio >= 6.5f){
            System.out.println("Felicidades, excelente promedio");
        } else if (promedio >= 6.0f){
            System.out.println("Muy bien, buen promedio");
        } else if (promedio >= 5.5f){
            System.out.println("Bien, aceptable promedio");
        } else {
            System.out.println("Puedes mejorar, bajo promedio");
        }
        System.out.println("promedio = " + promedio);
    }
}

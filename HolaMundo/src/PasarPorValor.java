public class PasarPorValor {
    public static void main(String[] args) {

        Integer i =10;
        System.out.println("Valor de i antes de llamar a modificar: " + i);
        test(i);
        System.out.println("Valor de i después de llamar a modificar (se mantiene igual): " + i);
    }

    public static void test(Integer i){
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Terminamos el método test con i = " + i);
    }
}

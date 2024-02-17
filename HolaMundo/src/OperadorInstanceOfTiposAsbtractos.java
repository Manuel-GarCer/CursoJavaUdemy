public class OperadorInstanceOfTiposAsbtractos {
    public static void main(String[] args) {
       Object texto = new String("Creando un objeto de la clase String ... que tal");
       Number numero = Integer.valueOf(7); // valor entero

       Boolean b1 = texto instanceof String;
       System.out.println("texto es del tipo String = " + b1);

       b1 = texto instanceof Object;
       System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);

       b1 = numero instanceof Integer;
       System.out.println("numero es del tipo Integer = " + b1);


        b1 = numero instanceof Number;
        System.out.println("numero es del tipo Number = " + b1);

        b1 = numero instanceof Object;
        System.out.println("numero es del tipo Object = " + b1);

        b1 = numero instanceof Long;
        System.out.println("numero es del tipo Long = " + b1);

        b1 = numero instanceof Double;
        System.out.println("numero es del tipo Double = " + b1);

        Number decimal = Float.valueOf(45.54f); //45.54f;

        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);
    }
}

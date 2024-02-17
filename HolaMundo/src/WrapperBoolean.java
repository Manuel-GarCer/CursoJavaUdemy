public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; // false
        System.out.println("primBoolean = " + primBoolean);

        Boolean objBoolean = Boolean.valueOf(primBoolean);
        System.out.println("objBoolean = " + objBoolean);

        Boolean objBoolean2 = Boolean.valueOf("false");
        System.out.println("objBoolean2 = " + objBoolean2);

        Boolean objBoolean3 = false;

        System.out.println("Comparando dos objetos Boolean: " + (objBoolean == objBoolean2));
        System.out.println("Comparando dos objetos Boolean: " + (objBoolean.equals(objBoolean2)));
        System.out.println("Comparando dos objetos Boolean: " + (objBoolean2 == objBoolean3));
        System.out.println("Comparando dos objetos Boolean: " + (objBoolean2.equals(objBoolean3)));

        boolean primBoolean2 = objBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);

    }
}

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        int n = 100000;
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            //c = c.concat(a).concat(b).concat("\n"); //500 =>2ms, 1000 => 4ms, 10000 => 160ms; 100000 => 6030ms
            // += a + b + "\n"; //500 => 40ms 1000 => 44ms 10000 => 110ms 100000 => 1100ms
            sb.append(a).append(b).append("\n");//500 => 0ms, 1000 => 0ms, 10000 => 3ms, 100000 => 16ms
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo: " + (t2 - t1) + " ms");
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}

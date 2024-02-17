import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String [] nombres = {"Juan", "Pedro", "Luis", "Carlos", "Ana", "Maria", "Luisa", "Fernanda"};
        int count = nombres.length;
        for (int i = 0; i < count; i++) {
            if(nombres[i].equals("Luis") || nombres[i].equals("Luisa")) {
                continue;
            }
            System.out.println( i + " - " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese el nombre a buscar");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if(nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            System.out.println("nombre = " + nombres[i]);
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado en el arreglo");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no fue encontrado en el arreglo");
        }
        }
}

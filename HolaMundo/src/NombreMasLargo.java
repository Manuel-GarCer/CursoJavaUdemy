import javax.swing.JOptionPane;

public class NombreMasLargo {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre completo de la primera persona:");
        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre completo de la segunda persona:");
        String nombre3 = JOptionPane.showInputDialog("Ingrese el nombre completo de la tercera persona:");

        String nombreLargo1 = nombre1.split(" ")[0].length() >= nombre2.split(" ")[0].length() ? nombre1 : nombre2;
        String nombreLargoFinal = nombreLargo1.split(" ")[0].length() >= nombre3.split(" ")[0].length() ? nombreLargo1 : nombre3;

        JOptionPane.showMessageDialog(null, nombreLargoFinal + " tiene el nombre más largo.");
    }
}
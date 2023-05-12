import javax.swing.JOptionPane;

public class OptionDialog {
    public static void main(String[] args) {

        String[] arreglo = { "Monitores", "Teclados", "Pantallas", "Bocinas", "Auriculares" };

        int opcion = JOptionPane.showOptionDialog(null, "Elige una de las siguientes opciones...", "Escoge una opción",
                0,
                JOptionPane.QUESTION_MESSAGE, null, arreglo, "Teclados");

        JOptionPane.showMessageDialog(null, "Tu respuesta fue: " + arreglo[opcion]);
        JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa");
    }
}

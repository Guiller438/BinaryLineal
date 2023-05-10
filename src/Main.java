import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ventana MainForm = new Ventana();
                MainForm.setContentPane(MainForm.getMainPanel());
                MainForm.setBounds(100,100,500,500);
                MainForm.setVisible(true);
                MainForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });
        /**Busqueda arreglo = new Busqueda();
        int[] arr = arreglo.generateRandomArray(5, 0, 10);
        System.out.println("Arreglo desordenado :");
        arreglo.printArray(arr);
        System.out.println("Arreglo ordenado :");
        arreglo.orderArray(arr);
        arreglo.printArray(arr);**/

    }
}
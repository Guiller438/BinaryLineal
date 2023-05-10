import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
    private JPanel mainPanel;
    private JButton linearVsBinaryButton;
    private JTextArea Tiemposarea;

    public Ventana() {
        linearVsBinaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Busqueda arreglo = new Busqueda();
                int[] arr = arreglo.generateRandomArray(10, 0, 10);
                int target = 10;
                arreglo.orderArray(arr);
                if(arreglo.binarySearch(arr, target) == -1){
                    Tiemposarea.setText("El elemento no se encuentra en el arreglo");
                }else{
                    long startTimeLineal = System.nanoTime();
                    arreglo.linearSearch(arr, target);
                    long endTimeLineal = System.nanoTime();
                    long duration = (endTimeLineal - startTimeLineal);
                    long startTimeBynary = System.nanoTime();
                    arreglo.binarySearch(arr, target);
                    long endTimeBynary = System.nanoTime();
                    duration = (endTimeBynary - startTimeBynary);
                    Tiemposarea.setText("Tiempo de busqueda lineal: " + duration + " nanosegundos" + "\n" + "Tiempo de busqueda binaria: " + duration + " nanosegundos");
                }

            }
        });
    }

    public Container getMainPanel() {
        return mainPanel;
    }
}

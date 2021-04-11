package Actividad1Evaluacion;

import javax.swing.*;
import java.util.ArrayList;

public class InsertarAgente {
    private JTextField nombre;
    private JButton crearButton;
    private JTextField edad;
    private JTextField email;
    private JTextField fechaInscripcion;
    private JTextField sueldo;
    private JPanel agentePanel;
    private ArrayList<Object> lista = new ArrayList<>();

    public static void main() {
        JFrame frame = new JFrame("InsertarAgente");
        frame.setContentPane(new InsertarAgente().agentePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}

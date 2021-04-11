package Actividad1Evaluacion;

import javax.swing.*;
import java.util.ArrayList;

public class InsertarCliente {

    private JPanel clientesPanel;
    private JTextField nombre;
    private JTextField email;
    private JButton crearButton;
    private JPanel panelMain;
    private ArrayList<Object> lista = new ArrayList<>();


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main() {
        JFrame frame = new JFrame("InsertarCliente");
        frame.setContentPane(new InsertarCliente().clientesPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

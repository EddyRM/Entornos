package Actividad1Evaluacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static javax.swing.JOptionPane.*;

public class InsertarAgente {
    private JTextField nombre;
    private JButton crearButton;
    private JTextField edad;
    private JTextField email;
    private JTextField fechaInscripcion;
    private JTextField sueldo;
    private JPanel agentePanel;
    private static ArrayList<Object> listaAgentes = new ArrayList<>();

    public InsertarAgente() {
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Agentes agente = new Agentes(Integer.parseInt(edad.getText()), fechaInscripcion.getText(), email.getText(), nombre.getText(), Integer.parseInt(sueldo.getText()));
                listaAgentes.add(agente);
                resetFields();
            }

        });
    }

    public static ArrayList<Object> getListaAgentes() {
        return listaAgentes;
    }

    public void resetFields(){
        edad.setText("");
        fechaInscripcion.setText("");
        email.setText("");
        nombre.setText("");
        sueldo.setText("");
    }

    public static void main() {
        JFrame frame = new JFrame("InsertarAgente");
        frame.setContentPane(new InsertarAgente().agentePanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}

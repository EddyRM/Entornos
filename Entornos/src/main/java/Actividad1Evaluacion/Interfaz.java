package Actividad1Evaluacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Interfaz {
    private JButton buscarCliente;
    private JPanel panelMain;
    private JButton clienteButton;
    private JButton agenteButton;
    private JButton teamLeaderButton;


    public Interfaz() {

        clienteButton.addActionListener(e -> InsertarCliente.main());

        agenteButton.addActionListener (e -> InsertarAgente.main());

        teamLeaderButton.addActionListener(e -> InsertarTeamLeader.main());


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Interfaz");
        frame.setContentPane(new Interfaz().panelMain);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

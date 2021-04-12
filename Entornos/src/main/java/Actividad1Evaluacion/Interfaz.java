package Actividad1Evaluacion;

import javax.swing.*;
import java.util.ArrayList;

public class Interfaz {
    private JPanel panelMain;
    private JButton clienteCreateButton;
    private JButton agenteCreateButton;
    private JButton teamLeaderCreateButton;
    private JButton mostrarTls;
    private JButton mostrarAgentes;
    private JButton mostrarClientes;


    public Interfaz() {

        clienteCreateButton.addActionListener(e -> InsertarCliente.main());

        agenteCreateButton.addActionListener (e -> InsertarAgente.main());

        teamLeaderCreateButton.addActionListener(e -> InsertarTeamLeader.main());

        mostrarTls.addActionListener(e -> JOptionPane.showMessageDialog(null, listar(InsertarTeamLeader.getListatl())));

        mostrarAgentes.addActionListener(e -> JOptionPane.showMessageDialog(null, listar(InsertarAgente.getListaAgentes())));

        mostrarClientes.addActionListener(e -> JOptionPane.showMessageDialog(null, listar(InsertarCliente.getListaClientes())));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Interfaz");
        frame.setContentPane(new Interfaz().panelMain);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    
    private static String listar(ArrayList<Object> personas) {
        String textToDisplay = "<html>";
        for (Object persona : personas) {
            textToDisplay = textToDisplay + persona.toString() + "<br/>";
        }
        return (textToDisplay + "</html>");
    }
}

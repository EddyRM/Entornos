package Actividad1Evaluacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;


public class InsertarTeamLeader {
    private JPanel tlPanel;
    private JTextField nombre;
    private JTextField edad;
    private JTextField email;
    private JTextField fechaIncorporacion;
    private JTextField sueldo;
    private JButton crearButton;
    private final ArrayList<TeamLeaders> lista = new ArrayList<TeamLeaders>();


    public InsertarTeamLeader() {
        crearButton.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                TeamLeaders tl;
                tl = new TeamLeaders(Integer.parseInt(edad.getText()), fechaIncorporacion, email, nombre, Integer.parseInt(sueldo.getText());
                lista.add(tl);
            }

        });
    }

    public static void main() {
        JFrame frame = new JFrame("InsertarTeamLeader");
        frame.setContentPane(new InsertarTeamLeader().tlPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}



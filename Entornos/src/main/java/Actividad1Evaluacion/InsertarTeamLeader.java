package Actividad1Evaluacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class InsertarTeamLeader {
    private JPanel tlPanel;
    private JTextField nombre;
    private JTextField edad;
    private JTextField email;
    private JTextField fechaIncorporacion;
    private JTextField sueldo;
    private JButton crearButton;
    private static ArrayList<Object> listatl = new ArrayList<Object>();


    public InsertarTeamLeader() {
        crearButton.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                TeamLeaders tl;
                tl = new TeamLeaders(Integer.parseInt(edad.getText()), fechaIncorporacion.getText(), email.getText(), nombre.getText(), Float.parseFloat(sueldo.getText()));
                listatl.add(tl);
                resetFields();
            }

        });
    }

    public static ArrayList<Object> getListatl() {
        return listatl;
    }

    public static void main() {
        JFrame frame = new JFrame("InsertarTeamLeader");
        frame.setContentPane(new InsertarTeamLeader().tlPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public void resetFields(){
        edad.setText("");
        fechaIncorporacion.setText("");
        email.setText("");
        nombre.setText("");
        sueldo.setText("");
    }

}



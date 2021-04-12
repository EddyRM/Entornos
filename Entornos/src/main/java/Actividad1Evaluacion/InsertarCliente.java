package Actividad1Evaluacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InsertarCliente {

    private JPanel clientesPanel;
    private JTextField nombre;
    private JTextField idCliente;
    private JButton crearButton;
    private JTextField fechaRegistro;
    private JTextField email;
    private JTextField dineroAcumulado;
    private JPanel panelMain;
    private static ArrayList<Object> listaClientes = new ArrayList<Object>();



    public InsertarCliente() {
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clientes cliente;
                cliente = new Clientes(Integer.parseInt(idCliente.getText()), email.getText(),fechaRegistro.getText(), Integer.parseInt(dineroAcumulado.getText()), nombre.getText());
                listaClientes.add(cliente);
                resetFields();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static ArrayList<Object> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Object> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void resetFields(){
        nombre.setText("");
        fechaRegistro.setText("");
        email.setText("");
        dineroAcumulado.setText("");
        idCliente.setText("");
    }



    public static void main() {
        JFrame frame = new JFrame("InsertarCliente");
        frame.setContentPane(new InsertarCliente().clientesPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

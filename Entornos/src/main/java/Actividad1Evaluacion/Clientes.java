package Actividad1Evaluacion;

import java.util.Objects;

public class Clientes {
    private int idCliente;
    private String email;
    private String fechaRegistro;
    private float dineroAcumulado;
    private String nombre;

    public Clientes(int idCliente, String email, String fechaRegistro, float dineroAcumulado, String nombre) {
        this.idCliente = idCliente;
        this.email = email;
        this.fechaRegistro = fechaRegistro;
        this.dineroAcumulado = dineroAcumulado;
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clientes)) return false;
        Clientes clientes = (Clientes) o;
        return idCliente == clientes.idCliente && Float.compare(clientes.dineroAcumulado, dineroAcumulado) == 0 && Objects.equals(email, clientes.email) && Objects.equals(fechaRegistro, clientes.fechaRegistro) && Objects.equals(nombre, clientes.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, email, fechaRegistro, dineroAcumulado, nombre);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public float getDineroAcumulado() {
        return dineroAcumulado;
    }

    public void setDineroAcumulado(float dineroAcumulado) {
        this.dineroAcumulado = dineroAcumulado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String toString() {
        return "Clientes{" +
                "idCliente=" + idCliente +
                ", email='" + email + '\'' +
                ", fechaRegistro='" + fechaRegistro + '\'' +
                ", dineroAcumulado=" + dineroAcumulado +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

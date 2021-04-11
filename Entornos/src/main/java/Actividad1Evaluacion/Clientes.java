package Actividad1Evaluacion;

import java.util.Date;
import java.util.Objects;

public class Clientes {
    private int idCliente;
    private String email;
    private Date fechaRegistro;
    private float dineroAcumulado;
    private String tipoTienda;

    public Clientes(int idCliente, String email, Date fechaRegistro, float dineroAcumulado, String tipoTienda) {
        this.idCliente = idCliente;
        this.email = email;
        this.fechaRegistro = fechaRegistro;
        this.dineroAcumulado = dineroAcumulado;
        this.tipoTienda = tipoTienda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clientes)) return false;
        Clientes clientes = (Clientes) o;
        return idCliente == clientes.idCliente && Float.compare(clientes.dineroAcumulado, dineroAcumulado) == 0 && Objects.equals(email, clientes.email) && Objects.equals(fechaRegistro, clientes.fechaRegistro) && Objects.equals(tipoTienda, clientes.tipoTienda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, email, fechaRegistro, dineroAcumulado, tipoTienda);
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

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public float getDineroAcumulado() {
        return dineroAcumulado;
    }

    public void setDineroAcumulado(float dineroAcumulado) {
        this.dineroAcumulado = dineroAcumulado;
    }

    public String getTipoTienda() {
        return tipoTienda;
    }

    public void setTipoTienda(String tipoTienda) {
        this.tipoTienda = tipoTienda;
    }
}

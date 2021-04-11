package Actividad1Evaluacion;

import java.util.Date;
import java.util.Objects;

public class Agentes {
    private int edad;
    private Date fechaIncorporacion;
    private String email;
    private boolean jornadaCompleta;
    private float sueldo;

    public Agentes(int edad, Date fechaIncorporacion, String email, boolean jornadaCompleta, float sueldo) {
        this.edad = edad;
        this.fechaIncorporacion = fechaIncorporacion;
        this.email = email;
        this.jornadaCompleta = jornadaCompleta;
        this.sueldo = sueldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Agentes)) return false;
        Agentes agentes = (Agentes) o;
        return edad == agentes.edad && jornadaCompleta == agentes.jornadaCompleta && Float.compare(agentes.sueldo, sueldo) == 0 && Objects.equals(fechaIncorporacion, agentes.fechaIncorporacion) && Objects.equals(email, agentes.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad, fechaIncorporacion, email, jornadaCompleta, sueldo);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isJornadaCompleta() {
        return jornadaCompleta;
    }

    public void setJornadaCompleta(boolean jornadaCompleta) {
        this.jornadaCompleta = jornadaCompleta;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
}

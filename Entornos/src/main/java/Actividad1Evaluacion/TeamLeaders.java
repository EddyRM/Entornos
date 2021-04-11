package Actividad1Evaluacion;

import javax.swing.*;
import java.util.Date;
import java.util.Objects;

public class TeamLeaders {
    private int edad;
    private String fechaIncorporacion;
    private String email;
    private String nombre;
    private float sueldo;


    public TeamLeaders(int edad, String fechaIncorporacion, String email, String nombre, float sueldo) {
        this.edad = edad;
        this.fechaIncorporacion = fechaIncorporacion;
        this.email = email;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(String fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeamLeaders)) return false;
        TeamLeaders that = (TeamLeaders) o;
        return getEdad() == that.getEdad() && getNombre() == that.getNombre() && Float.compare(that.getSueldo(), getSueldo()) == 0 && Objects.equals(getFechaIncorporacion(), that.getFechaIncorporacion()) && Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEdad(), getFechaIncorporacion(), getEmail(), getNombre(), getSueldo());
    }
}

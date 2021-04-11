package Actividad1Evaluacion;

import java.util.Date;
import java.util.Objects;

public class Agentes {
    private int edad;
    private Date fechaIncorporacion;
    private String email;
    private String nombre;
    private float sueldo;

    public Agentes(int edad,
                   Date fechaIncorporacion,
                   String email,
                   String nombre,
                   float sueldo) {
        this.edad = edad;
        this.fechaIncorporacion = fechaIncorporacion;
        this.email = email;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Agentes)) return false;
        Agentes agentes = (Agentes) o;
        return edad == agentes.edad && nombre == agentes.nombre && Float.compare(agentes.sueldo, sueldo) == 0 && Objects.equals(fechaIncorporacion, agentes.fechaIncorporacion) && Objects.equals(email, agentes.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad, fechaIncorporacion, email, nombre, sueldo);
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
}

package Actividad1Evaluacion;

import java.util.Date;
import java.util.Objects;

public class TeamLeaders {
    private int edad;
    private Date fechaIncorporacion;
    private String email;
    private int grupoDirige;
    private float sueldo;

    public TeamLeaders(int edad, Date fechaIncorporacion, String email, int grupoDirige, float sueldo) {
        this.edad = edad;
        this.fechaIncorporacion = fechaIncorporacion;
        this.email = email;
        this.grupoDirige = grupoDirige;
        this.sueldo = sueldo;
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

    public int getGrupoDirige() {
        return grupoDirige;
    }

    public void setGrupoDirige(int grupoDirige) {
        this.grupoDirige = grupoDirige;
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
        return getEdad() == that.getEdad() && getGrupoDirige() == that.getGrupoDirige() && Float.compare(that.getSueldo(), getSueldo()) == 0 && Objects.equals(getFechaIncorporacion(), that.getFechaIncorporacion()) && Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEdad(), getFechaIncorporacion(), getEmail(), getGrupoDirige(), getSueldo());
    }
}

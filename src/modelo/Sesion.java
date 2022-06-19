
package modelo;

import java.sql.Date;

public class Sesion {
    private int idSesion;
    private String idTutor;
    private String idTutorado;
    private Date fechaActual;
    private Date fechaAcordada;
    private String curso;

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public String getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(String idTutor) {
        this.idTutor = idTutor;
    }

    public String getIdTutorado() {
        return idTutorado;
    }

    public void setIdTutorado(String idTutorado) {
        this.idTutorado = idTutorado;
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public Date getFechaAcordada() {
        return fechaAcordada;
    }

    public void setFechaAcordada(Date fechaAcordada) {
        this.fechaAcordada = fechaAcordada;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}

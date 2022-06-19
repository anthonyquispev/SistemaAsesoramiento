
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class Escuela {
    private int idEscuela;
    private String nombreEscuela;

    public int getIdEscuela() {
        return idEscuela;
    }

    public void setIdEscuela(int idEscuela) {
        this.idEscuela = idEscuela;
    }

    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }
    
    public String toString() {
        return this.nombreEscuela;
    }
    
    public Vector<Escuela> mostrarEscuelas(Integer idFacultad) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        Vector<Escuela> vectorEscuelas = new Vector<Escuela>();
        Escuela escuela = null;

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();

            ps = conexion.prepareStatement("SELECT * FROM Escuela WHERE FacultadID=" + idFacultad);
            rs = ps.executeQuery();

            escuela = new Escuela();
            escuela.setIdEscuela(0);
            escuela.setNombreEscuela("Seleccione escuela");
            vectorEscuelas.add(escuela);

            while (rs.next()) {
                escuela = new Escuela();
                escuela.setIdEscuela(rs.getInt("EscuelaID"));
                escuela.setNombreEscuela(rs.getString("NombreEAP"));
                vectorEscuelas.add(escuela);
            }
            rs.close();
        } catch (Exception e) { //SQL EXCEPTION
            System.out.println("Error: " + e);
        }
        return vectorEscuelas;
    }    
    
}

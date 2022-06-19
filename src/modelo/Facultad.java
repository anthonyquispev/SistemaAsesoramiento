
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class Facultad {
    private int idFacultad;
    private String nombreFacultad;

    public int getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(int idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }
    
    public String toString() {
        return this.nombreFacultad;
    }
    
    public Vector<Facultad> mostrarFacultades() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        Vector<Facultad> vectorFacultades = new Vector<Facultad>();
        Facultad facultad = null;
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("SELECT * FROM Facultad");
            rs = ps.executeQuery();

            facultad = new Facultad();
            facultad.setIdFacultad(0);
            facultad.setNombreFacultad("Seleccione una Facultad");
            vectorFacultades.add(facultad);

            while (rs.next()) {
                facultad = new Facultad();
                facultad.setIdFacultad(rs.getInt("FacultadID"));
                facultad.setNombreFacultad(rs.getString("Nombre"));
                vectorFacultades.add(facultad);
            }
            rs.close();
        } catch (Exception e) { //SQL EXCEPTION
            System.out.println("Error: " + e);
        }
        return vectorFacultades;
    }
    
}

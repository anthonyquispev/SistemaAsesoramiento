package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultasTutorado extends Conexion {

    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(Tutorado tutorado, boolean bCorreo) {
        Connection conexion = getConnection();
        try {
            if (bCorreo) {
                ps = conexion.prepareStatement("INSERT INTO Tutorado (Apellidos, Nombres, Celular, Correo) VALUES (?, ?, ?, ?)");
                ps.setString(1, tutorado.getApellidos());
                ps.setString(2, tutorado.getNombres());
                ps.setInt(3, tutorado.getCelular());
                ps.setString(4, tutorado.getCorreo());
            } else {
                ps = conexion.prepareStatement("INSERT INTO Tutorado (Apellidos, Nombres, Celular) VALUES (?, ?, ?)");
                ps.setString(1, tutorado.getApellidos());
                ps.setString(2, tutorado.getNombres());
                ps.setInt(3, tutorado.getCelular());
            }
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println("Error:" + e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

}

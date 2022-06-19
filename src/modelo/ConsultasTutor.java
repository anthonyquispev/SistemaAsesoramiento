package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultasTutor extends Conexion {

    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(Tutor tutor, int idEscuela) {
        Connection conexion = getConnection();

        try {
            ps = conexion.prepareStatement("INSERT INTO Tutor (TutorID, EscuelaID, Dni, Apellidos, Nombres, CorreoInstitucional, Celular, Fecha_nacimiento, Img) \n"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, tutor.getIdTutor());
            ps.setInt(2, idEscuela);
            ps.setString(3, tutor.getDni());
            ps.setString(4, tutor.getApellidos());
            ps.setString(5, tutor.getNombres());
            ps.setString(6, tutor.getCorreoInstitucional());
            ps.setInt(7, tutor.getCelular());
            ps.setDate(8, tutor.getFecha_nacimiento());

//            String ruta = "C:\\Users\\Lorena\\Desktop\\Fotos ejemplo\\fotoPorDefecto.jpg";
            String ruta = ".\\src\\imagenes\\fotoPorDefecto.jpg";
            File archivo = new File(ruta);
            FileInputStream archivoEntrada = new FileInputStream(archivo);
            ps.setBinaryStream(9, archivoEntrada, archivo.length());
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

package pruebas;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Conexion;
import vista.VentanaPrincipal;

public class Prueba01 {

    public static void main(String[] args) {

//        Cargar Fotos por defecto
//        cargarFotoBD("18200179");
//        cargarFotoBD("18200170");
//        cargarFotoBD("18200015");
//        cargarFotoBD("18200226");
//        cargarFotoBD("18200208");
//        cargarFotoBD("18200220");
//        cargarFotoBD("18200200");
//        cargarFotoBD("18200176");
//        cargarFotoBD("18200156");
//        cargarFotoBD("18200045");
//        cargarFotoBD("18200189");
        VentanaPrincipal ventana = new VentanaPrincipal();

        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }

    private static void cargarFotoBD(String idTutor) {
        PreparedStatement ps = null;
        Conexion con = new Conexion();
        String ruta = "C:\\Users\\Lorena\\Desktop\\Fotos ejemplo\\fotoPorDefecto.jpg";
        File archivo = new File(ruta);

        try {
            FileInputStream archivoEntrada = new FileInputStream(archivo);
            Connection conexion = con.getConnection();

            ps = conexion.prepareStatement("UPDATE Tutor SET Img = (?) WHERE TutorID = (?)");
            //1: solo hay una interrogación, archivo de tipo FileInputStream, tamaño del archivo
            ps.setBinaryStream(1, archivoEntrada, archivo.length());
            ps.setString(2, idTutor);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}

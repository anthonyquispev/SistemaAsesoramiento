package modelo;

import java.sql.DriverManager;
import java.sql.Connection;

public class Conexion {
    
    public static final String URL = "jdbc:mysql://localhost:3306/asesoria_bd?autoReconnet=true&useSSL=false&zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
    public static final String usuario = "root";
    public static final String contraseña = "3322";
    
    public Connection getConnection(){
        Connection conexion = null;
        
        try{           
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, usuario, contraseña);

        } catch (Exception e){
            System.out.println("Error, " + e);
        }
        return conexion;
    } 
    
}

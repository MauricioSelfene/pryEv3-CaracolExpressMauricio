package servicios;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    public static Connection getConexion() {

        Connection connection = null;
        try {
            
            String NOMBRE_BD = "bd_encomiendas";
            String USER_BD = "root";
            String PASS_BD = "";
            String DIREC_BD = "localhost:3001";
            //carga la clase controlador
            Class.forName("com.mysql.jdbc.Driver"); //nombre del controlador de JDBC
            //establece la conexión a la base de datos
            connection = DriverManager.getConnection("jdbc:mysql://" + DIREC_BD + "/" + NOMBRE_BD, USER_BD, PASS_BD);

            
            System.out.println("Conexión exitosa");
            
            
        } catch (Exception ex) {
            System.out.println("Error!!!" + ex.getMessage());
        }
        
        return connection;
    }

}

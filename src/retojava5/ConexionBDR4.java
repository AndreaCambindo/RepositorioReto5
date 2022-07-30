package retojava5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConexionBDR4 {
    
    public static Connection conectarBDR4(){
        String dbURL="jdbc:mysql://localhost:3306/retocuatro";
        String username="root";
        String password="Andre11";
        
        try{
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if(conn != null){
                System.out.println("Conectado");
            }
            return conn;
        }catch(SQLException ex){
        ex.printStackTrace();
        }
        return null;
    }
}

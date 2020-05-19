
package DAO;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alvaro
 */
public class bd {
     public bd() {
    }
    public Connection getMysql(){
        Connection c = null;
        
        try {
            //Registrar Driver
            DriverManager.registerDriver(new Driver());
             //Establecer conexion con la Base Datos
            String urldb="jdbc:mysql://localhost:3306/examen?useTimezone=true&serverTimezone=UTC";
            String usuario="root";
            String clave="root";
            c = DriverManager.getConnection(urldb, usuario, clave);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(bd.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return c;
    }
}

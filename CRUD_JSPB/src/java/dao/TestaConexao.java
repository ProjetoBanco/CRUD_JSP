
package dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Sergio
 */
public class TestaConexao {
    
     public static void main(String[] args) throws SQLException {
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta!");
        connection.close();
    }
    
}

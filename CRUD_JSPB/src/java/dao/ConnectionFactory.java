package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sergio
 */
public class ConnectionFactory {

    public Connection getConnection() {
        System.out.println("Conectando ao banco...");
        try {

            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/fazenda", "root", "");

        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }

    }

   

}

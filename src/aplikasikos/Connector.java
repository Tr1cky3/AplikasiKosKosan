package aplikasikos;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    public static Connection getKoneksi() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/db_kos_231011401467"; 
            String user = "root";
            String pass = "root1";
            conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
        }
        return conn;
    }
}
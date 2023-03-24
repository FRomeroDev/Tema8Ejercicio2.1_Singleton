package tema8Ejerciciio2_BD_provincias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author FERNANDO ROMERO DE ÁVILA - 1º DAW 2022-23
 */
class ConnectionSingleton {

    private static Connection con;

    public static Connection getConnection() throws SQLException {
	String url = "jdbc:mysql://127.0.0.1/comunidad_provincia";
	String user = "root";
	String password = "Solana12023";
	if (con == null || con.isClosed()) {
	    con = DriverManager.getConnection(url, user, password);
	}
	return con;
    }

}

package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class GenericDAO {
	protected Connection miConexion = null;
	// carga del driver de conexion con jdbc:
	static {
		// bloque especial que se ejecuta una unica vez
		// a lo largo de la aplicacion la primera vez que esta clase es usada
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("error driver");
		}
	} // end static

	protected void conectar() {
		try {
			miConexion = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/practica2", "root",
					"jeveris");
		} catch (SQLException e) {
			System.out.println("no pude conectarme a la base de datos");
			System.out.println("comprobar ruta de la base de datos");
			System.out.println("comprobar nombre de usuario y contraseña");
		}
	}// end conectar

	protected void desconectar() {
		try {
			miConexion.close();
		} catch (SQLException e) {
			System.out.println("no pude realizar la desconexion");
		}
	}// end desconectar
} // end class

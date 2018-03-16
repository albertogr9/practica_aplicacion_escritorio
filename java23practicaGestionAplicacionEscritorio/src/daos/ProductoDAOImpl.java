package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Producto;

public class ProductoDAOImpl implements ProductoDAO {
	private Connection miConexion = null;

	public ProductoDAOImpl() {
		// preparo driver y conexion
		try {
			Class.forName("com.mysql.jdbc.Driver");
			miConexion = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/practica_escritorio", "root",
					"jeveris");
		} catch (ClassNotFoundException e) {
			System.out.println("no encuentro el driver-libreria de mysql");
		} catch (SQLException e) {
			System.out.println("error de conexion o la sql esta mal");
		}

	}

	public void borrarProducto(int id) {
try {
	PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.sqlBorradoProducto);
	ps.setInt(1, id);
	ps.execute();
	ps.close();
} catch (SQLException e) {
System.out.println("la sql de borrado está mal");
System.out.println(e.getMessage());
	e.printStackTrace();
}
	} // 

	public void registrarProducto(Producto p) {
		String sqlInsercionProducto = "insert into tabla_productos "
				+ "(modelo,marca,discoDuro,ram,procesador,pantalla,peso)"
				+ "values (?,?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = miConexion.prepareStatement(sqlInsercionProducto);
			ps.setString(1, p.getModelo());
			ps.setString(2, p.getMarca());
			ps.setString(3, p.getDiscoDuro());
			ps.setString(4, p.getRam());
			ps.setString(5, p.getProcesador());
			ps.setString(6, p.getPantalla());
			ps.setString(7, p.getPeso());
			ps.execute();
			ps.close();
			System.out.println("Producto agregado correctamente");
		} catch (SQLException e) {
			System.out.println("No se ha podido insertar producto");
			System.out.println(e.getMessage());
		}
	}

	public Producto[] obtenerProducto() {
		Producto[] productos = null;
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.sqlSeleccionProducto);
			// para sql tipo select debo usar el metodo executeQuery
			ResultSet resultado = ps.executeQuery();
			List<Producto> listProductos = new ArrayList<Producto>();
			// next pasa al siguiente resultado de la base de datos que aun no
			// hemos procesado, si no hay ningún resultado más devuelve false
			while (resultado.next()) {
				Producto p = new Producto();
				p.setModelo(resultado.getString("modelo"));
				p.setMarca(resultado.getString("marca"));
				p.setDiscoDuro(resultado.getString("discoDuro"));
				p.setRam(resultado.getString("ram"));
				p.setProcesador(resultado.getString("procesador"));
				p.setPantalla(resultado.getString("pantalla"));
				p.setPeso(resultado.getString("peso"));
				p.setId(resultado.getInt("id"));
				listProductos.add(p);
			}// end while
				// transformar de list a array
			productos = listProductos
					.toArray(new Producto[listProductos.size()]);
		} catch (SQLException e) {
			System.out.println("fallo en la sql de seleccion productos");
		}
		return productos;
	}

}

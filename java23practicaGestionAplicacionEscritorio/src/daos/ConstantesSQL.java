package daos;

public class ConstantesSQL {
	final static String sqlInsercionProducto = "insert into tabla_productos "
			+ "(modelo,marca,discoDuro,ram,procesador,pantalla,peso)"
			+ "values (?,?,?,?,?,?,?)";

	final static String sqlSeleccionProducto = "select * from tabla_productos";

	final static String sqlBorradoProducto = "delete from tabla_productos where id=? ";
}
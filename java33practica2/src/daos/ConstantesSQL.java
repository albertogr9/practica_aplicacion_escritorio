package daos;

public class ConstantesSQL {
	public static final String INSERCION_ORDENADOR = "insert into tabla_ordenadores(marca,modelo,precio,disco,ram,procesador,pantalla,peso)"
			+ "values(?,?,?,?,?,?,?,?)";
	public static final String SELECCION_ORDENADORES = "select * from tabla_ordenadores";
	public static final String INSERCION_CLIENTE = "insert into tabla_clientes(nombre,calle,numero,codigoPostal,poblacion,telefono,email,particularEmpresa)"+ "values(?,?,?,?,?,?,?,?)";
	public static final String SELECCION_CLIENTES = "select * from tabla_clientes";	
	public static final String IDENTIFICACION_ADMIN = "select id from tabla_administradores where login = ? and pass = ?";
	public static final String BORRAR_CLIENTE = "delete from tabla_clientes where id = ?";
	public static final String BORRAR_ORDENADOR = "delete from tabla_ordenadores where id = ?";
	public static final String OBTENER_CLIENTE_POR_ID = "select * from tabla_clientes where id = ?";
	public static final String GUARDAR_CAMBIOS_CLIENTE = "update tabla_clientes set nombre=?, calle=?, numero=?, codigoPostal=?, poblacion=?, telefono=?, email=?, particularEmpresa=? where id = ?";
	public static final String OBTENER_ORDENADOR_POR_ID = "select * from tabla_ordenadores where id = ?";
	public static final String GUARDAR_CAMBIOS_ORDENADOR = "update tabla_ordenadores set marca=?, modelo=?, precio=?, disco=?, ram=?, procesador=?, pantalla=?, peso=? where id = ?";

} // end class

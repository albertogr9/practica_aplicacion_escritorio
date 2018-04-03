package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Ordenador;
import daos.OrdenadoresDAO;
import daos.ConstantesSQL;
import daos.GenericDAO;

public class OrdenadoresDAOImpl extends GenericDAO implements OrdenadoresDAO {

	@Override
	public void registrarOrdenador(Ordenador ordenador) {
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.INSERCION_ORDENADOR);
			ps.setString(1, ordenador.getMarca());
			ps.setString(2, ordenador.getModelo());
			ps.setString(3, ordenador.getPrecio());
			ps.setString(4, ordenador.getDisco());
			ps.setString(5, ordenador.getRam());
			ps.setString(6, ordenador.getProcesador());
			ps.setString(7, ordenador.getPantalla());
			ps.setString(8, ordenador.getPeso());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("la sql de insercion de Ordenador esta mal");
		}
		desconectar();
	} // end registrarOrdenador

	public List<Ordenador> obtenerOrdenador() {
		conectar();
		List<Ordenador> ordenadores = new ArrayList<Ordenador>();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.SELECCION_ORDENADORES);
			ResultSet resultado = ps.executeQuery();
			while (resultado.next()) {
				Ordenador ordenador = new Ordenador();
				ordenador.setMarca(resultado.getString("marca"));
				ordenador.setModelo(resultado.getString("modelo"));
				ordenador.setPrecio(resultado.getString("precio"));
				ordenador.setDisco(resultado.getString("disco"));
				ordenador.setRam(resultado.getString("ram"));
				ordenador.setProcesador(resultado.getString("procesador"));
				ordenador.setPantalla(resultado.getString("pantalla"));
				ordenador.setPeso(resultado.getString("peso"));
				ordenador.setId(resultado.getInt("id"));
				ordenadores.add(ordenador);
			} // end while
		} catch (SQLException e) {
			System.out.println("sql select Ordenadors esta mal");
		} // end catch
		desconectar();
		return ordenadores;
	}

	@Override
	public void borrarOrdenador(int id) {
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.BORRAR_ORDENADOR);
			ps.setInt(1, id);
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("la sql de borrar Ordenador esta mal");
		}
		desconectar();
	} // end obtenerOrdenadors

	@Override
	public Ordenador obtenerOrdenadorPorId(int id) {
		conectar();
		Ordenador ordenador = new Ordenador();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.OBTENER_ORDENADOR_POR_ID);
			ps.setInt(1, id);
			ResultSet resultado = ps.executeQuery();
			if (resultado.next()) {
				ordenador.setMarca(resultado.getString("marca"));
				ordenador.setModelo(resultado.getString("modelo"));
				ordenador.setPrecio(resultado.getString("precio"));
				ordenador.setDisco(resultado.getString("disco"));
				ordenador.setRam(resultado.getString("ram"));
				ordenador.setProcesador(resultado.getString("procesador"));
				ordenador.setPantalla(resultado.getString("pantalla"));
				ordenador.setPeso(resultado.getString("peso"));
				ordenador.setId(resultado.getInt("id"));
			}
		} catch (SQLException e) {
			System.out.println("seguramente la sql este mal");
			System.out.println(e.getMessage());
		}
		desconectar();
		return ordenador;
	}

	@Override
	public void guardarCambiosOrdenador(Ordenador ordenador) {
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.GUARDAR_CAMBIOS_ORDENADOR);
			ps.setString(1, ordenador.getMarca());
			ps.setString(2, ordenador.getModelo());
			ps.setString(3, ordenador.getPrecio());
			ps.setString(4, ordenador.getDisco());
			ps.setString(5, ordenador.getRam());
			ps.setString(6, ordenador.getProcesador());
			ps.setString(7, ordenador.getPantalla());
			ps.setString(8, ordenador.getPeso());
			ps.setInt(9, ordenador.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("no se han podido guardar los cambios");
			e.printStackTrace();
		}
		desconectar();
		
	}

} // end class

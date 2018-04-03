package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import daos.ClientesDAO;
import daos.ConstantesSQL;
import daos.GenericDAO;

public class ClientesDAOImpl extends GenericDAO implements ClientesDAO {

	public void registrarCliente(Cliente cliente) {
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.INSERCION_CLIENTE);
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getCalle());
			ps.setString(3, cliente.getNumero());
			ps.setString(4, cliente.getCodigoPostal());
			ps.setString(5, cliente.getPoblacion());
			ps.setString(6, cliente.getTelefono());
			ps.setString(7, cliente.getEmail());
			ps.setString(8, cliente.getParticularEmpresa());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("la sql de insercion de cliente esta mal");
		}
		desconectar();
	} // end registrarCliente

	@Override
	public List<Cliente> obtenerClientes() {
		conectar();
		List<Cliente> clientes = new ArrayList<Cliente>();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.SELECCION_CLIENTES);
			ResultSet resultado = ps.executeQuery();
			while (resultado.next()) {
				Cliente cliente = new Cliente();
				cliente.setNombre(resultado.getString("nombre"));
				cliente.setCalle(resultado.getString("calle"));
				cliente.setNumero(resultado.getString("numero"));
				cliente.setCodigoPostal(resultado.getString("codigoPostal"));
				cliente.setPoblacion(resultado.getString("poblacion"));
				cliente.setTelefono(resultado.getString("telefono"));
				cliente.setEmail(resultado.getString("email"));
				cliente.setParticularEmpresa(resultado.getString("particularEmpresa"));
				cliente.setId(resultado.getInt("id"));
				clientes.add(cliente);
			} // end while
		} catch (SQLException e) {
			System.out.println("sql select clientes esta mal");
		} // end catch
		desconectar();
		return clientes;
	} // end obtenerClientes

	@Override
	public boolean identificarAdmin(String login, String pass) {
		boolean identificado = false;
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.IDENTIFICACION_ADMIN);
			ps.setString(1, login);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				identificado = true;
				// si este if se cumple eso es que he obtenido un resultado de
				// base de datos

			}
		} catch (SQLException e) {
			System.out.println(" la sql de identificacion tiene problemas");
			System.out.println(e.getMessage());
		}
		desconectar();
		return identificado;
	}

	@Override
	public void borrarCliente(int id) {
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.BORRAR_CLIENTE);
			ps.setInt(1, id);
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("la sql de borrar cliente esta mal");
		}
		desconectar();
	}

	@Override
	public Cliente obtenerClientePorId(int id) {
		conectar();
		Cliente cliente = new Cliente();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.OBTENER_CLIENTE_POR_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				cliente.setNombre(rs.getString("nombre"));
				cliente.setCalle(rs.getString("calle"));
				cliente.setNumero(rs.getString("numero"));
				cliente.setCodigoPostal(rs.getString("codigoPostal"));
				cliente.setPoblacion(rs.getString("poblacion"));
				cliente.setTelefono(rs.getString("telefono"));
				cliente.setEmail(rs.getString("email"));
				cliente.setParticularEmpresa(rs.getString("particularEmpresa"));
				cliente.setId(id);
			}
		} catch (SQLException e) {
			System.out.println("seguramente la sql este mal");
			System.out.println(e.getMessage());
		}
		desconectar();
		return cliente;
	}

	@Override
	public void guardarCambiosCliente(Cliente cliente) {
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.GUARDAR_CAMBIOS_CLIENTE);
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getCalle());
			ps.setString(3, cliente.getNumero());
			ps.setString(4, cliente.getCodigoPostal());
			ps.setString(5, cliente.getPoblacion());
			ps.setString(6, cliente.getTelefono());
			ps.setString(7, cliente.getEmail());
			ps.setString(8, cliente.getParticularEmpresa());
			ps.setInt(9, cliente.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("no se han podido guardar los cambios");
			e.printStackTrace();
		}
		desconectar();
	}


}// end class

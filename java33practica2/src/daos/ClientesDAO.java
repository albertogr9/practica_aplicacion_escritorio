package daos;

import java.util.List;

import modelo.Cliente;

public interface ClientesDAO {
	void registrarCliente(Cliente cliente);
	List<Cliente> obtenerClientes();
	void borrarCliente(int id);
	boolean identificarAdmin (String email, String contraseña);
	Cliente obtenerClientePorId(int id);
	void guardarCambiosCliente(Cliente cliente);
	
}

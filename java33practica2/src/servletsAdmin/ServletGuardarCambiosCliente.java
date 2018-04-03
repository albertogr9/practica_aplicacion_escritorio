package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.ClientesDAO;
import daosImpl.ClientesDAOImpl;
import modelo.Cliente;

@WebServlet("/ServletGuardarCambiosCliente")
public class ServletGuardarCambiosCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletGuardarCambiosCliente() {
		super();

	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("campoNombre");
		String calle = request.getParameter("campoCalle");
		String numero = request.getParameter("campoNumero");
		String codigoPostal = request.getParameter("campoCodigoPostal");
		String poblacion = request.getParameter("campoPoblacion");
		String telefono = request.getParameter("campoTelefono");
		String email = request.getParameter("campoEmail");
		String particularEmpresa = request.getParameter("campoParticularEmpresa");
		String id = request.getParameter("campoId");

		// ahora deberiamos validar todos los datos
		// fin parte validacion

		Cliente cliente = new Cliente(nombre, calle, numero, codigoPostal,
				poblacion, telefono, email, particularEmpresa);
		cliente.setId(Integer.parseInt(id));
		System.out.println("queremos guardar: " + cliente.toString());
		ClientesDAO clientesDAO = new ClientesDAOImpl();
		clientesDAO.guardarCambiosCliente(cliente);

		request.getRequestDispatcher("ServletListadoClientes").forward(
				request, response);
	}

}

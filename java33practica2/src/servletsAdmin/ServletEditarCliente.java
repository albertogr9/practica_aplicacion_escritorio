package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Cliente;
import daos.ClientesDAO;
import daosImpl.ClientesDAOImpl;

@WebServlet("/ServletEditarCliente")
public class ServletEditarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("editar cliente de id: " + id);
		ClientesDAO clientesDAO = new ClientesDAOImpl();
		Cliente clienteAeditar = clientesDAO.obtenerClientePorId(id);
		request.setAttribute("clienteAeditar", clienteAeditar);
		System.out.println("mostrando: " + clienteAeditar.toString());
		request.getRequestDispatcher("editarCliente.jsp").forward(request, response);
	}

}

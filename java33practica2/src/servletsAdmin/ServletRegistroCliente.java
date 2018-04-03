package servletsAdmin;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.ClientesDAO;
import daosImpl.ClientesDAOImpl;
import modelo.Cliente;

@WebServlet("/ServletRegistroCliente")
public class ServletRegistroCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("se ejecuta el post del ServletRegistroCliente");
		// recoger lo que ha introducido el usuario en el formulario:
		// campoTitulo es el name del input del que quiero coger la informacion
		String nombre = request.getParameter("campoNombre");
		String calle = request.getParameter("campoCalle");
		String numero = request.getParameter("campoNumero");
		String codigoPostal = request.getParameter("campoCodigoPostal");
		String poblacion = request.getParameter("campoPoblacion");
		String telefono = request.getParameter("campoTelefono");
		String email = request.getParameter("campoEmail");
		String particularEmpresa = request
				.getParameter("campoParticularEmpresa");
		
		String expresionRegularNombre = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{3,10}";
		Pattern pattern = Pattern.compile(expresionRegularNombre);
		Matcher matcher = pattern.matcher(nombre);
		
		if (matcher.matches()) {
			System.out.println("nombre ok");
		} else {
			System.out.println("nombre no valido");
			request.setAttribute("mensaje", "nombre no valido");
			request.getRequestDispatcher("registrarCliente.jsp").forward(
					request, response);
			return;
		}
		Cliente nuevoCliente = new Cliente(nombre, calle, numero, codigoPostal,
				poblacion, telefono, email, particularEmpresa);
		System.out.println("vamos a registrar: " + nuevoCliente.toString());
		ClientesDAO clientesDAO = new ClientesDAOImpl();
		clientesDAO.registrarCliente(nuevoCliente);
		request.getRequestDispatcher("registroClienteOK.jsp").forward(request,
				response);
	} // end

} // end class

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
		String nombre = request.getParameter("campoNombre");
		String calle = request.getParameter("campoCalle");
		String numero = request.getParameter("campoNumero");
		String codigoPostal = request.getParameter("campoCodigoPostal");
		String poblacion = request.getParameter("campoPoblacion");
		String telefono = request.getParameter("campoTelefono");
		String email = request.getParameter("campoEmail");
		String particularEmpresa = request
				.getParameter("campoParticularEmpresa");
		
		String expresionRegularNombre = "[a-zA-Z������������\\s]{3,15}";
		String expresionRegularNumero = "[0-9]{1,15}";
		String expresionRegularCodigoPostal = "[0-9]{1,5}";
		String expresionRegularEmail = "[^@]+@[^@]+\\.[a-zA-Z]{2,}";
		
		
		Pattern pattern = Pattern.compile(expresionRegularNombre);
		Matcher matcher = pattern.matcher(nombre);

		if (matcher.matches()) {
			System.out.println("nombre ok");
		} else {
			System.out.println("nombre no valido");
			request.setAttribute("mensaje", "nombre no valido");
			request.getRequestDispatcher("registrarCliente.jsp").forward(
					request, response);
			return
			;
		}
		
		Pattern patternNum = Pattern.compile(expresionRegularNumero);
		Matcher matcherNum = patternNum.matcher(numero);

		if (matcherNum.matches()) {
			System.out.println("numero ok");
		} else {
			System.out.println("numero no valido");
			request.setAttribute("mensaje", "numero no valido");
			request.getRequestDispatcher("registrarCliente.jsp").forward(
					request, response);
			return;
		}
		Pattern patternCp = Pattern.compile(expresionRegularCodigoPostal);
		Matcher matcherCp = patternCp.matcher(codigoPostal);

		if (matcherCp.matches()) {
			System.out.println("cp ok");
		} else {
			System.out.println("cp no valido");
			request.setAttribute("mensaje", "cp no valido");
			request.getRequestDispatcher("registrarCliente.jsp").forward(
					request, response);
			return;
		}
		
		Pattern patternEmail = Pattern.compile(expresionRegularEmail);
		Matcher matcherEmail = patternEmail.matcher(email);

		if (matcherEmail.matches()) {
			System.out.println("email ok");
		} else {
			System.out.println("email no valido");
			request.setAttribute("mensaje", "email no valido");
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

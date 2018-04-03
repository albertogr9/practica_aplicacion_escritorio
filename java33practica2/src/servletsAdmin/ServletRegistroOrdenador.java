package servletsAdmin;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import daos.OrdenadoresDAO;
import daosImpl.OrdenadoresDAOImpl;
import modelo.Ordenador;

@WebServlet("/ServletRegistroOrdenador")
public class ServletRegistroOrdenador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// protegemos este servlet por si se intenta acceder a el directamente
		// sin estar identificado
		if (request.getSession().getAttribute("admin") == null) {
			request.getRequestDispatcher("login.jsp")
					.forward(request, response);
		}
		System.out.println("se ejecuta el post del ServletRegistroOrdenador");
		// recoger lo que ha introducido el usuario en el formulario:
		// campoTitulo es el name del input del que quiero coger la informacion
		String marca = request.getParameter("campoMarca");
		String modelo = request.getParameter("campoModelo");
		String precio = request.getParameter("campoPrecio");
		String disco = request.getParameter("campoDisco");
		String ram = request.getParameter("campoRam");
		String procesador = request.getParameter("campoProcesador");
		String pantalla = request.getParameter("campoPantalla");
		String peso = request.getParameter("campoPeso");
		// parte de validacion de datos
		String expresionRegularMarca = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{3,10}";
		Pattern pattern = Pattern.compile(expresionRegularMarca);
		Matcher matcher = pattern.matcher(marca);
		
		if (matcher.matches()) {
			System.out.println("marca ok");
		} else {
			System.out.println("marca no valida");
			request.setAttribute("mensaje", "marca no valida");
			request.getRequestDispatcher("registrarOrdenador.jsp").forward(
					request, response);
			return;
		} // end else */
			// fin parte validacion de datos
		Ordenador nuevoOrdenador = new Ordenador(marca, modelo,
				precio, disco, ram, procesador, pantalla, peso);
		// ahora le damos el nuevo anuncio a un DAO para que lo registre
		System.out.println("vamos a registrar: " + nuevoOrdenador.toString());
		OrdenadoresDAO ordenadoresDAO = new OrdenadoresDAOImpl();
		ordenadoresDAO.registrarOrdenador(nuevoOrdenador);
		request.getRequestDispatcher("registroOrdenadorOK.jsp").forward(request,
				response);//  desde un servlet no deberia mostrarle nada al usuario, para eso
		// tenemos las jsp que son las encargadas de realizar la "vista" de la
		// aplicacion

		// asÌ digo al server que siga la ejecucion en la siguiente jsp
	} // end 

} // end class

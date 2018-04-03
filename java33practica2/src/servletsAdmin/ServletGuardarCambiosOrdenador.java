package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.OrdenadoresDAO;
import daosImpl.OrdenadoresDAOImpl;
import modelo.Ordenador;

@WebServlet("/ServletGuardarCambiosOrdenador")
public class ServletGuardarCambiosOrdenador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletGuardarCambiosOrdenador() {
		super();

	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String marca = request.getParameter("campoMarca");
		String modelo = request.getParameter("campoModelo");
		String precio = request.getParameter("campoPrecio");
		String disco = request.getParameter("campoDisco");
		String ram = request.getParameter("campoRam");
		String procesador = request.getParameter("campoProcesador");
		String pantalla = request.getParameter("campoPantalla");
		String peso = request.getParameter("campoPeso");
		String id = request.getParameter("campoIdOrdenador");

		// ahora deberiamos validar todos los datos

		// fin parte validacion
		Ordenador ordenador = new Ordenador(marca, modelo,
				precio, disco, ram, procesador, pantalla, peso);
		ordenador.setId(Integer.parseInt(id));
		System.out.println("queremos guardar: " + ordenador.toString());
		OrdenadoresDAO ordenadoresDAO = new OrdenadoresDAOImpl();
		ordenadoresDAO.guardarCambiosOrdenador(ordenador);

		request.getRequestDispatcher("ServletListadoOrdenadores").forward(
				request, response);
	}

}

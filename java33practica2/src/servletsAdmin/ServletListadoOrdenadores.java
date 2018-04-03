package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.OrdenadoresDAO;
import daosImpl.OrdenadoresDAOImpl;

@WebServlet("/ServletListadoOrdenadores")
public class ServletListadoOrdenadores extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out
				.println("obteniendo ordenadores para gestionarlos en administracion");
		OrdenadoresDAO ordenadoresDAO = new OrdenadoresDAOImpl();
		request.setAttribute("ordenadores", ordenadoresDAO.obtenerOrdenador());
		request.getRequestDispatcher("gestionOrdenadores.jsp").forward(request, response);
	}

}

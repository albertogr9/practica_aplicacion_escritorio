package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.OrdenadoresDAO;
import daosImpl.OrdenadoresDAOImpl;

@WebServlet("/ServletBorrarOrdenador")
public class ServletBorrarOrdenador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("borrar Ordenador de id: " + id);
		OrdenadoresDAO ordenadoresDAO = new OrdenadoresDAOImpl();
		ordenadoresDAO.borrarOrdenador(id);
	}

}

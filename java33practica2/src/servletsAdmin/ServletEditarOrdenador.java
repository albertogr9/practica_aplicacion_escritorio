package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Ordenador;
import daos.OrdenadoresDAO;
import daosImpl.OrdenadoresDAOImpl;

@WebServlet("/ServletEditarOrdenador")
public class ServletEditarOrdenador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("editar Ordenador de id: " + id);
		OrdenadoresDAO ordenadoresDAO = new OrdenadoresDAOImpl();
		Ordenador ordenadorAeditar = ordenadoresDAO.obtenerOrdenadorPorId(id);
		request.setAttribute("ordenadorAeditar", ordenadorAeditar);
		System.out.println("mostrando: " + ordenadorAeditar.toString());
		request.getRequestDispatcher("editarOrdenador.jsp").forward(request, response);
	}

}

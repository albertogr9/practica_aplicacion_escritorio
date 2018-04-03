package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.ClientesDAO;
import daosImpl.ClientesDAOImpl;

@WebServlet("/ServletIdentificacion")
public class ServletIdentificacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("se ejecuta el servlet de identificacion de admin");
		String login = request.getParameter("campoLogin");
		String pass = request.getParameter("campoPass");
		ClientesDAO clientesDAO = new ClientesDAOImpl();
		if(clientesDAO.identificarAdmin(login, pass)){
			request.getSession().setAttribute("admin", "ok");
			request.getRequestDispatcher("menu.jsp").forward(request, response);
			System.out.println("accediste correctamente");
		}else{
			request.getRequestDispatcher("login.jsp").forward(request, response);
			System.out.println("no se pudo acceder");
		}
	}
}

package cz.memorit.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cz.memorit.bean.Balicek;
import cz.memorit.dao.MemoritDao;


@WebServlet("/MemoritServlet")
public class MemoritServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
  
    public MemoritServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect = "";
		getServletConfig().getServletContext().getRequestDispatcher(redirect).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package org.jboss.as.quickstarts.helloworld;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ServletTest
 */
@WebServlet("/ServletTest")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.getWriter().println("<html><body>Hello World !</body></html>");
		
		
		String nb1 = request.getParameter("nb1");
		String nb2 = request.getParameter("nb2");
		int resultat = Integer.parseInt(nb1) + Integer.parseInt(nb2);
		response.getWriter().println("<html><body>le resultat est : " + resultat +"</body></html>");
		
		/*
		PrintWriter out = response.getWriter();
		try {
			String db_url = "jdbc:hsqldb:hsql://localhost/xdb";
			String db_user = "sa";
			Class.forName("org.hsqldb.jdbcDriver");
			Connection con = DriverManager.getConnection(db_url, db_user, null);
			response.setContentType("text/html");
			String op = request.getParameter("op");
			if (op.equals("add")) {
				String nb1 = request.getParameter("nb1");
				String nb2 = request.getParameter("nb2");
				int resultat = Integer.parseInt(nb1) + Integer.parseInt(nb2);
				response.getWriter().println("<html><body>le resultat est : " + resultat +"</body></html>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
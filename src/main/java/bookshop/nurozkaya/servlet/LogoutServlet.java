package bookshop.nurozkaya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//used this in navbar
@WebServlet("/log-out")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//remove the session
		try(PrintWriter out = response.getWriter()){
			if(request.getSession().getAttribute("auth") !=null) {
				request.getSession().removeAttribute("auth");	
				//login sayfas�na y�nlendir
				response.sendRedirect("login.jsp");
			} else {
				
				response.sendRedirect("index.jsp");
			}
		}
	}
}

package Data;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class data1
 */
public class data1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String userName = request.getParameter("userName");
	        String password = request.getParameter("password1");
	        String email = request.getParameter("email");
	        String phone = request.getParameter("phone");
	        String city = request.getParameter("city");
	        
	        
	        
	        try {
           Hibernat h = new Hibernat();
           h.userinfo(userName, password, phone, email, city);
	    
	        
           		response.sendRedirect("index.jsp");
	        	
	        	
	        }

	        catch(Exception e) {e.printStackTrace();}
	        
		
	}

}

package data;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class controller
 */
@WebServlet("/controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		
		
		
		model m= new model();
		m.setName(name);
		m.setPass(pass);

		boolean b=m.validate();
		
		
		if(b)
		{response.sendRedirect("login.jsp");}
		else
		{	response.sendRedirect("error.jsp");	}
		}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}



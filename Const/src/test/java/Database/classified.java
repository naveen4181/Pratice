package Database;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class classified {
	
	
	@RequestMapping("/act")
	public ModelAndView data(HttpServletRequest request,HttpServletResponse response) 
	{
		
	String s=request.getParameter("uname");
	String s1=request.getParameter("pass");
	
	
	ModelAndView mv= new ModelAndView();
	service sv= new service();
	int a=sv.nothing();
	
	mv.setViewName("Message.jsp");
	mv.addObject("a",a);
	mv.addObject("pass",s1);
	mv.addObject("uname",s);
	return mv;
		
	}

}

package servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class register {
	
	@RequestMapping("/data")
	public ModelAndView data(HttpServletResponse response,HttpServletRequest request) 
	{
		ModelAndView mv = new ModelAndView();
		
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String sal=request.getParameter("sal");
		String job=request.getParameter("job");
	//	String name=request.getParameter("name");
		
			insert i= new insert();
			i.insert(name, age, sal, job);
	
		
		mv.setViewName("olejsp.jsp");
		
		return mv;
		
		
		
	}

}

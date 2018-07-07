package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller 
{
	@RequestMapping("/data")
	public ModelAndView data(HttpServletRequest request,HttpServletResponse response) 
	{String j=request.getParameter("age");
		String i=request.getParameter("name");
		System.out.println(i);
		System.out.println(j);//@RequestParam("name")int i,@RequestParam("age")int j
		
		
		
		ModelAndView mv= new ModelAndView();
		
		hib h= new hib();
		h.pojo(i, j);
		mv.setViewName("AllDone.jsp");
		return mv;
		
		
	}
	
	
	
	
	


}

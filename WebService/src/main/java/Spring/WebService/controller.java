package Spring.WebService;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
@Path("data")
public class controller {

	@GET
	@javax.ws.rs.Produces(value= {MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<pojo> data() 
	{
		respo r = new respo();
		
		return r.insert();
	}
	
	@Path("ins")
	@POST
	@Consumes(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public void insert(pojo p) 
	{
				
		System.out.println(p);
		
		respo r = new respo();
		
		r.create(p);	
	}
	
	@Path("del/{id}")
	@Consumes(value=MediaType.APPLICATION_XML)
	@DELETE
	public void delete(@PathParam("id") String data) 
	{
		
		
		
		System.out.println("The Path Param Values:"+data);
		
	}
	
	
	
	
	
}

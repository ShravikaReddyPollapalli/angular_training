package com.legato;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("/service")
public class Rest {
    @GET
    @Path("/{param}")
    public Response getInfo(@PathParam("param") String name) {
    	return Response.status(200).entity("Info: " + name).build();
    }
    
    @GET 
	@Path("/mul/{num1}/{num2}")
	public Response getinfo(@PathParam("num1") int x,@PathParam("num2") int y) {
		return Response.status(200).entity(String.valueOf(x*y)).build();
	}
    
    @POST @Path("/custinfo")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFormCustomer(@FormParam("name") String name, @FormParam("address") String address) { 
    	JSONObject j = new JSONObject();
    	j.put("name",name); 
    	j.put("address",address);
    	return Response.status(200). entity(String.valueOf(j)).build();
    }
    
}
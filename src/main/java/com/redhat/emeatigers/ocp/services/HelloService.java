package com.redhat.emeatigers.ocp.services;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloService {
	@GET
	@Path("/{name}")
	@Produces("application/json;charset=UTF-8")
	public Response hello(@PathParam("name") String name) {
		try {
			if (name == null){
				name = "nobody";
			}
			String env = "local";
			if (System.getenv("ENV") != null){
				env = System.getenv("ENV");
			}
			String message = "Hello "+name+" from "+env;
			Map<String,String> response = new HashMap<String,String>();
			response.put("message", message);
			return Response.status(Response.Status.OK).entity(response).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}

	}
	@GET
	@Path("/list")
	@Produces("application/json;charset=UTF-8")
	public Response list() {
		try {
			
			Map<String,Object> response = new HashMap<String,Object>();
			response.put("hellos", new HelloRepo().list());
			return Response.status(Response.Status.OK).entity(response).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}

	}
}



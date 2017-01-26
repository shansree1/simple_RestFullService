package com.shaan.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shaan.rest.bo.RestFullBO;


@Component
@Path("/restfull")
public class RestService {
	
	@Autowired
	RestFullBO restBo;
	
	@GET
	@Path("getName")
	public Response getname(){
		
		String result = restBo.getName();
		return Response.status(200).entity(result).build();
		
	}

}

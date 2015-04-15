package com.rest.determinant;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/deter")
public class DeterResource {

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Determinant getDeter()
	{
		double[][] array = new double [2][2];
		Determinant deter = new Determinant();
		array[0][0]=1;
		array[0][1]=2;
		array[1][0]=3;
		array[1][1]=4;
		deter.setArray(array);
		deter.setOrder(2);
		return deter;
	}
	
	@GET
	@Path("/test")
	public String hello()
	{
		return "Hello Jersey";
	}
}

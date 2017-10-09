package org.vijay.rest.messenger.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/message")
public class MessageResource {
	
	@GET
	@Path("/1")
	public String getMessage(){
		return "Welcome";
	}

}

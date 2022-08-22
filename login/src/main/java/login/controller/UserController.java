package login.controller;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import login.model.User;
import login.services.UserServices;

@Path("User Controller")
public class UserController {

protected UserServices red = new UserServices();

	@Path("Create")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String create(User e) {
		return red.Create(e);

	}

	@Path("Read/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String read(@PathParam("id") long id) {
		return red.get(id);
	}

	@Path("Update/{id}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String update(@PathParam("id") long id, User e) {
		return red.Edit(id, e);
	}

	@Path("Delete/{id}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public boolean remove(@PathParam("id") long id) {
		return red.Remove(id);
	}

	@Path("GetAll")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<User> getAll() {
		return red.getAll();
	}
	
	@Path("Login")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String login(User e) {
		return red.Login(e);

	}

}

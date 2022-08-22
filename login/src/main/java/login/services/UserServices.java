package login.services;

import java.util.Collection;

import login.model.User;
import login.repository.UserRepository;

public class UserServices{

	protected UserRepository rep = UserRepository.getInstance();;

	public String Create(User e) {
		rep.AddE(e);
		return e.toString();
	}

	public String Edit(long id, User e) {
		return rep.EditE(id, e);
	}

	public boolean Remove(long id) {
		return rep.RemoveE(id);
	}

	public String get(long id) {
		return rep.getE(id);
	}

	public Collection<User> getAll() {

		return rep.getAllE();

	}
	
	public String Login(User e) {
		return rep.Login(e);
	}

}

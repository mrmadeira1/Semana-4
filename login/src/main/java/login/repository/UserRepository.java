package login.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import login.model.Entity_;
import login.model.User;

public class UserRepository extends Entity_ {

	public static UserRepository getInstance() {
		return INSTANCE;
	}

	private UserRepository() {

	}

	public static final UserRepository INSTANCE = new UserRepository();

	Map<Long, User> us = new HashMap<Long, User>();
	long currentId = 1;

	public String AddE(User e) {
		e.setId(currentId);
		currentId++;

		us.put(e.getId(), e);

		
		return e.toString();

	}

	public String EditE(long id, User e) {
		
			e.setId(id);
			us.put(id, e);
		
		return e.toString();
	}

	public boolean RemoveE(long id) {
		us.remove(id);

		return us.containsKey(id);
		// falso se remover

	}

	public String getE(long id) {
//		us.get(id);
		return us.get(id).toString();

	}

	public Collection<User> getAllE() {

		return us.values();

	}

	public String Login(User e) {
		String p = e.getPassword();
		String n = e.getUsername();

		if (us.size() > 0) {
			for(User f : us.values())
				if (f.getPassword().equals(p)&& f.getUsername().equals(n)){
					return "login efetuado com sucesso";

				} else
					return "Credenciais erradas";
			}
		return " ";

	}

}

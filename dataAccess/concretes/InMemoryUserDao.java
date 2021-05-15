package campHomeworkWeek5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import campHomeworkWeek5.dataAccess.abstracts.UserDao;
import campHomeworkWeek5.entities.concrete.User;

public class InMemoryUserDao implements UserDao{

	public List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("User added to database : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		this.users.remove(user);
		System.out.println("User deleted to database : " + user.getFirstName());
		
	}

	@Override
	public List<User> getAll() {
		
		return this.users;
	}

	@Override
	public boolean checkEmailExists(User user) {
			for (User person : users) {
				if (person.getEmail()==user.getEmail()) {
					return false;
				}
			}	
			return true;
	}

}

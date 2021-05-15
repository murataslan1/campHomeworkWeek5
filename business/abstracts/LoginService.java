package campHomeworkWeek5.business.abstracts;

import campHomeworkWeek5.entities.concrete.User;

public interface LoginService {
	void register(User user);
	void login(String email, String password);
}

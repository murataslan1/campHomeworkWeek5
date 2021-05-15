package campHomeworkWeek5.business.concretes;

import campHomeworkWeek5.business.abstracts.LoginService;
import campHomeworkWeek5.business.abstracts.UserService;
import campHomeworkWeek5.core.abstracts.GoogleService;
import campHomeworkWeek5.entities.concrete.User;

public class UserManager implements UserService {

	private LoginService loginService;
	private GoogleService googleService;
	
	public UserManager(LoginService loginService, GoogleService googleService) {
		
		this.loginService = loginService;
		this.googleService = googleService;
	}

	@Override
	public void register(User user) {
		loginService.register(user);
		
	}

	@Override
	public void login(String email, String password) {
		loginService.login(email, password);

		
	}

	@Override
	public void registerToGoogle() {
		googleService.registerToSystem();
		
	}

}

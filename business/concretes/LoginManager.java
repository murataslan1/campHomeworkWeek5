package campHomeworkWeek5.business.concretes;

import campHomeworkWeek5.business.abstracts.LoginService;
import campHomeworkWeek5.core.abstracts.CheckService;
import campHomeworkWeek5.core.abstracts.EmailService;
import campHomeworkWeek5.dataAccess.abstracts.UserDao;
import campHomeworkWeek5.entities.concrete.User;


public class LoginManager implements LoginService{

	private EmailService emailService;
	private CheckService checkService;
	private UserDao userDao;
	
	public LoginManager(EmailService emailService, CheckService checkService, UserDao userDao) {
		super();
		this.emailService = emailService;
		this.checkService = checkService;
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		
		if (!userDao.checkEmailExists(user)) {
			System.out.println("Registration failed.\n" + user.getEmail() + " This email has been used before");
			return;
		}
		if (checkService.checkFirstName(user.getFirstName())) {
			System.out.println("Firt name verified");
		}
		else {
			return;
		}
		if (checkService.checkLastName(user.getLastName())) {
			System.out.println("Last name is verified");
		}
		else {
			return;
		}
		if (checkService.checkEmail(user.getEmail())) {
			System.out.println("Email is  verified");
		}
		else {
			return;
		}
		if (checkService.checkPassword(user.getPassword())) {
			System.out.println("Password is  verified");
		}
		else {
			return;
		}
		
		emailService.sendVerifyEmail(user);
		emailService.clickToVerify(user);
		userDao.add(user);
		System.out.println("Registration is successful. Hi,  " + user.getFirstName() + " !");
		
	}
	@Override
	public void login(String email, String password) {
		for (User users : userDao.getAll()) {
			if (email==users.getEmail()) {
				
				if(password!=users.getPassword()) {
					System.out.println("Login failed. Check your email or password!");
					return;
				}
				System.out.println("Login successful");
				return;
				
			}

		}
		
	}

}

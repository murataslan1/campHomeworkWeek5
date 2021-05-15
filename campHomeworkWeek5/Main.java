package campHomeworkWeek5;

import campHomeworkWeek5.business.abstracts.UserService;
import campHomeworkWeek5.business.concretes.LoginManager;
import campHomeworkWeek5.business.concretes.UserManager;
import campHomeworkWeek5.core.adapters.GoogleManagerAdapter;
import campHomeworkWeek5.core.concretes.CheckManager;
import campHomeworkWeek5.core.concretes.EmailManager;
import campHomeworkWeek5.dataAccess.concretes.InMemoryUserDao;
import campHomeworkWeek5.entities.concrete.User;

public class Main {

	public static void main(String[] args) {
		

		UserService userService=new UserManager(new LoginManager(new EmailManager(), new CheckManager(), new InMemoryUserDao()), 
				new GoogleManagerAdapter()); 
		
		User user = new User(1, "Murat", "Aslan","contactmurataslan@gmail.com","123456789");
		userService.register(user);
		userService.login("contactmurataslan@gmail.com", "123456789");

		
		System.out.println("Google simulated");
		userService.registerToGoogle();
		
		User user1 = new User(2, "Murat", "Aslan", "contactmurataslan@gmail.com","58");
		userService.register(user1);
		userService.login("contactmurataslan@gmail.com", "852");

		
		
		
		
	}

}

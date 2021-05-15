package campHomeworkWeek5.core.concretes;

import campHomeworkWeek5.core.abstracts.EmailService;
import campHomeworkWeek5.entities.concrete.User;

public class EmailManager implements EmailService {

	@Override
	public void sendVerifyEmail(User user) {
		System.out.println("Your verification link has been send to your email: " + user.getEmail());
		
	}

	@Override
	public void clickToVerify(User user) {
		System.out.println("Click on the verification and verify your email: " + user.getFirstName());
		
	}

}

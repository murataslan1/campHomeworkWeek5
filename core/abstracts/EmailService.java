package campHomeworkWeek5.core.abstracts;

import campHomeworkWeek5.entities.concrete.User;

public interface EmailService {
	void sendVerifyEmail(User user);
	void clickToVerify(User user);
}

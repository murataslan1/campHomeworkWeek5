package campHomeworkWeek5.core.concretes;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

import campHomeworkWeek5.core.abstracts.CheckService;

public class CheckManager implements CheckService {

	public static final String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"; 
	// regex kullanıldı
	
	
	@Override
	public boolean checkFirstName(String firstName) {
		if (firstName.length()<3) {
			System.out.println("Your first name should contain at least 2 characters ");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(String lastName) {
		if (lastName.length()<3) {
			System.out.println("Your last name should contain at least 2 characters ");
			return false;
		}
		return true;
		
	}

	@Override
	public boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (!matcher.matches()) {
			System.err.println("Your email type should contain @gmail.com ");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkPassword(String password) {
		if (password.length()<6) {
			System.out.println("Your password should contain at least 6 characters ");
			return false;
		}
		return true;
		
	}

}

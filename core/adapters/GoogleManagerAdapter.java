package campHomeworkWeek5.core.adapters;

import campHomeworkWeek5.Google.GoogleManager;
import campHomeworkWeek5.core.abstracts.GoogleService;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void registerToSystem() {
		GoogleManager googleManager = new GoogleManager();
		googleManager.register();
		
	}

}

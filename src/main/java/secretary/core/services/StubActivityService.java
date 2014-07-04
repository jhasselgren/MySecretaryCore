package secretary.core.services;

import secretary.core.domain.Activity;
import secretary.core.events.CreatedEvent;
import secretary.core.events.DeletedEvent;
import secretary.core.events.GetManyEvent;
import secretary.core.events.GetOneEvent;
import secretary.core.events.UpdatedEvent;

public class StubActivityService implements ActivityService{

	public CreatedEvent<Activity> CreateActivity(Activity activity) {
		activity.setId("123-456-789");
		return new CreatedEvent<Activity>(activity.getId(), activity);
	}

	public GetOneEvent<Activity> getActivity(String id) {
		Activity activity = new Activity();
		
		activity.setId(id);
		activity.setName("Create a As-Is");
		activity.setShortDescription("Show a overview of DDS System");
		activity.setDescription("We should create a picture that show all compoment inside DDS Core and all contected systems. The goal is to get a good understanding of what DDS consist of");
		
		return new GetOneEvent<Activity>(id, activity);
	}

	public GetManyEvent<Activity> getAllActivities() {
		// TODO Auto-generated method stub
		return null;
	}

	public UpdatedEvent<Activity> updateActivity(Activity Activity) {
		// TODO Auto-generated method stub
		return null;
	}

	public DeletedEvent<Activity> deleteActivity(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}

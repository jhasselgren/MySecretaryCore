package secretary.core.services;

import secretary.core.domain.Activity;
import secretary.core.events.CreatedEvent;
import secretary.core.events.DeletedEvent;
import secretary.core.events.GetManyEvent;
import secretary.core.events.GetOneEvent;
import secretary.core.events.UpdatedEvent;

public interface ActivityService {
	public CreatedEvent<Activity> CreateActivity(Activity activity);
	public GetOneEvent<Activity> getActivity(String id);
	public GetManyEvent<Activity> getAllActivities();
	public UpdatedEvent<Activity> updateActivity(Activity Activity);
	public DeletedEvent<Activity> deleteActivity(String id);
}

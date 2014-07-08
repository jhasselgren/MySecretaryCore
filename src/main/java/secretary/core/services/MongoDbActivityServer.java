package secretary.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import secretary.core.domain.Activity;
import secretary.core.events.CreatedEvent;
import secretary.core.events.DeletedEvent;
import secretary.core.events.GetManyEvent;
import secretary.core.events.GetOneEvent;
import secretary.core.events.UpdatedEvent;
import secretary.core.repository.ActivityMongoRepository;

public class MongoDbActivityServer implements ActivityService{
	
	@Autowired
	ActivityMongoRepository repository;
	
	@Override
	public CreatedEvent<Activity> CreateActivity(Activity activity) {
		Activity saved = repository.save(activity);
		CreatedEvent<Activity> event = new CreatedEvent<Activity>(saved.getId(), saved);
		return event;
	}

	@Override
	public GetOneEvent<Activity> getActivity(String id) {
		
		Activity loadedActivity = repository.findOne(id);
		
		if(loadedActivity == null){
			return GetOneEvent.notFound(id);
		}
		
		GetOneEvent<Activity> event = new GetOneEvent<Activity>(loadedActivity.getId(), loadedActivity);
		
		return event;
	}

	@Override
	public GetManyEvent<Activity> getAllActivities() {
		
		List<Activity> allActivities = repository.findAll();
		
		GetManyEvent<Activity> event = new GetManyEvent<>(allActivities);
		
		return event;
	}

	@Override
	public UpdatedEvent<Activity> updateActivity(Activity activity) {

		Activity saved = repository.save(activity);
		
		return new UpdatedEvent<Activity>(saved.getId(), saved);
	}

	@Override
	public DeletedEvent<Activity> deleteActivity(String id) {
		
		Activity toDelete = repository.findOne(id);
		
		if(toDelete == null){
			return DeletedEvent.notFound(id);
		}
		
		repository.delete(toDelete);
		return new DeletedEvent<Activity>(id, toDelete);
	}

}

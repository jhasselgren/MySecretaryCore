package secretary.core.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import secretary.core.domain.Activity;
import secretary.core.domain.FileThing;
import secretary.core.domain.TextThing;
import secretary.core.domain.ToDoThing;
import secretary.core.events.CreatedEvent;
import secretary.core.events.DeletedEvent;
import secretary.core.events.GetManyEvent;
import secretary.core.events.GetOneEvent;
import secretary.core.events.UpdatedEvent;

public class StubActivityService implements ActivityService {

	static Map<String, Activity> activities = new HashMap<String, Activity>();
	
	public StubActivityService(){
		
//		activity = new Activity();
//		
//		activity.setId("hej");
//		activity.setName("Create a As-Is");
//		activity.setShortDescription("Show a overview of DDS System");
//		activity.setDescription("We should create a picture that show all compoment inside DDS Core and all contected systems. The goal is to get a good understanding of what DDS consist of");
//	
//		{
//			TextThing textThing = new TextThing();
//			textThing.setCreated(new Date());
//			textThing.setName("Meting 2014-06-10");
//			textThing.setText("<p>Mauris eu feugiat lorem, posuere sagittis eros. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ornare mi sem, eget rutrum lorem mollis vitae. Sed fermentum risus nec sagittis mattis. Quisque ac lacus sed justo pretium pharetra. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Ut porttitor sollicitudin justo vel fermentum. Duis ac tellus enim. Suspendisse facilisis aliquet velit ut adipiscing. Phasellus vulputate neque commodo pellentesque gravida. Quisque lacinia laoreet pharetra. Curabitur metus diam, elementum eu lacus et, scelerisque scelerisque ante. Morbi fermentum gravida dui in semper. Nam lacinia fermentum est ultrices tincidunt.</p><p>Ut luctus tortor eu urna posuere accumsan. Etiam id feugiat turpis, sed elementum neque. Integer tristique eros in semper consequat. Nunc risus ante, rhoncus a nunc non, auctor elementum dui. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Duis vulputate id metus vitae blandit.</p><p>Etiam congue velit ligula, a adipiscing nunc tempor eget. Praesent dapibus id erat id mattis. Mauris turpis arcu, dapibus at lectus non, posuere egestas nisi. Mauris nulla lacus, rutrum vel ornare nec, tincidunt id erat. Praesent feugiat ut mauris sed malesuada. Nulla id massa aliquam, placerat tortor aliquam, molestie mauris. Phasellus vulputate nunc ut lectus vestibulum ultrices. Cras gravida, lacus at tincidunt egestas, nibh est varius tellus, vitae gravida nulla massa ac augue. Donec eu purus tellus. Nulla eget diam malesuada, elementum diam pharetra, sodales libero.</p>");
//		
//			ToDoThing todoThing1 = new ToDoThing();
//			todoThing1.setCreated(new Date());
//			Calendar cal = new GregorianCalendar(2014,10,11);
//			todoThing1.setDeadline(cal.getTime());
//			todoThing1.setName("AP: Boka möte");
//			todoThing1.setProgress(30);
//			textThing.addThing(todoThing1);
//			
//			FileThing fileThing = new FileThing();
//			fileThing.setName("Systemkarta AS-IS Norge");
//			fileThing.setFileType("pdf");
//			fileThing.setFileId("test");
//			fileThing.setDescription("Beskriver hur DDS ser ut idag med huvudmoduler samt sammankopplade system");
//			textThing.addThing(fileThing);
//			
//			ToDoThing todoThing2 = new ToDoThing();
//			todoThing2.setCreated(new Date());
//			Calendar cal2 = new GregorianCalendar(2014,10,11);
//			todoThing2.setDeadline(cal2.getTime());
//			todoThing2.setName("Skapa en To-Be Systemkarta");
//			todoThing2.setProgress(100);
//			todoThing2.setCompleted(true);
//			textThing.addThing(todoThing2);
//			
//			activity.addThing(textThing);
//		}
//		
//		{
//			FileThing activityFileThing1 = new FileThing();
//			activityFileThing1.setName("Dokumentation om DDS");
//			activityFileThing1.setFileType("pdf");
//			activity.addThing(activityFileThing1);
//		}
//		
//		{
//			FileThing activityFileThing2 = new FileThing();
//			activityFileThing2.setName("DDS Källkod");
//			activityFileThing2.setFileType("zip");
//			activity.addThing(activityFileThing2);
//		}
//		
//		{
//			ToDoThing todoThing = new ToDoThing();
//			todoThing.setName("Skapa mötesantekningar");
//			Calendar cal = new GregorianCalendar(2014,7,21);
//			todoThing.setDeadline(cal.getTime());
//			todoThing.setProgress(25);
//			todoThing.setDescription("Skriv rent antekningarna och maila ut till alla deltagare");
//			activity.addThing(todoThing);
//		}
//		
//		{
//			ToDoThing todoThing = new ToDoThing();
//			todoThing.setName("Skapa mötesantekningar");
//			Calendar cal = new GregorianCalendar(2014,7,25);
//			todoThing.setDeadline(cal.getTime());
//			todoThing.setProgress(50);
//			todoThing.setDescription("Skriv rent antekningarna och maila ut till alla deltagare");
//			activity.addThing(todoThing);
//		}
	}
	
	public CreatedEvent<Activity> CreateActivity(Activity activity) {
		
		String id = UUID.randomUUID().toString();
		
		activity.setId(id);
		
		
		{
			TextThing textThing = new TextThing();
			textThing.setCreated(new Date());
			textThing.setName("Meting 2014-06-10");
			textThing.setText("<p>Mauris eu feugiat lorem, posuere sagittis eros. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ornare mi sem, eget rutrum lorem mollis vitae. Sed fermentum risus nec sagittis mattis. Quisque ac lacus sed justo pretium pharetra. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Ut porttitor sollicitudin justo vel fermentum. Duis ac tellus enim. Suspendisse facilisis aliquet velit ut adipiscing. Phasellus vulputate neque commodo pellentesque gravida. Quisque lacinia laoreet pharetra. Curabitur metus diam, elementum eu lacus et, scelerisque scelerisque ante. Morbi fermentum gravida dui in semper. Nam lacinia fermentum est ultrices tincidunt.</p><p>Ut luctus tortor eu urna posuere accumsan. Etiam id feugiat turpis, sed elementum neque. Integer tristique eros in semper consequat. Nunc risus ante, rhoncus a nunc non, auctor elementum dui. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Duis vulputate id metus vitae blandit.</p><p>Etiam congue velit ligula, a adipiscing nunc tempor eget. Praesent dapibus id erat id mattis. Mauris turpis arcu, dapibus at lectus non, posuere egestas nisi. Mauris nulla lacus, rutrum vel ornare nec, tincidunt id erat. Praesent feugiat ut mauris sed malesuada. Nulla id massa aliquam, placerat tortor aliquam, molestie mauris. Phasellus vulputate nunc ut lectus vestibulum ultrices. Cras gravida, lacus at tincidunt egestas, nibh est varius tellus, vitae gravida nulla massa ac augue. Donec eu purus tellus. Nulla eget diam malesuada, elementum diam pharetra, sodales libero.</p>");
		
			ToDoThing todoThing1 = new ToDoThing();
			todoThing1.setCreated(new Date());
			Calendar cal = new GregorianCalendar(2014,10,11);
			todoThing1.setDeadline(cal.getTime());
			todoThing1.setName("AP: Boka möte");
			todoThing1.setProgress(30);
			textThing.addThing(todoThing1);
			
			FileThing fileThing = new FileThing();
			fileThing.setName("Systemkarta AS-IS Norge");
			fileThing.setFileType("pdf");
			fileThing.setFileId("test");
			fileThing.setDescription("Beskriver hur DDS ser ut idag med huvudmoduler samt sammankopplade system");
			textThing.addThing(fileThing);
			
			ToDoThing todoThing2 = new ToDoThing();
			todoThing2.setCreated(new Date());
			Calendar cal2 = new GregorianCalendar(2014,10,11);
			todoThing2.setDeadline(cal2.getTime());
			todoThing2.setName("Skapa en To-Be Systemkarta");
			todoThing2.setProgress(100);
			todoThing2.setCompleted(true);
			textThing.addThing(todoThing2);
			
			activity.addThing(textThing);
		}
		
		{
			FileThing activityFileThing1 = new FileThing();
			activityFileThing1.setName("Dokumentation om DDS");
			activityFileThing1.setFileType("pdf");
			activity.addThing(activityFileThing1);
		}
		
		{
			FileThing activityFileThing2 = new FileThing();
			activityFileThing2.setName("DDS Källkod");
			activityFileThing2.setFileType("zip");
			activity.addThing(activityFileThing2);
		}
		
		{
			ToDoThing todoThing = new ToDoThing();
			todoThing.setName("Skapa mötesantekningar");
			Calendar cal = new GregorianCalendar(2014,7,21);
			todoThing.setDeadline(cal.getTime());
			todoThing.setProgress(25);
			todoThing.setDescription("Skriv rent antekningarna och maila ut till alla deltagare");
			activity.addThing(todoThing);
		}
		
		{
			ToDoThing todoThing = new ToDoThing();
			todoThing.setName("Skapa mötesantekningar");
			Calendar cal = new GregorianCalendar(2014,7,25);
			todoThing.setDeadline(cal.getTime());
			todoThing.setProgress(50);
			todoThing.setDescription("Skriv rent antekningarna och maila ut till alla deltagare");
			activity.addThing(todoThing);
		}
		
		
		
		activities.put(id, activity);
		
		return new CreatedEvent<Activity>(activity.getId(), activity);
	}

	public GetOneEvent<Activity> getActivity(String id) {
		
		Activity activity = activities.get(id);
		
		return new GetOneEvent<Activity>(id, activity);
	}

	public GetManyEvent<Activity> getAllActivities() {
		// TODO Auto-generated method stub
		return new GetManyEvent<Activity>(new ArrayList<Activity>(activities.values()));
	}

	public UpdatedEvent<Activity> updateActivity(Activity activity) {
		
		if(activity == null){
			return UpdatedEvent.notFound("");
		}
		
		if(!activities.containsKey(activity.getId())){
			return UpdatedEvent.notFound(activity.getId());
		}
		
		activities.put(activity.getId(), activity);
		
		return new UpdatedEvent<Activity>(activity.getId(), activity);
	}

	public DeletedEvent<Activity> deleteActivity(String id) {
		
		Activity actvity = activities.get(id);
		
		activities.remove(id);
		
		return new DeletedEvent<Activity>(id, actvity);
	}

}

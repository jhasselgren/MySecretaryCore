package secretary.core.events;

public class UpdatedEvent<T> {
	
	private String id;
	private T entity;
	private boolean entityFound = true;
	
	public UpdatedEvent(String id){
		this.id = id;
	}
	
	public UpdatedEvent(String id, T entity){
		this(id);
		this.entity = entity;
	}
	
	public String getId(){
		return id;
	}
	
	public T getEntity(){
		return this.entity;
	}
	
	public boolean isEntityFound(){
		return this.entityFound;
	}
	
	public static <T> UpdatedEvent<T> notFound(String id){
		UpdatedEvent<T> ev = new UpdatedEvent<T>(id);
		ev.entityFound = false;
		return ev;
	}
	
}

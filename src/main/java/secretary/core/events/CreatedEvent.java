package secretary.core.events;


public class CreatedEvent<T> {
	
	private T entity;
	private String id;
	
	public CreatedEvent(String id){
		this.id = id;
	}
	
	public CreatedEvent(String id, T entity){
		this(id);
		this.entity = entity;
	}
	
	public String getId(){
		return this.id;
	}
	
	public T getEntity(){
		return this.entity;
	}
}

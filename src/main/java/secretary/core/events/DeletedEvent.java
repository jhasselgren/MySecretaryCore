package secretary.core.events;

public class DeletedEvent<T> {
	private String id;
	private T entity;
	private boolean entityFound = true;
	private boolean deletionCompleted;
	
	public DeletedEvent(String id){
		this.id = id;
	}
	
	public DeletedEvent(String id, T entity){
		this(id);
		this.entity = entity;
		this.deletionCompleted = true;
	}
	
	public String getId(){
		return id;
	}
	
	public T getEntity(){
		return this.entity;
	}
	
	public boolean isDeletionCompleted(){
		return this.deletionCompleted;
	}
	
	public boolean isEntityFound(){
		return this.entityFound;
	}
	
	public static <T> DeletedEvent<T> deletionForbidden(String id){
		DeletedEvent<T> ev = new DeletedEvent<T>(id);
		ev.entityFound = true;
		ev.deletionCompleted = false;
		
		return ev;
	}
	
	public static <T> DeletedEvent<T> notFound(String id){
		DeletedEvent<T> ev = new DeletedEvent<T>(id);
		ev.entityFound = false;
		return ev;
	}
	
}

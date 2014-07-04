package secretary.core.events;

public class GetOneEvent<T> {
	private String id;
	private T entity;
	private boolean entityFound = true;
	
	public GetOneEvent(String id){
		this.id = id;
	}
	
	public GetOneEvent(String id, T entity){
		this(id);
		this.entity = entity;
	}
	
	public String getId(){
		return this.id;
	}
	
	public T getEntity(){
		return this.entity;
	}
	
	public boolean isEntityFound(){
		return this.entityFound;
	}
	
	public static <T> GetOneEvent<T> notFound(String id){
		GetOneEvent<T> ev = new GetOneEvent<T>(id);
		ev.entityFound = false;
		return ev;
	}
	
}

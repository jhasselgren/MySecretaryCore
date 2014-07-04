package secretary.core.events;

import java.util.List;

public class GetManyEvent<T> {
	private final List<T> entities;
	
	public GetManyEvent(List<T> entities){
		this.entities = entities;
	}
	
	public List<T> getEntities(){
		return this.entities;
	}
	
}

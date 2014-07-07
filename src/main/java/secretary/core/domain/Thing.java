package secretary.core.domain;

import java.util.Date;
import java.util.UUID;

public class Thing {
	private String name;
	private Date created;
	private ThingType type;
	private String id;
	
	public Thing() {
		created = new Date();
		id = UUID.randomUUID().toString();
	}
	
	protected void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public ThingType getType() {
		return type;
	}
	public void setType(ThingType type) {
		this.type = type;
	}
}

package secretary.core.domain;

import java.util.Date;

public class Thing {
	private String name;
	private Date created;
	private ThingType type;
	
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

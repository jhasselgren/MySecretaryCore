package secretary.core.domain;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,
		include = JsonTypeInfo.As.PROPERTY,
		property = "type",
		visible = true
		
		)
@JsonSubTypes(
		{
			@Type(value = FileThing.class),
			@Type(value = TextThing.class),
			@Type(value = ToDoThing.class)
		}
		)
public abstract class Thing {
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
	
	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		Thing toCompare;
		
		if(obj != null && obj instanceof Thing)
		{
			toCompare = (Thing) obj;
			isEqual = toCompare.id.equals(this.id);
		}
		
		return isEqual;
	}
}

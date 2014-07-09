package secretary.core.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("TODO")
public class ToDoThing extends Thing { 
	
	private Boolean completed = false;
	private Date deadline;
	private String description;
	private int progress;
	
	public ToDoThing(){
		super();
		this.setType(ThingType.TODO);
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}
	
	
	
}

package secretary.core.domain;

import java.util.ArrayList;
import java.util.List;

public class TextThing extends Thing {
	
	private String text;
	private List<Thing> things;
	
	public TextThing() {
		this.things = new ArrayList<Thing>();
		this.setType(ThingType.TEXT);
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Thing> getThings() {
		return things;
	}

	public void setThings(List<Thing> things) {
		this.things = things;
	}
	
	public void addThing(Thing thing){
		this.things.add(thing);
	}
}

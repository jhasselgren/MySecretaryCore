package secretary.core.domain;


public class FileThing extends Thing {
	
	private String fileType;
	private String description;
	
	public FileThing(){
		super();
		setType(ThingType.FILE);
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

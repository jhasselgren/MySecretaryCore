package secretary.core.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;


@JsonTypeName("FILE")
public class FileThing extends Thing {
	
	private String fileType;
	private String description;
	private String fileId;
	
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

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	
	
}

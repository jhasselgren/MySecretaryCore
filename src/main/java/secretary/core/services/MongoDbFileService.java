package secretary.core.services;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsOperations;

import com.mongodb.gridfs.GridFSDBFile;

public class MongoDbFileService implements FileService {

	GridFsOperations gridOperations;
	
	public MongoDbFileService(GridFsOperations gridOperations){
		this.gridOperations = gridOperations;
	}
	
	public void UploadFile(InputStream inputStream, String fileName) {
		gridOperations.store(inputStream, fileName);
	}

	public void fetchFile(OutputStream outputStream, String fileName) throws IOException {
		
		List<GridFSDBFile> result = gridOperations.find(new Query(Criteria.where("filename").is(fileName)));
		
		for (GridFSDBFile file : result) {
			
			file.writeTo(outputStream);
		}
	}
}

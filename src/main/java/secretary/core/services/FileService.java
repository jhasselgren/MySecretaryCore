package secretary.core.services;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface FileService {
	public void UploadFile(InputStream inputStream, String fileName);
	public void fetchFile(OutputStream outputStream, String fileName) throws IOException;
}

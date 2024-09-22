package iostreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteDataToNotepad {

	public static void main(String[] args) throws Exception {
		String str = "Hello Java World";

		String filePath = System.getProperty("user.dir") + "\\Files\\TestOutputFile.txt";
		File file1 = new File(filePath);
		FileOutputStream fos = new FileOutputStream(file1);
		fos.write(str.getBytes());
		fos.close();
		

	}

}

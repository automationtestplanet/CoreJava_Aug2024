package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteDataToPropertiesFile {

	public static void main(String[] args) throws Exception {
		String filePath = System.getProperty("user.dir") + "\\Files\\Test.properties";		

		File file1 = new File(filePath);
		FileInputStream fis = new FileInputStream(file1);		
		Properties testProperties = new Properties();
		testProperties.load(fis);		
		testProperties.setProperty("gender", "Male");
		FileOutputStream fos = new FileOutputStream(file1);
		testProperties.store(fos, "Done by Raju Chelle");
		fos.close();

	}

}

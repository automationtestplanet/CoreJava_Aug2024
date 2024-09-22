package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws Exception {
		
		String filePath = System.getProperty("user.dir") + "\\Files\\Test.properties";		

		File file1 = new File(filePath);
		FileInputStream fis = new FileInputStream(file1);		
		Properties testProperties = new Properties();
		testProperties.load(fis);
		System.out.println(testProperties.getProperty("name"));
		System.out.println(testProperties.getProperty("qualification "));
		System.out.println(testProperties.getProperty("job"));
		System.out.println(testProperties.getProperty("age"));
		System.out.println(testProperties.getProperty("salary"));
		System.out.println(testProperties.getProperty("roll.no"));
		System.out.println(testProperties.getProperty("gender1"));

	}

}

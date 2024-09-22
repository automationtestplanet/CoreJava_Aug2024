package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReadDataFromNotepad {

	public static void main(String[] args) throws Exception {

		System.out.println(System.getProperty("user.dir"));

		String filePath = System.getProperty("user.dir") + "\\Files\\TestInputFile.txt";
		System.out.println(filePath);

		File file1 = new File(filePath);
		FileInputStream fis = new FileInputStream(file1);

		System.out.println(fis.available());
		byte[] byteArr = new byte[fis.available()];
		fis.read(byteArr);

//		for(byte eachByte:byteArr) {
//			System.out.println(eachByte);
//		}

		String data = new String(byteArr);

		System.out.println(data);

		var filteredData = Arrays.asList(data.split(" ")).stream().filter(eachWord -> eachWord.equals("Java"))
				.collect(Collectors.toList());
		System.out.println(filteredData);

	}

}

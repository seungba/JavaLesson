package lesson20190402;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExcelEx01 {
	public static void main(String[] args) {
		String txtPathName = "C:\\Users\\dltmd\\Desktop\\Lesson2.txt";
		String excPathName = "C:\\Users\\dltmd\\Desktop\\Lesson.xlsx";
		File txtFile = new File(txtPathName);
		File excFile = new File(excPathName);
		
//		System.out.println(txtFile.exists());		// true
		System.out.println(excFile.exists());		// true
//		System.out.println(file);				// true
		
		try {
			byte[] byteContent = Files.readAllBytes(Paths.get(excPathName));
			String content = new String(byteContent);
			System.out.println(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

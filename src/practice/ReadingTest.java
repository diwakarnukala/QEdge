package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadingTest {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\Sri\\Desktop\\Selenium.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet()
		
	}

}

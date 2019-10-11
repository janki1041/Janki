package screenshot;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {

	public static void main(String[] args) throws IOException, InterruptedException, InvalidFormatException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Sanjay\\Desktop\\demo.xlsx");

//		String value1 =WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(value1);
//		Thread.sleep(1000);
		 String value2 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value2);
	}

}

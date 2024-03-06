package Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExternalFile {
public void fetch() throws EncryptedDocumentException, IOException {
	File file = new File("D\\");
	FileInputStream fis = new FileInputStream(file);
	Workbook wb=WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("Sheet1");
	int row = sheet.getPhysicalNumberOfRows();
	int col = sheet.getRow(0).getPhysicalNumberOfCells();
	for(int i =0;i<row;i++) {
		for(int j =0;j<col;j++) {
		String s= sheet.getRow(i).getCell(j).toString();
		System.out.println(s);
		}
	}
}
}

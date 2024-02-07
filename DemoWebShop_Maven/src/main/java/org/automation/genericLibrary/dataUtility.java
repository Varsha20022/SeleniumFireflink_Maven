package org.automation.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class dataUtility {
	public String getData(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(FrameWorkConstans.properties_Path);
		Properties pobj=new Properties();
		pobj.load(fis);
		return pobj.getProperty(key);
	}
   public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
   {
	   FileInputStream fis=new FileInputStream(FrameWorkConstans.excel_Path);
	   Workbook book = WorkbookFactory.create(fis);
	   Sheet sh = book.getSheet(sheetName);
	     return sh.getRow(rowNum).getCell(cellNum).toString();
	   
   }
   
   public Object[][] getMultipledata(String Sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(FrameWorkConstans.excel_Path);
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(Sheetname);
		int lastrow = sh.getPhysicalNumberOfRows();
		int lastcell = sh.getRow(0).getPhysicalNumberOfCells();
		Object [][] arr=new Object[lastrow-1][lastcell];
		for(int i=1;i<lastrow;i++)
		{
			for(int j=0;j<lastcell;j++)
			{
             arr[i-1][j]=sh.getRow(i).getCell(j).toString();
             
			}
			//System.out.println();
			
		}
		return arr;

	}


   
}

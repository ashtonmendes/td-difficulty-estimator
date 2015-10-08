package gamepipelab.usc.tdgame.readers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
public class SampleReader
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis = new FileInputStream("/home/ashton/Desktop/aae_TDDesignData.xlsm");
		Workbook workbk = new XSSFWorkbook(fis);
		System.out.println("Number of sheets: "+workbk.getNumberOfSheets());
		
		Sheet sheet = workbk.getSheetAt(3);

			
		Iterator<Row> rowIter = sheet.iterator();
		
		/*Iterator<Cell> cellIter = sheet.getRow(25).cellIterator();
		
		while(cellIter.hasNext())
		{
			Cell cell = cellIter.next();
			
			System.out.print(cell+"\t");
		}*/
		
		System.out.println(sheet.getRow(25).getCell(1));		
		
		/*while(rowIter.hasNext())
		{
			Row row = rowIter.next();
			
			Iterator<Cell> cellIter = row.cellIterator();
			
			while(cellIter.hasNext())
			{
				Cell cell = cellIter.next();
				
				System.out.print(cell+"\t");
			}
			
			System.out.println();
		}*/
		
	}
}

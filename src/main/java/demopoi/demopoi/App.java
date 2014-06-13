package demopoi.demopoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InvalidFormatException, FileNotFoundException, IOException
    {
        
    	 Workbook wb3=WorkbookFactory.create(new FileInputStream("/home/raaz/Downloads/Book1.xlsx"));
    	    Sheet sh=wb3.getSheet("sheet1");  
    	    int rows=sh.getLastRowNum();
    	
    	    System.out.println(rows);
    	    
    	    
    	    
    	    Map<String, Object[]> data = new HashMap<String, Object[]>();
    	    data.put("1", new Object[] {"Emp No.", "Name", "Salary"});
    	    data.put("2", new Object[] {1d, "John", 1500000d});
    	    data.put("3", new Object[] {2d, "Sam", 800000d});
    	    data.put("4", new Object[] {3d, "Dean", 700000d});
    	     
    	    Set<String> keyset = data.keySet();
    	    int rownum = 0;
    	    for (String key : keyset) {
    	        Row row = sh.createRow(rownum++);
    	        Object [] objArr = data.get(key);
    	        int cellnum = 0;
    	        for (Object obj : objArr) {
    	            Cell cell = row.createCell(cellnum++);
    	            if(obj instanceof Date) 
    	                cell.setCellValue((Date)obj);
    	            else if(obj instanceof Boolean)
    	                cell.setCellValue((Boolean)obj);
    	            else if(obj instanceof String)
    	                cell.setCellValue((String)obj);
    	            else if(obj instanceof Double)
    	                cell.setCellValue((Double)obj);
    	        }
    	    }
    	    FileOutputStream out = 
    	            new FileOutputStream(new File("/home/raaz/Downloads/Book1.xlsx"));
    	    wb3.write(out);
    	    out.close();
    }
}

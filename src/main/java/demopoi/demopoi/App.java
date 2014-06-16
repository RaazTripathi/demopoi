package demopoi.demopoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFDataValidation;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InvalidFormatException, FileNotFoundException, IOException
    {
    	
    	
    	String rowval[]={"manchurian","cheez","onion","chili","Y","600","400"};
        
    	XSSFWorkbook wb=(XSSFWorkbook) WorkbookFactory.create(new FileInputStream("G:\\Projects\\demopoi\\src\\main\\java\\Book1.xlsx"));
    	    Sheet sh=wb.getSheet("sheet1");  
    	    int rows=sh.getLastRowNum();
    
    	    XSSFSheet sh2=wb.getSheet("sheet2");  
    	    int rowcount=sh2.getLastRowNum();
    	    
    	    System.out.println(rowcount);
    	    
    	    
    	    
    	    List<XSSFDataValidation> validations=   sh2.getDataValidations();
    	  
    	    
    	    
    	    
    	    
    	 for (int a=0;a<=10;a++)
    	 {
    		 Row row=sh2.getRow(a);
    		 if(row!=null)
    		 {
    			Cell cel=row.getCell(0);
    			System.out.println(cel.getStringCellValue());
    			
    			if(cel.getStringCellValue().equals("Ingridient2"))
    			{
    				System.out.println();
    				Cell cel2=row.getCell(1);
    				
    				System.out.println(cel2.getStringCellValue());
    				
    				
    			cel2.getDateCellValue();
    				
    			}
    			
    		 }
    		 
    		 
    	 }
    	    
    	    
    	    
    	 /*   Row lastrow=sh.getRow(rows);
    	    
    	    
    	    
    	    
    	   Row row= sh.createRow(rows+1);
    	int i=0;
    	   for(String str:rowval){
    	Cell cel=   row.createCell(i);
    	   
    	   cel.setCellValue(str);
    	   
    	   i++;
    	   }*/  
    	    FileOutputStream out = 
    	            new FileOutputStream(new File("G:\\Projects\\demopoi\\src\\main\\java\\Book1.xlsx"));
    	    wb.write(out);
    	    out.close();
    	    
  	    
    	    
    	    
    	    
    }
}

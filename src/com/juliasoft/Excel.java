package com.juliasoft;

import java.io.*;
import java.util.Iterator;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {
	
	public String path = null;
	public Workbook workbook = null;
	//public Sheet sheet = null;
	
	public enum EndpointType{
		SOURCE,
		SINK;
	}
	
	public Excel(String path) {
		this.path = path;
		openWorkBook();
	}
	
	public void openWorkBook() {
		try {
			//workbook = WorkbookFactory.create(new File(path));
			workbook = new XSSFWorkbook(new FileInputStream(path));
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot open" + path);
		}
	}
	
	public Sheet getSheet(String sheetname) {
		Sheet sheet = null;
		try {
			Iterator<Sheet> sheetIterator = workbook.sheetIterator();
	        while (sheetIterator.hasNext()) {
	            Sheet tempSheet = sheetIterator.next();
	            	if(tempSheet.getSheetName().equals(sheetname))
	            		sheet = tempSheet;
	        }
			
		} catch (EncryptedDocumentException e) {
			System.out.println(sheetname + " doesnot exist in the workbook" + path);
		}
		return sheet;
	}
	
	public void readExcel(String sheetname ) {
		Sheet sheet = getSheet(sheetname);
		DataFormatter dataFormatter = new DataFormatter();
		Iterator<Row> rowIterator = sheet.rowIterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				String cellValue = dataFormatter.formatCellValue(cell);
				System.out.print(cellValue + "\t");
			}
			System.out.println();
		}

	}
	

	public void updateJuliaConfigFile(String sheetname, String ChannelPath, int chanelSheetIndex, int confColNo) {
		//String sheetname -- The sheet of GDPR Specification file
		//String chanelSheetIndex -- Channel Configuration file
		//int SheetIndex -- sheet no on the channel configuration
		//int targetCellNo -- target column number in the GDPR Specification file.
		
		
		Workbook channelWorkbook = null;
		System.out.println("opening channel config: " + ChannelPath);
		
		try {
			channelWorkbook = new XSSFWorkbook(new FileInputStream(ChannelPath));
		} catch (IOException e) {
			System.out.println("cannot open configuration file: " + ChannelPath);
		}
		
		
		Sheet ChannelSheet = channelWorkbook.getSheetAt(chanelSheetIndex);
		Sheet configsheet = getSheet(sheetname);
		int ChannelRowCount = ChannelSheet.getLastRowNum() - ChannelSheet.getFirstRowNum();
		int configRowCount = configsheet.getLastRowNum() - configsheet.getFirstRowNum();
		//System.out.println("no of rows->"+ configsheet.getSheetName()+" -- " + configRowCount);
		int SensitiveDataCategoriesROW = 1;
		int LeakagePointCategoriesROW =1;
		for (int row=1; row<=ChannelRowCount;row++) {
			
			Row channelRow = ChannelSheet.getRow(row);
			Cell channelCell_M = channelRow.getCell(2);
			String channelMethod = channelCell_M.getStringCellValue();
			
			Cell channelCell_P = channelRow.getCell(1);		
			String channelClass = channelCell_P.getStringCellValue();
			
			Cell channelCell_T = channelRow.getCell(5);
			String chnltype = channelCell_T.getStringCellValue();

			if(sheetname.equals("SensitiveData")) {
				for(int confRow=1; confRow <= configRowCount; confRow++) {
					String confMethod = getValuesat(sheetname, confRow, 2);
					
					if(confMethod.equals(channelMethod)) {
						String confClass = getValuesat(sheetname, confRow, 1);
						if(confClass.equals(channelClass)) {
							System.out.println("-->"+confClass);
							UpdateCategories("SensitiveDataCategories", SensitiveDataCategoriesROW, 0, chnltype);
							String temp = getValuesat(sheetname, confRow, 5);
							System.out.println("-->"+sheetname+" : "+confRow+ " : "+ 2 + " = " +temp);
							UpdateTypeofSensitiveData(sheetname, confRow, confColNo, chnltype);
							SensitiveDataCategoriesROW++;
						}

					}
				}
			}
			
			if(sheetname.equals("LeakagePoint")) {
				for(int confRow=1; confRow <= configRowCount; confRow++) {
					String confMethod = getValuesat(sheetname, confRow, 2);
					
					if(confMethod.equals(channelMethod)) {
						String confClass = getValuesat(sheetname, confRow, 1);
						if(confClass.equals(channelClass)) {
							System.out.println("-->"+confClass);
							UpdateCategories("LeakagePointCategories", LeakagePointCategoriesROW, 0, chnltype);
							String temp = getValuesat(sheetname, confRow, 5);
							System.out.println("-->"+sheetname+" : "+confRow+ " : "+ 2 + " = " +temp);
							UpdateTypeofSensitiveData(sheetname, confRow, confColNo, chnltype);
							LeakagePointCategoriesROW++;
						}

					}
				}
			}
		}
		
		try {
			channelWorkbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot close" + ChannelPath);
		}
	}
	
	
	public String getValuesat(String sheetname, int rowID, int colID) {
		String value = "";
		Sheet sheet = getSheet(sheetname);
		// Get Row at index rowID
		//System.out.println(sheet.getSheetName() + "--" +rowID + "--" +colID);
	    Row row = sheet.getRow(rowID);
	    // System.out.println(row.getPhysicalNumberOfCells());
	    // Get the Cell at index colID from the above row
	    Cell cell = row.getCell(colID);
	    if (cell == null) {
	        System.out.println("cell does not exist at: " + path+" -> "+sheetname);
	    }else {
	    	value = cell.getStringCellValue();
	    	//System.out.println(row.getRowNum()+" "+value);
	    }
		return value;
	}
	public void UpdateTypeofSensitiveData(String sheetname, int rowID, int colID, String val) {
		
		Sheet sheet = getSheet(sheetname);

		// Get Row at index rowID
	    Row row = sheet.getRow(rowID);
	    // Get the Cell at index colID from the above row

	    //row.removeCell(row.getCell(colID));
	    //Cell cell = row.getCell(colID);
	    Cell cell = row.createCell(colID);
        cell.setCellType(CellType.STRING);

	    cell.setCellValue(val);
	    FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream(path);
		    workbook.write(fileOut);
		    fileOut.close();
		    System.out.println("Updated Row "+rowID +": "+sheetname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot write");
		}
	}
	public void UpdateCategories(String sheetname, int rowID, int colID, String val) {
		Sheet sheet = getSheet(sheetname);
		// Get Row at index rowID
		
	    Row row = sheet.createRow(rowID);
	    if(row==null) {
	    	row = sheet.createRow(rowID);
	    }
	    // Get the Cell at index colID from the above row
	    Cell cell = row.getCell(colID);

	 // Create the cell if it doesn't exist
	    if (cell == null) {
	        cell = row.createCell(colID);
	        cell.setCellType(CellType.STRING);
	    }
	    cell.setCellValue(val);
	    //write to excel
	    FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream(path);
		    workbook.write(fileOut);
		    fileOut.close();
		    System.out.println("Updated Row "+rowID +": "+sheetname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot write");
		}
	}

	public void closeExcel(){
		try {
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot close" + path);
		}
	}
}

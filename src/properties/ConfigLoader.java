package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

	public static String getMyValue(String key) {
		FileInputStream fis2=null;
		Properties family=new Properties();
		try {
			//fis=new FileInputStream("./config.properties");//"./config.properties"
			fis2=new FileInputStream("./family.properties");
			//prop.load(fis);
			family.load(fis2);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		if(fis2!=null)
//			fis2.close();
		String value=family.getProperty(key);
		return value;
		
	}
	public static void main(String[] args) throws IOException {
		System.out.println(getMyValue("sister"));
		
//		Properties prop=new Properties();
//		
//		FileInputStream fis=null;
//		
//		
//
//		try {
//			fis=new FileInputStream("./config.properties");//"./config.properties"
//			
//			prop.load(fis);
//		
//		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//System.out.println(prop.getProperty("fairfax"));
//		System.out.println(prop.getProperty("Washington DC"));
//		System.out.println(prop.getProperty("New Orleans"));
//		
//		
//		if(fis!=null)
//			fis.close();
//		
//		
		/*
		 * Dymitry's code
		 * FileInputStream fi=null;
try {
   fi=new FileInputStream("c:\\search.xls");
   Workbook w=Workbook.getWorkbook(fi);
   Sheet s=w.getSheet(0);
} finally {
   if (fi!=null) {
       fi.close();
   }
}
		 */
	
		
	}

}

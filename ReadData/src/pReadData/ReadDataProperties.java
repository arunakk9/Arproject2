package pReadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ReadDataProperties {

	public static void main(String[] args) {
		
		try{ 
			File file =new File("datafile.properties");
			FileInputStream fileInput = new FileInputStream(file); 
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();
			
			@SuppressWarnings("rawtypes")
			Enumeration enukeys = properties.keys();
			while (enukeys.hasMoreElements()){
				String key = (String) enukeys.nextElement();
				String value = properties.getProperty(key);
				System.out.println(key + ": "  + value );
				
			}}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e){
				e.printStackTrace();
			}
						
			
		}
		// TODO Auto-generated method stub

	}



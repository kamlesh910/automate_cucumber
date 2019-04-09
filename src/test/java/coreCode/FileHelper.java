package coreCode;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class FileHelper {
	Properties prop = new Properties();
	InputStream input = null;

	public String getProperty(String key) {
		try {
			input = new FileInputStream("src/test/java/Repository/contactPage_repository.properties");
			prop.load(input);
			//System.out.println(prop.getProperty(key));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return prop.getProperty(key).toString();
	}
}

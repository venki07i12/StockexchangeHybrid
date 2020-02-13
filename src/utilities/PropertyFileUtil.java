package utilities;

import java.io.FileInputStream;
import java.util.Properties;


public class PropertyFileUtil {

	public static String getValueForkey(String Key) throws Exception
	{
		FileInputStream fis = new FileInputStream("./PropertiesFile/Environment.properties");
		Properties configproperties = new Properties();
		configproperties.load(fis);
		return configproperties.getProperty(Key);
	}
	
	
	
}

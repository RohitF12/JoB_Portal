package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class Property_File 
{
	public static String r_email;
	public static String r_password;

	public String getdata(String key) throws IOException
	{
		Properties p = new Properties();
		FileInputStream fis= new FileInputStream("./src/test/resources/data.properties");
		p.load(fis);
		return p.getProperty(key);
		
	}

}

package utilitypack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyDataUtility {
	public String readPropData(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IPathConstant.PROPERTYPATH);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}

}

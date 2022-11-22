package practiceForFetching;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadingDatafromXmlFileTest {
	@Test
	public void readingDataFromXml(XmlTest xml)
	{
		String value=xml.getParameter("url");
		String username=xml.getParameter("un");
		String password=xml.getParameter("pwd");
		
		System.out.println(value);
		System.out.println(username);
		System.out.println(password);
	}

}

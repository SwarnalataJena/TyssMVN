package practiceForFetching;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadingDataFromjsonFileTest {
	@Test
	public void readingJsonfile() throws Throwable, Throwable
	{
		FileReader fr=new FileReader("./readJsn.json");
		JSONParser jp=new JSONParser();
		Object jobj = jp.parse(fr);
		HashMap hm=(HashMap)jobj;
		String value=(String)hm.get("url");
		String username=(String)hm.get("un");
		String password=(String)hm.get("pwd");
		
		System.out.println(value);
		System.out.println(username);
		System.out.println(password);
	}

}

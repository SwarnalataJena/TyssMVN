package utilitypack;

import java.util.Random;

/**
 * author Swarna
 * @author USER
 *
 */
public class JavaUtility {
	public static int createmulorgname()
	{
		Random r=new Random();
		int rn = r.nextInt(2000);
		return rn;		
	}

}

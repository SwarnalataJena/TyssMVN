package practise;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicateUsingHashmap {
	public static void main(String[] args) {
		String str[]= {".net","python","java",".net"};
		HashSet hp=new HashSet();
		for(String s:str) {
			if(!hp.add(s))
			{
				System.out.println(hp);
			}
		}
		
	}

}

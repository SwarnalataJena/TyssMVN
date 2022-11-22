package practise;

public class PositionSameButWordReverse {
	public static void main(String[] args) {
		String str="amear is a good boy";
		String s[]=str.split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
			String s1=s[i];
			String res="";
			for(int j=0;j<s1.length();j++)
			{
			res=s1.charAt(j)+res;	
			}
			System.out.print(res+" ");
		}
		
	}

}

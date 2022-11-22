package practise;

public class ReverseString {
	public static void main(String[] args) {
		String str="amear is a bad boy";
		String[] s = str.split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
		String res=s[i];
		System.out.print(res+" ");
		}
		
	}

}

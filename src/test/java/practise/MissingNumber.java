package practise;

public class MissingNumber {
	public static void main(String[] args) {
		int a[]= {1,2,5,3,10};
		boolean status=true;
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==a[j])
				{
					status=false;
					break;
				}
			}
			if(status==true)
			{
				System.out.println(i+" ");
			}
			status=true;
		}
		
	}

}

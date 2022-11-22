package practise;

import java.util.Arrays;

public class PartialReverseOfArray {
	public static void main(String[] args) {
		int a[]= {2,8,9,7,4,5,6};
		int key=2;
		for(int i=0;i<key;i++)
		{
			int temp=a[0];
			for(int j=1;j<a.length;j++)
			{
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}

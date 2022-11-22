package oopsConcept;

public class DownCastParent {
	public void m1()
	{
		System.out.println("Good morning");
	}
	public void m2()
	{
		System.out.println("Good afternoon");
	}

}
class DownCastChild extends DownCastParent{
	public void m2()
	{
		System.out.println("Good morning dear");
	}
	public void m3()
	{
		System.out.println("Good afternoon dear");
	}
	public static void main(String[] args) {
		DownCastParent d=new DownCastChild();
		d.m1();
		d.m2();
//		d.m3();
		DownCastChild c=(DownCastChild)d;
		c.m1();
		c.m2();
		c.m3();
	}
}

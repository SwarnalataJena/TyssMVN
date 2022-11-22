package oopsConcept;

public class UpCastParent {
	public void m1()
	{
		System.out.println("Good morning");
	}
	public void m2()
	{
		System.out.println("Good afternoon");
	}
}
class UpCastChild extends UpCastParent{
	public void m1()
	{
		System.out.println("Good morning dear");
	}
	public void m3()
	{
		System.out.println("good night dear");
	}
	public static void main(String[] args) {
	UpCastParent u=new UpCastChild();
	u.m1();
	u.m2();
//	u.m3(); compile time error
	}
	
}

package oopsConcept;

public interface A {
	public void m1();

}
interface B{
	public void m2();	
}
interface C{
	public void m3();	
}
class Abc implements A,B,C{
	public void m1()
	{
		System.out.println("jorka jhatka");
	}
	public void m2()
	{
		System.out.println("hai jorose");
	}
	public void m3()
	{
		System.out.println("laga");
	}

	public static void main(String[] args) {
		Abc a=new Abc();
		a.m1();
		a.m2();
		a.m3();
	}
}
package oopsConcept;

public class MethodOverload {
	public void m(int x)
	{
		System.out.println("Abcdefg");
	}
	public void m(String name)
	{
		System.out.println("hijklmn");
	}
	public void m(float f)
	{
		System.out.println("opqrstuvwxyz");	
	}
	public static void main(String[] args) {
		MethodOverload m=new MethodOverload();
		m.m(12);
		m.m(56.786f);
		m.m("Swarna");
	}
}

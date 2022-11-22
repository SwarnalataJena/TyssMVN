package oopsConcept;

public class ParentInherit {
	public void m1()
	{
		System.out.println("good morning guys");
	}
	public void m2()
	{
		System.out.println("Good night all");
	}

}
class ChildInherit extends ParentInherit{
	public static void main(String[] args) {
		ChildInherit c=new ChildInherit();
		c.m1();
		c.m2();
	}
}

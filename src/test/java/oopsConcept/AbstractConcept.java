package oopsConcept;

public abstract class AbstractConcept {
	public abstract void m1();
	public void m2() {
		System.out.println("I have already implemented");
	}

}
class AbstractConceptChild extends AbstractConcept{
	public void m1()
	{
		System.out.println("I have implemented just now");
	}
	public static void main(String[] args) {
		AbstractConceptChild a=new AbstractConceptChild();
		a.m1();
		a.m2();
	}
}

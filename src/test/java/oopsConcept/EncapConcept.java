package oopsConcept;

public class EncapConcept {
	private int x=27;
	private String name="Swarna";
	public String getName()
	{
		return name;
	}
	public int getX()
	{
		return x;
	}

}
class ChildEncap{
	public static void main(String[] args) {
		EncapConcept e=new EncapConcept();
		String n=e.getName();
		int a=e.getX();
		System.out.println("My name is "+n);
		System.out.println("My age is "+a);
	}
}

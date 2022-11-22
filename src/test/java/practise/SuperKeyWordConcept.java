package practise;

public class SuperKeyWordConcept {
	 int x=50;
	 static String name="swarna";
	public void m() {
		System.out.println("good night dear");
	}
	public static void m1() {
		System.out.println("good morning");
	}

}

class ChildSuperKeyWordConcept extends SuperKeyWordConcept{
	public void t() {
		System.out.println(super.x);
		System.out.println(super.name);
		super.m();
		super.m1();
	}
	
	public static void main(String[] args) {
		ChildSuperKeyWordConcept x=new ChildSuperKeyWordConcept();
		x.t();
	}
	
}
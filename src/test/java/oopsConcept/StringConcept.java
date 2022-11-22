package oopsConcept;

public class StringConcept {
	public static void main(String[] args) {
		String str="Radhe";
		String s1=new String("Krishna");
		String s2=new String("Krishna");
		String s3="Radhe";
		String s4="Krishna";
		String s5=new String("Radhe");
		System.out.println(s1.equals(s4));//true
		System.out.println(s1==s4);//false
	}
}

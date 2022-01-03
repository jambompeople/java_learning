package Inheritance.Override;

public class Override{
	public static void main(String[] args){
		Person jd = new Person(14,"Jackson");
		Student jf = new Student(17, 11, 99.99, "Jefferson");

		System.out.println(jd);
		System.out.println(jf);
		System.out.println(jd.getName());
		System.out.println(jf.getName());
		System.out.println(jf.getMark());
		jf.setMark(50.00);
		System.out.println(jf.getMark());
	}
}
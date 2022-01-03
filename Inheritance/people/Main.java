package Inheritance.people;

public class Main{
	public static void main(String[] args){
		Person garry = new Person("Garry");
		Person jd = new Student("Jackson", 9, 99.9);
		Person jf = Student.newStudent("Jefferson", 11, 99.9);
		System.out.println(jd);
	}
}
package Inheritance.people;

public class Student extends Person{
	private int grade;
	private double score;


	public Student(String name, int grade, double score){
		super(name);
		this.grade = grade;
		this.score = score;
	}

	public static Student newStudent(String name, int grade, double score){
		Student temp = new Student(name, grade, score);
		return temp;
	}

	public String toString(){
		return super.getName() + " is in grade " + grade;
	}
}
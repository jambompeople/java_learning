package Inheritance.Override;



public class Student extends Person{
	private int grade;
	private double mark;

	public Student(int age, int grade, double mark, String name){
		super(age, name);
		this.grade = grade;
		this.mark = mark;
	}

	public int getGrade(){
		return grade;
	}

	public void setGrade(int grade){
		this.grade = grade;
	}

	public double getMark(){
		return mark;
	}

	public void setMark(double mark){
		this.mark = mark;// this is the representation of the current object 
	}

	@java.lang.Override
	public String toString(){
		return super.getName() + " is in grade " + grade; //super is the representation of the superclass object
	}
}
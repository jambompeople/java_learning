package OLD;

public class MyClass{
  public static void main(String[]args){
    student JacksonDing = new student();
    JacksonDing.FieldTrip(7,"JacksonDing");
  }
}
class student{
  int grade;
  int id;
  String name;
  public void FieldTrip(int grade, String name){
    this.grade = grade;
    this.name = name;
    if(grade==7){
      System.out.println(name+"\tcan go to the FieldTrip");
    }else{
      System.out.println(name+"can not go to the FieldTrip");
    }
  }
}

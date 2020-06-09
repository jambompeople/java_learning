import java.util.*;
public class classjacksonding{
  public static void main(String[]args){
    triangle jackson = new triangle(1,2,3);
    jackson.perimeter();
  }

}
class triangle{
  private int side1;
  private int side2;
  private int side3;
  private int base ;
  private int hight;
  public triangle(int side1,int side2,int side3){
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }
  public void perimeter(){
    int perimeter = side1+side2+side3;
    System.out.println("the perimeter is " + perimeter);
  }
}

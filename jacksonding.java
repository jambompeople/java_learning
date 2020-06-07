import java.util.*;
public class jacksonding{
  static void squares(){
    Scanner MyLength = new Scanner(System.in);
    System.out.println("please put the length of one of the rectangle you have");
    int length = MyLength.nextInt();
    Scanner MyWidth = new Scanner(System.in);
    System.out.println("please put the width of one of the rectangle you have");
    int width = MyWidth.nextInt();
    Scanner Mychoice = new Scanner(System.in);
    System.out.println("if you want to calculate area please type 1, if you want to calculate premeter please type 2 ");
    int choice = Mychoice.nextInt();
    if(choice == 1){
      int area = length*width;
      System.out.println("the area of one of the rectangle is "+area);
    }else if(choice == 2){
      int premeter = (length+width)*2;
      System.out.println("the premeter of one of the rectangle is "+premeter);
    }else{
      System.out.println("you can only choose 1 or 2");
  }
}
  static void triangles(){
    Scanner base = new Scanner(System.in);
    System.out.println("please put your base of the triangle here");
    int mybase = base.nextInt();
    Scanner hight = new Scanner(System.in);
    System.out.println("please put the hight here");
    int myhight = hight.nextInt();
    Scanner sides = new Scanner(System.in);
    System.out.println("please put the sides simultaneously");
    int side1 = sides.nextInt();
    int side2 = sides.nextInt();
    int side3 = sides.nextInt();
    int perimeter = side1+side2+side3;
    int area = mybase*myhight/2;
    Scanner Mychoice = new Scanner(System.in);
    System.out.println("if you want to calculate area please type 1, if you want to calculate premeter please type 2 ");
    int choice = Mychoice.nextInt();
    if(choice == 1){
      System.out.println("the area of the triangle is "+area);
    }else if(choice == 2){
      System.out.println("the perimeter of the triangle is "+perimeter);
    }
  }
  public static void main(String[]args){
    triangles();
   }
  }

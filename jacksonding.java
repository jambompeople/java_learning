import java.util.*;
public class jacksonding{
  public static void main(String[]args){
   Scanner MyAmount = new Scanner(System.in);
   System.out.println("please put how many rectangle you have");
   int amount = MyAmount.nextInt();
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
  /*static void area(){
    area = length*width;
    totalArea = area*amount;
    System.out.println("the area of one of your rectangle is"+area+"the area of your total rectangle is "+totalArea);
  }
  static void premeter(){
    premeter = (length+width)*2;
    System.out.println("the premeter of one of your rectangle is "+premeter);*/

}

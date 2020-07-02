import java.util.Scanner;

public class advancedcalculator{
  public static void main(String[]args){
    Scanner fir = new Scanner(System.in);
    System.our.println("please put first number");
    int firstnum = fir.nextInt();
    Scanner sec = new Scanner(System.in);
    System.our.println("please put second number");
    int secondnum = sec.nextInt();
    Scanner thi = new Scanner(System.in);
    System.our.println("please put third number");
    int thirdnum = thi.nextInt();
    Scanner ord = new Scanner(System.in);
    System.our.println("please put the first operation");
    String order = ord.nextInt();
    Scanner ord2 = new Scanner(System.in);
    System.our.println("please put the second operation");
    String order2 = ord2.nextInt();
    String firstnumber = Integer.toString(firstnum);
    String secondnumber = Integer.toString(secondnum);
    String[] list = {firstnum,order,secondnum,order2,thirdnum};
    int end = firstnum order secondnum order2 thirdnum;
    /*if(order.equals("+"|"-")){
      if(order2.equals("+"|"-")){
        System.our.println(firstnum);
      }else if(order2.equals("/"|"*")){
        System.our.println();
      }
    }else if(order.equals("/"|"*")){
      if(order2.equals("+"|"-")){
        System.our.println();
      }else if(order2.equals("/"|"*")){
        System.our.println();
      }
    }
  }
  static int add(int a, int b, int c){
    a = firstnum;
    b = secondnum;
    c = thirdnum;
    if(order.equals("+")&&order2.equals("+"))
  }*/
  }
}

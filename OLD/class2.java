package OLD;

import java.util.Scanner;

public class class2{
  public static void main(String[]args){
    Scanner fir = new Scanner(System.in);
    System.out.println("put first number");
    int first = fir.nextInt();
    Scanner sec = new Scanner(System.in);
    System.out.println("put first number");
    int second = sec.nextInt();
    Scanner thi = new Scanner(System.in);
    System.out.println("put first number");
    int third = thi.nextInt();
    if(first>second&&second>third){
      System.out.println(first);
    }else if(first>third&&third>second){
      System.out.println(second);
    }else if(second>first&&first>third){
      System.out.println(third);
    }else if(second>third&&third>first){
      System.out.println(third);
    }else if(third>first&&first>second){
      System.out.println(third);
    }else if(third>second&&second>first){
      System.out.println(third);
    }else{
      System.out.println("error");
    }
  }
}

import java.util.Scanner;

public class calculator{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    System.out.println("put the operation in + or - or * or /");
    String operator = sc.nextLine();
    Scanner fir = new Scanner(System.in);
    System.out.println("please put first number");
    int first = fir.nextInt();
    Scanner sec = new Scanner(System.in);
    System.out.println("please put first number");
    int second = sec.nextInt();
    if(operator.equals("+")){
      System.out.println(first+second);
    }else if(operator.equals("-")){
      System.out.println(first-second);
    }else if(operator.equals("*")){
      System.out.println(first*second);
    }else if(operator.equals("/")){
      System.out.println(first/second);
    }
  }
}

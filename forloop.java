import java.util.Scanner;

public class forloop{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("please put a number here");
    int num = sc.nextInt();
    int[] what = new int[num];
    for(int i = 0;i<num;i++){
      Scanner scan = new Scanner(System.in);
      System.out.println("please put a number here");
      int number = scan.nextInt();
      what[i] = number;
    }
    for(int x = 0;x<what.length;x++){
      
    }
  }
}

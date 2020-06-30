import java.util.*;

public class task{
  public static void main(String[]args){
      Scanner arrNum = new Scanner(System.in);
      System.out.println("put the length of the array");
      int arrnum = arrNum.nextInt();
      int[] arr = new int[arrnum];

      Scanner inNum1 = new Scanner(System.in);
      for(int a = 0; a<arrnum; a++){
        Scanner inNum = new Scanner(System.in);
        System.out.println("please put a integer");
        int myNum = inNum.nextInt();
        arr[a]=myNum;
      }
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
      }
  }
}

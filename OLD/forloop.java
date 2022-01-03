package OLD;

import java.util.Scanner;

public class forloop{
  public static void main(String[]args){
    int[] arr = new int[4];
    arr[0] = 1;
    arr[1] = 4;
    arr[2] = 2;
    arr[3] = 10;
    for(int a = 2;a<arr.length;a++){
      int current = arr[a];
      int formerindex = a-1;
      while(formerindex>0&&arr[formerindex]>current){
        arr[formerindex] = arr[formerindex+1];
        formerindex = formerindex-1;
        arr[formerindex+1] = current;
      }
    }
    for(int i = 0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}

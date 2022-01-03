package OLD;

import java.util.*;
public class unitdigit {
    public static void main(String[]args){
        System.out.println("put your first number");
        Scanner firstnum = new Scanner(System.in);
        int firstnumber = firstnum.nextInt();
        System.out.println("put your second number");
        Scanner secondnum = new Scanner(System.in);
        int secondnumber = firstnum.nextInt();
        int sum = firstnumber+secondnumber;
        int what = sum%10;
        System.out.println(what);
/*        while(true){
          int food = sum-100;
          if(food<0){
            continue;
          }else if(food>0&&food<10){
            System.out.println(food);
            break;
          }else if(food>10&&food<100){
            while(true){
              if(work<10&&work>0){
                System.out.println(work);
                break;
              }else if(work>10){
                continue;
              }
              int work = food-10;
            }
            break;
          }
        }
        */
    }
}

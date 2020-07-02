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
        while(true){
          int food = sum-100;
          if(food<0){
            break;
          }else if(food>0&&food<10){
            System.out.println(food);
            break;
          }else if(food>10){
            int work = 
            System.out.println(food-10);
            break;
          }
        }
    }
}

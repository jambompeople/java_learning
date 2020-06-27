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
        String strsum = Integer.toString(sum);
        char[] strsumls = strsum.toCharArray();
        System.out.println("your unitdigit is "+strsumls[-1]);
    }
}
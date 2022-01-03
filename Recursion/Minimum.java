package Recursion;

/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/
import java.util.ArrayList;

public class Minimum
{
    public static int findMinimum(ArrayList<Integer> numbers)
    {
        
        // Base Case: What is the smallest ArrayList you can have? 
        // What is the minimum value of that array?
    
        // Recursive call: How do you find the minimum of the rest of the ArrayList?
        //                 (Not including the last element)
    
        // Return: The minimum of (the last element, minimum of the rest of the ArrayList)
        if(numbers.size()==1){
            return numbers.get(0);
        }
        
        Integer x = numbers.get(numbers.size()-1);
        
        numbers.remove(numbers.size()-1);
        
        if(x<findMinimum(numbers)){
            return x;
        }else{
            return findMinimum(numbers);
        }
        
    }
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(){{add(2);add(5);add(40);add(1);add(7);}};
		System.out.println(findMinimum(a));
	}
}

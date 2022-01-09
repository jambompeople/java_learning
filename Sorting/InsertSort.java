package Sorting;
import java.util.*;

public class InsertSort{
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>(){{add(1); add(3); add(2); add(10); add(7);}};
		int[] jd = new int[]{1,2,1,3,6,4};
		System.out.println(InsertSort.insertSort(arr));
		System.out.println(InsertSort.insertSort(jd));
	}

	public static ArrayList<Integer> insertSort(ArrayList<Integer> arr){
		for(int i = 1; i<arr.size(); i++){
			for(int j = i; j>0; j--){
				if(arr.get(i)<arr.get(j)){
					int temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
		return arr;
	}

	public static String insertSort(int[] jd){
		for(int i = 1; i<jd.length; i++){
			int currentNum = jd[i];
			int currentIndex = i-1;
			while(currentIndex>=0 && jd[currentIndex]>currentNum){
				jd[currentIndex+1] = jd[currentIndex];
				currentIndex--;
			}
			jd[currentIndex+1] = currentNum;
		}
		return Arrays.toString(jd);
	}
}
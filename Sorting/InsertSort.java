package Sorting;
import java.util.*;

public class InsertSort{
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>(){{add(1); add(3); add(2); add(10); add(7);}};
		int[] jd = new int[]{1,2,5,3,6,4};
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
			for(int j = i; j>0; j--){
				if(jd[j]>jd[i]){
					int temp = jd[i];
					jd[i] = jd[j];
					jd[j] = temp;
				}
			}
		}
		return Arrays.toString(jd);
	}
}
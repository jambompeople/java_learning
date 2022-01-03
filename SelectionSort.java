import java.util.*;

public class SelectionSort{
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>(){{add(1); add(3); add(2); add(10); add(7);}};
		int[] jd = new int[]{1,2,5,3,6,4};

		System.out.println(SelectionSort.selectionSort(arr));
		System.out.println(SelectionSort.selectionSort(jd));

	}

	//O(N!)

	public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr){
		for(int i = 0; i<arr.size()-1; i++){
			for(int j = i+1; j<arr.size(); j++){
				int min = i;
				if(arr.get(i)>arr.get(j)){
					min = j;
					int temp = arr.get(i);
					arr.set(i, arr.get(min));
					arr.set(j, temp);
				}
			}
		}
		return arr;
	}

	public static String selectionSort(int[] jd){
		for(int i = 0; i<jd.length; i++){
			for(int j = i+1; j<jd.length; j++){
				int min = i;
				if(jd[i]>jd[j]){
					min = j;
					int temp = jd[i];
					jd[i] = jd[min];
					jd[j] = temp;
				}
			}
		}
		return Arrays.toString(jd);
	}
}
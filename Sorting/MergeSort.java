package Sorting;

public class MergeSort {
    public static void mgSort(int[] current, int length){
        if(length<2){
            return;
        }

        int mid = length/2;
        int[] start = new int[mid];
        int[] end = new int[length-mid];

        for(int i = 0; i<mid; i++){
            start[i] = current[i];
        }

        for(int j = mid; j<length; j++){
            end[j-mid] = current[j];
        }

        mgSort(start, mid);
        mgSort(end, length-mid);
        merge(current, start, end);
    }

    public static void merge(int[] current, int[] start, int[] end){
        int startSize = start.length;
        int endSize = end.length;

        int i = 0;
        int j = 0;
        int k = 0;
        while(i<startSize&&j<endSize){
            if(start[i]<=end[j]){
                current[k++] = start[i++];
            }else{
                current[k++] = end[j++];
            }
        }
        while(i<startSize){
            current[k++] = start[i++];
        }
        while(j<endSize){
            current[k++] = end[j++];
        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,4,2,6,3,8,10};
        mgSort(arr, arr.length);
        for (int element : arr) {
            System.out.println(element);
        }
    }
}

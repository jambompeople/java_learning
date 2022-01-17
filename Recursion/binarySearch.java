package Recursion;

public class binarySearch{
    public static int binaryLoop(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = (start+end)/2;
            if(target>arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else if(target==arr[mid]){
                return mid;
            }
        }
        return -1;
    }
    public static int binaryLoop(int[] arr, int start, int end, int target){
        int mid = (start+end)/2;
        if(target==arr[mid]){
            return mid;
        }else if(target<arr[mid]){
            return binaryLoop(arr, start, mid-1,target);
        }else if(target>arr[mid]){
            return binaryLoop(arr, mid+1, end, target);
        }else{
            return -1;
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,5,6,8,9,30};
        System.out.println(binaryLoop(arr,8));

        System.out.println(binaryLoop(arr, 0, arr.length-1, 9));
    }
}
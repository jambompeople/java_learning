
public class ProperSelectionSort{

    public static void selectionSort(int[] elements){
        for(int i = 0; i<elements.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j<elements.length; j++){
                if(elements[minIndex]>=elements[j]){
                    minIndex = j;
                }
            }
            if(i!=minIndex){
                int temp = elements[i];
                elements[i] = elements[minIndex];
                elements[minIndex] = temp;
            }
            
        }
    }

    public static void main(String args[]){
        int[] arr = new int[]{6,3,4,2,2,1,9};

        selectionSort(arr);
        
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
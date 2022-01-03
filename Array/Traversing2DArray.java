package Array;
public class Traversing2DArray{
	public static void main(String[] args){
		//int[][] hello = new int[2][5];
		//hello = {{2,4,5,3,1,5},{1,2,3,4,5,4},{1,2,3,4,5,6}};
		int[][] arr = new int[][]{{1,2,5},{6,3,8}};

		Traversing2DArray.columbMajor(arr);
		System.out.println(" ");
		Traversing2DArray.rowMajor(arr);
	}

	public static void rowMajor(int[][] arr){
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
		}
	}

	public static void columbMajor(int[][] arr){
		for(int i = 0; i<arr[0].length; i++){
			for(int j = 0; j<arr.length; j++){
				System.out.println(arr[j][i]);
			}
		}
	}
}
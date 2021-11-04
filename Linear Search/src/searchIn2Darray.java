
public class searchIn2Darray {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				
		};
		int traget=4;
		System.out.print(search(arr,traget));
		
		

	}
	
	static int search(int [][] arr, int traget) {
			 for(int row = 0; row<arr.length;row++) {
				 
				 for(int col = 0; col<arr[row].length;col++) {
					 
					if(arr[row][col] == traget ) {
						return arr [row][col] ;
					}
				 }
			 }
			 return -1;
	}

}

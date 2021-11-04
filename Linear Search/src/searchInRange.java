
public class searchInRange {

	public static void main(String[] args) {
		
		int [] array= {1,2,3,4,5,6};
		search(array,6);

	}
	
	static int search(int[] arr, int traget) {
		if (arr.length == 0) {
			
			return -1;
			
		}else {
			for (int index=arr[1]; index<arr[4];index++) {
				
				if (arr[index] == traget) {
					System.out.println(index);
					return index;
				}
				
				
			}
		}
		System.out.println("not in array");
		return traget ;
		
	}

}

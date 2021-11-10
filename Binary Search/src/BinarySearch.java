
public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr= {2,4,6,9,11,12,14,20,36,48};
		int traget=9;
		int ans = binary(arr,traget);
		System.out.println(ans);
	}
	
	static int binary(int[] arr, int traget) {
		 int start = 0;
		 int end = arr.length-1;
		 
		while(start<=end) {
			
//			int mid=(start+end)/2; //not use this bcz it might exceeds the limit for integer in java//
			
//		better way to get mid 
			int mid = start + (end - start) / 2;// very important
			
			if(traget < arr[mid]) {
				end = mid - 1;
				
			}else if(traget > arr[mid]) {
				
				start = mid+1;
			}else {
				return mid;
			}
		}
		
		return -1;
	}

}

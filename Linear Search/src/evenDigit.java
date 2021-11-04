

public class evenDigit {

	public static void main(String[] args) {
	
		int[] array= {12,345,2,61,7896};
		
		
		serach(array);
		
		
	}
	

	static int serach(int[] arr) {
		
		int ans=0;
		
		for(int index=0;index<arr.length ;index++) {
			
			int len = Integer.toString(arr[index]).length();
			
			if (len/2!=0) {
				
			
			}else {
				
				
				ans++;
				System.out.println(ans);
			}
				
		}
		return -1;
	}
	
	

}
 
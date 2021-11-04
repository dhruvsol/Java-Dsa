
public class searchInString {

	public static void main(String[] args) {
		
		String str="dhruvraj is a pro coder";
		char  traget = 'z';
		
		System.out.println(search(str,traget));

	}
	static boolean search(String str,char traget) {
		if (str.length() == 0) {
			return false;
		}else {
			
			for(int i = 0 ; i < str.length();i++) {
				if (traget == str.charAt(i)) {
					
					return true ;
				}
				
				
			}
		}
		
		return false;
	}

}

package week1.day2;

public class PalindromeJava {

	public static void main(String[] args) {
		String str = "152";
		String rev="";
		for (int i = str.length()-1;i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		if (str.contentEquals(rev)) {
			System.out.println("Given String is palindrome");
		}
		else {
			System.out.println("Given String is not palindrome");
			
		}	
		}
			
			
		
				
	}



package String;

public class NonRepeatingCharacter {

	private static final int MAX_CHAR = 26;

	public static char nonRepeatingChar(String s) {
		
//		int[] freq = new int[MAX_CHAR];
//		
//		for(char c : s.toCharArray()) {
//			freq[c - 'a']++;
//		}
//		
//		for(int i = 0; i < s.length(); i++) {
//			if(freq[s.charAt(i) - 'a'] == 1) {
//				return s.charAt(i);
//			}
//		}
		
		for(int i = 0; i < s.length(); i++) {
			 boolean found = false;
			 
			 for(int j = 0; j < s.length(); j++) {
				 if(i != j && s.charAt(i) == s.charAt(j)) {
					 found = true;
					 break;
				 }
			 }
			 
			 if(found == false) {
				 return s.charAt(i);
			 }
		}
		
		return '$';
	}
	
	public static void main(String[] args) {
		
		String s = "racecar";
		System.out.println(nonRepeatingChar(s));
	}
}

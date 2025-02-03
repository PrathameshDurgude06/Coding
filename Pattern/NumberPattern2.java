package Pattern;

//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 
//6 6 6 6 6 6 

public class NumberPattern2 {
	
	public static void pattern(int n) {
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		int n = 6;
		pattern(n);
	}
}

package Pattern;

//1 2 3 4 5 6 
// 2 3 4 5 6 
//  3 4 5 6 
//   4 5 6 
//    5 6 
//     6 
//    5 6 
//   4 5 6 
//  3 4 5 6 
// 2 3 4 5 6 
//1 2 3 4 5 6 

public class MirrorImageTrianglePattern {
	
	public static void main(String[] args) {
		int n = 6;
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int j = i; j <=n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		for(int i = n - 1; i >= 1; i--) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

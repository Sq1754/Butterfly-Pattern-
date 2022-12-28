import java.util.Scanner;

public class Q7_advance_pattern {
	public static void main(String[]args) {
		
		// Q7 print butterfly pattern
		/*    
		 *    *        *
		 *    **      **
		 *    ***    ***
		 *    ****  ****
		 *    **********
		 *    **********
		 *    ****  ****
		 *    ***    ***
		 *    **      **
		 *    *        *
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows");
		int rows = sc.nextInt();
		
		// upper half
		for(int i=1;i<=rows;i++) {
			// 1st part  for stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			//for spaces 
			int spaces = 2*(rows-i);
			for(int j= 1;j<=spaces;j++) {
				System.out.print(" ");
			}
			
			//2nd part 
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Lower half
		for(int i=rows;i>=1;i--) {
			// 1st part  for stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			//for spaces 
			int spaces = 2*(rows-i);
			for(int j= 1;j<=spaces;j++) {
				System.out.print(" ");
			}
			
			//2nd part 
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}		
			

	   }
}

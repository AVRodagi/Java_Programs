import java.util.Scanner;

/**
 * 
 */

/**
 * @author HP
 *
 */
public class BTS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the odd value of n: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)/* prints the alphabet B and T */ {
				if(j==0||
						(i==0&&j<n/2)||
						(j==n/2&& i!=0 && i!=(n-1))||
						(i==(n-1)&&j<n/2)||(i==5&&j<n/2)||
						(j>n/2&&i==0)||(j==((3*n)/4)&&i>=0)
						)
						/* prints the alphabet B and T */
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			
			for(int j=0;j<n;j++) {
				if( (i==0&&j<=n/2&&j!=0)||
						(i==(n/2)&& j<n/2&&j!=0)||
							(i==(n-1)&& j<n/2)||
							 (j==0&&i<n/2&&i!=0)||
							 (j==(n/2)&&i>n/2&& i!=(n-1))
						)/* prints the alphabet S */
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}

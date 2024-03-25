import java.util.Scanner ;
public class SerieDiFibonacciIterativa {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("inserire un numero");
		int n = input.nextInt();
		int[] num = new int[n];
		num[0]=1;
		if (n==1)
			System.out.println(num[0]);
		else {
			num[1]=2;
			if (n==2)
				System.out.println(num[1]);
			else {
				for ( int i=2 ; i<n ; i++ ){
					num[i]=num[i-1]+num[i-2];
				}
				System.out.println(num[n-1]);
			}
		}	
	}}
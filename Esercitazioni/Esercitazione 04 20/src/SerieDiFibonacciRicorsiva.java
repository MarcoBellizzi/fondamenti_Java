import java.util.Scanner ;
public class SerieDiFibonacciRicorsiva {
	static Scanner input = new Scanner(System.in);
	
	public static int numerodellaserie (int n ) {
		if (n==1)
			return 1 ;
		if (n==2)
			return 2 ;
		
			int numserie ;
			int n2 = numerodellaserie(n-1);
			int n3 = numerodellaserie(n-2);
			numserie = n2+n3;	
			return numserie ;
	}
	public static void main(String[] args) {
		int n = input.nextInt();
		int num = numerodellaserie(n);
		System.out.println(num);
	}}
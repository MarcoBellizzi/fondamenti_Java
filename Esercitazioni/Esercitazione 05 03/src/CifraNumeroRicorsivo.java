import java.util.Scanner ;
public class CifraNumeroRicorsivo {
	static Scanner input = new Scanner(System.in) ;
	
	public static int cifrapiualta(int n, int max){
		n=n/10;	
		if (n%10>max)
			max = n%10;
		if (n!=0)
			max = cifrapiualta(n,max);
	
		return max ;
	}
	
	public static void main(String[] args) {
		
		int n = input.nextInt();
		int max = n%10;
		int cifra = cifrapiualta(n,max);
		System.out.println(cifra);
	}
}
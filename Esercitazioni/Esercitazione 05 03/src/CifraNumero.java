import java.util.Scanner ;
public class CifraNumero {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int n = input.nextInt();
		int max = n%10;
		int corr = max;
		n = n/10;
		while (n>0){
			corr = n%10;
			if (corr>max)
				max = corr ;
			n = n/10;
		}
		System.out.println(max);
	}
}
import java.util.Scanner ;
public class FattorialeConRicorsione {
	static Scanner input = new Scanner(System.in);
	
	public static int fatt (int n){
		if (n==0 || n==1)
			return 1;
		return (n * fatt(n-1));
	}
	
	public static void main(String[] args) {
		System.out.println("inserire un numero positivo");
		int num = input.nextInt();
		int risultato = fatt(num);
		System.out.println(risultato);
		
	}}
import java.util.Scanner ;

public class ConfrontoNumeri {

	static Scanner input = new Scanner (System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Scrivi tre numeri, digita ogni numero e poi premi 'enter'");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if (a>b){
			if (a>c)  System.out.println(" il primo numero è il più grande");
			else System.out.println("il terzo numero è il più grande"); }
		
		if (a<b) {
			if (c>b)   System.out.println("il terzo numero è il più grande");
			else System.out.println("il secondo numero è il più grande"); }
		}

	}


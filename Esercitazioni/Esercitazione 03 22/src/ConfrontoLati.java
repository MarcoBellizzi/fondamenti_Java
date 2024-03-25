import java.util.Scanner ;

public class ConfrontoLati {

	static Scanner input = new Scanner (System.in) ;
	
	public static void main(String[] args) {
	
		System.out.println("dammi tre numeri");
		System.out.println("Essi corrispondono alla lunghezza dei tre lati di un triangolo");
		System.out.println("inserire un numero seguito dal tasto 'enter'");
		System.out.println("ripere l operazione tre volte");
	
		int a = input.nextInt() ;
		int b = input.nextInt();
		int c = input.nextInt();
    
		if (a==b && b==c)
			System.out.println("il triangolo è equilatero");
		else
			if (a==b || b==c || a==c)
				System.out.println("il triangolo è isoscele");
			else 
				System.out.println("il triangolo è scaleno");

	}
}
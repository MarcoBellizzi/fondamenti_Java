import java.util.Scanner;

public class Test {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Clinica c = new Clinica();

c.leggiDottori(input);
c.leggiPazienti(input);

c.stampaDottori();
c.stampaPazienti();
		

	}

}

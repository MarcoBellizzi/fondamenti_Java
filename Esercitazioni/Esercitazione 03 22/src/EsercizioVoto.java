import java.util.Scanner ;
public class EsercizioVoto {
static Scanner input = new Scanner (System.in) ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("inserisci il tuo voto d'esame");

int a =input.nextInt() ;

if (a>=0 && a<18)
	System.out.println("sei bocciato");
if (a>=18 && a<=30)
	System.out.println("sei promosso");
if (a<0 || a>30)
	System.out.println("voto non corretto");



		
		
	}

}

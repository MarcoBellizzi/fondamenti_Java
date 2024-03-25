import java.util.Scanner ;
import java.util.Random ;
public class GiocoDelleTrePorte {
	static Random a = new Random() ;
	static Scanner input = new Scanner(System.in);
	
	
	public static void noncambio(int volte) {
		int vittorie = 0 ;
		
		for ( int num=0 ; num<volte ; num++) {
			
			// crea porta0 porta1 porta2 
			int[] porta = new int[3]; 
			
			//per decidere la porta con la macchina assegno 1 alla macchina e 0 alle pecore
			int sceltaportaconmacchina = a.nextInt(3);
			porta[sceltaportaconmacchina] = 1 ;
			for ( int i=0 ; i<3 ; i++){
				if (porta[i]!=1)
					porta[i]=0;
			}
			
			//il giocatore fa la scelta
			int portascelta = porta[a.nextInt(3)];
			
			
			if (portascelta==1)
				vittorie++;
		}
		System.out.println("su "+volte+" prove il giocatore ha vinto "+vittorie+" volte non cambiando il pacco");
	}
	
	public static void cambio(int volte){
		int vittorie = 0 ;
		
		for ( int num=0 ; num<volte ; num++){
			
			// crea porta0 porta1 porta2 
			int[] porta = new int[3]; 
			
			//per decidere la porta con la macchina assegno 1 alla macchina e 0 alle pecore
			int sceltaportaconmacchina = a.nextInt(3);
			porta[sceltaportaconmacchina] = 1 ;
			for ( int i=0 ; i<3 ; i++){
				if (porta[i]!=1)
					porta[i]=0;
			}
			
			//il giocatore fa la scelta
			int portascelta = a.nextInt(3);
			
			
			porta[portascelta]= porta[portascelta] + 10 ;
			
			/* a questo punto sia hanno due possibili situazioni:
			 * o la porta scelta è giusta o è sbagliata quindi 
			 * 1) 11 0 0
			 * 2) 10 1 0
			 */
			
			//si apre una porta pecora
			boolean pescareunpaccovuoto = false ;
			while (pescareunpaccovuoto == false){
				int b = a.nextInt(3);
				if (porta[b]==0){
					porta[b]=2;
					pescareunpaccovuoto=true ;
				}
				
			}
			
			/* adesso si presentauna situazione di questo tipo: 2 possibili situazioni
			 * 1) 11 0 2
			 * 2) 10 1 2
			 */
			
			//il giocatore cambia il pacco
			boolean cambiapacco = false ;
			int paccofinale = 0;
			while (cambiapacco==false){
				int c = a.nextInt(3);
				if (porta[c]!=2 && porta[c]<5){
					paccofinale = porta[c];
					cambiapacco = true ;
				}
			}
			
			if (paccofinale==1)
				vittorie++;
		}
		
		System.out.println("su "+volte+" prove il giocatore ha vinto "+vittorie+" volte cambiando il pacco");
		
	}

	public static void main(String[] args) {
		
		int num = input.nextInt();
		
		noncambio(num);
		cambio(num);
		
	}
}

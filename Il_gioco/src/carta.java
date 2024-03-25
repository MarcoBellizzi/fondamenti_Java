import java.util.Scanner ;
import java.util.Random ;

public class carta {
	static Scanner input = new Scanner(System.in);
	static Random casuale = new Random();
	
	private int numero ;
	private String palo ;
	
	//COSTRUTTORI
	
	public carta(){
		numero = 0 ;
		palo = "vuoto" ;
	}
	
	//METODI
	
	public int getnumero(){
		return this.numero;
	}
	
	public String getpalo(){
		return this.palo;
	}
	
	public static void creamazzo (carta[] mazzo){
		for (int i=0 ; i<10 ; i++){
			mazzo[i].numero = i+1 ;
			mazzo[i].palo = "denara" ;
		}
		for (int i=10 ; i<20 ; i++){
			mazzo[i].numero = i-9 ;
			mazzo[i].palo = "spade" ;
		}
		for (int i=20 ; i<30 ; i++){
			mazzo[i].numero = i-19 ;
			mazzo[i].palo = "coppe" ;
		}
		for (int i=30 ; i<40 ; i++){
			mazzo[i].numero = i-29 ;
			mazzo[i].palo = "bastoni" ;
		}
	}
	
	public void eliminacarta(){
		this.numero = 0 ;
		this.palo = "vuoto" ;
	}
	
	public static void mischiacarte(carta[] mazzo , carta[]mazzomischiato){
		for (int i=0 ; i<40 ; i++){
			int cas = casuale.nextInt(40);
			if (mazzo[cas].getnumero()==0){
				while (mazzo[cas].getnumero()==0){
					cas = casuale.nextInt(40);
				}
			}
			mazzomischiato[i].numero = mazzo[cas].getnumero();
			mazzomischiato[i].palo = mazzo[cas].getpalo();
			mazzo[cas].eliminacarta();
		}
	}
	
	public static void azione(carta[] mazzomischiato,carta[] tuecarte,carta[] suecarte,int tuoipunti,int suoipunti,boolean presa,int cont){
		while (cont<45){
			String tuasceltap = " " ;
			int suascelta=0 ;
			int tuascelta=0 ;
			
			boolean vincita ;
			if (presa){
				System.out.println("-------------------------------------------");
				System.out.println("butta una carta :");
				for (int i=0 ; i<5 ; i++){
					System.out.println(i+") " + tuecarte[i].getnumero() + " di " + tuecarte[i].getpalo());
				}
				tuasceltap = input.nextLine();
				if (tuasceltap.charAt(0)=='0'){
					tuascelta=0;
				}
				else {
					if (tuasceltap.charAt(0)=='1'){
						tuascelta=1;
					}
					else {
						if (tuasceltap.charAt(0)=='2'){
							tuascelta=2;
						}
						else {
							if (tuasceltap.charAt(0)=='3'){
								tuascelta=3;
							}
							else {
								if (tuasceltap.charAt(0)=='4'){
									tuascelta=4;
								}
								else {
									
									while ((tuasceltap.charAt(0)!='0') && (tuasceltap.charAt(0)!='1') && (tuasceltap.charAt(0)!='2') && (tuasceltap.charAt(0)!='3') && (tuasceltap.charAt(0)!='4') ){
										System.out.println("NON HO CAPITO CHE CARTA VUOI BUTTARE... SCEGLI UNA CARTA");
										tuasceltap=input.nextLine();
									}
									if (tuasceltap.charAt(0)=='0'){
										tuascelta=0;
									}
									else {
										if (tuasceltap.charAt(0)=='1'){
											tuascelta=1;
										}
										else {
											if (tuasceltap.charAt(0)=='2'){
												tuascelta=2;
											}
											else {
												if (tuasceltap.charAt(0)=='3'){
													tuascelta=3;
												}
												else {
													if (tuasceltap.charAt(0)=='4'){
														tuascelta=4;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
							
				
				
				boolean puorisponderepalo = false ;
				boolean puorisponderenumero = false ;
				for (int i=0 ; i<5 ; i++){
					if (tuecarte[tuascelta].getpalo()==suecarte[i].getpalo()){
						puorisponderepalo=true ; 
					}
					if ( tuecarte[tuascelta].getnumero()==suecarte[i].getnumero()){
						puorisponderenumero=true ;
					}
				}
				if (puorisponderepalo==true){
					int cartaminima = 11 ;
					for (int i=0 ; i<5 ; i++){
						if (suecarte[i].getpalo()==tuecarte[tuascelta].getpalo() && suecarte[i].getnumero()<cartaminima){
							suascelta=i;
							cartaminima=suecarte[suascelta].getnumero();
						}
					}
					if (puorisponderenumero==true && tuecarte[tuascelta].getnumero()<suecarte[suascelta].getnumero()){
						for (int i=0 ; i<5 ; i++){
							if (tuecarte[tuascelta].getnumero()==suecarte[i].getnumero()){
								suascelta=i;
							}
						}
					}
				}
				else {
					if (puorisponderenumero==true){
						for (int i=0 ; i<5 ; i++){
							if (tuecarte[tuascelta].getnumero()==suecarte[i].getnumero()){
								suascelta=i;
							}
						}
					}
					else {
						suascelta=casuale.nextInt(5);
						if (suecarte[suascelta].getnumero()==0){
							while (suecarte[suascelta].getnumero()==0){
								suascelta = casuale.nextInt(5);
							}
						}
					}
				}
			}
			else {
				suascelta = casuale.nextInt(5);
				if (suecarte[suascelta].getnumero()==0){
					while (suecarte[suascelta].getnumero()==0){
						suascelta = casuale.nextInt(5);
					}
				}
				System.out.println("----------------------------------------------");
				System.out.println("io butto : " + suecarte[suascelta].getnumero() + " di " + suecarte[suascelta].getpalo());
				System.out.println();
				System.out.println("butta una carta");
				for (int i=0 ; i<5 ; i++){
					System.out.println(i+") " + tuecarte[i].getnumero() + " di " + tuecarte[i].getpalo());
				}
				tuasceltap = input.nextLine();
				if (tuasceltap.charAt(0)=='0'){
					tuascelta=0;
				}
				else {
					if (tuasceltap.charAt(0)=='1'){
						tuascelta=1;
					}
					else {
						if (tuasceltap.charAt(0)=='2'){
							tuascelta=2;
						}
						else {
							if (tuasceltap.charAt(0)=='3'){
								tuascelta=3;
							}
							else {
								if (tuasceltap.charAt(0)=='4'){
									tuascelta=4;
								}
								else {
									while (tuasceltap.charAt(0)!='0' && tuasceltap.charAt(0)!='1' && tuasceltap.charAt(0)!='2' && tuasceltap.charAt(0)!='3' && tuasceltap.charAt(0)!='4' ){
										System.out.println("NON HO CAPITO CHE CARTA VUOI BUTTARE... SCEGLI UNA CARTA");
										tuasceltap=input.nextLine();
									}
									if (tuasceltap.charAt(0)=='0'){
										tuascelta=0;
									}
									else {
										if (tuasceltap.charAt(0)=='1'){
											tuascelta=1;
										}
										else {
											if (tuasceltap.charAt(0)=='2'){
												tuascelta=2;
											}
											else {
												if (tuasceltap.charAt(0)=='3'){
													tuascelta=3;
												}
												else {
													if (tuasceltap.charAt(0)=='4'){
														tuascelta=4;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if (suecarte[suascelta].getpalo()!=tuecarte[tuascelta].getpalo() && suecarte[suascelta].getnumero()!=tuecarte[tuascelta].getnumero()){
					boolean costretto = true ;
					for (int i=0 ; i<5 ; i++){
						if (tuecarte[i].getpalo()==suecarte[suascelta].getpalo()){
							costretto = false ;
						}
					}
					if (costretto==false){
						while (costretto==false){
							System.out.println("NON PUOI BUTTARE QUELLA CARTA COGLIONA!! CONTROLLA BENE LE TUE CARTE");
							tuasceltap = input.nextLine();
							if (tuasceltap.charAt(0)=='0'){
								tuascelta=0;
							}
							else {
								if (tuasceltap.charAt(0)=='1'){
									tuascelta=1;
								}
								else {
									if (tuasceltap.charAt(0)=='2'){
										tuascelta=2;
									}
									else {
										if (tuasceltap.charAt(0)=='3'){
											tuascelta=3;
										}
										else {
											if (tuasceltap.charAt(0)=='4'){
												tuascelta=4;
											}
											else {
												while (tuasceltap.charAt(0)!='0' && tuasceltap.charAt(0)!='1' && tuasceltap.charAt(0)!='2' && tuasceltap.charAt(0)!='3' && tuasceltap.charAt(0)!='4' ){
													System.out.println("NON HO CAPITO CHE CARTA VUOI BUTTARE... SCEGLI UNA CARTA");
													tuasceltap=input.nextLine();
												}
												if (tuasceltap.charAt(0)=='0'){
													tuascelta=0;
												}
												else {
													if (tuasceltap.charAt(0)=='1'){
														tuascelta=1;
													}
													else {
														if (tuasceltap.charAt(0)=='2'){
															tuascelta=2;
														}
														else {
															if (tuasceltap.charAt(0)=='3'){
																tuascelta=3;
															}
															else {
																if (tuasceltap.charAt(0)=='4'){
																	tuascelta=4;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
							if (tuecarte[tuascelta].getpalo()==suecarte[suascelta].getpalo()){
								costretto=true ;
							}
						}
					}
				}
			}
			
			System.out.println("tu hai buttato : " + tuecarte[tuascelta].getnumero() + " di " + tuecarte[tuascelta].getpalo());
			System.out.println("io ho buttato : " + suecarte[suascelta].getnumero() + " di " + suecarte[suascelta].getpalo());
			
			if (presa){
				vincita = true ;
				if (tuecarte[tuascelta].getpalo()==suecarte[suascelta].getpalo() && tuecarte[tuascelta].getnumero()>suecarte[suascelta].getnumero()){
					vincita = false ;
				}
				if (tuecarte[tuascelta].getnumero()==suecarte[suascelta].getnumero()){
					vincita = false ;
				}
			}
			else {
				vincita = false ;
				if(tuecarte[tuascelta].getpalo()==suecarte[suascelta].getpalo() && tuecarte[tuascelta].getnumero()<suecarte[suascelta].getnumero()){
					vincita = true ;
				}
				if (tuecarte[tuascelta].getnumero()==suecarte[suascelta].getnumero()){
					vincita = true ;
				}
			}
			
			if (vincita){
				System.out.println("vinci tu!");
				tuoipunti = tuoipunti + tuecarte[tuascelta].getnumero() + suecarte[suascelta].getnumero() ;
				
			}
			else {
				System.out.println("vinco io!");
				suoipunti = suoipunti + tuecarte[tuascelta].getnumero() + suecarte[suascelta].getnumero() ;
			}
			
			String vuoto = input.nextLine();
			
			if (cont < 39){
				tuecarte[tuascelta].numero = mazzomischiato[cont].getnumero();
				tuecarte[tuascelta].palo = mazzomischiato[cont].getpalo();
				cont++;
				suecarte[suascelta].numero = mazzomischiato[cont].getnumero();
				suecarte[suascelta].palo = mazzomischiato[cont].getpalo();
				cont++;
			}
			else {
				tuecarte[tuascelta].numero = 0 ;
				tuecarte[tuascelta].palo = "vuoto" ;
				suecarte[suascelta].numero = 0 ;
				suecarte[suascelta].palo = "vuoto" ;
				cont++;
			}
			
			if (vincita){
				presa = true ;
			}
			else {
				presa = false ;
			}
		}
		
		System.out.println("i tuoi punti sono : " + tuoipunti );
		System.out.println("i miei punti sono : " + suoipunti );
		
		if (tuoipunti>suoipunti){
			System.out.println("HAI VINTO");
		}
		else {
			System.out.println("HAI PERSO");
		}
	}

	public static void main(String[] args) {
		
		String avvio = input.nextLine();
		System.out.println("CIAO!! SEI PRONTO A GIOCARE CON ME?");
		String risposta = input.nextLine();
		System.out.println("BENISSIMO!! TANTO TI SPACCO IL CULO :) DO' IO CARTE. CHE IL GIOCO ABBIA INIZIO!");
		String inizio = input.nextLine();
		
		carta [] mazzo = new carta[40];
		for (int i=0 ; i<40 ; i++){
			mazzo[i] = new carta();
		}
		
		creamazzo(mazzo);
		
		carta[] mazzomischiato = new carta[40];
		for (int i=0 ; i<40 ; i++){
			mazzomischiato[i] = new carta();
		}
		
		mischiacarte(mazzo,mazzomischiato);
		
		carta[] tuecarte = new carta[5];
		carta[] suecarte = new carta[5];
		
		for (int i=0 ; i<5 ; i++){
			tuecarte[i] = new carta();
			suecarte[i] = new carta();
			tuecarte[i].numero = mazzomischiato[i].getnumero();
			tuecarte[i].palo = mazzomischiato[i].getpalo();
			suecarte[i].numero = mazzomischiato[i+5].getnumero();
			suecarte[i].palo = mazzomischiato[i+5].getpalo();
		}
		
		int tuoipunti = 0 ;
		int suoipunti = 0 ;
		boolean presa = true ;
		
		int cont=10 ;
		
		azione(mazzomischiato,tuecarte,suecarte,tuoipunti,suoipunti,presa,cont);
		
		System.out.println("TI E' PIACIUTO GIOCARE CON ME?");
		String fine = input.nextLine();

	}
	
}

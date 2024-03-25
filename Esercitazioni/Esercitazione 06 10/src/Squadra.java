import java.util.Scanner ;
public class Squadra {
	static Scanner input = new Scanner(System.in);
	
	private Fantacalcio[] portieri = new Fantacalcio[2];
	private Fantacalcio[] difensori = new Fantacalcio[10];
	private Fantacalcio[] centrocampisti = new Fantacalcio[10];
	private Fantacalcio[] attaccanti = new Fantacalcio[4];
	
	
	
	public Squadra(){
		
		for(int i=0 ; i<portieri.length ; i++){
			portieri[i]= new Fantacalcio();
			System.out.println("dammi il nome del portiere  " + i);
			portieri[i].creaportiere(input.nextLine());
			portieri[i].setnumeromaglia(i);
		}
		
		for(int i=0 ; i<difensori.length ; i++){
			difensori[i]= new Fantacalcio();
			System.out.println("dammi il nome del difensore  " + i);
			difensori[i].creadifensore(input.nextLine());
			difensori[i].setnumeromaglia(i+2);
		}
	
		for(int i=0 ; i<centrocampisti.length ; i++){
			centrocampisti[i]= new Fantacalcio();
			System.out.println("dammi il nome del centrocampista  " + i);
			centrocampisti[i].creacentrocampista(input.nextLine());
			centrocampisti[i].setnumeromaglia(i+12);
		}
		
		for(int i=0 ; i<attaccanti.length ; i++){
			attaccanti[i]= new Fantacalcio();
			System.out.println("dammi il nome dell'attaccante  " + i);
			attaccanti[i].creaattaccante(input.nextLine());
			attaccanti[i].setnumeromaglia(i+22);
		}
	}
	
	//METODI
	
	public Fantacalcio[] rosa(Squadra a){
		Fantacalcio[] rosa = new Fantacalcio[26];
		
		for(int i=0 ; i<2 ; i++){
			rosa[i]=a.portieri[i];
		}
		for(int i=2 ; i<12 ; i++){
			rosa[i]=a.difensori[i-2];
		}
		for(int i=12 ; i<22 ; i++){
			rosa[i]=a.centrocampisti[i-12];
		}
		for(int i=22 ; i<26 ; i++){
			rosa[i]=a.attaccanti[i-22];
		}
		
		return rosa ;
	}
	
	
	public String[] schiera(){
		String[] formazione = new String[11];
		
		System.out.println("dammi i nomi degli 11 giocatori da schierare (4-4-2) ");
		
		for (int i=0 ; i<formazione.length ; i++){
			formazione[i]=input.nextLine();
		}
		
		return formazione ;
	}
	
	
	
	
	
	
}
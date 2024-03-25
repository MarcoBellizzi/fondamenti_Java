import java.util.Scanner ;
public class Fantacalcio {	
	static Scanner input = new Scanner(System.in);
	
	private String nome ;
	private String ruolo ;
	private int valore ;
	private int numeromaglia ;
	
	//COSTRUTTORI 
	
	public Fantacalcio(){
		nome = "";
		ruolo = "";
		valore = 0;
		numeromaglia = 0;
	}
	
	//METODI
	
	public void creaportiere(String a){
		nome = a ;
		ruolo = "portiere" ;
		valore = 0 ;
	}
	
	public void creadifensore(String a){
		nome = a ;
		ruolo = "difensore" ;
		valore = 0 ;
	}
	
	public void creacentrocampista(String a){
		nome = a ;
		ruolo = "centrocampista" ;
		valore = 0 ;
	}
	
	public void creaattaccante(String a){
		nome = a ;
		ruolo = "attaccante";
		valore = 0 ;
	}
	
	public String getnome(){
		return nome ;
	}
	
	public String getruolo(){
		return ruolo ;
	}
	
	public int getvalore(){
		return valore ;
	}
	
	public int getnumeromaglia(){
		return numeromaglia ;
	}
	
	public void setnome(String a){
		this.nome = a ;
	}
	
	public void setruolo(String a){
		this.ruolo = a ;
	}
	
	public void setvalore(int a){
		this.valore = a ;
	}
	
	public void setnumeromaglia(int a){
		this.numeromaglia = a ;
	}
	
	public static void verificaformazione(String[] formazione, Fantacalcio[] rosa){
		boolean condizione = false;
		for(int i=0 ; i<formazione.length ; i++){
			condizione = false ;
			for(int j=0 ; j<rosa.length ; j++){
				if (formazione[i].equals(rosa[j].getnome())){
					condizione = true;
				}
			}
			if (condizione==false)
				System.out.println("il convocato numero "+i+" non appartine alla rosa");
		}
	}
	
	public static int getMagliaGiocatore(Squadra a,String  nome, String ruolo){
		Fantacalcio[] rosa = a.rosa(a);
		for (int i=0 ; i<rosa.length ; i++){
			if (rosa[i].getnome().equals(nome)){
				if (ruolo==rosa[i].getruolo()){
					return rosa[i].getnumeromaglia();
				}
			}
		}
		return -1 ;
	}
	
	public static String getNomeGiocatore(Squadra a , int numero){
		Fantacalcio[] rosa = a.rosa(a);
		for ( int i=0 ; i<rosa.length ; i++){
			if (rosa[i].getnumeromaglia()== numero){
				return "il giocatore con la maglietta " + i + rosa[i].getnome();
			}
		}
		return "non è presente questo numero di maglia";
	}
	
	public static void stampaRosa(Squadra a){
		Fantacalcio[] rosa = a.rosa(a);
		for (int i=0 ; i<rosa.length ; i++){
			if (i==2 || i==12 || i== 22){
				System.out.println("");
			}
			System.out.print(rosa[i].getnome()+"    ");
		}
	}
	
	public static void stampaFormazione(String[] formazione){
		for (int i=0 ; i<formazione.length ; i++){
			System.out.println(formazione[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Squadra Napoli = new Squadra();
		String[] formazione = Napoli.schiera();
		
		Fantacalcio[] rosa = Napoli.rosa(Napoli);
		
		verificaformazione(formazione,rosa);
		
		System.out.println(getNomeGiocatore(Napoli,23));
		
		stampaRosa(Napoli);
		
		
		
		
	}
}
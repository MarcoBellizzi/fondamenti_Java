import java.util.Scanner;

public class Libreria {
	
	static Scanner input = new Scanner(System.in);
	
	private Scaffale[] scaffali = new Scaffale[3];
	
	private Libreria(Scaffale[] s){
		scaffali=s;
	}
	
	public Libreria(Libreria l){
	for(int i=0; i<scaffali.length; i++)
		scaffali[i]=l.scaffali[i];
	}
	
	public Libreria() {
	for(int i=0; i<scaffali.length; i++)
		scaffali[i]= new Scaffale();
	}

	public static Libreria leggi(Scanner input){
		Scaffale[] s= new Scaffale[3];
		for(int i=0; i<s.length; i++)
			s[i]=Scaffale.inserisciLibri(input);
		Libreria l = new Libreria(s);
		return l;
	}
	
	public Scaffale getScaffale(int i){
		return scaffali[i-1];
	}
	
	public void svuotaScaffale(int i){
		scaffali[i-1].svuota();
	}
	
	public void svuotaLibreria(){
		for(int i=0; i<scaffali.length; i++)
			scaffali[i].svuota();
	}
	
	public String getLibro(int i, int p){
		if(scaffali[i-1].getLibro(p-1).equals(""))
			return "";
		else
			return scaffali[i-1].getLibro(p-1);
	}
	
	public boolean cercaLibro(String l){
		for(int i=0; i<scaffali.length; i++)
			if(scaffali[i].cercaLibro(l)){
				System.out.println("Scaffale "+(i+1));
				return true;
			}
		return false;
	}
	
	public boolean aggiungiLibro(String l){
		boolean aggiunto = false;
		for(int i=0; i<scaffali.length; i++)
			aggiunto=scaffali[i].aggiungiLibro(l);
		return aggiunto;
	}
	
	public void compattaScaffale(int i){
		scaffali[i-1].compatta();
	}
	
	public void compattaLibreria(){
		for(int i=0; i<scaffali.length; i++)
			scaffali[i].compatta();
	}
	
	public boolean inserisciLibro(String l, int s, int p){
		if(scaffali[s-1].inserisciLibro(l, p-1))
			return true;
		return false;
	}
}

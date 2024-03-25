	import java.util.Scanner;

public class Scaffale {
	
	static Scanner input = new Scanner(System.in);
	
	private String[] libri = new String[20];
	
	public Scaffale(){
		for(int i=0; i<libri.length; i++)
			libri[i]="";
	}
	
	public Scaffale(String[] l){
		libri=l;
	}
	
	public Scaffale(Scaffale s){
		for(int i=0; i<libri.length; i++)
			libri[i]=s.libri[i];
	}
	
	public String toString(){
		String output="";
		for(int i=0; i<libri.length; i++)
			output+=libri[i];
		return output;
	}
	
	public boolean aggiungiLibro(String l){
		for(int i=0; i<libri.length; i++)
			if(libri[i].equals("")){
				libri[i]=l;
				return true;
			}
		return false;
	}
	
	public void compatta(){
		boolean vuoto=true;
		for(int i=0; i<libri.length-1; i++){
			if(libri[i].equals("") && !(libri[i+1].equals("")))
				libri[i]=libri[i+1];
			else{
				int k=i+1;
				while(!vuoto){
				if(!(libri[k].equals(""))){
					libri[i]=libri[k];
					vuoto=false;
				}
				else
					k++;
				}
				}
		}
			
	}
	
	public boolean cercaLibro(String l){
		for(int i=0; i<libri.length; i++)
			if(libri[i].equals(l)){
				System.out.println("la posizione è "+(i+1));
				return true;
			}
		return false;
	}

	public boolean inserisciLibro(String l,int i){
		if(libri[i-1].equals("")){
			libri[i-1]=l;
			return true;
		}
		return false;
			
	}
	
	public String getLibro(int i){
		return libri[i-1];
	}
	
	public void svuota(){
		for(int i=0; i<libri.length; i++)
			libri[i]="";
	}
	
	public void stampaLibro(int i){
		System.out.println(libri[i-1]);
	}
	
	public static Scaffale inserisciLibri(Scanner input){
		int i=0;
		System.out.println("Inserisci Libro");
		String[] l = new String[20];
		String libro= input.next();
		while(!l[i].equals("fine") && i<l.length){
			l[i]=libro;
			System.out.println("Inserisci Libro");
			libro=input.next();
			i++;
		}
		for(;i<l.length;i++)
			l[i]="";
		Scaffale s = new Scaffale(l);
		return s;
		
	}

	
}

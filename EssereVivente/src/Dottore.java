import java.util.Scanner;

public class Dottore {

	static Scanner input = new Scanner(System.in);
	
	private Persona dottore;
	private String specializzazione;
	private double parcella;
	
	public Dottore(){
		dottore = new Persona();
		specializzazione = " ";
		parcella = 0;
	}
	
	public Dottore(Persona p,String s,double pa){
		this.dottore=p;
		this.specializzazione=s;
		this.parcella=pa;
	}
	
	public Dottore(Dottore d){
		this.dottore=d.dottore;
		this.specializzazione=d.specializzazione;
		this.parcella=d.parcella;
	}
	
	public Dottore leggiDottore(Scanner input){
		Persona p = new Persona();
		System.out.println("Inserisci nome dottore");
		p.inserisciNome(input);
		System.out.println("Inserisci specializzazione");
		specializzazione=input.next();
		System.out.println("Inserisci parcella");
		parcella=input.nextDouble();
		Dottore d = new Dottore(p,specializzazione,parcella);
		return d;
	}
	
	public String toString(){
		return (dottore.toString()+" Specializzazione: "+this.specializzazione+" Parcella: "+this.parcella);
	}
	
	public String getNome(){
		return dottore.getNome();
	}
	
	public void setNome(String n){
		this.dottore.setNome(n);
	}
	
	public String getSpecializzazione(){
		return this.specializzazione;
	}
	
	public double getParcella(){
		return this.parcella;
	}
	
	public void setParcella(double p){
		this.parcella=p;
	}
	
	public boolean equals(Dottore d1,Dottore d2){
		if(d1.dottore.getNome().equalsIgnoreCase(d2.dottore.getNome())){
			System.out.println("Ci sono 2 dottori con lo stesso nome");
			if(d1.specializzazione.equalsIgnoreCase(d2.specializzazione)){
				System.out.println("Hanno la stessa specializzazione");
				if(d1.parcella==d2.parcella)
				   return false;
				else
					return true;
			}else
				return true;
		}else
			return false;
	}
	
	public void trovaDottoreConS(String s){
		if(this.specializzazione.equals(s))
			this.toString();
	}
	
	public void licenziaDottore(Dottore d){
		d = new Dottore();
	}
	
	public Dottore aggiungiDottore(){
		Dottore d = new Dottore();
		d.leggiDottore(input);
		return d;
	}
}

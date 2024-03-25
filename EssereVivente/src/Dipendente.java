import java.util.Scanner;

public class Dipendente {
 
	static Scanner input = new Scanner(System.in);
	
	private Persona dipendente;
	private double stipendioAnnuale;
	private int annoAssunto;
	private String codiceIdentit�;
	
	public Dipendente(){
		dipendente = new Persona();
		stipendioAnnuale = 0;
		annoAssunto = 0;
		codiceIdentit� = " ";
	}
	
	public Dipendente(Persona p, double s, int a, String c){
		this.dipendente = new Persona(p);
		this.stipendioAnnuale = s;
		this.annoAssunto = a;
		this.codiceIdentit� = c;
	}
	
	public Dipendente(Dipendente d){
		this.dipendente = new Persona(d.dipendente);
		this.stipendioAnnuale = d.stipendioAnnuale;
		this.annoAssunto = d.annoAssunto;
		this.codiceIdentit� = d.codiceIdentit�;
	}
	
	public String toString(){
		return ("Nome dipendente: "+this.dipendente.toString()+" Stipendio annuale: "+this.stipendioAnnuale+" Anno assunzione: "+this.annoAssunto+" Codice di identificazione: "+this.codiceIdentit�);
	}
	
	public Dipendente trovaDipendenteConCI(String c){
		if(this.codiceIdentit�.equals(c))
			return new Dipendente(this.dipendente, this.stipendioAnnuale, this.annoAssunto, this.codiceIdentit�);
		return new Dipendente();
	}
	
	public Dipendente trovaDipendenteConN(String n){
		if(this.dipendente.getNome().equals(n))
			return new Dipendente(this.dipendente,this.stipendioAnnuale,this.annoAssunto,this.codiceIdentit�);
		return new Dipendente();
	}
	
	public Dipendente trovaDipendenteConAA(int a){
		if(this.annoAssunto==a)
			return new Dipendente(this.dipendente,this.stipendioAnnuale,this.annoAssunto,this.codiceIdentit�);
	return new Dipendente();
	}
	
	public String getDipendente(){
	return	this.dipendente.getNome();
	}
	
	public double getStipendioAnnuo(){
		return this.stipendioAnnuale;
	}
	
	public int getAnnoAssunzione(){
		return this.annoAssunto;
	}
	
	public String getCodiceIdentit�(){
		return this.codiceIdentit�;
	}
	
	public boolean equals(Dipendente d1, Dipendente d2){
		if(d1.dipendente.getNome().equalsIgnoreCase(d2.dipendente.getNome())){
			System.out.println("Ci sono 2 dipendenti con lo stesso nome ");
			if(d1.codiceIdentit�.equalsIgnoreCase(d2.codiceIdentit�)){
				System.out.println("Hanno anche lo stesso codice di identificazione");
				return false;
			}else
				return true;
		}else
			return false;
	}
	
	public void setNome(String n){
		this.dipendente.setNome(n);
	}
	
	public void setStipendioAnnuo(double s){
		this.stipendioAnnuale=s;
	}
	
	public void leggi(Scanner input){
		this.dipendente.inserisciNome(input);
		this.stipendioAnnuale = input.nextDouble();
		this.annoAssunto = input.nextInt();
		this.codiceIdentit� = input.next();
	}
	
	public boolean equalsNomi(Persona p1,Persona p2){
		return p1.hannoLoStessoNome(p2);
	}
	
	public void licenziaDipendente(Dipendente p){
		p = new Dipendente();
	}
	
	public Dipendente aggiungiDipendente(){
		Dipendente d = new Dipendente();
		d.leggi(input);
		return d;
	}
}

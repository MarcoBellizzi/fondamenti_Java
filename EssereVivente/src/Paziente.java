import java.util.Scanner;

public class Paziente {

	static Scanner input = new Scanner(System.in);
	
	private Persona paziente;
	private String codiceIdentitÓ;
	
	public Paziente(){
		paziente = new Persona();
		codiceIdentitÓ = " ";
	}
	
	public Paziente(Persona p, String c){
		this.paziente = new Persona(p);
		this.codiceIdentitÓ=c;
	}
	
	public Paziente(Paziente p){
		this.paziente = new Persona(p.paziente);
		this.codiceIdentitÓ=p.codiceIdentitÓ;
	}
	
	public Paziente leggiPaziente(Scanner input){
		System.out.println("Nome ");
		paziente.inserisciNome(input);
		System.out.println("Codice di Identificazione");
		codiceIdentitÓ=input.next();
		Paziente p = new Paziente(paziente,codiceIdentitÓ);
		return p;
	}
	
	public String toString(){
		return (this.paziente.toString()+" Codice Identificativo Paziente: "+this.codiceIdentitÓ);
	}
	
	public void dimettiPaziente(Paziente p){
		p = new Paziente();
	}
	
	public Paziente aggiungiPaziente(){
		Paziente p = new Paziente();
		p.leggiPaziente(input);
		return p;
	}
	
	public void trovaPazienteConCI(String c){
		if(this.codiceIdentitÓ.equalsIgnoreCase(c))
			this.toString();
	}
	
	public String getPaziente(){
		return this.paziente.getNome();
	}
	
	public String getCodiceIdentitÓ(){
		return this.codiceIdentitÓ;
	}
	
	public void setPaziente(Persona p){
		this.paziente = new Persona(p);
	}
	
	public void setCodiceIdentitÓ(String c){
		this.codiceIdentitÓ=c;
	}
	
	public boolean equals(Paziente p1,Paziente p2){
		if(p1.paziente.getNome().equalsIgnoreCase(p2.paziente.getNome())){
			System.out.println("Ci sono 2 pazienti con lo stesso nome");
			if(p1.codiceIdentitÓ.equalsIgnoreCase(p2.codiceIdentitÓ)){
				System.out.println("Hanno lo stesso codice di identificazione");
				return false;
			}else
				return true;
		}else
			return false;
	}
	
	
}

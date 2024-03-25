import java.util.Scanner;

public class Carta {

	private int valore;
	private String seme;

	public Carta(){
		valore=0;
		seme=" ";
	}
	
	public Carta(int v,String s){
		this.valore=v;
		this.seme=s;
	}
	
	public Carta(Carta c){
		this.valore=c.valore;
		this.seme=c.seme;
	}
	
	public Carta getCarta(){
		return new Carta(this.valore,this.seme);
	}
	
	public void setCarta(Carta c){
		this.valore=c.valore;
		this.seme=c.seme;
	}
	
	public Carta leggiCarta(Scanner input){
		System.out.println("Inserisci valore");
		valore=input.nextInt();
		System.out.println("Inserisci seme");
		seme=input.next();
		Carta c = new Carta(valore,seme);
		return c;
		
	}
	
	public void stampaCarta(Carta c){
		System.out.println("Valore: "+this.valore);
		System.out.println("Seme: "+this.seme);
	}
	
	public void brucciataCarta(Carta c){
		c = new Carta();
	}
	
	public int getValore(){
		return this.valore;
	}
	
	public String getSeme(){
		return this.seme;
	}
	
	public void setValore(int v){
		this.valore=v;
	}
	
	public void setSeme(String s){
		this.seme=s;
	}
}

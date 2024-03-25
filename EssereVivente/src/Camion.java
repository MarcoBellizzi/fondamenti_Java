import java.util.*;

public class Camion {

	static Scanner input = new Scanner(System.in);
	
	private double caricoInT; //capacità di carico in tonnellate
	private double caricoR;   //capacità di carico del rimorchio
	
	public Camion(){
		caricoInT=0;
		caricoR=0;
	}
	
	public Camion(double cT,double cR){
		this.caricoInT=cT;
		this.caricoR=cR;
	}
	
	public Camion(Camion c){
		this.caricoInT=c.caricoInT;
		this.caricoR=c.caricoR;
	}
	
	public Camion leggiCamion(Scanner input){
		System.out.println("Inserisci carico in tonnellate");
		caricoInT=input.nextDouble();
		System.out.println("Inserisci carico del rimorchio");
		caricoR=input.nextDouble();
		Camion c = new Camion(caricoInT,caricoR);
		return c;
	}
	
	public void svuotaCamion(Camion c){
		c = new Camion();
	}
	
	public void setCaricoInT(double c){
		this.caricoInT=c;
	}
	
	public void setCaricoR(double c){
		this.caricoR=c;
	}
	
	public double getCaricoInT(){
		return this.caricoInT;
	}
	
	public double getCaricoR(){
		return this.caricoR;
	}
	
	public Camion caricaCamion(double c1, double c2){
		Camion c = new Camion(c1,c2);
		return c;
	}
	
	public String toString(){
		return ("Carico in tonnellate: "+this.caricoInT+" Carico rimorchio: "+this.caricoR);
	}
}

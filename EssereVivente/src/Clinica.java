import java.util.Scanner;

public class Clinica {

	static Scanner input = new Scanner(System.in);
	
	private Paziente[] pazienti; 
	private Dottore[] dottori;
	private double fattura;
	private int nPazienti;
	private int nDottori;
	
	public Clinica(){
		for(int i=0; i<nPazienti; i++)
			pazienti[i] = new Paziente();
		for(int j=0; j<nDottori; j++)
			getDottori()[j] = new Dottore();
		fattura = 0;
	}
	
	public Clinica(Paziente[] p, Dottore[] d, int f){
		this.pazienti=p;
		this.setDottori(d);
		this.fattura=f;
	}
	
	public Clinica(Clinica c){
		this.nPazienti=c.nPazienti;
		this.nDottori=c.nDottori;
		this.pazienti=c.pazienti;
		this.setDottori(c.getDottori());
		this.fattura=c.fattura;
	}
	
	public void licenzia(Dottore d){
		d.licenziaDottore(d);
	}
	
	public void assumi(){
		Dottore d = new Dottore();
		d.aggiungiDottore();
		boolean assunto=false;
		int i=0;
		while(!assunto && i<nDottori){
			if(dottori[i].getNome().equals(new Dottore())){
				dottori[i]=d;
				assunto=true;
			}
			i++;
		}
	}
	
	public void dimetti(Paziente p){
		p.dimettiPaziente(p);
	}
	
	public void ricovera(){
		Paziente p = new Paziente();
		p.aggiungiPaziente();
		boolean aggiunto=false;
		int i=0;
		while(!aggiunto && i<nPazienti){
			if(pazienti[i].getPaziente().equalsIgnoreCase(" ")){
				pazienti[i]=p;
				aggiunto=true;
			}
			i++;
		}
	}
	
	public void leggiDottori(Scanner input){
		System.out.println("Quanti dottori inserisci");
		nDottori=input.nextInt();
		Dottore d = new Dottore();
		Dottore[] c = new Dottore[nDottori];
		for(int i=0; i<nDottori; i++){
			System.out.println("Dottore n°"+(i+1));
			c[i]=d.leggiDottore(input);
		}
		this.dottori = c;
	}
	
	public void leggiPazienti(Scanner input){
		System.out.println("Quanti pazienti inserisci");
		nPazienti=input.nextInt();
		Paziente p = new Paziente();
		Paziente[] c = new Paziente[nPazienti];
		for(int i=0; i<nPazienti; i++){
			System.out.println("Paziente n°"+(i+1));
			c[i]=p.leggiPaziente(input);
		}
		this.pazienti = c;
	}
	
	public void stampaDottori(){
		for(int i=0; i<nDottori; i++)
			System.out.println(dottori[i].toString());
	}
	
	public void stampaPazienti(){
		for(int i=0; i<nPazienti; i++)
			System.out.println(pazienti[i].toString());
	}
	
	public double fatturaTotale(){
		for(int i=0; i<nDottori; i++)
			fattura+=getDottori()[i].getParcella();
		return fattura;
	}

	public Dottore[] getDottori() {
		return dottori;
	}

	public void setDottori(Dottore[] dottori) {
		this.dottori = dottori;
	}

	public void setNDottori(int n){
		this.nDottori=n;
	}
	
	public void setNPazienti(int n){
		this.nPazienti=n;
	}
}

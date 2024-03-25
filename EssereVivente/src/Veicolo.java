import java.util.Scanner ;

public class Veicolo {

	static Scanner input = new Scanner(System.in);
	
	private String marca;
	private int cilindrata;
	private Persona proprietario;
	
	public Veicolo(){
		marca=" ";
		cilindrata=0;
		proprietario = new Persona();
	}
	
	public Veicolo(String m, int c, Persona p){
		this.marca=m;
		this.cilindrata=c;
		this.proprietario= new Persona(p);
	}
	
	public Veicolo(Veicolo v){
		this.marca=v.marca;
		this.cilindrata=v.cilindrata;
		this.proprietario=new Persona(v.proprietario);
	}
	
	public void setMarca(String m){
		this.marca=m;
	}
	
	public void setCilindrata(int c){
		this.cilindrata=c;
	}
	
	public void setProprietario(Persona p){
		this.proprietario=new Persona(p);
	}
	
	public String getMarca(){
		return this.marca;
	}
	
	public int getCilindrata(){
		return this.cilindrata;
	}
	
	public Persona getProprietario(){
		return this.proprietario;
	}
	
	public String toString(){
		return ("Marca: "+this.marca+" Cilindrata: "+this.cilindrata+" Proprietario: "+this.proprietario);
	}
	
	public boolean equals(Veicolo v1,Veicolo v2){
		if(v1.equals(v2)){
			System.out.println("Sono identici");
			return false;
		}else if(v1.proprietario.hannoLoStessoNome(v2.proprietario)){
			if(!(v1.marca.equalsIgnoreCase(v2.marca))){
				System.out.println(v1.proprietario+" ha almeno 2 macchine diverse");
				return true;
			}
		}
		return false;
	}

	public Veicolo leggiVeicolo(Scanner input) {
		System.out.println("Inserisci Marca:");
		marca=input.next();
		System.out.println("Inserisci Cilindrata");
		cilindrata=input.nextInt();
		System.out.println("Inserisci Proprietario");
		proprietario.inserisciNome(input);
		Veicolo v = new Veicolo(marca, cilindrata, proprietario);
		return v;
	}
	
	public void demolizione(Veicolo v){
		v = new Veicolo();
	}
	
	public Veicolo aggiungiVeicolo(){
		Veicolo v = new Veicolo();
		Veicolo c = new Veicolo();
		c=v.leggiVeicolo(input);
		return c;
	}
	
	
	
}

import java.util.*;

public class Briscola {
	
	static Scanner input = new Scanner(System.in);
	
	private Carta[] scala ;
	private static int nScala = 10;
	
	public Briscola(){
		for(int i=0; i<nScala; i++){
			this.scala[i] = new Carta();
		}
	}
	
	public Briscola(Carta c){
		Briscola b = new Briscola();
		for(int i=0 ; i<nScala; i++){
			b.scala[i]=c.getCarta();
		}
		
	}
	
	public Briscola(Briscola b){
		this.scala=b.scala;
	}
	
	public Briscola leggiBriscola(String s){
		Briscola b = new Briscola();
		for(int i=0; i<nScala; i++)
			if(scala[i].getSeme().equalsIgnoreCase(s))
				b.scala[i] = new Carta(i+1,s); 
		return b;
	}
	
	public void stampaBriscola(){
		for(int i=0; i<nScala; i++)
			this.scala[i].stampaCarta(this.scala[i].getCarta());
	}
	
	public Briscola uscitaBriscola(Carta c){
		Briscola b = new Briscola();
		for(int i=0; i<nScala; i++)
			if(scala[i].equals(c))
					b.scala[i] = new Carta();
		return b;
	}
	
	public boolean finiteBriscole(Briscola b){
		Carta c = new Carta();
		int contaUscite=0;
		for(int i=0; i<nScala; i++)
			if(b.scala[i].equals(c)){
					contaUscite++;
					if(contaUscite==10){
						System.out.println("Sono uscite tutte le briscole");
						return false;
			}
	}
		System.out.println("Ci sono ancora "+(10-contaUscite));
		return true;
}
	
	
}

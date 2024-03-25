import java.util.*;

public class Mano {

	static Scanner input = new Scanner(System.in);
	
	private Carta[] mano;
	
	public Mano(){
		for(int i=0; i<mano.length; i++)
			mano[i]=new Carta();
	}
	
	public Mano(Carta[] m){
		this.mano=m;
	}
	
	public Mano(Mano m){
		this.mano=m.mano;
	}
	
	public Carta[] getMano(){
		return this.mano;
	}
	
	public void setMano(Carta[] c){
		this.mano=c;
	}
	
	public Mano leggiMano(Scanner input){
		Mano m = new Mano();
		for(int i=0; i<m.mano.length; i++)
			m.mano[i].leggiCarta(input);
		return m;
	}
	
}

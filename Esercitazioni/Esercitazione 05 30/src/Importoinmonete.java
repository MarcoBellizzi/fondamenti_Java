import java.util.Scanner;
public class Importoinmonete {
	static Scanner input = new Scanner(System.in);
	
	private int[] v = new int[4];
	
	//COSTRUTTORI
	
	public Importoinmonete(){
		azzerra();
	}
	
	public Importoinmonete(int a, int b, int c, int d){
		int[] v2 = {a,b,c,d};
		for(int i=0 ; i<4 ; i++){
			v[i]=v2[i];
		}
	}
	
	//METODI
	
	public void azzerra(){
		for (int i=0 ; i<4 ; i++){
			v[i]=0;
		}
	}
	
	public void aggiungimonete(int a, int b, int c, int d){
		int[] v2 = {a,b,c,d};
		for (int i=0 ; i<4 ; i++){
			v[i]=v[i]+v2[i];
		}
	}
	
	public void estraimonete(int a, int b, int c, int d){
		int[] v2 = {a,b,c,d};
		for (int i=0 ; i<v.length ; i++){
			v[i]=v[i]-v2[i];
		}
		if (v[0]<0 || v[1]<0 || v[2]<0 || v[3]<0){
			this.aggiungimonete(a,b,c,d);
			}
			System.out.println("hai cercato di estrarre monete che non erano nel portafogli");
			System.out.println("l'estrazione non è stata effettuata");
	}
	
	public int contasoldi(){
		int tot = (v[0]*10) + (v[1]*20) + (v[2]*50) + (v[3]*100) ;
		return tot;
	}
	
	public void aggiungiportamonete(Importoinmonete a){
		for ( int i=0 ; i<v.length ; i++){
			this.v[i] = this.v[i] + a.v[i] ;
		}
	}
	
	public void estraiimporto(int a){
		int[] v2 = {0,0,0,0};
		if (a/100>0){
			v2[3]=(a/100);
			a=a-(v[3]*100);
		}
		if (a/50>0){
			v2[2]=(a/50);
			a=a-(v2[2]*50);
		}
		if (a/20>0){
			v2[1]=(a/20);
			a=a-(v2[1]*20);
		}
		if (a/10>0){
			v2[0]=(a/10);
		}
		for (int i=0 ; i<v.length ; i++){
			v[i]=v[i]-v2[i];
		}
		if (v[0]<0 || v[1]<0 || v[2]<0 || v[3]<0){
			this.aggiungimonete(v2[0],v2[1],v2[2],v2[3]);
			}
			System.out.println("hai cercato di estrarre monete che non erano nel portafogli");
			System.out.println("l'estrazione non è stata effettuata");
	}
	
	public static void main(String[] args) {
		
		Importoinmonete primoportafogli = new Importoinmonete(0,0,0,1);
		Importoinmonete secondoportafogli = new Importoinmonete(0,0,1,0);
		
		primoportafogli.aggiungiportamonete(secondoportafogli);
		
		System.out.println(primoportafogli.contasoldi());
		
		primoportafogli.estraiimporto(100);
		
		System.out.println(primoportafogli.contasoldi());
		
		
		
	}
}
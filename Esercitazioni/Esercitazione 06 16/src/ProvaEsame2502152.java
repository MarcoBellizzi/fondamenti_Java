import java.util.Scanner;
public class ProvaEsame2502152 {
	static Scanner input = new Scanner(System.in);
	
	public static char[] creastringa(){
		System.out.println("inserire la lunghezza della parola");
		int n = input.nextInt();
		char[] parola = new char[n];
		for ( int i=0 ; i<parola.length ; i++){
			System.out.println("inserisci un carattere");
			char p = input.next().charAt(0);
			parola[i]= p;
		}
		return parola ;
	}
	
	public static boolean controllacaratteri( char[] v , char c){
		int con = 0 ;
		for (int i=0 ; i<v.length ; i++){
			if (v[i]!= c){
				con++;
				if (con>3){
					return false ;
				}
			}
			else {
				con = 0;
			}
		}
		return true ;
	}
	
	public static boolean ccr ( char[] v , char c , int cont , int i){  // i e cont inizializzati a 0
		if ( cont>3 )
			return false ;
		if (v[i]!=c){
			cont ++;
		}
		else {
			cont = 0 ;
		}
		if (i==v.length){
			return true ;
		}
		else {
			return ccr(v,c,cont,i+1);
		}
	}
	
	public static void main(String[] args) {
		
		char[] parola = creastringa();
		System.out.println("inserisci il carattere da controllare");
		char c = input.next().charAt(0);
		System.out.println(controllacaratteri(parola,c));
		System.out.println(ccr(parola,c,0,0));
		
		
		
		
	}
}
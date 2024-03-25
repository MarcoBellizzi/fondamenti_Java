import java.util.Scanner;
public class ProvaEsame270114 {
	static Scanner input = new Scanner(System.in);
	
	public static char[] leggicaratteri(){
		System.out.println("inserisci il numero di elementi");
		int n = input.nextInt();
		char[] v = new char[n];
		for (int i=0 ; i<n ; i++){
			System.out.println("inserisci un carattere");
			v[i]=input.next().charAt(0);
		}
		return v ;
	}
	
	public static int contalettere(char[] v, char c){
		int tot = 0 ;
		for (int i=0 ; i<v.length ; i++){
			if (v[i]==c){
				tot++;
			}
		}
		return tot;
	}
	
	public static boolean verificaanagramma(char[] v1 , char[] v2){
		if (v1.length!=v2.length){
			return false ;
		}
		boolean stessonumero = false ;
		for (int i=0 ; i<v1.length ; i++){
			stessonumero = false ;
			for (int j=0 ; j<v2.length ; j++){
				if (v1[i]==v2[j]){
					if (contalettere(v1,v1[i])==contalettere(v2,v1[i])){
						stessonumero = true ;
					}
				}
			}
			if (stessonumero == false){
				return false ;
			}
		}
		return true ;
	}
	
	public static boolean èaccompagnato (int[][] m, int a, int i, int j){
		if (i>=m.length || i>=m[0].length || j>=m.length || j>=m[0].length){
			return false ;
		}
		if (m[i][j]==a){
			return true ;
		}
		else {
			return èaccompagnato(m,a,i+1,j+1) ;
		}
	}
	
	public static boolean accompagnato(int[][] m){
		int[] primariga = new int[m[0].length-1];
		for (int i=0 ; i<primariga.length ; i++){
			primariga[i]=m[0][i];
		}
		boolean[] condizione = new boolean [primariga.length];
		for (int i=0 ; i<primariga.length ; i++){
			condizione[i]=èaccompagnato(m,primariga[i],1,i+1);
		}
		for (int i=0 ; i<condizione.length ; i++){
			if (condizione[i]==false)
				return false ;
		}
		return true ;
	}
	
	public static int[][] leggimatrice(){
		System.out.println("dammi le righe e le colonne");
		int m = input.nextInt();
		int n = input.nextInt();
		int [][] matrice = new int[m][n];
		for (int i=0 ; i<m ; i++){
			for (int j=0 ; j<n ; j++){
				System.out.println("dammi l'elemento in posizione "+i+" "+j);
				matrice[i][j]=input.nextInt();
			}
		}
		for (int i=0 ; i<m ; i++){
			for ( int j=0 ; j<n ; j++){
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println("");
		}
		return matrice ;
	}
	
	public static void main(String[] args) {
		
		char[] v1 = leggicaratteri();
		char[] v2 = leggicaratteri();
		System.out.println(verificaanagramma(v1,v2));
		
		int[][] matrice = leggimatrice();
		System.out.println(accompagnato(matrice));
		
		
		
	}
}

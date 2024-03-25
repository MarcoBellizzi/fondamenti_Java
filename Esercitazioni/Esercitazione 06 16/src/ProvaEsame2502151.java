import java.util.Scanner ;
public class ProvaEsame2502151 {
	static Scanner input = new Scanner(System.in);
	
	public static int[][] creamatricevuota(){
		System.out.println("iserire il numero di righe e di colonne");
		int n = input.nextInt();
		int m = input.nextInt();
		int[][] matrice = new int [n] [m];
		for ( int i=0 ; i<n ; i++){
			for ( int j=0 ; j<m ; j++){
				matrice[i][j]=0;
			}
		}
		return matrice;
	}
	
	public static void riempimatricevuota( int [][] matricevuota ){
		System.out.println("inserire la stringa terminata da -1");
		int k = 0;
		int corr = 0;
		boolean condizione = true ;  // ancora non trovato -1
		for ( int i=0 ; i<matricevuota.length ; i++){
			for ( int j=0 ; j<matricevuota[0].length ; j++){
				if (i%2==0){
					if (condizione){
						corr = input.nextInt();
						if (corr==-1){
							condizione = false ;
						}
						else {
							matricevuota[i][j]=corr;
						}
					}
				}
				else {
					k = matricevuota[0].length - j - 1 ;
					if (condizione){
						corr = input.nextInt();
						if (corr==-1){
							condizione = false ;
						}
						else {
							matricevuota[i][k]=corr;
						}
					}
				}
			}
		}
		if (condizione){
			System.out.println("raggiunto il numero massimo di elementi");
		}
	}
	
	public static void main(String[] args) {
		
		int[][] matricevuota = creamatricevuota();
		riempimatricevuota(matricevuota);
		
		
		for(int i=0 ; i<matricevuota.length ; i++){
			for(int j=0;j<matricevuota[0].length;j++){
				System.out.print(matricevuota[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
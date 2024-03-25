import java.util.Scanner;
public class ProvaEsameRomaArtem {
	static Scanner input = new Scanner(System.in);
	
	public static int[][] creamatrice(){
		System.out.println("dammi il numero di righe e di clonne");
		int n = input.nextInt();
		int m = input.nextInt();
		int[][] matrice = new int[n][m];
		for (int i=0 ; i<n ; i++){
			for (int j=0 ; j<m ; j++){
				System.out.println("dammi l'elemento "+i+" "+j);
				matrice[i][j]=input.nextInt();
			}
		}
		return matrice ;
	}
	
	public static int[] processa(int[][] src , int[][] idx){
		int[]somma = new int[src.length];
		for (int i=0 ; i<somma.length ; i++){
			int tot = 0 ;
			for (int ii=idx[i][0] ; ii<=idx[i][1] ; ii++){
				tot = tot + src[i][ii] ;
			}
			if (idx[i][2]<idx[i][0] || idx[i][2]>idx[i][1]){
				tot = tot - src[i][idx[i][2]];
			}
			else {
				tot = tot - (src[i][idx[i][2]]*2);
			}
			somma[i]=tot;
		}
		return somma ;
	}
	
	public static void main(String[] args) {
		
		int [][] src = creamatrice();
		int [][] idx = creamatrice();
		int [] v = processa(src,idx);
		for (int i=0 ; i<v.length ; i++){
			System.out.println(v[i]);
		}

	}

}

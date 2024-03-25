import java.util.Scanner;
public class RiempiMatrice {
	static Scanner input = new Scanner(System.in);
	
	public static void leggimatrice(int n, int[][] matrice) {
		for ( int i=0 ; i<n ; i++){
			for (int j=0 ; j<n ; j++){
				System.out.println("dammi un numero");
				matrice [i][j]= input.nextInt();
			}
		}
	}
	
	public static void stampamatrice(int [][] matrice) {
		for (int i=0 ; i<matrice.length ; i++){
			for ( int j=0 ; j<matrice.length ; j++){
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int n = input.nextInt();
		int[][] matrice = new int [n][n];
		
		leggimatrice(n,matrice);
		stampamatrice(matrice);
		
		
	}
}
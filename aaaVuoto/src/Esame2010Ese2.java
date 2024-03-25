import java.util.Scanner;

public class Esame2010Ese2 {
	public static void stampa(int[][] m){
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[0].length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void leggi(Scanner in , int[][] m){
		for(int i=0; i<m.length; i++)
			for(int j=0; j<m[0].length; j++)
				m[i][j] = in.nextInt();
	}
public static void ruotaAntiOrario(int[][] m){
	int[][] m1 = new int[m[0].length][m.length];
	int h=m1.length-1,k=0;
	for(int i=0; i<m.length; i++){
		for(int j=0; j<m[0].length; j++){
			m1[h--][k]=m[i][j];
		}
		h=m1.length-1;
		k++;
	}
	for(int i=0; i<m.length; i++){
		for(int j=0; j<m[0].length; j++){
			m[i][j]=m1[i][j];
		}
	}
	
}
public static void ruotaAntiOrario(int[][] m , int gradi){
	int i=0;
	int dim = 0;
	if(gradi==0)
		dim=0;
	else if(gradi%90==0)
		dim+=1;
	else if(gradi%180==0)
		dim+=2;
	else if(gradi%270==0)
		dim+=3;
	else if(gradi%360==0)
		dim+=4;
		ruotaAntiOrario(m);
}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int matrice [][] = new int[4][4];
		System.out.println("inserisci elementi nella matrice ");
		leggi(in,matrice);
		stampa(matrice);
		ruotaAntiOrario(matrice);
		System.out.println();
		System.out.println("stampo matrice ruotata in senso antiorario di 90 gradi ");
		stampa(matrice);

	}

}
